/**
 * 
 */
package fr.playsoft.andsink.view.tabbar;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class CreatingTab extends BaseListActivity {
	
	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.SetupLayoutListener#setupOthersInTitleBar()
	 */
	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.SetupLayoutListener#setupAboutContent()
	 */
	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "Example about Android View Animation effect:<br />" +
				"- Grid Fade<br />" +
				"- List Cascade<br />" +
				"- Reverse order<br />" +
				"- Randomize<br />" +
				"- Grid Direction<br />" +
				"- Wave scale<br />" +
				"- Nested Animations<br />";
		
		 ACTIVITY_USING_RES = 
			 "<b>Java file:</b><br />" +
		 		"- ViewAnimations.java<br />" +
		 		"<b>XML</b><br />" +
		 		"- Main layout: ks_list_template<br />" +
		 		"- Layout: ks_list_row.xml, ks_custom_titlebar<br />" +
		 		"- color.xml<br />" +
		 		"- dimensions.xml<br />" +
		 		"- Android Manifest<br />" +
		 		"<b>Drawable</b><br />" +
		 		"- ks_list_row_selector.xml<br />";

	}

	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.BaseListActivity#setupListData()
	 */
	@Override
	public void setupListData() {
		
		LISTDATA.add(new String[] {"Method 1", 
				"Create tabbar from TabHost activity - Intents in content",	
				"fr.playsoft.andsink.view.tabbar.TabMethod1"});
		LISTDATA.add(new String[] {"Method 2", 
				"Create tabbar from TabHost activity - embedded Views in content",	
				"fr.playsoft.andsink.view.tabbar.TabMethod2"});
		LISTDATA.add(new String[] {"Method 3", 
				"Create tabbar from TabHost activity - Views content from TabContentFactory",	
				"fr.playsoft.andsink.view.tabbar.TabMethod3"});
		
		LISTDATA.add(new String[] {"Method 4", 
				"Create tabbar from Activity - Views in content",	
				"fr.playsoft.andsink.view.tabbar.TabMethod4"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "View Animations"; //Activity name 
		
	}

}
