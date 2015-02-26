package com.example.Poly;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ListListener implements OnItemClickListener {

	// List item's reference
	List<JsonItem> listItems;
	// Calling activity reference
	Activity activity;
	
	public ListListener(List<JsonItem> aListItems, Activity aActivity) {
		// TODO Auto-generated constructor stub
		listItems = aListItems;
		activity  = aActivity;

	}

	public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
		// We create an Intent which is going to display data
        Intent i = new Intent(Intent.ACTION_VIEW);
        // We have to set data for our new Intent
        if(listItems.get(pos).getlink() != ""){
        	i.setData(Uri.parse(listItems.get(pos).getlink()));
        }
        if(listItems.get(pos).getLocation() != ""){
        	i.setData(Uri.parse(listItems.get(pos).getLocation()));
        } 
        // And start activity with our Intent
        activity.startActivity(i);
	}
	
	
}

