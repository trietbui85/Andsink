/**
 * 
 */
package fr.playsoft.andsink.view;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class Layouts extends BaseListActivity {
	
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
		ACTIVITY_INFO = "Example about Android Layout. You MUST learn about layout before continue" +
				" working with other Views<br />" +
				"- Baseline<br />" +
				"<b>- LinearLayout (very important)</b><br />" +
				"<b>- RelativeLayout</b><br />" +
				"- ScrollView<br />" +
				"- TableLayout<br />" +
				"<b>- Tab Layout (very important)</b><br />";
		
		 ACTIVITY_USING_RES = "<b>Java file:</b><br />" +
		 		"- KSLayouts.java<br />" +
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
		
		LISTDATA.add(new String[] {"BaseLine", "One of the most simple layout",	
				"fr.playsoft.andsink.view.layout.BaseLine"});
		LISTDATA.add(new String[] {"LinearLayout", "The most popular and useful layout of Android", 
				"fr.playsoft.andsink.view.layout.LinearLayout"});
		LISTDATA.add(new String[] {"RelativeLayout", "Relative layout", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"ScrollView", "Scroll view", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"TableLayout", "We don't often use this layout", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Tab Layout", "Useful, but hard to customize", 
				"fr.playsoft.andsink.KSEmpty"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Layouts"; //Activity name 
		
	}

}
