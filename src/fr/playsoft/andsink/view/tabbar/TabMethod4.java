package fr.playsoft.andsink.view.tabbar;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TabHost;
import fr.playsoft.andsink.AndSink;
import fr.playsoft.andsink.R;

public class TabMethod4 extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.tab_default3);

		setupTabbar();

	}

	private void setupTabbar() {
		Resources res = getResources(); // Resource object to get Drawables
		
		TabHost tabHost = (TabHost) findViewById(R.id.tabhost_main);
		
		//we call setup(mLocalActivityManager) because tab content is Intent
		tabHost.setup();
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		String title;

		// Initialize a TabSpec for each tab and add it to the TabHost
		title = res.getString(R.string.tab1_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_views))
				.setContent(R.id.tab_default_view_0);
		tabHost.addTab(spec);

		title = res.getString(R.string.tab2_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_controls))
				.setContent(R.id.tab_default_view_1);
		tabHost.addTab(spec);

		title = res.getString(R.string.tab3_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_phone))
				.setContent(R.id.tab_default_view_2);
		tabHost.addTab(spec);

	}

	@SuppressWarnings("unused")
	private void btn_home_click(View v) {
		Intent intent = new Intent(this, AndSink.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
		finish();
	}

}