package com.example.capstone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;


public class WebActivity extends Activity {
	
	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		
        Intent intent = getIntent();
        String url = intent.getStringExtra("URL");
		
		
		//Creates the webview along with enabling javascript
		webView = (WebView) findViewById(R.id.wvBrowser);
		webView.getSettings().setJavaScriptEnabled(true);
		
		//loads the url
		webView.loadUrl(url);

	}
	
}