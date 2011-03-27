package fr.playsoft.andsink.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class ViewVisibility extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.view_anim_layout;		
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInMainLayout() {
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
	    inflater.inflate(R.menu.menu_visibility, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		ImageView img = (ImageView) findViewById(R.id.view_anim_layout_main_img);
		
		switch (item.getItemId()) {
	    case R.id.mi_vis_visible:
	    	Toast.makeText(this, "Image will become VISIBLE", Toast.LENGTH_SHORT).show();
	    	img.setVisibility(View.VISIBLE);
	        return true;
	    case R.id.mi_vis_invisible:
	    	Toast.makeText(this, "Image will become INVISIBLE", Toast.LENGTH_SHORT).show();
	    	img.setVisibility(View.INVISIBLE);
	        return true;
	    case R.id.mi_vis_gone:
	    	Toast.makeText(this, "Image will become DISAPPEARED", Toast.LENGTH_SHORT).show();
	    	img.setVisibility(View.GONE);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
	
}