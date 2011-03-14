package fr.playsoft.andsink.view.anim;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.Constants;
import fr.playsoft.andsink.R;


public class GridFade extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.view_anim_01_gridfade;
	}

	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "The first View Animation: Grid Face<br />";

		ACTIVITY_USING_RES = 
			"<b>Java file:</b><br />" +
	 		"- GridFace.java (main)<br />" +
	 		"- BaseActivity.java (parent)<br />" +
	 		"- Constants.java<br />" +
	 		"<b>Layout</b><br />" +
	 		"- anim_01_gridface.xml (main)<br />" +
	 		"<b>Drawable</b><br />" +
	 		"- All images used here is gotten from Android system and defined" +
	 		" in APP_ICON_RES_GRIDVIEW of Constants.java<br />" +
	 		"<b>Anim</b><br />" +
	 		"- anim_gridfade.xml (main)<br />" +
	 		"- anim_fade.xml <br />" +
	 		"<b>Android Manifest</b><br />" ;
		
	}

	@Override
	public void setupOthersInMainLayout() {
		GridView grid = (GridView) findViewById(R.id.anim_01_grid);
        grid.setAdapter(new GridFadeAdapter());
		
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
	public class GridFadeAdapter extends BaseAdapter {
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView i = new ImageView(GridFade.this);
            
            Drawable icon = getResources().getDrawable(Constants.APP_ICON_RES_GRIDVIEW[position]);
            i.setImageDrawable(icon);
            i.setScaleType(ImageView.ScaleType.FIT_CENTER);
            i.setLayoutParams(new GridView.LayoutParams(48, 48));
            return i;
        }


        public final int getCount() {
            return Constants.APP_ICON_RES_GRIDVIEW.length;
        }

        public final Object getItem(int position) {
            return Constants.APP_ICON_RES_GRIDVIEW[position];
        }

        public final long getItemId(int position) {
            return position;
        }
    }

	
	
}