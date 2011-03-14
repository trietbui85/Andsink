/**
 * 
 */
package fr.playsoft.andsink;


/**
 * @author Admin
 *
 */
public class KSViews extends BaseListActivity {
	
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
		ACTIVITY_INFO = "Example about Android Views. You will see many example" +
				" about views, such as:<br />" +
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
		
		LISTDATA.add(new String[] {"Layouts", "BaseLine, LinearLayout, RelativeLayout, " +
				"ScrollView, TableLayout, Tabbar",	"fr.playsoft.andsink.view.Layouts"});
		LISTDATA.add(new String[] {"Layout animation", "Animation when change between views", 
				"fr.playsoft.andsink.view.ViewAnimations"});
		
		LISTDATA.add(new String[] {"Visibility", "Show/hide views", "fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"ListView", "ListView, customize, Adapter, Expandable Listivew...", 
				"fr.playsoft.andsink.KSEmpty"});
		
		LISTDATA.add(new String[] {"Gallery & GridView", "Use Gallery and Grid to show image", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"ImageView & ImageSwitcher", "Learn about Image container", 
				"fr.playsoft.andsink.KSEmpty"});
		
		LISTDATA.add(new String[] {"Theme", "How to change theme of your app", 
				"fr.playsoft.andsink.KSEmpty"});
		LISTDATA.add(new String[] {"Titlebar", "Learn how to customize Android title bar with real and fake", 
				"fr.playsoft.andsink.KSEmpty"});
		
		LISTDATA.add(new String[] {"Activity", "Android Activity", 
				"fr.playsoft.andsink.KSEmpty"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Views"; //Activity name 
		
	}

}
