package com.example.bandung;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Rumah_Sakit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rumah_sakit);

		Button startBtn = (Button) findViewById(R.id.makeCall1);
		startBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall1();
			}
		});

		Button startBtn2 = (Button) findViewById(R.id.makeCall2);
		startBtn2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall2();
			}
		});
	}

	protected void makeCall1() {
		Log.i("Make call1", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Rumah_Sakit.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall2() {
		Log.i("Make call2", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Rumah_Sakit.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ambulan, menu);
		return true;
	}

}
