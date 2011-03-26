package fr.playsoft.andsink;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class AndSink extends BaseActivity {
	
	private GridView grid;
	
	private final int[][] GRID_THUMBNAIL_TEXT = {
			{R.drawable.ic_views, R.string.tab1_name},
			{R.drawable.ic_controls, R.string.tab2_name},
			{R.drawable.ic_phone, R.string.tab3_name},
			{R.drawable.ic_android, R.string.tab4_name},
			{R.drawable.ic_android, R.string.tab5_name},
			{R.drawable.ic_mashup, R.string.tab6_name},
			{R.drawable.ic_title_info_default, R.string.tab7_name}
	};
	
	class AndSinkGridAdapter extends BaseAdapter 
	{
	    /** Tag for LogCat **/
	    public static final String TAG = "AndSinkGridAdapter";
	    
		/** Context to use **/
	    private Context mContext;
	    
	    private int[][] mGridArray;
	    
	    /**
	     * Creates video thumbnails adapter.
	     * @param pContext Context to use.
		 * @param pGridArray
	     */
	    public AndSinkGridAdapter(Context pContext , int[][] pGridArray)
	    {
	        mContext = pContext;
	        mGridArray = pGridArray;
	    }
	    
	    public int getCount() 
	    {
	    	return mGridArray.length;
	    }

		public Object getItem(int position) 
		{
			return null;
		}

		public long getItemId(int position) 
		{
			return 0;
		}
		
		/**
		 * Creates a new ImageView for each item referenced by the Adapter.
		 */
		public View getView(final int position, View convertView, ViewGroup parent) 
		{
			GridHolder holder = null;

			if (convertView == null) 
			{ 
				// if it's not recycled, initialize some attributes
				convertView = LayoutInflater.from(mContext).inflate(R.layout.ks_griditem, null);

				holder = new GridHolder();
				holder.mThumbnail = (ImageView) convertView.findViewById(R.id.ks_griditem_thumb);
				holder.mTitle = (TextView) convertView.findViewById(R.id.ks_griditem_title);
				convertView.setTag( holder );
			} 
			else 
			{
				holder = (GridHolder) convertView.getTag();
			}
			
			String gridItemTitle = getString(mGridArray[position][1]);
			int gridItemResId = mGridArray[position][0];
			
			holder.mThumbnail.setBackgroundResource(gridItemResId);
			
			holder.mTitle.setText(gridItemTitle);
			return convertView;
		}

		private class GridHolder 
		{
			public ImageView mThumbnail;
			public TextView mTitle;
		}
	}

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.main;
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInMainLayout() {
		grid = (GridView) findViewById(R.id.ks_grid_main);
		grid.setAdapter(new AndSinkGridAdapter(this, GRID_THUMBNAIL_TEXT));
		
		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
				Intent intent = null;
				switch (position) {
				case 0:
					intent = new Intent(AndSink.this, KSViews.class);
					break;
				case 1:
					intent = new Intent(AndSink.this, KSControls.class);
					break;
				case 2:
					intent = new Intent(AndSink.this, KSEmpty.class);
					break;
				case 3:
					intent = new Intent(AndSink.this, KSEmpty.class);
					break;
				case 4:
					intent = new Intent(AndSink.this, KSNetwork.class);
					break;
				case 5:
					intent = new Intent(AndSink.this, KSEmpty.class);
					break;
				case 6:
					intent = new Intent(AndSink.this, KSEmpty.class);
					break;
				default:
					break;
				}
				if(intent != null)
					startActivity(intent);
			}
		});
		
	}

	@Override
	public void setupOthersInTitleBar() {
		//because we're in HOME screen, show don't show HOME and INFO icon
		((ImageView) findViewById(R.id.ks_btn_title_home)).setVisibility(View.GONE);
		((ImageView) findViewById(R.id.ks_btn_title_info)).setVisibility(View.GONE);
		
		//and make Title text larger
		((TextView) findViewById(R.id.ks_titlebar_text)).setTextSize(
				getResources().getDimension(R.dimen.ks_titlebar_textsize) );
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Android Kitchen Sink"; //Activity name 
		
	}
}
