package com.example.Poly;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import android.util.Log;

public class JsonUtils {

	/**
	 * Method fills list with data from the JSON response.
	 */
	public static void fillListclub(JSONObject response, List<JsonItem> items) {
		try{
			// Get the data array containing posts
            JSONArray jsonArray = response.getJSONArray("clubs");
            
            // Get each post data
            for(int i=0; i < jsonArray.length(); i++){
            		// Get an object which represents post
                    JSONObject jsonPostObject = jsonArray.getJSONObject(i);
                    
                    // Create a data object and fill it with data 
                    JsonItem item = new JsonItem();
                    item.setname(jsonPostObject.optString("name"));
                    item.setpresident(jsonPostObject.optString("president"));
                  
                    // Add new object to the list
                    items.add(item);
            }
        }
        catch(Exception e) {
        	// Report problems
            Log.e("ClubVolley::JSONParser", "JSON parsing error!");
        }
	}
	
	public static void fillListTeacher(JSONObject response, List<JsonItem> items) {
		try{
			// Get the data array containing posts
            JSONArray jsonArray = response.getJSONArray("professors");
            
            // Get each post data
            for(int i=0; i < jsonArray.length(); i++){
            		// Get an object which represents post
                    JSONObject jsonPostObject = jsonArray.getJSONObject(i);
                    
                    // Create a data object and fill it with data 
                    JsonItem item = new JsonItem();
                    item.setTid(jsonPostObject.optString("tid"));
                    item.setFname(jsonPostObject.optString("tFname"));
                    item.setLname(jsonPostObject.optString("tLname"));
                    item.setRating_Num(jsonPostObject.optString("overall_rating"));
                    item.setRating_Word(jsonPostObject.optString("rating_class"));
                  
                    // Add new object to the list
                    items.add(item);
            }
        }
        catch(Exception e) {
        	// Report problems
            Log.e("ProfVolley::ProfJSONParser", "JSON parsing error!");
        }
	}
	
}
