package com.example.bandung;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Center extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_center);

		Button startBtn = (Button) findViewById(R.id.makeCall1);
		startBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall1();
			}
		});

		Button startBtn2 = (Button) findViewById(R.id.mapcenter);

		startBtn2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Center.this, SenterWeb.class);
				startActivity(intent);
			}
		});

	}

	protected void makeCall1() {
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Center.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.center, menu);
		return true;
	}


}
