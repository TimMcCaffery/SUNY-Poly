package com.example.Poly;

import com.example.projecttesting.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;  
import android.support.v4.app.Fragment;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;
import android.widget.Button;
 public class SunyitFragment extends Fragment {  
      @Override  
      public View onCreateView(LayoutInflater inflater, ViewGroup container,  
                Bundle savedInstanceState) {  
           // TODO Auto-generated method stub  
           View v = inflater.inflate(R.layout.activity_sunyit_fragment, container,false);  
           
           Button  angel = (Button)v.findViewById(R.id.angel);
           Button  banner = (Button)v.findViewById(R.id.Banner);
           Button  cancel = (Button)v.findViewById(R.id.Canned);
           Button  club = (Button)v.findViewById(R.id.Club);
           Button  contact = (Button)v.findViewById(R.id.Contact);
           Button  events = (Button)v.findViewById(R.id.Events);
           Button  prof = (Button)v.findViewById(R.id.Prof);
           Button  store = (Button)v.findViewById(R.id.School);
           Button  laundry = (Button)v.findViewById(R.id.Laundry);
           Button  Media = (Button)v.findViewById(R.id.Media);
           
           final Intent ClubIntent = new Intent(getActivity(), ClubActivity.class);
           final Intent ContactIntent = new Intent(getActivity(), ContactActivity.class);
           final Intent ProfIntent = new Intent(getActivity(), ProfActivity.class);
           final Intent WebViewIntent = new Intent(getActivity(), WebViewActivity.class);
           final Intent MediaIntent = new Intent(getActivity(), MediaActivity.class);
           
           angel.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
            	   
            	   WebViewIntent.putExtra("URL", "https://sunyit.sln.suny.edu/home.asp");
                   startActivity(WebViewIntent);
               }
           });
           
           banner.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
            	   
            	   WebViewIntent.putExtra("URL", "https://banner.sunyit.edu");
                   startActivity(WebViewIntent);
               }
           });
           
           cancel.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
            	   WebViewIntent.putExtra("URL", "https://sunyit.edu/apps/canceled_classes");
                   startActivity(WebViewIntent);
               }
           });
           
           club.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   startActivity(ClubIntent);
               }
           });
           
           contact.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   startActivity(ContactIntent);
               }
           });
          
           events.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
            	   
            	   WebViewIntent.putExtra("URL", "https://sunyit.edu/events");
                   startActivity(WebViewIntent);
               }
           });
           
           laundry.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
            	   String url = "http://m.laundryview.com";
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
           
           prof.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   startActivity(ProfIntent);
               }
           });
           
           store.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
            	   WebViewIntent.putExtra("URL", "http://m.bkstr.com/suny-itstore/home");
                   startActivity(WebViewIntent);
               }
           });
           
           
           return v;
      }  
 }  