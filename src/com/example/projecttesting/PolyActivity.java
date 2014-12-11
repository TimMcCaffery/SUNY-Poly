package com.example.projecttesting;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.projecttesting.R;


public class PolyActivity extends ActionBarActivity {
	
	//Sends buttons to outside links inside project
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_poly);	
	}
	
	//Button Selection Process, onClick for Angel and Banner Buttons
	public void SelectButton(View v){
		
		//Creates another activity page
		Intent NumIntent = new Intent(this, PolyContactActivity.class);
		Intent WebIntent = new Intent(this, WebActivity.class);
		Intent ClubIntent = new Intent(this, ClubsActivity.class);
		Intent TeacherIntent = new Intent(this, TeachersActivity.class);
		
		String message = "http://www.sunyit.edu/mobile";
		
		//Chooses between the buttons, and selects the url
		switch(v.getId()){
		case R.id.Angel: //Sends To Angel
			message = "https://sunyit.sln.suny.edu/home.asp";
			break;
		case R.id.Banner: //Sends To Banner
			message = "https://banner.sunyit.edu";
			break;
		case R.id.SchoolStore: //Sends to School Store
			message = "http://m.bkstr.com/suny-itstore/home";
			break;
		case R.id.Laundry: //Sends to Laundry
			message = "http://m.laundryview.com";
			break;
		case R.id.CanceledClasses: //Sends to Canceled Classes
			message = "https://sunyit.edu/apps/canceled_classes";
			break;
		}
		
		
		//Selects which activity to start
		if ((v.getId() == R.id.Angel) || (v.getId() == R.id.Banner) || 
				(v.getId() == R.id.SchoolStore) || (v.getId() == R.id.Laundry) ||
				(v.getId() == R.id.CanceledClasses)){
			
			WebIntent.putExtra("URL", message);
			startActivity(WebIntent); //Sends to website page
		
		}else if (v.getId() == R.id.Contacts){
				startActivity(NumIntent); //Sends to Phone Number Page
		}else if (v.getId() == R.id.Clubs){
				ClubIntent.putExtra("ClubChoice", "PolyAdpt");
				startActivity(ClubIntent); // Sends to Club Page
		}else if (v.getId() == R.id.Teachers){
				startActivity(TeacherIntent); // Sends to Teacher Page
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