package com.facebook.android;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.facebook.android.AsyncFacebookRunner.RequestListener;
import com.facebook.android.Facebook.DialogListener;

import fr.playsoft.andsink.R;
import fr.playsoft.andsink.network.facebook.FacebookSharing;

/**
 * Facebook utility - connects to facebook and sends message.
 * Most of this code was copied from facebook sdk example.
 * 
 * @author Olgierd Uzieblo
 */
public class FacebookUtility 
{
	/** APP_ID - TODO: set final app id here **/
    private static final String APP_ID = "146421392084362";

    /** Tag for LogCat **/
    private static final String TAG = "FacebookUtility";
    
    /** Message to send **/
    private static String sMessage="";
        	
	/** Activity to use **/
    private static Activity sActivity = null;
    
    /** Flag to control if message was already posted **/
    private static boolean sIsMessagePosted = true;
        
	/** Last time when facebook error was shown **/
	private static long sLastFacebookErrorToastTime;
    
	/** Minimal time between next facebook errors **/
	private static final int MIN_FACEBOOK_ERROR_INTERVAL = 5000;
        
    private static SessionListener sSessionListener;    
    private static Facebook sFacebook = null;
    private static AsyncFacebookRunner sAsyncRunner;

    private static class SessionStore 
    {        
        private static final String TOKEN = "access_token";
        private static final String EXPIRES = "expires_in";
        private static final String KEY = "facebook-session";
        
        public static boolean save(Facebook session, Context context) 
        {
            Editor editor =
                context.getSharedPreferences(KEY, Context.MODE_PRIVATE).edit();
            editor.putString(TOKEN, session.getAccessToken());
            editor.putLong(EXPIRES, session.getAccessExpires());
            return editor.commit();
        }

        public static boolean restore(Facebook session, Context context) 
        {
            SharedPreferences savedSession =
                context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
            session.setAccessToken(savedSession.getString(TOKEN, null));
            session.setAccessExpires(savedSession.getLong(EXPIRES, 0));
            return session.isSessionValid();
        }
    }
    
    private static interface AuthListener 
    {
    	public void onAuthSucceed();
        public void onAuthFail(String error);
    }    

    private static class SessionEvents 
    {
        private static LinkedList<AuthListener> mAuthListeners = new LinkedList<AuthListener>();
        
        public static void addAuthListener(AuthListener listener) 
        {
            mAuthListeners.add(listener);
        }
        
        public static void onLoginSuccess() 
        {
            for (AuthListener listener : mAuthListeners) 
            {
                listener.onAuthSucceed();
            }
        }
        
        public static void onLoginError(String error) 
        {
            for (AuthListener listener : mAuthListeners) 
            {
                listener.onAuthFail(error);
                showFacebookFailed();
            }
        }          
    }    
    
    private static final class LoginDialogListener implements DialogListener 
    {
        public void onComplete(Bundle values) 
        {
            SessionEvents.onLoginSuccess();
        }

        public void onFacebookError(FacebookError error) 
        {
            SessionEvents.onLoginError(error.getMessage());
            showFacebookFailed();
        }
        
        public void onError(DialogError error) 
        {
            SessionEvents.onLoginError(error.getMessage());
            showFacebookFailed();
        }

        public void onCancel() 
        {
            SessionEvents.onLoginError("Action Canceled");
            showFacebookFailed();
        }
    }
    
    private static class SessionListener implements AuthListener 
    {   
        public void onAuthSucceed() 
        {
            SessionStore.save(sFacebook, sActivity);
        }

        public void onAuthFail(String error) 
        {
        	showFacebookFailed();
        }
    }
    
    /**
     * Displays Toast about successful sending of message.
     * Always performed in UI thread.
     */
    public static void showFacebookSuccess()
    {
    	FacebookSharing.sHandler.post( new Runnable() 
		{	
			@Override
			public void run() 
			{
				Toast.makeText(sActivity, sActivity.getString(R.string.STR_FACEBOOK_SUCCESSFUL) , Toast.LENGTH_LONG).show();
			}
		});
    }
    
