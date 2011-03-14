/**
 * 
 */
package fr.playsoft.andsink;


/**
 * @author Admin
 *
 */
public class KSControls extends BaseListActivity {
	
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
		ACTIVITY_NAME = "Views"; //Activity name 
		ACTIVITY_INFO = "Example about Android Controls. You will see many example" +
				" about controls, such as:<br />" +
				"- Auto complete<br />" +
				"- Button<br />" +
				"- Chronometer<br />" +
				"- Date Time Widget<br />" +
				"- Gauss Control<br />" +
				"- Group Control<br />" +
				"<b>- TextView (important)</b><br />" +
				"- Linkify<br />" +
				"- Marquee<br />" +
				"- Dialog<br />" +
				"- Menu<br />";
		
		 ACTIVITY_USING_RES = "<b>Java file:</b><br />" +
		 		"- KSControls.java<br />" +
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
		
		LISTDATA.add(new String[] {"AutoComplete", "How auto-complete works in Android",	
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Button", "Button & ImageButton control", "fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Chronometer", "What is it??? I don't know", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Date Time Widget", "Date Time control in Android", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Gauss Control", "Progress bar, Seek bar, Rating bar", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Group control", "Radio Group, Spinner", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Text View", "Text view, Text Switcher", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Linkify", "Linkify", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"LogTextBox", "LogTextBox", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Marquee", "Marquee", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Dialog", "Dialog box and Customize Dialog", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Menu & Key", "Android system menu & key",
				"fr.playsoft.andsink.KSEmpty"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Controls"; //Activity name 
		
	}

}
