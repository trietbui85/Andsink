package fr.playsoft.andsink.controls.image;

import android.widget.TextView;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;

public class ImageViewScaleCenter extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_iv_scale_center; 

		
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInMainLayout() {
		TextView tv1 = (TextView) findViewById(R.id.iv_scale_l1_txt);
		tv1.setText("ImageView w=" + (int)getResources().getDimension(R.dimen.iv_scale_l1_w) +
				", h=" + (int)getResources().getDimension(R.dimen.iv_scale_l1_h));
		
		TextView tv1b = (TextView) findViewById(R.id.iv_scale_l1b_txt);
		tv1b.setText("ImageView w=" + (int)getResources().getDimension(R.dimen.iv_scale_l1b_w) +
				", h=" + (int)getResources().getDimension(R.dimen.iv_scale_l1b_h));
		
		TextView tv2 = (TextView) findViewById(R.id.iv_scale_l2_txt);
		tv2.setText("ImageView w=" + (int)getResources().getDimension(R.dimen.iv_scale_l2_w) +
				", h=" + (int)getResources().getDimension(R.dimen.iv_scale_l2_h));
		
		TextView tv3 = (TextView) findViewById(R.id.iv_scale_l3_txt);
		tv3.setText("ImageView w=" + (int)getResources().getDimension(R.dimen.iv_scale_l3_w) +
				", h=" + (int)getResources().getDimension(R.dimen.iv_scale_l3_h));
		
		TextView tv4 = (TextView) findViewById(R.id.iv_scale_l4_txt);
		tv4.setText("ImageView w=" + (int)getResources().getDimension(R.dimen.iv_scale_l4_w) +
				", h=" + (int)getResources().getDimension(R.dimen.iv_scale_l4_h));
		
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
	
	
	
}