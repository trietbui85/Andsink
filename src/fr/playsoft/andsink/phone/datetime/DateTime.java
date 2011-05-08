/**
 * 
 */
package fr.playsoft.andsink.phone.datetime;

import fr.playsoft.andsink.BaseListActivity;
import fr.playsoft.andsink.R;


/**
 * @author Admin
 *
 */
public class DateTime extends BaseListActivity {
	
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
		ACTIVITY_INFO = "Example about Android Network. You will see many examples" +
				" about network, such as:<br />" +
				"<b>- Layouts (very important)</b><br />" +
				"- Visibility<br />" +
				"<b>- ListView (very important)</b><br />" +
				"- Layout Animation<br />" +
				"- Focus Effect<br />" +
				"- Gallery & GridView<br />" +
				"- ImageView & ImageSwitcher<br />" +
				"- Theme<br />" +
				"- Customize Window Titlebar<br />" +
				"- Activity"; //Activity About information of this view
		
		 ACTIVITY_USING_RES = "<b>Java file:</b><br />" +
		 		"- KSViews.java<br />" +
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
		
		LISTDATA.add(new String[] {"Date formatting", 
				"Demonstrate examples of Date formatting",	
				"fr.playsoft.andsink.phone.datetime.DateTime1"});
		
		LISTDATA.add(new String[] {"Date formatting with Locale", 
				"Demonstrate examples of Date formatting with different Locale",	
				"fr.playsoft.andsink.phone.datetime.DateTime2"});
		
		LISTDATA.add(new String[] {"Time formatting", 
				"Demonstrate examples of Time formatting",	
				"fr.playsoft.andsink.phone.datetime.DateTime3"});
		
		LISTDATA.add(new String[] {"Time formatting with Locale", 
				"Demonstrate examples of Time formatting with different Locale",	
				"fr.playsoft.andsink.phone.datetime.DateTime4"});
		
		LISTDATA.add(new String[] {"Date&Time formatting", 
				"Demonstrate examples of Date&Time formatting",	
				"fr.playsoft.andsink.phone.datetime.DateTime5"});
		
		LISTDATA.add(new String[] {"Date&Time formatting with Locale", 
				"Demonstrate examples of Date&Time formatting with different Locale",	
				"fr.playsoft.andsink.phone.datetime.DateTime6"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = getString(R.string.tab5_name); //Activity name 
		
	}

}