    /**
     * Displays Toast with facebook error.
     * Always performed in UI thread.
     */
    public static void showFacebookFailed()
    {
		long lCurrentTime = System.currentTimeMillis();
		
		if ( lCurrentTime - sLastFacebookErrorToastTime > MIN_FACEBOOK_ERROR_INTERVAL )
		{	
			sLastFacebookErrorToastTime = lCurrentTime;
			FacebookSharing.sHandler.post( new Runnable() 
			{	
				@Override
				public void run() 
				{
					Toast.makeText( sActivity , sActivity.getString(R.string.STR_FACEBOOK_FAILED ), Toast.LENGTH_LONG).show();
				}
			});
		}
    }
    
    /**
     * Posts message on facebook wall.
     */
    private static void postMessage()
    {
    	if ( !sIsMessagePosted )
    	{
    		sIsMessagePosted = true;
    		Bundle lParameters = new Bundle();
    		lParameters.putString("message", sMessage);
    		sFacebook.dialog(sActivity , "feed" , lParameters , new SampleDialogListener());
    	}
    }
    
    /**
     * Launches facebook.
     * @param pActivity Activity to use as a parent.
     * @param pMessage Message to post on facebook wall.
     */
    public static void launchFacebook( Activity pActivity , String pMessage )
    {   
        Log.i(TAG,"Started Facebook utility");
        
        // Getting message
        sMessage = pMessage;        
        sActivity = pActivity;
        sSessionListener = new SessionListener();
        
        // Resetting flag
        sIsMessagePosted = false;
		        
       	sFacebook = new Facebook(APP_ID);
       	sAsyncRunner = new AsyncFacebookRunner(sFacebook);

        SessionStore.restore(sFacebook, sActivity);
        SessionEvents.addAuthListener(new SampleAuthListener());        
        SessionEvents.addAuthListener(sSessionListener);
        
        if ( !sFacebook.isSessionValid() )
        {
        	Log.i(TAG,"No valid session - authorizing...");
        	sFacebook.authorize(sActivity, new String[] {}, Facebook.FORCE_DIALOG_AUTH , new LoginDialogListener());
        }
        else
        {
        	Log.i(TAG,"There is a valid session - posting message.");
        	postMessage();
        }        
    }
    
    private static class SampleAuthListener implements AuthListener 
    {
        public void onAuthSucceed() 
        {
        	Log.i(TAG,"Logged in successfully! Posting message...");
        	postMessage();
        }

        public void onAuthFail(String error) 
        {
        	Log.e(TAG,"Login Failed: " + error);
        	showFacebookFailed();
        }
    }

    private static class WallPostRequestListener implements RequestListener
    {
        public void onComplete(final String response, final Object state) 
        {
            Log.d(TAG, "Got response: " + response);
            String message = "<empty>";
            try 
            {
                JSONObject json = Util.parseJson(response);
                message = json.getString("message");
            } catch (JSONException e) {
                Log.w("TAG", "JSON Error in response");
            } catch (FacebookError e) {
                Log.w("TAG", "Facebook Error: " + e.getMessage());
            }
            final String text = "Your Wall Post: " + message;            
            Log.i(TAG,text);
            showFacebookSuccess();
        }
        
        public void onFacebookError(FacebookError e, final Object state) 
        {
            Log.e(TAG, "onFacebookError" , e);
            showFacebookFailed();
        }

        public void onFileNotFoundException(FileNotFoundException e, final Object state) 
        {
            Log.e(TAG, "onFileNotFoundException" , e);
            showFacebookFailed();
        }

        public void onIOException(IOException e, final Object state) 
        {
			Log.e(TAG, "onIOException" , e);
			showFacebookFailed();
        }

        public void onMalformedURLException(MalformedURLException e, final Object state) 
        {
			Log.e(TAG, "onMalformedURLException" , e);
			showFacebookFailed();
        }
    }

    private static class SampleDialogListener implements DialogListener 
    {
        public void onComplete(Bundle values) 
        {
            final String postId = values.getString("post_id");
            if (postId != null) 
            {
                Log.d(TAG, "Dialog Success! post_id=" + postId);
                sAsyncRunner.request(postId, new WallPostRequestListener());
            } else 
            {
                Log.d(TAG, "No wall post made");
                showFacebookFailed();
            }
        }
        
        public void onFacebookError(FacebookError e) 
        {
			Log.e(TAG, "onFacebookError" , e);
			showFacebookFailed();
        }
        
        public void onError(DialogError e) 
        {
			Log.e(TAG, "onError" , e);     
			showFacebookFailed();
        }

        public void onCancel() 
        {   
        	Log.e(TAG, "onCancel!");
        	showFacebookFailed();
        }
    }
}