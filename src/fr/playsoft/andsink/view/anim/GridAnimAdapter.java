package fr.playsoft.andsink.view.anim;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import fr.playsoft.andsink.Constants;

public class GridAnimAdapter extends BaseAdapter {
	
	private Context context;
	private Activity activity;
	
	public GridAnimAdapter(Activity pActivity) {
		this.context = pActivity.getBaseContext();
		this.activity = pActivity;
	}
	
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(context);
        
        Drawable icon = activity.getResources().getDrawable(Constants.APP_ICON_RES_GRIDVIEW[position]);
        i.setImageDrawable(icon);
        i.setScaleType(ImageView.ScaleType.FIT_CENTER);
        i.setLayoutParams(new GridView.LayoutParams(48, 48));
        return i;
    }


    public final int getCount() {
        return Constants.APP_ICON_RES_GRIDVIEW.length;
    }

    public final Object getItem(int position) {
        return Constants.APP_ICON_RES_GRIDVIEW[position];
    }

    public final long getItemId(int position) {
        return position;
    }
}
