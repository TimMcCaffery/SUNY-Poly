package com.example.Poly;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.projecttesting.R;


public class ContactActivity extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact, menu);
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

	//When a button is clicked this method starts
	public void OnDial(View v){
		
		//starts the action dial intent
		Intent OMGHELP = new Intent(Intent.ACTION_DIAL);
		String number = "";
		
		
		//Selects which number they would like to call
		if(v.getId() == R.id.NumUnivPoli){ //Call University Police
			number = "tel:3157927222";
		}else if (v.getId() == R.id.NumAdmissions){ //Call Admissions
			number = "tel:3157927208";
		}else if (v.getId() == R.id.NumCA){ //Call College Association
			number = "tel:3157927341";
		}else if (v.getId() == R.id.NumLibrary){ //Call Library
			number = "tel:3157927245";
		}else if (v.getId() == R.id.NumMail){ //Call Mail Room
			number = "tel:3157927204";
		}else if (v.getId() == R.id.NumResLife){ //Call Res Life
			number = "tel:3157927810";
		}else if (v.getId() == R.id.NumSchoolStore){ //Call School Store
			number = "tel:3157927257";
		}else if (v.getId() == R.id.NumSA){ //Call Student Association
			number = "tel:3157927135";
		}
		
		//Allows your phone to open up the caller so you can contact who is needed
		OMGHELP.setData(Uri.parse(number));
	    startActivity(OMGHELP);
	}
}