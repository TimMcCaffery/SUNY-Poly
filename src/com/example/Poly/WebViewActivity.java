package com.example.Poly;

import com.example.projecttesting.R;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends ActionBarActivity {

	
	WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		
		//Gets URL from CSNE or POLY Activity to use as webpage
	    Intent intent = getIntent();
        String url = intent.getStringExtra("URL");

		//Creates the webview along with enabling javascript
		webView = (WebView) findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);

		//loads the url
		webView.loadUrl(url);
		
		webView.setWebViewClient(new myWebViewClient());
	}
	
	public class myWebViewClient extends WebViewClient {
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        view.loadUrl(url);
	        return true;
	    }
	}

}
