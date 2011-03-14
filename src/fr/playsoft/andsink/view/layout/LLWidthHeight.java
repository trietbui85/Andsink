package fr.playsoft.andsink.view.layout;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class LLWidthHeight extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_ll_1;
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
	    inflater.inflate(R.menu.menu_ll_1, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		LinearLayout ll = (LinearLayout) findViewById(R.id.layout_ll_1);
		LayoutParams params = ll.getLayoutParams();
		
		switch (item.getItemId()) {
	    case R.id.mi_width_fillparent:
	    	params = new LinearLayout.LayoutParams(
	    			LinearLayout.LayoutParams.FILL_PARENT,
	    			params.height
	    	);
	    	ll.setLayoutParams(params);
	        return true;
	    case R.id.mi_width_wrapcontent:
	    	params = new LinearLayout.LayoutParams(
	    			LinearLayout.LayoutParams.WRAP_CONTENT,
	    			params.height
	    	);
	    	ll.setLayoutParams(params);
	        return true;
	    case R.id.mi_width_const:
	    	params = new LinearLayout.LayoutParams(
	    			(int) getResources().getDimension(R.dimen.layout_ll_w200),
	    			params.height
	    	);
	    	ll.setLayoutParams(params);
	        return true;
	    case R.id.mi_height_fillparent:
	    	params = new LinearLayout.LayoutParams(
	    			params.width,
	    			LinearLayout.LayoutParams.FILL_PARENT
	    	);
	    	ll.setLayoutParams(params);
	        return true;
	    case R.id.mi_height_wrapcontent:
	    	params = new LinearLayout.LayoutParams(
	    			params.width,
	    			LinearLayout.LayoutParams.WRAP_CONTENT
	    	);
	    	ll.setLayoutParams(params);
	        return true;
	    case R.id.mi_height_const:
	    	params = new LinearLayout.LayoutParams(
	    			params.width,
	    			(int) getResources().getDimension(R.dimen.layout_ll_h100)
	    	);
	    	ll.setLayoutParams(params);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
}