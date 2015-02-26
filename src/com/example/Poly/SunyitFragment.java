package com.example.Poly;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.projecttesting.R;
 public class SunyitFragment extends Fragment {  
      
	 final String[] items = new String[] { "Angel", "Banner", "Canceled Classes",
		        "Clubs", "Contacts", "Events", "Rate My Professor", "School Store",
		        "Laundry", "Maps"};
	 
	 @Override  
      public View onCreateView(LayoutInflater inflater, ViewGroup container,  
                Bundle savedInstanceState) {  
           // TODO Auto-generated method stub  
           View v = inflater.inflate(R.layout.activity_sunyit_fragment, container,false);  
           
           ListView list = (ListView)v.findViewById(R.id.listView1);
           ImageButton facebook = (ImageButton) v.findViewById(R.id.facebook);
           ImageButton twitter = (ImageButton) v.findViewById(R.id.facebook);
           ImageButton linkdin = (ImageButton) v.findViewById(R.id.facebook);
           ImageButton youtube = (ImageButton) v.findViewById(R.id.facebook);
           
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
           list.setAdapter(adapter);
           
           final Intent ClubIntent = new Intent(getActivity(), ClubActivity.class);
           final Intent ContactIntent = new Intent(getActivity(), ContactActivity.class);
           final Intent ProfIntent = new Intent(getActivity(), ProfActivity.class);
           final Intent WebViewIntent = new Intent(getActivity(), WebViewActivity.class);
           final Intent MapIntent = new Intent(getActivity(), MapsActivity.class);
           
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
	            	   Intent Laundry = new Intent(Intent.ACTION_VIEW);
	            	   Laundry.setData(Uri.parse(url));
	            	   startActivity(Laundry);
                 }
				 if(position == 9){ //Maps
	 				 startActivity(MapIntent);
				 }
               }

           });  
           
           addButtonListener(v);
           
           return v;
      }  
	 
		public void addButtonListener(View v) {

			//Creates another activity page
			final Intent WebIntent = new Intent(getActivity(), WebViewActivity.class);
			ImageButton facebookButton = (ImageButton) v.findViewById(R.id.facebook);
			ImageButton twitterButton = (ImageButton) v.findViewById(R.id.twitter);
			ImageButton linkdinButton = (ImageButton) v.findViewById(R.id.linkdin);
			ImageButton youtubeButton = (ImageButton) v.findViewById(R.id.youtube);
			
			
			facebookButton.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					WebIntent.putExtra("URL", "https://www.facebook.com/sunypolytechnic");
					startActivity(WebIntent); //Sends to facebook
				}
			});

			twitterButton.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					WebIntent.putExtra("URL", "https://twitter.com/sunyit");
					startActivity(WebIntent); //Sends to twitter
				}
			});
			
			linkdinButton.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					WebIntent.putExtra("URL", "https://www.linkedin.com/company/suny-institute-of-technology");
					startActivity(WebIntent); //Sends to linkdin
				}
			});
			
			youtubeButton.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					WebIntent.putExtra("URL", "https://www.youtube.com/user/SUNYIT");
					startActivity(WebIntent); //Sends to youtube
				}
			});
		}
	 
 }  