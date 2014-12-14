package com.example.bandung;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Barat_web extends Activity {
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_barat_web);
		
		WebView browser = (WebView) findViewById(R.id.barat);
		browser.getSettings().setJavaScriptEnabled(true);		
		browser.loadUrl("file:///android_asset/Barat.html");
	}

}