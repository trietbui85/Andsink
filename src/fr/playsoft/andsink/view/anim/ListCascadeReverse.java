package fr.playsoft.andsink.view.anim;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class ListCascadeReverse extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.view_anim_03_listcascadereverse;
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
		ListView list = (ListView) findViewById(R.id.anim_03_listview);
		list.setAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, 
				getResources().getStringArray(R.array.str_array_Tech_corp)));
        
		list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos, long arg3) {
				Toast.makeText(ListCascadeReverse.this, 
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