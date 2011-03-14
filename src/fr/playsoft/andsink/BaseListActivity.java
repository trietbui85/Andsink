package fr.playsoft.andsink;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public abstract class BaseListActivity extends BaseActivity {
	
	public static final String TAG = "BaseListActivity";
	private ListView list;
	protected List<String[]> LISTDATA = new ArrayList<String[]>();
	
	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.ks_list_template;
		
	}
	
	/**
	 * Setup data for LISTDATA here <br />
	 * LISTDATA is a List of @String with structure like this: <br />
	 * [ <br />
	 * &nbsp;&nbsp;&nbsp;&nbsp;STR_TITLE, STR_DESCRIPTION, STR_FULL_PATH_OF_DESTINATION_CLASS
	 *  <br />], <br />
	 * [ ], <br />
	 * Example: <br />
	 * LISTDATA = {<br />
	 * &nbsp;&nbsp;&nbsp;&nbsp;{"Gallery", "Gallery in fullscreen", "fr.playsoft.android.andsink.gallery1"},<br />
	 * &nbsp;&nbsp;&nbsp;&nbsp;{"Gallery Advanced", "Gallery with image downloaded from network", "fr.playsoft.android.andsink.gallery2"}<br />
	 * };<br />
	 */
	public abstract void setupListData();
	
	@Override
	public void setupOthersInMainLayout() {
		setupListData();
		list = (ListView) findViewById(R.id.ks_list_main);
		list.setAdapter(new BaseListAdapter(this, LISTDATA));
		
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
				Intent intent = new Intent();
		        String strClass = getViewListClass(position);
		        intent.setClassName(BaseListActivity.this, strClass);
		        
		        Log.v(TAG, "@pkg=" + strClass + " _compName=" + strClass);        
		        
		        intent.putExtra(Constants.BASE_ACIVITY_CLASSNAME, getViewListName(position));
		        
		        startActivity(intent);
				
			}
		});
	}
	
	private String getViewListClass(int pos) {
    	if(pos >=0 && pos < LISTDATA.size()) {
    		return LISTDATA.get(pos)[2];
    	}
    	return "";
    }
    
    private String getViewListName(int pos) {
    	if(pos >=0 && pos < LISTDATA.size()) {
    		return LISTDATA.get(pos)[0];
    	}
    	return "";
    }
    
	class BaseListAdapter extends BaseAdapter 
	{
	    /** Tag for LogCat **/
	    public static final String TAG = "BaseListAdapter";
	    
		/** Context to use **/
	    private Context mContext;
	    
	    private List<String[]> mListData;
	    
	    /**
	     * Creates video thumbnails adapter.
	     * @param pContext Context to use.
		 * @param lISTDATA
	     */
	    public BaseListAdapter(Context pContext , List<String[]> lISTDATA)
	    {
	        mContext = pContext;
	        mListData = lISTDATA;
	    }
	    
	    public int getCount() 
	    {
	    	return mListData.size();
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
			Holder holder = null;

			if (convertView == null) 
			{ 
				// if it's not recycled, initialize some attributes
				convertView = LayoutInflater.from(mContext).inflate(R.layout.ks_list_row, null);

				holder = new Holder();
				holder.strTitle = (TextView) convertView.findViewById(R.id.ks_list_row_title);
				holder.strDesc = (TextView) convertView.findViewById(R.id.ks_list_row_desc);
				convertView.setTag( holder );
			} 
			else 
			{
				holder = (Holder) convertView.getTag();
			}
			String[] item = mListData.get(position);
			String strItemTitle = item[0];
			String strItemDesc = item[1];
			
			holder.strTitle.setText(strItemTitle);
			holder.strDesc.setText(strItemDesc);
			return convertView;
		}

		private class Holder 
		{
			public TextView strTitle;
			public TextView strDesc;
		}
	}
	
}