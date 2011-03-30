package fr.playsoft.andsink.view.layout;

import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class LLGravity extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_ll_4_gravity;
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
	    inflater.inflate(R.menu.menu_ll_4_gravity, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		LinearLayout ll = (LinearLayout) findViewById(R.id.layout_ll_4_gravity_main);
		
		switch (item.getItemId()) {
		
	    case R.id.mi_ll4_horizontal:
	    	Toast.makeText(this, "Switch layout to LinearLayout.HORIZONTAL", Toast.LENGTH_SHORT).show();
	    	ll.setOrientation(LinearLayout.HORIZONTAL);
	        return true;
	    case R.id.mi_ll4_vertical:
	    	Toast.makeText(this, "Switch layout to LinearLayout.VERTICAL", 
	    			Toast.LENGTH_SHORT).show();
	    	ll.setOrientation(LinearLayout.VERTICAL);
	        return true;
	        
	    case R.id.mi_ll4_left:
	    	Toast.makeText(this, "Switch layout to Horizontal Gravity.LEFT", 
	    			Toast.LENGTH_SHORT).show();
	    	ll.setHorizontalGravity(Gravity.LEFT);
	    	return true;
	    case R.id.mi_ll4_center:
	    	Toast.makeText(this, "Switch layout to Horizontal Gravity.CENTER_HORIZONTAL", 
	    			Toast.LENGTH_SHORT).show();
	    	ll.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);
	    	return true;
	    case R.id.mi_ll4_right:
	    	Toast.makeText(this, "Switch layout to Horizontal Gravity.RIGHT", 
	    			Toast.LENGTH_SHORT).show();
	    	ll.setHorizontalGravity(Gravity.RIGHT);
	    	
	        return true;
	    case R.id.mi_ll4_top:
	    	Toast.makeText(this, "Switch layout to Vertical Gravity.TOP", 
	    			Toast.LENGTH_SHORT).show();
	    	ll.setVerticalGravity(Gravity.TOP);
	        return true;
	    case R.id.mi_ll4_middle:
	    	Toast.makeText(this, "Switch layout to Vertical Gravity.CENTER_VERTICAL", 
	    			Toast.LENGTH_SHORT).show();
	    	ll.setVerticalGravity(Gravity.CENTER_VERTICAL);
	        return true;
	    case R.id.mi_ll4_bottom:
	    	Toast.makeText(this, "Switch layout to Vertical Gravity.BOTTOM", 
	    			Toast.LENGTH_SHORT).show();
	    	ll.setVerticalGravity(Gravity.BOTTOM);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
}