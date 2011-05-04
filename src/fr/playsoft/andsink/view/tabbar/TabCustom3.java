package fr.playsoft.andsink.view.tabbar;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import fr.playsoft.andsink.AndSink;
import fr.playsoft.andsink.Constants;
import fr.playsoft.andsink.R;

public class TabCustom3 extends TabActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitleBarNameFromIntent();
		
//		setContentView(R.layout.tab_custom2);
		
		setupTabbar();

	}

	private void setupTabbar() {
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab
		String title;
		View v;
		
		int tabHeight = (int) res.getDimension(R.dimen.tab_custom_height);
		
		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, TabIntent0.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		title = res.getString(R.string.tab_custom_1_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title )
				.setContent(intent);
		tabHost.addTab(spec);
		v = tabHost.getTabWidget().getChildAt(0);
		v.getLayoutParams().height = tabHeight;

		// Do the same for the other tabs
		intent = new Intent().setClass(this, TabIntent1.class);

		title = res.getString(R.string.tab_custom_2_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title )
				.setContent(intent);
		tabHost.addTab(spec);
		v = tabHost.getTabWidget().getChildAt(1);
		v.getLayoutParams().height = tabHeight;

		intent = new Intent().setClass(this, TabIntent2.class);

		title = res.getString(R.string.tab_custom_3_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title)
				.setContent(intent);
		tabHost.addTab(spec);
		v = tabHost.getTabWidget().getChildAt(2);
		v.getLayoutParams().height = tabHeight;

	}

	private void setTitleBarNameFromIntent() {
		try {
			String curActivityName = getIntent().getStringExtra(
					Constants.BASE_ACIVITY_CLASSNAME);
			if (curActivityName != null) {
				TextView tvTitleBar = (TextView) findViewById(R.id.ks_titlebar_text);
				if (tvTitleBar != null)
					tvTitleBar.setText(curActivityName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private void btn_home_click(View v) {
		Intent intent = new Intent(this, AndSink.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
		finish();
	}

}