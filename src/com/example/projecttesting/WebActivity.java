package com.example.projecttesting;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import com.example.projecttesting.R;

public class WebActivity extends ActionBarActivity {

	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
	
		//Gets URL from CSNE or POLY Activity to use as webpage
	    Intent intent = getIntent();
        String url = intent.getStringExtra("URL");
		
		//Creates the webview along with enabling javascript
		webView = (WebView) findViewById(R.id.wvBrowser);
		webView.getSettings().setJavaScriptEnabled(true);
		
		//loads the url
		webView.loadUrl(url);

	}
}