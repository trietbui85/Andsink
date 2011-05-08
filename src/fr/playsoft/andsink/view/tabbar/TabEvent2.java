package fr.playsoft.andsink.view.tabbar;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.TabHost;
import android.widget.Toast;
import fr.playsoft.andsink.AndSink;
import fr.playsoft.andsink.R;

public class TabEvent2 extends TabActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setupTabbar();

	}

	private void setupTabbar() {
		final Resources res = getResources(); // Resource object to get Drawables
		final TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab
		String title;
		View v;

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, TabIntent0.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		title = res.getString(R.string.tab1_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_views))
				.setContent(intent);
		tabHost.addTab(spec);
		v = tabHost.getTabWidget().getChildAt(0);
		v.setTag(title);

		// Do the same for the other tabs
		intent = new Intent().setClass(this, TabIntent1.class);

		title = res.getString(R.string.tab2_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_controls))
				.setContent(intent);
		tabHost.addTab(spec);
		v = tabHost.getTabWidget().getChildAt(1);
		v.setTag(title);

		intent = new Intent().setClass(this, TabIntent2.class);

		title = res.getString(R.string.tab3_name);
		spec = tabHost.newTabSpec(title)
				.setIndicator(title, res.getDrawable(R.drawable.ic_phone))
				.setContent(intent);
		tabHost.addTab(spec);
		v = tabHost.getTabWidget().getChildAt(2);
		v.setTag(title);
		
		int numberOfTabs = tabHost.getTabWidget().getChildCount();
        for(int t=0; t<numberOfTabs; t++){
        	tabHost.getTabWidget().getChildAt(t).setOnTouchListener(new OnTouchListener() {
				
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					if(v != null) {
						int curTabIndex = 0;
						String strTabTag = tabHost.getCurrentTabTag();
						String strCurTag = (String) v.getTag();
						
						if(strCurTag.equals(res.getString(R.string.tab1_name)))
							curTabIndex = 0;
						else if(strCurTag.equals(res.getString(R.string.tab2_name)))
							curTabIndex = 1;
						else if(strCurTag.equals(res.getString(R.string.tab3_name)))
							curTabIndex = 2;
						if(event.getAction() == MotionEvent.ACTION_DOWN) {
							Toast.makeText(TabEvent2.this, "TouchDOWN on tab " + strCurTag, 
									Toast.LENGTH_SHORT).show();
							Log.d("TabEvent", "onTouch DOWN @strTabTag=" + strTabTag + 
									" @strCurTag=" + strCurTag);
						}
						else {
							Toast.makeText(TabEvent2.this, "TouchUP on tab " + strCurTag, 
									Toast.LENGTH_SHORT).show();
							Log.d("TabEvent", "onTouch UP @strTabTag=" + strTabTag + 
									" @strCurTag=" + strCurTag);
							tabHost.setCurrentTab(curTabIndex);
						}
					}
					return false;
				}
			});
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