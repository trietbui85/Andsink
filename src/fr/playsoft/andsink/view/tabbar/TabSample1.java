package fr.playsoft.andsink.view.tabbar;

import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;
import fr.playsoft.andsink.BaseTabActivity;
import fr.playsoft.andsink.R;

public class TabSample1 extends BaseTabActivity {

	private TabHost tabHost;
	Resources res;
	
	private void setupTabbar() {
		res = getResources(); // Resource object to get Drawables
		tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab
		
		intent = new Intent().setClass(this, TabIntent0.class);
		spec = tabHost.newTabSpec("tab0");
		spec.setIndicator("tab0", null);
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, TabIntent1.class);
		spec = tabHost.newTabSpec("tab1");
		spec.setIndicator("tab1", null);
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, TabIntent2.class);
		spec = tabHost.newTabSpec("tab2");
		spec.setIndicator("tab2", null);
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, TabIntent3.class);
		spec = tabHost.newTabSpec("tab3");
		spec.setIndicator("tab3", null);
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, TabIntent4.class);
		spec = tabHost.newTabSpec("tab4");
		spec.setIndicator("tab4", null);
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		tabHost.setCurrentTab(0);
		tabHost.getTabWidget().setVisibility(View.GONE);
	}
	
	/**
	 * Called when menu is created.
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_tab_sample1, menu);
		
		return true;
	}
	
	/**
	 * Launched when menu option has been selected.
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item ) 
	{
		switch (item.getItemId()) 
		{
		case R.id.menu_item_actualites:
			tabHost.setCurrentTab(0);
			return true;

		case R.id.menu_item_festival:
			tabHost.setCurrentTab(1);
			return true;

		case R.id.menu_item_multimedia:
			tabHost.setCurrentTab(2);
			return true;

		case R.id.menu_item_orange:
			tabHost.setCurrentTab(3);
			return true;

		case R.id.menu_item_presse:
			tabHost.setCurrentTab(4);
			return true;
		default:
			return false;
		}
	}
	

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.tab_sample1;
		
	}

	@Override
	public void setupOthersInMainLayout() {
		Toast.makeText(this, getString(R.string.press_menu), Toast.LENGTH_LONG).show();
		setupTabbar();
		
	}

	@Override
	public void setupTitleBarNameStr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

}