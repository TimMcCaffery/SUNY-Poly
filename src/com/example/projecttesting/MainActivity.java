package com.example.projecttesting;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.projecttesting.R;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void SelectSchool(View v){
		
		Intent CNSEIntent = new Intent (this, CNSEActivity.class);
		Intent PolyIntent = new Intent (this, PolyActivity.class);

		if(v.getId() == R.id.sunycnse){
			startActivity(CNSEIntent); //Selects CNSE MAIN PAGE
		}else if(v.getId() == R.id.sunypoly){
			startActivity(PolyIntent); //Selects POLY MAIN PAGE
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
