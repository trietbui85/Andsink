/**
 * 
 */
package fr.playsoft.andsink.view;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class ViewAnimations extends BaseListActivity {
	
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
		ACTIVITY_INFO = "Example about Android View Animation effect:<br />" +
				"- Grid Fade<br />" +
				"- List Cascade<br />" +
				"- Reverse order<br />" +
				"- Randomize<br />" +
				"- Grid Direction<br />" +
				"- Wave scale<br />" +
				"- Nested Animations<br />";
		
		 ACTIVITY_USING_RES = 
			 "<b>Java file:</b><br />" +
		 		"- ViewAnimations.java<br />" +
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
		
		LISTDATA.add(new String[] {"Grid Fade", 
				"GridView has items displayed with Face-in effect (anim by xml)",	
				"fr.playsoft.andsink.view.anim.GridFade"});
		
		LISTDATA.add(new String[] {"Grid Fade Randomize", 
				"GridView has items displayed with Fade-in effect in Randomize order (anim by xml)",	
				"fr.playsoft.andsink.view.anim.GridRandomize"});
		
		LISTDATA.add(new String[] {"Grid Fade Inverse", 
				"GridView has items displayed with Fade-in effect in Inverse order (anim by xml)",	
				"fr.playsoft.andsink.view.anim.GridFadeInverse"});
		
		LISTDATA.add(new String[] {"Grid Wave Scale", 
				"GridView has items displayed with Wave Scale effect (anim by xml)",	
				"fr.playsoft.andsink.view.anim.GridWaveScale"});
		
		LISTDATA.add(new String[] {"List Cascade", 
				"List has items displayed with Cascade effect (anim by code)", 
				"fr.playsoft.andsink.view.anim.ListCascade"});
		
		LISTDATA.add(new String[] {"List Cascade Inverse", 
				"List has items displayed with Cascade effect in Inverse order (anim by xml)", 
				"fr.playsoft.andsink.view.anim.ListCascadeReverse"});
		
		LISTDATA.add(new String[] {"Layout Anim Left", 
				"Layout Anim with moving from right to left effect", 
				"fr.playsoft.andsink.view.anim.LayoutAnimLeft2Right"});
		
		LISTDATA.add(new String[] {"Layout Anim Right", 
				"Layout Anim with moving from left to right effect", 
				"fr.playsoft.andsink.view.anim.LayoutAnimRight2Left"});
		
		LISTDATA.add(new String[] {"Nested Animations", "Nested Animations", 
				"fr.playsoft.andsink.view.anim.NestedAnim"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "View Animations"; //Activity name 
		
	}

}
