package fr.playsoft.andsink.view.layout;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class LLWeight extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_ll_5_weight;
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
		// TODO Auto-generated method stub
		Toast.makeText(this, getString(R.string.press_menu), Toast.LENGTH_SHORT).show();
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
	    inflater.inflate(R.menu.menu_ll_5_weight, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		TextView tv = (TextView) findViewById(R.id.layout_ll_5_weight_txt);
		
		switch (item.getItemId()) {
		
	    case R.id.mi_ll5_text_long:
	    	tv.setText(getString(R.string.STR_LOREM_IPSUM_LONG));
	        return true;
	    case R.id.mi_ll5_text_short:
	    	tv.setText(getString(R.string.press_menu));
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
}