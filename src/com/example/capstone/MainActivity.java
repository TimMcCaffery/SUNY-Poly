package com.example.capstone;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {
	
	//Sends buttons to outside links inside project
	public final static String EXTRA_MESSAGE = "com.example.capstone.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
	}
	
	//Button Selection Process, onClick for Angel and Banner Buttons
	public void SelectButton(View v){
		
		//Allows you to send things to other activities
		Intent WebIntent = new Intent(this, WebActivity.class);
		Intent NumIntent = new Intent(this, NumberActivity.class);

		String url = "http://www.sunyit.edu/mobile";
		
		//Chooses between the buttons, and selects the url
		switch(v.getId()){
		case R.id.Angel: //Sends To Angel
			url = "https://sunyit.sln.suny.edu/home.asp";
			break;
		case R.id.Banner: //Sends To Banner
			url = "https://sunyit.sln.suny.edu/home.asp";
			break;
		case R.id.SchoolStore: //Sends to School Store
			url= "http://m.bkstr.com/suny-itstore/home";
			break;
		}
		
		//Selects which activity to start
		if ((v.getId() == R.id.Angel) || (v.getId() == R.id.Banner) || 
				(v.getId() == R.id.SchoolStore)){
			
			WebIntent.putExtra(EXTRA_MESSAGE, url);
			startActivity(WebIntent);
		
		}else if (v.getId() == R.id.EmergencyContacts){
			startActivity(NumIntent);
		}

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
