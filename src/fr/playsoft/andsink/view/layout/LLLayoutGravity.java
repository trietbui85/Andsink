/**
 * 
 */
package fr.playsoft.andsink.view.layout;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class LLLayoutGravity extends BaseListActivity {
	
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
		
		LISTDATA.add(new String[] {"Layout Gravity by code *", 
				"Learn how to set gravity attribute by code", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity1"});
		
		LISTDATA.add(new String[] {"Layout Gravity Top-Left", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity11"});
		LISTDATA.add(new String[] {"Layout Gravity Top-Center", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity12"});
		LISTDATA.add(new String[] {"Layout Gravity Top-Right", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity13"});
		
		LISTDATA.add(new String[] {"Layout Gravity Middle-Left ^", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity21"});
		LISTDATA.add(new String[] {"Layout Gravity Middle-Center ^", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity22"});
		LISTDATA.add(new String[] {"Layout Gravity Middle-Right ^", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity23"});
		
		LISTDATA.add(new String[] {"Layout Gravity Left-Bottom ^", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity31"});
		LISTDATA.add(new String[] {"Layout Gravity Center-Bottom ^", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity32"});
		LISTDATA.add(new String[] {"Layout Gravity Right-Bottom ^", 
				"Learn how to set gravity attribute by xml", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity33"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Linear Layout Sample"; //Activity name 
		
	}

}
