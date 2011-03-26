package fr.playsoft.andsink.view.layout;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class LLOrientation extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_ll_2_horizontal;
	}

	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "Set orientation for Linear Layout." +
				" Orientation can be Horizontal or Vertical<br />";

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
		// TODO Auto-generated method stub
		Toast.makeText(this, getString(R.string.press_menu), Toast.LENGTH_LONG).show();
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu_ll_2, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
	    case R.id.mi_ll2_horizontal:
	    	Toast.makeText(this, "Switch to Horizontal", Toast.LENGTH_LONG).show();
	    	setContentView(R.layout.layout_ll_2_horizontal);
	        return true;
	    case R.id.mi_ll2_vertical:
	    	Toast.makeText(this, "Switch to Vertical", Toast.LENGTH_LONG).show();
	    	setContentView(R.layout.layout_ll_2_vertical);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
}