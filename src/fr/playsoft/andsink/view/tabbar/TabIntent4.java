package fr.playsoft.andsink.view.tabbar;

import fr.playsoft.andsink.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TabIntent4 extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView tv = new TextView(this);
		
		tv.setPadding(5, 5, 5, 5);
		tv.setText(R.string.STR_LOREM_IPSUM_4);
		
		setContentView(tv);
	}
	
}