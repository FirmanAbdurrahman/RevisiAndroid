package com.example.bandung;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SenterWeb extends Activity {
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_senter_web);
		
		WebView browser = (WebView) findViewById(R.id.center);
		browser.getSettings().setJavaScriptEnabled(true);		
		browser.loadUrl("file:///android_asset/Center.html");
	}

}
