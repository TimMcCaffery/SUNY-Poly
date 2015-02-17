package com.example.Poly;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.example.projecttesting.R;

public class CNSEFragment extends Fragment {  
    
	 final String[] items = new String[] { "BlackBoard", "Clubs", "Contacts",
		        "Ellucian", "Intranet", "Laundry", "School Store", "School Media"};
	
	@Override  
     public View onCreateView(LayoutInflater inflater, ViewGroup container,  
               Bundle savedInstanceState) {  
            
          View v = inflater.inflate(R.layout.activity_cnsefragment, container,false);  
          
          ListView list = (ListView)v.findViewById(R.id.listView2);
          ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
          list.setAdapter(adapter);
          
          final Intent ContactIntent = new Intent(getActivity(), AContactActivity.class);
          final Intent WebViewIntent = new Intent(getActivity(), WebViewActivity.class);
          final Intent MediaIntent = new Intent(getActivity(), AMediaActivity.class);
       
          list.setOnItemClickListener(new OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                      long arg3) {

                 if(position == 0){ //BlackBoard
                 	   WebViewIntent.putExtra("URL", "https://blackboard.albany.edu/");
                        startActivity(WebViewIntent);
                 }
                 if(position == 1){ //Clubs
                	 WebViewIntent.putExtra("URL", "https://myinvolvement.org/Organizations");
                     startActivity(WebViewIntent);
                 }
				 if(position == 2){ //Contacts
					 startActivity(ContactIntent);
                 }
				 if(position == 3){ //Ellucian
				 	 WebViewIntent.putExtra("URL", "https://asurams.gabest.usg.edu/pls/B210/twbkwbis.P_GenMenu?name=homepage");
		             startActivity(WebViewIntent); 
				 }
				 if(position == 4){//Intranet
					  WebViewIntent.putExtra("URL", "http://intranet.sunycnse.com/");
		              startActivity(WebViewIntent);
		          }
				 if(position == 5){//Laundry
					 String url = "http://m.laundryview.com/lvs.php?s=5777";
		         	 Intent i = new Intent(Intent.ACTION_VIEW);
		         	 i.setData(Uri.parse(url));
		         	 startActivity(i);
					 }
				 if(position == 6){//School Store
					  WebViewIntent.putExtra("URL", "http://albany.bncollege.com/");
		              startActivity(WebViewIntent);
					 }
				 if (position == 7){//Social Media
					 startActivity(MediaIntent);
				 }
				 }
				

          });  
       
        
          return v;
     }  
}  