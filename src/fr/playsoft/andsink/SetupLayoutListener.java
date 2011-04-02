package fr.playsoft.andsink;

import android.app.Activity;
import android.view.View;

/**
 * This SetupLayoutListener interface contains all necessary methods we need when setup a BaseActivity
 * You must implement all these methods unless your activity not run properly
 */
public interface SetupLayoutListener {
	/**
	 * This function is called when button HOME in TitleBar is clicked
	 * @param v View current view
	 */
	public void btn_home_click(View v);
	
	/**
	 * This function is called when button INFO in TitleBar is clicked
	 * @param v View current view
	 */
	public void btn_info_click(View v);
	
	/**
	 * You MUST declare your main layout here, ex: <br />
	 * &nbsp;&nbsp;&nbsp;&nbsp;ACTIVITY_LAYOUT = R.layout.layoutexample;	<br />
	 * Default APP_LAYOUT is <b>layout_empty.xml</b> if you don't declare it here <br />
	 * Note: you MUST call <b>setupMainLayoutId</b> BEFORE calling {@link Activity#setContentView(int)}
	 */
	public void setupMainLayoutId();
	
	/**
	 * Call this method to execute remaining task in onCreate() after setContainView()<br />
	 * Ex: you should put setup code of create Adapter for List / Grid view...
	 */
	public void setupOthersInMainLayout();
	
	/**
	 * Call this function to show or hide title bar.<br />
	 * In default action, title bar is always hidden (return TRUE)
	 * @return true (default) if you want to hide title bar
	 * 			false to show title bar
	 */
	public boolean setBoolHideTitleBar() ;
	
	/**
	 * Call this method to set right title for custom title bar<br />
	 * Ex: <br />
	 * &nbsp;&nbsp;&nbsp;&nbsp;ACTIVITY_NAME = "Views";	//Activity name <br />
	 * If you enter into this Activity from a BaseListActivity, you already have this activity's name set.<br />
	 * Read function {@link #readTitleBarNameFromIntent()} for more detail.
	 */
	public void setupTitleBarNameStr();
	
	/**
	 * this function will check if you pass Activity name from parent window.<br />
	 * If have, it'll take this value as current Activity title name.
	 */
	void readTitleBarNameFromIntent();
	
	/**
	 * Call this method to customize the title bar <br />
	 * Ex: hide/show the HOME and ABOUT icon...
	 */
	public void setupOthersInTitleBar();
	
	/**
	 * You should set About content for you Activity (ex: what is main function of this activity)<br />
	 * Content will be displayed in alert dialog when user clicks on INFO icon <br />
	 * Ex: setup content like this: <br />
	 * &nbsp;&nbsp;&nbsp;&nbsp;ACTIVITY_INFO = "This is an example about Android View";	//Activity About infomation of this view <br />
	 * &nbsp;&nbsp;&nbsp;&nbsp;ACTIVITY_USING_RES = "KSViews.java, AndroidManifest.xml";	//which resource & class file using in this views <br />
	 * You can use HTML tag in these variables' declaration <br />
	 * View example of these declaration in fr.playsoft.andsink.KSViews.java
	 */
	public void setupAboutContent();
	
}
