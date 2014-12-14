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

public class Pemadam extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pemadam);

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

		Button startBtn3 = (Button) findViewById(R.id.makeCall3);
		startBtn3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall3();
			}
		});

		Button startBtn4 = (Button) findViewById(R.id.makeCall4);
		startBtn4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall4();
			}
		});

		Button startBtn5 = (Button) findViewById(R.id.makeCall5);
		startBtn5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall5();
			}
		});

		Button startBtn6 = (Button) findViewById(R.id.makeCall6);
		startBtn6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall6();
			}
		});
	}

	protected void makeCall6() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085318167800"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Pemadam.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall5() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085318167800"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Pemadam.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall4() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085318167800"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Pemadam.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall3() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085318167800"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Pemadam.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall2() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085318167800"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Pemadam.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall1() {
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085318167800"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Pemadam.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pemadam, menu);
		return true;
	}

}
