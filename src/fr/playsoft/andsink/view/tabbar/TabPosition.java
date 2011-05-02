/**
 * 
 */
package fr.playsoft.andsink.view.tabbar;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class TabPosition extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"Tab on top", 
				"Default position of tabbar is on Top",	
				"fr.playsoft.andsink.view.tabbar.TabPos1"});
		LISTDATA.add(new String[] {"Tab on bottom", 
				"Make tab on bottom of screen (iPhone-style)",	
				"fr.playsoft.andsink.view.tabbar.TabPos2"});
		LISTDATA.add(new String[] {"Tab in any position", 
				"Tabbar can be in any position of screen",	
				"fr.playsoft.andsink.view.tabbar.TabPos3"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "View Animations"; //Activity name 
		
	}

}
