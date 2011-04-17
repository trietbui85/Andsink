package fr.playsoft.andsink.view.listview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;

public class ListUIDefault extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.lv_default;		
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInMainLayout() {
		// TODO Auto-generated method stub
		ListView listview = (ListView) findViewById(R.id.lv_default_list);
		
		final String[] content = getResources().getStringArray(R.array.str_array_Tech_corp);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, content);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
				Toast.makeText(ListUIDefault.this, "@pos=" + position + " @value=" + content[position], 
						Toast.LENGTH_SHORT).show();
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