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
		
//		LISTDATA.add(new String[] {"Layouts", "BaseLine, LinearLayout, RelativeLayout, " +
//				"ScrollView, TableLayout, Tabbar",	"fr.playsoft.andsink.view.Layouts"});
		LISTDATA.add(new String[] {"BaseLine", "One of the most simple layout",	
		"fr.playsoft.andsink.view.layout.KSBaseLine"});
				LISTDATA.add(new String[] {"LinearLayout", "The most popular and useful layout of Android", 
		"fr.playsoft.andsink.view.layout.KSLinearLayout"});
				LISTDATA.add(new String[] {"RelativeLayout", "Relative layout", 
		"fr.playsoft.andsink.KSEmpty"});
				LISTDATA.add(new String[] {"ScrollView", "Scroll view", 
		"fr.playsoft.andsink.KSEmpty"});
				LISTDATA.add(new String[] {"TableLayout", "We don't often use this layout", 
		"fr.playsoft.andsink.KSEmpty"});
				LISTDATA.add(new String[] {"Tab Layout", "Useful, but hard to customize", 
		"fr.playsoft.andsink.KSEmpty"});

		LISTDATA.add(new String[] {"Layout animation", "Animation when change between views", 
				"fr.playsoft.andsink.view.ViewAnimations"});
		
		LISTDATA.add(new String[] {"Background", 
				"Customize layout background with image or drawable resources", 
				"fr.playsoft.andsink.KSEmpty"});
		
		LISTDATA.add(new String[] {"Visibility", "Show/hide views", 
				"fr.playsoft.andsink.view.ViewVisibility"});
		
		LISTDATA.add(new String[] {"ListView", "ListView, customize, Adapter, Expandable Listivew...", 
				"fr.playsoft.andsink.KSEmpty"});
		
		LISTDATA.add(new String[] {"Gallery", "Use Gallery to show image", 
				"fr.playsoft.andsink.KSEmpty"});
		
		LISTDATA.add(new String[] {"GridView", "Use Grid to show image", 
				"fr.playsoft.andsink.KSEmpty"});

	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Views"; //Activity name 
		
	}

}
