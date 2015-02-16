package com.example.Poly;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.projecttesting.R;


public class AContactActivity extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acontact);
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
		if(v.getId() == R.id.NumAUnivPoli){ //Call University Police
			number = "tel:5184423131";
		}else if (v.getId() == R.id.NumAAdmissions){ //Call Admissions
			number = "tel:5184425435";
		}else if (v.getId() == R.id.NumAHR){ //Call Human Resources
			number = "tel:5184374700";
		}else if (v.getId() == R.id.NumALibrary){ //Call Library
			number = "tel:5189563600";
		}else if (v.getId() == R.id.NumAMail){ //Call Mail Room
			number = "tel:5184423272";
		}else if (v.getId() == R.id.NumAResLife){ //Call Res Life
			number = "tel:5184425875";
		}else if (v.getId() == R.id.NumASchoolStore){ //Call School Store
			number = "tel:5184425989";
		}else if (v.getId() == R.id.NumASA){ //Call Student Association
			number = "tel:5184425640";
		}
		
		//Allows your phone to open up the caller so you can contact who is needed
		OMGHELP.setData(Uri.parse(number));
	    startActivity(OMGHELP);
	}
}