package com.example.Poly;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.projecttesting.R;

public class MapsActivity extends ActionBarActivity {

    // Volley's request queue
    private RequestQueue requestQueue;
     
    // JSON feed items
    List<JsonItem> jsonItems;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);
		
//		 Uri location = Uri.parse(location); 
//		 Intent MapIntent = new Intent(Intent.ACTION_VIEW, location);
//		 startActivity(MapIntent);
		
		// Initialize the items list
        jsonItems = new ArrayList<JsonItem>();
         
        // Get the reference to the ListView
        ListView MapItems = (ListView) findViewById(R.id.listmapView);
         
        // Create a list adapter
        ArrayAdapter<JsonItem> adapter = new ArrayAdapter<JsonItem>(this,android.R.layout.simple_list_item_1, jsonItems);
        // Set list adapter for the ListView
        MapItems.setAdapter(adapter);
                      
        // Set list view item click listener
        MapItems.setOnItemClickListener(new ListListener(jsonItems, this));
         
        // Create the request queue
        requestQueue = Volley.newRequestQueue(this);
 
        // Read JSON data
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                                    Request.Method.GET,
                                    "https://raw.githubusercontent.com/TimMcCaffery/SUNY-Poly/JSON/map-index.json",
                                    null,
                                    new ClubJsonResponseListener(this, adapter, jsonItems),
                                    new JsonResponseErrorListener(this));
         
        // Add the request to the queue
        requestQueue.add(jsonObjectRequest);
       
        
	}
	
}
