package com.example.bandung;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Poldajabar_web extends Activity {
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_poldajabar_web);
		
		WebView browser = (WebView) findViewById(R.id.poldajabar);
		browser.getSettings().setJavaScriptEnabled(true);		
		browser.loadUrl("file:///android_asset/Poldajabar.html");
	}

}