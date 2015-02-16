package com.example.Poly;

import com.example.projecttesting.R;
import com.example.projecttesting.R.id;
import com.example.projecttesting.R.layout;
import com.example.projecttesting.R.menu;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MediaActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_media);
	}

	
public void SelectButton(View v){
		
		//Creates another activity page
		Intent WebIntent = new Intent(this, WebViewActivity.class);
		
		String message = "http://www.sunyit.edu/mobile";
		
		//Chooses between the buttons, and selects the url
		switch(v.getId()){
		case R.id.facebook: //Sends To Facebook
			message = "https://www.facebook.com/sunypolytechnic";
			break;
		case R.id.Twitter: //Sends To Twitter
			message = "https://twitter.com/sunyit";
			break;
		case R.id.LinkedIn: //Sends to LinkedIn
			message = "https://www.linkedin.com/company/suny-institute-of-technology";
			break;
		case R.id.Youtube: //Sends to Youtube
			message = "https://www.youtube.com/user/SUNYIT";
			break;
		}
		
			
		WebIntent.putExtra("URL", message);
		startActivity(WebIntent); //Sends to website page
		
		
			

	}

}
