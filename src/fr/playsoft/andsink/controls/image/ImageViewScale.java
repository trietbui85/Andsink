/**
 * 
 */
package fr.playsoft.andsink.controls.image;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class ImageViewScale extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"ScaleType Center", "How Image scaleType Center works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleCenter"});
		
		LISTDATA.add(new String[] {"ScaleType CenterCrop", "How Image scaleType CenterCrop works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleCenterCrop"});
		
		LISTDATA.add(new String[] {"ScaleType CenterInside", "How Image scaleType CenterInside works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleCenterInside"});
		
		LISTDATA.add(new String[] {"ScaleType FitCenter", "How Image FitCenter works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleFitCenter"});
		
		LISTDATA.add(new String[] {"ScaleType FitEnd", "How Image scaleType FitEnd works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleFitEnd"});

		LISTDATA.add(new String[] {"ScaleType FitStart", "How Image scaleType FitStart works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleFitStart"});
		
		LISTDATA.add(new String[] {"ScaleType FitXY", "How Image scaleType FitXY works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleFitXY"});

		LISTDATA.add(new String[] {"ScaleType Matrix *", "How Image scaleType Matrix works",	
				"fr.playsoft.andsink.controls.image.ImageViewScaleMatrix"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = getString(R.string.tab2_name); //Activity name 
		
	}

}
