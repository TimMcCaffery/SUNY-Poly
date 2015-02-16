package com.example.Poly;

import java.util.List;

import org.json.JSONObject;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.android.volley.Response.Listener;

public class ProfJsonResponseListener implements Listener<JSONObject> {
	// Prof activity context reference
	private Context context;
	
	// JSON feed items
    List<JsonItem> items;
    
    // List adapter reference
    private BaseAdapter adapter;
	
    // Initialize all the attributes
	public ProfJsonResponseListener(Context context, BaseAdapter adapter, List<JsonItem> items) {
		this.context = context;
		this.items = items;
		this.adapter = adapter;
	}
	
	// Called when JSON data is ready to be parsed 
	public void onResponse(JSONObject response) {
		// Parse JSON results
		JsonUtils.fillListTeacher(response, items);
		// Notify the list adapter that the item list is ready
		adapter.notifyDataSetChanged();
		// Display quick info to the user about the success
		//Toast.makeText(context, "Loading done !", Toast.LENGTH_LONG).show();
	}

}
