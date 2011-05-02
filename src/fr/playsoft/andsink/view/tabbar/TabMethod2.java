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

public class TabMethod2 extends TabActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tab_default1);
		setTitleBarNameFromIntent();

		setupTabbar();

	}

	private void setupTabbar() {
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

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

	private void btn_home_click(View v) {
		Intent intent = new Intent(this, AndSink.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
		finish();
	}

}