package com.example.Poly;

import java.util.ArrayList;
import java.util.List;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.projecttesting.R;

import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class ProfActivity extends ActionBarActivity {

    // Volley's request queue
    private RequestQueue requestQueue;
     
    // Search EditText
    EditText inputSearch;
    
    // JSON feed items
    List<JsonItem> jsonItems;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prof);
		 // Initialize the items list
        jsonItems = new ArrayList<JsonItem>();
         
        // Get the reference to the ListView
        ListView TeacherItems = (ListView) findViewById(R.id.listTeacherView);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
         
        // Create a list adapter
        final ArrayAdapter<JsonItem> adapter = new ArrayAdapter<JsonItem>(this,android.R.layout.simple_list_item_1, jsonItems);
        // Set list adapter for the ListView
        TeacherItems.setAdapter(adapter);
        
        //Search Query
        inputSearch.addTextChangedListener(new TextWatcher() {
            
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                adapter.getFilter().filter(cs);   
            }
             
            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                    int arg3) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub                          
            }
        });
        
        // Set list view item click listener
        TeacherItems.setOnItemClickListener(new ListListener(jsonItems, this));
         
        // Create the request queue
        requestQueue = Volley.newRequestQueue(this);
 
        for(int i = 1; i <= 12; i++){
        // Read JSON data
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                                    Request.Method.GET,
                                    "http://www.ratemyprofessors.com/find/professor/?department=&institution=SUNYIT&page=" + i + "&query=*%3A*&queryoption=TEACHER&queryBy=schoolId&sid=4244&sortBy=",
                                    null,
                                    new ProfJsonResponseListener(this, adapter, jsonItems),
                                    new JsonResponseErrorListener(this));
         
        // Add the request to the queue
        requestQueue.add(jsonObjectRequest);
        }
 
	}
}
