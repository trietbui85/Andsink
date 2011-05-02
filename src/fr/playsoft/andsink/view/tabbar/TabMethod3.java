package fr.playsoft.andsink.view.tabbar;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabContentFactory;
import android.widget.TextView;
import fr.playsoft.andsink.AndSink;
import fr.playsoft.andsink.Constants;
import fr.playsoft.andsink.R;

public class TabMethod3 extends TabActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tab_default2);
		setTitleBarNameFromIntent();

		setupTabbar();

	}

	private void setupTabbar() {
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		String title;
		
		LayoutInflater mInflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final View v0 =  mInflater.inflate(R.layout.tab_view_content0, null, false);
		final View v1 =  mInflater.inflate(R.layout.tab_view_content1, null, false);
		final View v2 =  mInflater.inflate(R.layout.tab_view_content2, null, false);
		
		// Initialize a TabSpec for each tab and add it to the TabHost
		title = res.getString(R.string.tab1_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_views))
				.setContent(new TabContentFactory() {
					
					public View createTabContent(String tag) {
						return v0;
					}
				});
		tabHost.addTab(spec);

		title = res.getString(R.string.tab2_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_controls))
				.setContent(new TabContentFactory() {
					
					public View createTabContent(String tag) {
						return v1;
					}
				});
		tabHost.addTab(spec);

		title = res.getString(R.string.tab3_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_phone))
				.setContent(new TabContentFactory() {
					
					public View createTabContent(String tag) {
						return v2;
					}
				});
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