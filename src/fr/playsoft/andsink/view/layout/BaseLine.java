package fr.playsoft.andsink.view.layout;

import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class BaseLine extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_bl;
	}

	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "Example about Android BaseLine layout, include:<br />" +
			"- Align Top, Bottom, Center, Everywhere<br />" +
			"- Multiline<br />" +
			"- Relative Alignment<br />" +
			"- Nested layout 1, 2, 3<br />";

		ACTIVITY_USING_RES = "<b>Java file:</b><br />" +
	 		"- BaseLine.java<br />" +
	 		"<b>XML</b><br />" +
	 		"- Main layout: layout_bl.xml<br />" +
	 		"- Layout: layout_bl_nested1.xml, layout_bl_nested12.xml, layout_bl_nested3.xml<br />" +
	 		"- style.xml<br />" +
	 		"- dimensions.xml<br />" +
	 		"- Android Manifest<br />" +
	 		"<b>Drawable</b><br />" +
	 		"- arrow_up_float.png, arrow_down_float.png<br />" +
	 		"- delete.jpg<br />";
		
	}

	@Override
	public void setupOthersInMainLayout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
	
	
	
}