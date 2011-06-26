package fr.playsoft.andsink;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

/**
 * @author Bui Minh Triet <br />
 * Playsoft Vietnam <br />
 * Email: minh-triet.bui@playsoft.fr <br />
 * Skype: triet.buiminh <br />
 * @category
 * The purpose of abstract class BaseActivity is supplying structure so that you can easily create
 * a new Activity with customized title bar (with HOME, INFO and name) <br />
 * {@link #BaseActivity()} will override function {@link #onCreate(Bundle)} with these following steps:  <br />
 * Note: function with <b>OVERRIDE</b> mean you <b>often</b> override it
 * whilte function with <b>SELDOM_OVERRIDE</b> mean you <b>seldom</b> override it <br /><br />
 * 
 * 1. {@link #onCreate(Bundle)} method is called to initialize Activity.<br /><br />
 * 
 * 2. (<b>SELDOM_OVERRIDE</b>) Call {@link #hideRealTitleBar()} to hide the Activity title bar (we use a custom title bar instead).
 * You can override this function to change title bar if you want (ex: you want to keep
 * app's original title bar and don't want to customize it) <br /><br />
 * 
 * 3. (<b>OVERRIDE</b>) {@link #setupMainLayoutId()}. 
 * You MUST set you main layout here, ex: <b>APP_LAYOUT=R.id.layout_empty</b><br /><br />
 * 
 * 4. {@link #setContentView(int)}. System will get your previous variable APP_LAYOUT to set 
 * as main layout for activity. That's why you must call {@link #setupMainLayoutId()} before 
 * {@link #setContentView(int)} <br /><br />
 * 
 * 5. (<b>SELDOM_OVERRIDE</b>) {@link #setupOthersInMainLayout()} is place where you set up
 * others. Ex: get the listview, create an adapter, set up listener for other controls... <br /><br />
 * 
 * 6. (<b>SELDOM_OVERRIDE</b>) {@link #readTitleBarNameFromIntent()} In case you enter this Acitivity from 
 * #BaseListActivity, the parent activity pass the name for child activity. You get child acitivity
 *  (of course it's current activity) title in here. <br /><br />
 *  
 * 7. (<b>SELDOM_OVERRIDE</b>) {@link #setupTitleBarNameStr()} In some case you don't have title bar name from parent,
 * so it's good to set its value here:  <b>ACTIVITY_NAME="Android Kitchen Sink"</b>; 
 * After set ACTIVITY_NAME, we'll set this value for title bar<br /><br />
 * 
 * 8. (<b>SELDOM_OVERRIDE</b>) {@link #setupOthersInTitleBar()} If you need to customize your title bar (
 * hide HOME or INFO button, change title text size...), this is place where you can do it <br /><br />
 * 
 * 9. (<b>OVERRIDE</b>) {@link #setupAboutContent()} You want user know what's the main function
 * of this activity? Let's set About content here: <br />
 * &nbsp;&nbsp;&nbsp;&nbsp;ACTIVITY_INFO = "This is an example about Android View";	//Activity About infomation of this view <br />
 * &nbsp;&nbsp;&nbsp;&nbsp;ACTIVITY_USING_RES = "KSViews.java, AndroidManifest.xml";	//which resource & class file using in this views <br />
 * &nbsp;&nbsp;You can use <b>HTML tag</b> in these variables' declaration <br />
 * &nbsp;&nbsp;View example of these declaration in fr.playsoft.andsink.KSViews.java
 * <br /><br />
 * 
 */
public abstract class BaseTabActivity extends TabActivity implements SetupLayoutListener {
	
	protected boolean mHideTitleBar = true;
	
	/**
	 * This is the main layout of current activity <br />
	 * If you don't initialize, default value of ACTIVITY_LAYOUT will be ks_layout_empty
	 */
	protected int ACTIVITY_LAYOUT = R.layout.ks_layout_empty;
	
	/**
	 * This is the name of current activity<br />
	 * This name will be displayed in title bar and in About alert dialog
	 */
	protected String ACTIVITY_NAME = "Android Kitchen Sink";
	
	/**
	 * This is the about content of current activity<br />
	 * You should describe which is the main function of this activity<br />
	 * This about content will be displayed in About alert dialog
	 */
	protected String ACTIVITY_INFO = "Android Kitchen Sink<br />"
			+ "Bui Minh Triet - Copyright 2011<br />" 
			+ "Contact: x3cafe@gmail.com";
	/**
	 * This is the about content of current activity<br />
	 * You should describe which resource files using for this Activity, 
	 * 		such as: KSViews.java, AndroidManifest.xml, ks_list_template.xml, ks_list_row.xml...<br />
	 * This about content will be displayed in About alert dialog
	 */
	protected String ACTIVITY_USING_RES = "<b>Java file:</b><br />" +
			"- KSEmpty.java<br />" +
	 		"<b>XML</b><br />" +
	 		"- Main layout: ks_layout_empty<br />" +
	 		"- Layout: ks_custom_titlebar<br />" +
	 		"- Android Manifest<br />" +
	 		"<b>Drawable</b><br />" +
	 		"- N/A<br />";
	
	/*
	 * Please don't override this function.
	 * If you want to setup others, using function BaseActivity#setupOthersView
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mHideTitleBar = setBoolHideTitleBar();
		
		if(mHideTitleBar)
			hideRealTitleBar();
		setupMainLayoutId();
		
		setContentView(ACTIVITY_LAYOUT);
		
		setupOthersInMainLayout();
		
		if(mHideTitleBar) {
			readTitleBarNameFromIntent();
			setupTitleBarNameStr();
			setupTitleBarName();
			setupOthersInTitleBar();
		}
		setupAboutContent();
		
	}
	
	public void readTitleBarNameFromIntent() {
		try {
	        String curActivityName = getIntent().getStringExtra(Constants.BASE_ACIVITY_CLASSNAME);
	        if(curActivityName != null)
	        	ACTIVITY_NAME = curActivityName;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean setBoolHideTitleBar() {
		return true;
	}
	
	public void hideRealTitleBar() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}
	
	private void setupTitleBarName() {
		TextView tvTitleBar = (TextView) findViewById(R.id.ks_titlebar_text);
		if(tvTitleBar!= null)
			tvTitleBar.setText(ACTIVITY_NAME);
		
	}
	
	
	/*
	 * Click button HOME in titlebar will bring user to home screen
	 * @see fr.playsoft.android.CustomTitleListener#btn_home_click(android.view.View)
	 */
	@Override
	public void btn_home_click(View v) {
		Intent intent = new Intent(this, AndSink.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
		finish();
	}
	
	/*
	 * Click button INFO in titlebar will open Alert Dialog
	 * @see fr.playsoft.android.SetupLayoutListener#btn_info_click(android.view.View)
	 */
	@Override
	public void btn_info_click(View v) {
		showAlertDialog(ACTIVITY_NAME, ACTIVITY_INFO, ACTIVITY_USING_RES);
	}

	public void showAlertDialog(String title, String about, String usingRes) {
		new InfoDialog(this, title, about, usingRes).show();
	}
	
}