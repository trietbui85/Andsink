/**
 * 
 */
package fr.playsoft.andsink.view;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class ViewAnimations extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"Grid Fade", "Grid Fade",	
				"fr.playsoft.andsink.view.anim.GridFade"});
		LISTDATA.add(new String[] {"List Cascade", "List Cascade", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Reverse order", "Reverse order", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Randomize", "Randomize", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Grid Direction", "Grid Direction", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Wave scale", "Wave scale", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Nested Animations", "Nested Animations", 
				"fr.playsoft.andsink.KSEmpty"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "View Animations"; //Activity name 
		
	}

}
