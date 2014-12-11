package com.example.projecttesting;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.projecttesting.R;

public class TeachersActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_teachers);
	}

	public void SelectDepartment(View v){
		
		//Staff Intent shows what the choice will be for the Teacher List
		Intent StaffIntent = new Intent(this, SAVEMEActivity.class);
		
		if (v.getId() == R.id.Buisness){
			StaffIntent.putExtra("StaffChoice", "BuisnessAdpt");
			startActivity(StaffIntent);
		} else if (v.getId() == R.id.Nursing){
			StaffIntent.putExtra("StaffChoice", "NursingAdpt");
			startActivity(StaffIntent);
		} else if (v.getId() == R.id.ESM){
			StaffIntent.putExtra("StaffChoice", "ESMAdpt");
			startActivity(StaffIntent);
		} else if (v.getId() == R.id.SocialScience){
			StaffIntent.putExtra("StaffChoice", "SocialAdpt");
			startActivity(StaffIntent);
		} else if (v.getId() == R.id.Communication){
			StaffIntent.putExtra("StaffChoice", "CommAdpt");
			startActivity(StaffIntent);
		} else if (v.getId() == R.id.ComputerScience){
			StaffIntent.putExtra("StaffChoice", "CompSciAdpt");
			startActivity(StaffIntent);
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.teachers, menu);
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
