package com.example.projecttesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.projecttesting.R;

public class ClubsActivity extends ActionBarActivity {

	List<Map<String, String>> Polyclubs = new ArrayList<Map<String,String>>();
	List<Map<String, String>> Albanyclubs = new ArrayList<Map<String,String>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clubs);
		
		 Intent intent = getIntent();
	     String ClubChoice = intent.getStringExtra("ClubChoice");
	     
	     //populates list
		 initList();

		    // We get the ListView component from the layout
		    ListView lv = (ListView) findViewById(R.id.listView);
		    
		    //creates lists of clubs
		    SimpleAdapter PolyAdpt = new SimpleAdapter(this, Polyclubs, android.R.layout.simple_list_item_1, new String[] {"Polyclubs"}, new int[] {android.R.id.text1});
		    SimpleAdapter AlbanyAdpt = new SimpleAdapter(this, Albanyclubs, android.R.layout.simple_list_item_1, new String[] {"Albanyclubs"}, new int[] {android.R.id.text1});

		    //Selects poly clubs or albanys clubs
		    if(new String("PolyAdpt").equals(ClubChoice)){
		    	lv.setAdapter(PolyAdpt);
		    }
		    if(new String("AlbanyAdpt").equals(ClubChoice)){
		    	lv.setAdapter(AlbanyAdpt);
		    }
	}
	

	   private void initList() {
		    // We gunna populate the clubs
		    Polyclubs.add(createClub("Polyclubs", "CLUBS"));
		    Polyclubs.add(createClub("Polyclubs", ""));
		    Polyclubs.add(createClub("Polyclubs", "Club Creaticity"));
		    Polyclubs.add(createClub("Polyclubs", "West Indian African Club(W.I.A.C)"));
		    Polyclubs.add(createClub("Polyclubs", "Black Latino American Student Union(B.L.A.S.U)"));
		    Polyclubs.add(createClub("Polyclubs", "MAGIC"));
		    Polyclubs.add(createClub("Polyclubs", "Wildcats Care"));
		    Polyclubs.add(createClub("Polyclubs", "Television Production Club"));
		    Polyclubs.add(createClub("Polyclubs", "Duel Academy"));
		    Polyclubs.add(createClub("Polyclubs", "Boarders Club"));
		    Polyclubs.add(createClub("Polyclubs", "Anime Club"));
		    Polyclubs.add(createClub("Polyclubs", "Brewers Club"));
		    Polyclubs.add(createClub("Polyclubs", "Students of Christ"));
		    Polyclubs.add(createClub("Polyclubs", "Role Players Guild (RPG)"));
		    Polyclubs.add(createClub("Polyclubs", "Asian Affiliated Association"));
		    Polyclubs.add(createClub("Polyclubs", "Pool Players Club"));
		    Polyclubs.add(createClub("Polyclubs", "BAJA Society of Automotive Engineers (SAE)"));
		    Polyclubs.add(createClub("Polyclubs", "SUNYIT Student Veterans"));
		    Polyclubs.add(createClub("Polyclubs", "International  Student Association(I.S.A)"));
		    Polyclubs.add(createClub("Polyclubs", "Psychology & Sociology Club"));
		    Polyclubs.add(createClub("Polyclubs", "SUNY Cycling Club"));
		    Polyclubs.add(createClub("Polyclubs", "SUNYIT Adventure Club  (ITAC)"));
		    Polyclubs.add(createClub("Polyclubs", "SUNYIT Dance Club"));
		    Polyclubs.add(createClub("Polyclubs", "Gay Straight Alliance (GSA)"));
		    Polyclubs.add(createClub("Polyclubs", "Network & Computer Security (N.C.S)"));
		    Polyclubs.add(createClub("Polyclubs", "Institute of Electrical and Electronics Engineers (IEEE)"));
		    Polyclubs.add(createClub("Polyclubs", "Student Health Information Management Association (SHIMA)"));
		    Polyclubs.add(createClub("Polyclubs", "Communication and Information Design(CID) Club"));
		    Polyclubs.add(createClub("Polyclubs", "Nursing Club"));

		    Albanyclubs.add(createClub("Albanyclubs", "CLUBS"));
		    Albanyclubs.add(createClub("Albanyclubs", ""));
		    Albanyclubs.add(createClub("Albanyclubs", "African Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Albany State Indian Alliance"));
		    Albanyclubs.add(createClub("Albanyclubs", "Asian American Alliance"));
		    Albanyclubs.add(createClub("Albanyclubs", "Chinese Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Chinese Students & Scholars Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Fuerza Latina"));
		    Albanyclubs.add(createClub("Albanyclubs", "Haitian Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Indian Student Organization"));
		    Albanyclubs.add(createClub("Albanyclubs", "Jamaican Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Japanese Anime/Manga Club"));
		    Albanyclubs.add(createClub("Albanyclubs", "Japanese Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Korean Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Korean Graduate Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "La Dolce Vita"));
		    Albanyclubs.add(createClub("Albanyclubs", "Liga Filipina"));
		    Albanyclubs.add(createClub("Albanyclubs", "Muslim Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Nefer Rohu"));
		    Albanyclubs.add(createClub("Albanyclubs", "Pakistani Student Association"));
		    Albanyclubs.add(createClub("Albanyclubs", "Turkish Student Association"));		    
	   }

		private HashMap<String, String> createClub(String key, String name) {
		    HashMap<String, String> clubs = new HashMap<String, String>();
		    clubs.put(key, name);

		    return clubs;
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.saveme, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
