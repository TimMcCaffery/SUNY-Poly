package com.example.projecttesting;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.projecttesting.R;


public class CNSEActivity extends ActionBarActivity {
	
	//Sends buttons to outside links inside project
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cnse);	
	}
	
	//Button Selection Process, onClick for Angel and Banner Buttons
	public void SelectButton(View v){
		
		//Creates another activity page
		Intent NumIntent = new Intent(this, CNSEContactActivity.class);
		Intent WebIntent = new Intent(this, WebActivity.class);
		Intent ClubIntent = new Intent(this, ClubsActivity.class);
		
		String message = "http://www.sunycnse.com/Home.aspx";
		
		//Chooses between the buttons, and selects the url
		switch(v.getId()){
		case R.id.BlackBoard: //Sends To Angel
			message = "https://blackboard.albany.edu";
			break;
		case R.id.Ellucian: //Sends To Banner
			message = "https://asurams.gabest.usg.edu/pls/B210/twbkwbis.P_GenMenu?name=homepage";
			break;
		case R.id.SchoolStore: //Sends to School Store
			message = "http://albany.bncollege.com/";
			break;
		case R.id.Laundry: //Sends to Laundry
			message = "http://m.laundryview.com/lvs.php?s=5777";
			break;
		}
		
		
		//Selects which activity to start
		if ((v.getId() == R.id.BlackBoard) || (v.getId() == R.id.Ellucian) || 
				(v.getId() == R.id.SchoolStore) || (v.getId() == R.id.Laundry)){
			
			WebIntent.putExtra("URL", message);
			startActivity(WebIntent); //Sends to website page
		
		}else if (v.getId() == R.id.Contacts){
				startActivity(NumIntent); //Sends to Phone Number Page
				
		}else if (v.getId() == R.id.Clubs){
				ClubIntent.putExtra("ClubChoice", "AlbanyAdpt");
				startActivity(ClubIntent); //Sends to Club Page
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

	/*
	private void trySetupSwipeRefresh() {
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.MenuLayout);
        if (mSwipeRefreshLayout != null) {
-            mSwipeRefreshLayout.setColorScheme(
+            mSwipeRefreshLayout.setColorSchemeResources(
                    R.color.refresh_progress_1,
                    R.color.refresh_progress_2,
-                    R.color.refresh_progress_3,
-                    R.color.refresh_progress_4);
+                    R.color.refresh_progress_3);
            mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            	
            }@Override
                public void onRefresh() {
            		return;
            }
            }
	}
	*/
}