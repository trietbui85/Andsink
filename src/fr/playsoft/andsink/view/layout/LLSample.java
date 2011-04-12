/**
 * 
 */
package fr.playsoft.andsink.view.layout;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class LLSample extends BaseListActivity {
	
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
		ACTIVITY_INFO = "LinearLayout is the most important layout of Android." +
				" We'll cover all attributes of this layout:<br />" +
				"- Vertical - Horizontal orientation<br />" +
				"- Set layout width & height with FILL_PARENT, WRAP_CONTENT<br />" +
				"- Set border space with Margin, Padding<br />" +
				"- Use Gravity for alignment<br />" +
				"- Layout weight<br />" +
				"- Customize layout with background<br />";
		
		ACTIVITY_USING_RES = 
				"<b>Java file:</b><br />" +
		 		"- KSLinearLayout.java (main)<br />" +
		 		"- BaseListActivity.java (parent)<br />" +
		 		"<b>Layout</b><br />" +
		 		"- ks_list_template (main)<br />" +
		 		"- ks_list_row.xml, ks_custom_titlebar<br />" +
		 		"<b>Drawable</b><br />" +
		 		"- ks_list_row_selector.xml<br />" +
		 		"<b>Menu</b><br />" +
		 		"- N/A<br />" +
		 		"<b>Anim</b><br />" +
		 		"- N/A<br />" +
		 		"<b>Android Manifest</b><br />" ;

	}

	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.BaseListActivity#setupListData()
	 */
	@Override
	public void setupListData() {
		
		LISTDATA.add(new String[] {"List row 1", 
				"List row with 1 thumbnail, 1 textview & 1 arrow", 
				"fr.playsoft.andsink.view.layout.LLSample1"});
		LISTDATA.add(new String[] {"List row 2", 
				"List row with 1 thumbnail, 2 textview & 1 arrow", 
				"fr.playsoft.andsink.view.layout.LLSample2"});
		LISTDATA.add(new String[] {"List row 3", 
				"List row with 1 thumbnail, 2 textview", 
				"fr.playsoft.andsink.view.layout.LLSample3"});
		LISTDATA.add(new String[] {"List row 4", 
				"Sample Linear Layout with 1 thumbnail, 2 textview", 
				"fr.playsoft.andsink.view.layout.LLSample4"});
		
		LISTDATA.add(new String[] {"Screen layout 1", 
				"Sample Linear Layout with 1 text, 1 image and 2 button", 
				"fr.playsoft.andsink.view.layout.LLSample5"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Linear Layout Sample"; //Activity name 
		
	}

}
