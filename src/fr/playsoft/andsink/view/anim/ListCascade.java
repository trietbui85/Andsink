package fr.playsoft.andsink.view.anim;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class ListCascade extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.view_anim_02_listcascade;
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
		ListView list = (ListView) findViewById(R.id.anim_02_listview);
		list.setAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, 
				getResources().getStringArray(R.array.str_array_Tech_corp)));
		
		AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(50);
        set.addAnimation(animation);

        animation = new TranslateAnimation(
            Animation.RELATIVE_TO_SELF, 0.0f,Animation.RELATIVE_TO_SELF, 0.0f,
            Animation.RELATIVE_TO_SELF, -1.0f,Animation.RELATIVE_TO_SELF, 0.0f
        );
        animation.setDuration(100);
        set.addAnimation(animation);

        LayoutAnimationController controller =
                new LayoutAnimationController(set, 0.5f);
        list.setLayoutAnimation(controller);
        
		list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos, long arg3) {
				Toast.makeText(ListCascade.this, 
						"You click item @pos=" + pos, Toast.LENGTH_SHORT).show();
				
			}
		});
		
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
}