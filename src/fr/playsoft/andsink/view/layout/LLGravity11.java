package fr.playsoft.andsink.view.layout;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class LLGravity11 extends BaseActivity {
	
	private LinearLayout ll;
	private CheckBox chkOrientation;
	
	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_ll_4_gravity_11;
	}

	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "Set width and height for Linear Layout." +
				" Can use FILL_PARENT, WRAP_CONTENT or a constant value<br />";

		ACTIVITY_USING_RES = 
			"<b>Java file:</b><br />" +
	 		"- LLWidthHeight.java (main)<br />" +
	 		"- BaseActivity.java (parent)<br />" +
	 		"<b>Layout</b><br />" +
	 		"- layout_ll_1.xml (main)<br />" +
	 		"- ks_custom_titlebar<br />" +
	 		"<b>Drawable</b><br />" +
	 		"- N/A<br />" +
	 		"<b>Value</b><br />" +
	 		"- dimensions.xml<br />" +
	 		"<b>Menu</b><br />" +
	 		"- menu_ll_1.xml<br />" +
	 		"<b>Anim</b><br />" +
	 		"- N/A<br />" +
	 		"<b>Android Manifest</b><br />" ;
		
	}

	@Override
	public void setupOthersInMainLayout() {
		
		ll = (LinearLayout) findViewById(R.id.layout_ll_4_gravity_main);
		chkOrientation = (CheckBox) findViewById(R.id.chkOrientation);
		
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
	public void onCheckboxClick(View v) {
		if(chkOrientation.isChecked()) {
			Toast.makeText(this, "Switch layout to VERTICAL orientation", 
	    			Toast.LENGTH_SHORT).show();
			ll.setOrientation(LinearLayout.VERTICAL);
		}
		else {
			Toast.makeText(this, "Switch layout to HORIZONTAL orientation", 
	    			Toast.LENGTH_SHORT).show();
			ll.setOrientation(LinearLayout.HORIZONTAL);
		}
	}
	
}