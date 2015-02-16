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
import android.widget.Button;

public class AMediaActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_amedia);
        
	}
	
public void SelectButton(View v){
		
		//Creates another activity page
		Intent WebIntent = new Intent(this, WebViewActivity.class);
		
		String message = "http://www.sunyit.edu/mobile";
		
		//Chooses between the buttons, and selects the url
		switch(v.getId()){
		case R.id.Afacebook: //Sends To Facebook
			message = "https://www.facebook.com/nanocollege";
			break;
		case R.id.ATwitter: //Sends To Banner
			message = "https://twitter.com/cnse";
			break;
		case R.id.ALinkedIn: //Sends to LinkendIn
			message = "https://www.linkedin.com/company/college-of-nanoscale-science-and-engineering?trk=extra_biz_viewers_viewed";
			break;
		case R.id.AYoutube: //Sends to Youtube
			message = "https://www.youtube.com/user/TheNanoCollege";
			break;
		}
		
			
		WebIntent.putExtra("URL", message);
		startActivity(WebIntent); //Sends to website page
		
		
			

	}

	
}
