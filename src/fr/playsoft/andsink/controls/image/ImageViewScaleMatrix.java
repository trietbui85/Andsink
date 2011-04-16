package fr.playsoft.andsink.controls.image;

import android.widget.TextView;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;

public class ImageViewScaleMatrix extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.layout_iv_scale_fitxy; 

		
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInMainLayout() {
		// TODO Auto-generated method stub
		TextView tv1 = (TextView) findViewById(R.id.iv_scale_l1_txt);
		tv1.setText("ImageView w=" + getResources().getDimension(R.dimen.iv_scale_l1_w) +
				", h=" + getResources().getDimension(R.dimen.iv_scale_l1_w));
		
		TextView tv1b = (TextView) findViewById(R.id.iv_scale_l1b_txt);
		tv1b.setText("ImageView w=" + getResources().getDimension(R.dimen.iv_scale_l1b_w) +
				", h=" + getResources().getDimension(R.dimen.iv_scale_l1b_w));
		
		TextView tv2 = (TextView) findViewById(R.id.iv_scale_l2_txt);
		tv2.setText("ImageView w=" + getResources().getDimension(R.dimen.iv_scale_l2_w) +
				", h=" + getResources().getDimension(R.dimen.iv_scale_l2_w));
		
		TextView tv3 = (TextView) findViewById(R.id.iv_scale_l3_txt);
		tv3.setText("ImageView w=" + getResources().getDimension(R.dimen.iv_scale_l3_w) +
				", h=" + getResources().getDimension(R.dimen.iv_scale_l3_w));
		
		TextView tv4 = (TextView) findViewById(R.id.iv_scale_l4_txt);
		tv4.setText("ImageView w=" + getResources().getDimension(R.dimen.iv_scale_l4_w) +
				", h=" + getResources().getDimension(R.dimen.iv_scale_l4_w));
		
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