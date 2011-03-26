package fr.playsoft.andsink.network.facebook;

import java.util.Date;

import com.facebook.android.FacebookUtility;

import android.os.Handler;
import android.view.View;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class FacebookSharing extends BaseActivity {

	/** Handler to be used to post in UI thread **/
	public static Handler sHandler;
	
	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.nw_fb_sharing; 
		
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInMainLayout() {
		// TODO Auto-generated method stub
		sHandler = new Handler();
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
	/**
	 * Execute when user clicks "Sharing via Facebook" button
	 * @param v
	 */
	public void onBtnSharingFbClick(View v) {
		
		//TODO: 
		FacebookUtility.launchFacebook(this, 
				"Start update your Facebook status @" + new Date().toLocaleString());
	}
	
	/**
	 * Execute when user clicks "Logout from Facebook" button
	 * @param v
	 */
	public void onBtnLogoutFbClick(View v) {
		
	}
	
}