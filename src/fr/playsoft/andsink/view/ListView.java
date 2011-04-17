/**
 * 
 */
package fr.playsoft.andsink.view;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class ListView extends BaseListActivity {
	
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
		LISTDATA.add(new String[] {"Customize UI *", 
				"Customize look-and-feel of ListView instead of default", 
				"fr.playsoft.andsink.view.listview.ListCustomizeUI"});

		LISTDATA.add(new String[] {"Adapter *", "Custom ListView data with adapter", 
				"fr.playsoft.andsink.view.listview.ListAdapter"});
		
		LISTDATA.add(new String[] {"Loading Effect *", "Atractive effect when loading listview", 
				"fr.playsoft.andsink.view.listview.ListEffect"});
		
		LISTDATA.add(new String[] {"Separators *", "Using separator to pagify each section", 
				"fr.playsoft.andsink.view.listview.ListSeparator"});
		
		LISTDATA.add(new String[] {"Choice ListView *", "ListView with single/multiple choce", 
				"fr.playsoft.andsink.view.listview.ListChoiceMode"});
		
		LISTDATA.add(new String[] {"Expandable List *", "Expandle listview", 
				"fr.playsoft.andsink.view.listview.ListExpandable"});
		
		LISTDATA.add(new String[] {"Sample *", 
				"Collective and high quality sample of listview, often use in real project", 
				"fr.playsoft.andsink.view.listview.ListSample"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = getString(R.string.tab1_name); //Activity name 
		
	}

}
