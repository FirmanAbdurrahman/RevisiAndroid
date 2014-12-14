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


public class Barat extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_barat);

		Button startBtn = (Button) findViewById(R.id.makeCall3);
		startBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall3();
			}
		});

		Button startBtn2 = (Button) findViewById(R.id.mapcenter);

		startBtn2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Barat.this, Barat_web.class);
				startActivity(intent);
			}
		});

	}

	protected void makeCall3() {
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Barat.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.barat, menu);
		return true;
	}


}
