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

public class Polisi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_polisi);

		Button center = (Button) findViewById(R.id.sentral);
		center.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Polisi.this, Center.class);
				startActivity(intent);
			}
		});

		Button poldajabar = (Button) findViewById(R.id.poldajabar);
		poldajabar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Polisi.this, Poldajabar.class);
				startActivity(intent);
			}
		});

		Button barat = (Button) findViewById(R.id.barat);
		barat.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Polisi.this, Barat.class);
				startActivity(intent);
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

		Button startBtn7 = (Button) findViewById(R.id.makeCall7);
		startBtn7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall7();
			}
		});

		Button startBtn8 = (Button) findViewById(R.id.makeCall8);
		startBtn8.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall8();
			}
		});

		Button startBtn9 = (Button) findViewById(R.id.makeCall9);
		startBtn9.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall9();
			}
		});

		Button startBtn10 = (Button) findViewById(R.id.makeCall10);
		startBtn10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall10();
			}
		});

		Button startBtn11 = (Button) findViewById(R.id.makeCall11);
		startBtn11.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall11();
			}
		});

		Button startBtn12 = (Button) findViewById(R.id.makeCall12);
		startBtn12.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall12();
			}
		});

		Button startBtn13 = (Button) findViewById(R.id.makeCall13);
		startBtn13.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall13();
			}
		});

		Button startBtn14 = (Button) findViewById(R.id.makeCall14);
		startBtn14.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall14();
			}
		});

		Button startBtn15 = (Button) findViewById(R.id.makeCall15);
		startBtn15.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall15();
			}
		});

		Button startBtn16 = (Button) findViewById(R.id.makeCall16);
		startBtn16.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall16();
			}
		});

		Button startBtn17 = (Button) findViewById(R.id.makeCall17);
		startBtn17.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall17();
			}
		});

		Button startBtn18 = (Button) findViewById(R.id.makeCall18);
		startBtn18.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall18();
			}
		});

		Button startBtn19 = (Button) findViewById(R.id.makeCall19);
		startBtn19.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall19();
			}
		});

		Button startBtn20 = (Button) findViewById(R.id.makeCall20);
		startBtn20.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall20();
			}
		});

		Button startBtn21 = (Button) findViewById(R.id.makeCall21);
		startBtn21.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall21();
			}
		});

		Button startBtn22 = (Button) findViewById(R.id.makeCall22);
		startBtn22.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall22();
			}
		});

		Button startBtn23 = (Button) findViewById(R.id.makeCall23);
		startBtn23.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall23();
			}
		});

		Button startBtn24 = (Button) findViewById(R.id.makeCall24);
		startBtn24.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall24();
			}
		});

		Button startBtn25 = (Button) findViewById(R.id.makeCall25);
		startBtn25.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall25();
			}
		});

		Button startBtn26 = (Button) findViewById(R.id.makeCall26);
		startBtn26.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall26();
			}
		});

		Button startBtn27 = (Button) findViewById(R.id.makeCall27);
		startBtn27.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall27();
			}
		});

		Button startBtn28 = (Button) findViewById(R.id.makeCall28);
		startBtn28.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall28();
			}
		});

		Button startBtn29 = (Button) findViewById(R.id.makeCall29);
		startBtn29.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				makeCall29();
			}
		});

	}

	protected void makeCall29() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall28() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall27() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall26() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall25() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall24() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall23() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall22() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall21() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall20() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall19() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall18() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall17() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall16() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall15() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall14() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall13() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall12() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall11() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall10() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall9() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall8() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall7() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall6() {
		// TODO Auto-generated method stub

		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall5() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	protected void makeCall4() {
		// TODO Auto-generated method stub
		Log.i("Make call", "");

		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:085772021993"));

		try {
			startActivity(phoneIntent);
			finish();
			Log.i("Finished making a call...", "");
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(Polisi.this, "Call faild, please try again later.",
					Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.polisi, (android.view.Menu) menu);
		return true;
	}

}
