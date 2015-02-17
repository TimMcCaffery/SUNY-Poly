package com.example.Poly;

import com.example.projecttesting.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;  
import android.support.v4.app.Fragment;  
import android.util.Log;
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
 public class SunyitFragment extends Fragment {  
      
	 final String[] items = new String[] { "Angel", "Banner", "Canceled Classes",
		        "Clubs", "Contacts", "Events", "Rate My Professor", "School Store",
		        "Laundry", "Social Media" };
	 
	 @Override  
      public View onCreateView(LayoutInflater inflater, ViewGroup container,  
                Bundle savedInstanceState) {  
           // TODO Auto-generated method stub  
           View v = inflater.inflate(R.layout.activity_sunyit_fragment, container,false);  
           
           ListView list = (ListView)v.findViewById(R.id.listView1);
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
           list.setAdapter(adapter);
           
           final Intent ClubIntent = new Intent(getActivity(), ClubActivity.class);
           final Intent ContactIntent = new Intent(getActivity(), ContactActivity.class);
           final Intent ProfIntent = new Intent(getActivity(), ProfActivity.class);
           final Intent WebViewIntent = new Intent(getActivity(), WebViewActivity.class);
           final Intent MediaIntent = new Intent(getActivity(), MediaActivity.class);
           
           list.setOnItemClickListener(new OnItemClickListener() {

               @Override
               public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                       long arg3) {

                  if(position == 0){
                	  WebViewIntent.putExtra("URL", "https://sunyit.sln.suny.edu/home.asp");
                      startActivity(WebViewIntent);                	  
                  }
                  if(position == 1){
                	  WebViewIntent.putExtra("URL", "https://banner.sunyit.edu");
                      startActivity(WebViewIntent);  
                  }
				 if(position == 2){
					   WebViewIntent.putExtra("URL", "https://sunyit.edu/apps/canceled_classes");
	                   startActivity(WebViewIntent);
                  }
				 if(position == 3){
					   startActivity(ClubIntent);
				 }
				 if(position == 4){
					 startActivity(ContactIntent);
				 }
				 if(position == 5){
	            	   WebViewIntent.putExtra("URL", "https://sunyit.edu/events");
	                   startActivity(WebViewIntent);
				 }
				 if(position == 6){
					 startActivity(ProfIntent);
                 }
				 if(position == 7){
					   WebViewIntent.putExtra("URL", "http://m.bkstr.com/suny-itstore/home");
	                   startActivity(WebViewIntent);
                 }
				 if(position == 8){
	            	   String url = "http://m.laundryview.com";
	            	   Intent i = new Intent(Intent.ACTION_VIEW);
	            	   i.setData(Uri.parse(url));
	            	   startActivity(i);
                 }
				 if(position == 9){
					 startActivity(MediaIntent);
                 }
               }

           });  
           
           return v;
      }  
 }  