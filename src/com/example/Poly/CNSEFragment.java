package com.example.Poly;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.projecttesting.R;

public class CNSEFragment extends Fragment {  
     @Override  
     public View onCreateView(LayoutInflater inflater, ViewGroup container,  
               Bundle savedInstanceState) {  
            
          View v = inflater.inflate(R.layout.activity_cnsefragment, container,false);  
          
          Button  BlackBoard = (Button)v.findViewById(R.id.ABlackBoard);
          Button  Contacts = (Button)v.findViewById(R.id.AContacts);
          Button  Clubs = (Button)v.findViewById(R.id.AClub);
          Button  Laundry = (Button)v.findViewById(R.id.ALaundry);
          Button  SchoolStore = (Button)v.findViewById(R.id.AStore);
          Button  Ellucian = (Button)v.findViewById(R.id.AEllucian);
          Button  Intranet = (Button)v.findViewById(R.id.AIntranet);
          Button  Media = (Button)v.findViewById(R.id.AMedia);
          
          
          final Intent ContactIntent = new Intent(getActivity(), AContactActivity.class);
          final Intent WebViewIntent = new Intent(getActivity(), WebViewActivity.class);
          final Intent MediaIntent = new Intent(getActivity(), AMediaActivity.class);
       
        BlackBoard.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
           	   
           	   WebViewIntent.putExtra("URL", "https://blackboard.albany.edu/");
                  startActivity(WebViewIntent);
              }
          });
          
        Clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         	   
         	   WebViewIntent.putExtra("URL", "https://myinvolvement.org/Organizations");
                startActivity(WebViewIntent);
            }
        });
        
        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ContactIntent);
            }
        });
        
        Laundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         	   String url = "http://m.laundryview.com/lvs.php?s=5777";
         	   Intent i = new Intent(Intent.ACTION_VIEW);
         	   i.setData(Uri.parse(url));
         	   startActivity(i);
            }
        });
        
        Media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MediaIntent);
            }
        });
        
        SchoolStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         	   
         	   WebViewIntent.putExtra("URL", "http://albany.bncollege.com/");
                startActivity(WebViewIntent);
            }
        });
        
        Ellucian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         	   
         	   WebViewIntent.putExtra("URL", "https://asurams.gabest.usg.edu/pls/B210/twbkwbis.P_GenMenu?name=homepage");
                startActivity(WebViewIntent);
            }
        });

        Intranet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         	   
         	   WebViewIntent.putExtra("URL", "http://intranet.sunycnse.com/");
                startActivity(WebViewIntent);
            }
        });
        
          return v;
     }  
}  