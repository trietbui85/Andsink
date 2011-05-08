package fr.playsoft.andsink.phone.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;
import fr.playsoft.andsink.resource.StringData;

public class DateTime1 extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.lv_layout_default;
		
	}

	@Override
	public void setupAboutContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupOthersInMainLayout() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2011);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.DATE, 5);
		cal.set(Calendar.HOUR, 20);
		cal.set(Calendar.MINUTE, 25);
		cal.set(Calendar.SECOND, 31);
		
		ListView listview = (ListView) findViewById(R.id.ks_list_main);
		
		View headerView = getLayoutInflater().inflate(R.layout.ks_list_template_header, null);
		listview.addHeaderView(headerView, null, false);
		
		Date d = cal.getTime();
		String header = "You'll convert " + d.toLocaleString() + " to different format";
		TextView txtResult = (TextView) headerView.findViewById(R.id.ks_list_template_header_txt);
		txtResult.setText(header);
		
		String[] strDateFormat = new String[] {
			"yy",
			"yyyy",
			"MM",
			"MMM",
			"MMMM",
			"d",
			"dd",
			"E",
			"EEEE"
		};
		String[] strDateFormatDesc = new String[] {
			"Year - 2 digits",
			"Year - 4 digits",
			"Month - digit",
			"Month - text",
			"Month - full text",
			"Date - 1 digit",
			"Date - 2 digits",
			"Day - short text",
			"Day - full text",
		};
		String[] result = new String[strDateFormat.length];
		
		for(int i = 0; i < strDateFormat.length; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat[i]);
			String txtFormatResult = sdf.format(cal.getTime());
			result[i] = strDateFormat[i] + " (" + strDateFormatDesc[i] + ")\n" + txtFormatResult;
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, result);
		listview.setAdapter(adapter);
		
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