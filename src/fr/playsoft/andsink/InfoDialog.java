/**
 * 
 */
package fr.playsoft.andsink;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Bui Minh Triet
 *
 */
public class InfoDialog extends Dialog {
	
	private String mTitle;
	private String mGeneralInfo;
	private String mUsingResource;
	
	public InfoDialog(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public InfoDialog(Context context, String pTitle, String pGeneralInfo, String pUsingResource) {
		super(context);
		mTitle = pTitle;
		mGeneralInfo = pGeneralInfo;
		mUsingResource = pUsingResource;
		
		/** 'Window.FEATURE_NO_TITLE' - Used to hide the title */
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		initListViewContent();
		setupOKButtonListener();
	}
	
	//found a bug make button not response to click event
	//http://stackoverflow.com/questions/3914810/button-on-custom-dialog-not-responding-to-click-events
	//and here the solution
	//http://stackoverflow.com/questions/4113939/handling-buttons-in-custom-dialogs
	private void setupOKButtonListener() {
		Button dialog_btn = (Button) this.findViewById(R.id.ks_infodialog_ok);
		dialog_btn.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				dismiss();
				
			}
		});
	}

	private void initListViewContent() {
		setContentView(R.layout.ks_infodialog);
		
		TextView tv0 = (TextView) findViewById(R.id.ks_infodialog_tv0);
		TextView tv1 = (TextView) findViewById(R.id.ks_infodialog_tv2);
		TextView tv2 = (TextView) findViewById(R.id.ks_infodialog_tv4);
		
		if(tv0 != null) tv1.setText(mTitle);
		if(tv1 != null) tv1.setText(Html.fromHtml(mGeneralInfo));
		if(tv1 != null) tv2.setText(Html.fromHtml(mUsingResource));
		
	}
	
}
