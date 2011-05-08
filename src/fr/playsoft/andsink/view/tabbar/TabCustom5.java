package fr.playsoft.andsink.view.tabbar;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TextView;
import fr.playsoft.andsink.AndSink;
import fr.playsoft.andsink.R;

public class TabCustom5 extends TabActivity {

	private TabHost tabHost;
	Resources res;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.tab_pos3);
		
		res = getResources(); // Resource object to get Drawables
		
		setupTabbar();

	}
	
	private TabHost.TabSpec createTab0() {
		Intent intent = new Intent().setClass(this, TabIntent0.class);
		String strTitle = res.getString(R.string.tab_custom_1_name);
		TabHost.TabSpec spec = tabHost.newTabSpec(strTitle);
		
		View tabIndicator = LayoutInflater.from(this).inflate(
				R.layout.tab_indicator_layout2, getTabWidget(), false);

		TextView title = (TextView) tabIndicator.findViewById(R.id.tab_label);
		title.setText(strTitle);

		spec.setIndicator(tabIndicator);
		spec.setContent(intent);
		
		return spec;
	}
	
	private TabHost.TabSpec createTab1() {
		Intent intent = new Intent().setClass(this, TabIntent1.class);
		String strTitle = res.getString(R.string.tab_custom_2_name);
		TabHost.TabSpec spec = tabHost.newTabSpec(strTitle);
		
		View tabIndicator = LayoutInflater.from(this).inflate(
				R.layout.tab_indicator_layout2, getTabWidget(), false);

		TextView title = (TextView) tabIndicator.findViewById(R.id.tab_label);
		title.setText(strTitle);

		spec.setIndicator(tabIndicator);
		spec.setContent(intent);
		
		return spec;
	}
	
	private TabHost.TabSpec createTab2() {
		Intent intent = new Intent().setClass(this, TabIntent2.class);
		String strTitle = res.getString(R.string.tab_custom_3_name);
		TabHost.TabSpec spec = tabHost.newTabSpec(strTitle);
		
		View tabIndicator = LayoutInflater.from(this).inflate(
				R.layout.tab_indicator_layout2, getTabWidget(), false);

		TextView title = (TextView) tabIndicator.findViewById(R.id.tab_label);
		title.setText(strTitle);

		spec.setIndicator(tabIndicator);
		spec.setContent(intent);
		
		return spec;
	}
    
	private void setupTabbar() {
		tabHost = getTabHost(); // The activity TabHost
		
		tabHost.addTab(createTab0());
		
		tabHost.addTab(createTab1());
		
		tabHost.addTab(createTab2());
		
		tabHost.setCurrentTab(0);
	}
	
	@SuppressWarnings("unused")
	private void btn_home_click(View v) {
		Intent intent = new Intent(this, AndSink.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
		finish();
	}

}