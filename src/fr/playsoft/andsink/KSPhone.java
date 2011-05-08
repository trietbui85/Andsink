/**
 * 
 */
package fr.playsoft.andsink;


/**
 * @author Admin
 *
 */
public class KSPhone extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"Date & time", 
				"Date and time in your phone",	
				"fr.playsoft.andsink.phone.datetime.DateTime"});
		
		LISTDATA.add(new String[] {"Multimedia", 
				"Audio, Video, Camera, Gallery...",	
				"fr.playsoft.andsink.Empty"});
		
		LISTDATA.add(new String[] {"Geolocation", 
				"Using Geolocation in Android",	
				"fr.playsoft.andsink.Empty"});
		
		LISTDATA.add(new String[] {"Physics", 
				"Vibrate, Accelerometer, Compass",	
				"fr.playsoft.andsink.Empty"});
		
		LISTDATA.add(new String[] {"Push Notification", 
				"Using Push Notification in Android",	
				"fr.playsoft.andsink.Empty"});
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = getString(R.string.tab5_name); //Activity name 
		
	}

}
