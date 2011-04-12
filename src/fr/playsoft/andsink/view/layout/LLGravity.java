/**
 * 
 */
package fr.playsoft.andsink.view.layout;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class LLGravity extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"Gravity by code", 
				"Learn how to set gravity attribute by code", 
				"fr.playsoft.andsink.view.layout.LLGravity1"});
		
		LISTDATA.add(new String[] {"Gravity Top-Left", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity11"});
		LISTDATA.add(new String[] {"Gravity Top-Center", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity12"});
		LISTDATA.add(new String[] {"Gravity Top-Right", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity13"});
		
		LISTDATA.add(new String[] {"Gravity Middle-Left", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity21"});
		LISTDATA.add(new String[] {"Gravity Middle-Center", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity22"});
		LISTDATA.add(new String[] {"Gravity Middle-Right", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity23"});
		
		LISTDATA.add(new String[] {"Gravity Left-Bottom", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity31"});
		LISTDATA.add(new String[] {"Gravity Center-Bottom", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity32"});
		LISTDATA.add(new String[] {"Gravity Right-Bottom", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLGravity33"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Linear Layout Sample"; //Activity name 
		
	}

}
