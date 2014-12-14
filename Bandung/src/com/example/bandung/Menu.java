package com.example.bandung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);

		Button polisi = (Button) findViewById(R.id.btnPolisi);
		Button pemadam = (Button) findViewById(R.id.btnPemadam);
		Button ambulan = (Button) findViewById(R.id.btnAmbulan);

		polisi.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Menu.this, Polisi.class);
				startActivity(intent);
			}
		});

		pemadam.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Menu.this, Pemadam.class);
				startActivity(intent);
			}
		});

		ambulan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Menu.this, Rumah_Sakit.class);
				startActivity(intent);
			}
		});
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, (android.view.Menu) menu);
		return true;
	}

}
