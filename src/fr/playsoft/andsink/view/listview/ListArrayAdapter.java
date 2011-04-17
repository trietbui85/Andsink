/**
 * 
 */
package fr.playsoft.andsink.view.listview;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class ListArrayAdapter extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"Default", 
				"Default ArrayAdapter", 
				"fr.playsoft.andsink.view.listview.ListArrayAdapter1"});
		
		LISTDATA.add(new String[] {"1 textview", 
				"ArrayAdapter with only textview", 
				"fr.playsoft.andsink.view.listview.ListArrayAdapter2"});
		
		LISTDATA.add(new String[] {"2 textviews", 
				"ArrayAdapter with 2 textviews", 
				"fr.playsoft.andsink.view.listview.ListArrayAdapter3"});
		
		LISTDATA.add(new String[] {"2 textview + 1 image", 
				"ArrayAdapter with 2 textviews and 1 image", 
				"fr.playsoft.andsink.view.listview.ListArrayAdapter4"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = getString(R.string.tab1_name); //Activity name 
		
	}

}
