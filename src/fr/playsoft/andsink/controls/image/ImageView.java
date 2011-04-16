/**
 * 
 */
package fr.playsoft.andsink.controls.image;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class ImageView extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"ScaleType ^", "How Image scaleType works",	
				"fr.playsoft.andsink.controls.image.ImageViewScale"});
		
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = getString(R.string.tab2_name); //Activity name 
		
	}

}
