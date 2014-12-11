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

public class SAVEMEActivity extends ActionBarActivity {

	List<Map<String, String>> buisness = new ArrayList<Map<String,String>>();
	List<Map<String, String>> CompSci = new ArrayList<Map<String,String>>();
	List<Map<String, String>> Nursing = new ArrayList<Map<String,String>>();
	List<Map<String, String>> Social = new ArrayList<Map<String,String>>();
	List<Map<String, String>> ESM = new ArrayList<Map<String,String>>();	
	List<Map<String, String>> Comm = new ArrayList<Map<String,String>>();	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_department_staff);
		
		 initList();

		 Intent intent = getIntent();
	     String StaffChoice = intent.getStringExtra("StaffChoice");
		 
		    // We get the ListView component from the layout
		    ListView lv = (ListView) findViewById(R.id.listView);
		    
		    //creates list for departments
		    SimpleAdapter BuisnessAdpt = new SimpleAdapter(this, buisness, android.R.layout.simple_list_item_1, new String[] {"buisness"}, new int[] {android.R.id.text1});
		    SimpleAdapter CompSciAdpt = new SimpleAdapter(this, CompSci, android.R.layout.simple_list_item_1, new String[] {"CompSci"}, new int[] {android.R.id.text1});
		    SimpleAdapter NursingAdpt = new SimpleAdapter(this, Nursing, android.R.layout.simple_list_item_1, new String[] {"Nursing"}, new int[] {android.R.id.text1});
		    SimpleAdapter SocialAdpt = new SimpleAdapter(this, Social, android.R.layout.simple_list_item_1, new String[] {"Social"}, new int[] {android.R.id.text1});
		    SimpleAdapter ESMAdpt = new SimpleAdapter(this, ESM, android.R.layout.simple_list_item_1, new String[] {"ESM"}, new int[] {android.R.id.text1});
		    SimpleAdapter CommAdpt = new SimpleAdapter(this, Comm, android.R.layout.simple_list_item_1, new String[] {"Comm"}, new int[] {android.R.id.text1});

		    //Displays one of the many departments for teachers
		    if(new String("BuisnessAdpt").equals(StaffChoice)){
		    	lv.setAdapter(BuisnessAdpt);
		    }
		    if(new String("CompSciAdpt").equals(StaffChoice)){
		    	lv.setAdapter(CompSciAdpt);
		    }
			if(new String("NursingAdpt").equals(StaffChoice)){
				lv.setAdapter(NursingAdpt);
			}
			if(new String("SocialAdpt").equals(StaffChoice)){
				lv.setAdapter(SocialAdpt);
		    }
			if(new String("ESMAdpt").equals(StaffChoice)){
				lv.setAdapter(ESMAdpt);
		    }
			if(new String("CommAdpt").equals(StaffChoice)){
				lv.setAdapter(CommAdpt);
			}
		    
		    
	}
	
		//Populates lists
	   private void initList() {
		    
		    buisness.add(createTeacher("buisness", "Buisness Department"));
		    buisness.add(createTeacher("buisness", ""));
		    buisness.add(createTeacher("buisness", "Interim Dean:"));
		    buisness.add(createTeacher("buisness", "Robert Yeh"));
		    buisness.add(createTeacher("buisness", " "));
		    buisness.add(createTeacher("buisness", "Academic Coordinators:"));
		    buisness.add(createTeacher("buisness", "SLaura Francis-Gladney"));
		    buisness.add(createTeacher("buisness", "William L. Langdon"));
		    buisness.add(createTeacher("buisness", ""));
		    buisness.add(createTeacher("buisness", "Faculty:"));
		    buisness.add(createTeacher("buisness", "Lisa Berardino"));
		    buisness.add(createTeacher("buisness", "Laura Francis-Gladney"));
		    buisness.add(createTeacher("buisness", "Robert Edgell"));
		    buisness.add(createTeacher("buisness", "J. Allen Hall"));
		    buisness.add(createTeacher("buisness", "Peter Karl"));
		    buisness.add(createTeacher("buisness", "Robert T. Orilio"));
		    buisness.add(createTeacher("buisness", "Naren Peddibhotla"));
		    buisness.add(createTeacher("buisness", "Rafael Romero"));
		    buisness.add(createTeacher("buisness", "Marie-Odile Richard"));
		    buisness.add(createTeacher("buisness", "Kenneth Wallis"));
		    buisness.add(createTeacher("buisness", ""));
		    buisness.add(createTeacher("buisness", "Others:"));
		    buisness.add(createTeacher("buisness", "Hoseoup Lee"));
		    buisness.add(createTeacher("buisness", "Naren Peddibhotla"));
		    buisness.add(createTeacher("buisness", ""));
		    buisness.add(createTeacher("buisness", "Keyboard Specialist:"));
		    buisness.add(createTeacher("buisness", "Jennifer Das"));


		    CompSci.add(createTeacher("CompSci", "Computer Science Department"));
		    CompSci.add(createTeacher("CompSci", ""));
		    CompSci.add(createTeacher("CompSci", "Faculty:"));
		    CompSci.add(createTeacher("CompSci", "Christopher Urban"));
		    CompSci.add(createTeacher("CompSci", " "));
		    CompSci.add(createTeacher("CompSci", "Faculty:"));
		    CompSci.add(createTeacher("CompSci", "Bruno Andriamanalimanana"));
		    CompSci.add(createTeacher("CompSci", "Roger Cavallo"));
		    CompSci.add(createTeacher("CompSci", "Amos Confer"));
		    CompSci.add(createTeacher("CompSci", "John Marsh"));
		    CompSci.add(createTeacher("CompSci", "Nick Merante"));
		    CompSci.add(createTeacher("CompSci", "Rosemary Mullick"));
		    CompSci.add(createTeacher("CompSci", "Jorge Novillo"));
		    CompSci.add(createTeacher("CompSci", "Ronald Sarner"));
		    CompSci.add(createTeacher("CompSci", "Sam Sengupta"));
		    CompSci.add(createTeacher("CompSci", "Scott Spetka"));
		    CompSci.add(createTeacher("CompSci", "Christopher Urban"));
		    CompSci.add(createTeacher("CompSci", ""));
		    CompSci.add(createTeacher("CompSci", "Hoseoup Lee"));
		    CompSci.add(createTeacher("CompSci", "Naren Peddibhotla"));
		    CompSci.add(createTeacher("CompSci", ""));
		    CompSci.add(createTeacher("CompSci", ""));
		    CompSci.add(createTeacher("CompSci", "Engineering Tech:"));
		    CompSci.add(createTeacher("CompSci", ""));
		    CompSci.add(createTeacher("CompSci", "Department Chair:"));
		    CompSci.add(createTeacher("CompSci", "Daniel K. Jones"));
		    CompSci.add(createTeacher("CompSci", ""));
		    CompSci.add(createTeacher("CompSci", "Faculty:"));
		    CompSci.add(createTeacher("CompSci", "Mohammed Abdallah"));
		    CompSci.add(createTeacher("CompSci", "S. Jayne Baran"));
		    CompSci.add(createTeacher("CompSci", "Digendra Das"));
		    CompSci.add(createTeacher("CompSci", "Lawrence R. Dunn"));
		    CompSci.add(createTeacher("CompSci", "Atlas Hsie"));
		    CompSci.add(createTeacher("CompSci", "Daniel K. Jones"));
		    CompSci.add(createTeacher("CompSci", "Mohamed Rezk"));
		    CompSci.add(createTeacher("CompSci", "Douglas J. Holzhauer"));
		    CompSci.add(createTeacher("CompSci", "Michael Mazzatti"));
		    CompSci.add(createTeacher("CompSci", "Anglo-Kamel Tadros"));
		   
		    ESM.add(createTeacher("ESM", "Engineering, Science and Math Departments"));
		    ESM.add(createTeacher("ESM", ""));
		    ESM.add(createTeacher("ESM", "Faculty:"));
		    ESM.add(createTeacher("ESM", "F. Andrew Wolfe"));
		    ESM.add(createTeacher("ESM", "Daniel  S. Benincasa"));
		    ESM.add(createTeacher("ESM", "Timothy E. Busch"));
		    ESM.add(createTeacher("ESM", "Coskun Cetinkaya"));
		    ESM.add(createTeacher("ESM", "Megan Lynne Dischiavo"));
		    ESM.add(createTeacher("ESM", "Andrea Dziubek"));
		    ESM.add(createTeacher("ESM", "Amir Fariborz"));
		    ESM.add(createTeacher("ESM", "Michael Hochberg"));
		    ESM.add(createTeacher("ESM", "Firas Khasawneh"));
		    ESM.add(createTeacher("ESM", "Zhanjie Li"));
		    ESM.add(createTeacher("ESM", "Michael J. Medley"));
		    ESM.add(createTeacher("ESM", "Carlie Phipps"));
		    ESM.add(createTeacher("ESM", "Edmond Rusjan"));
		    ESM.add(createTeacher("ESM", "Narayan Sharma"));
		    ESM.add(createTeacher("ESM", "Mason Somerville"));
		    ESM.add(createTeacher("ESM", "William Thistleton"));
		    ESM.add(createTeacher("ESM", "Zora Thomova"));
		    ESM.add(createTeacher("ESM", "Xinchao “Steven” Wei"));
		    ESM.add(createTeacher("ESM", "Laura Weiser-Erlandson"));
		    ESM.add(createTeacher("ESM", "Yu Zhou"));
		    ESM.add(createTeacher("ESM", ""));
		    ESM.add(createTeacher("ESM", "Staff:"));
		    ESM.add(createTeacher("ESM", "Nancy Lawrence"));
		    ESM.add(createTeacher("ESM", "Linell Machold"));

		    Nursing.add(createTeacher("Nursing", "Nursing Department"));
		    Nursing.add(createTeacher("Nursing", ""));
		    Nursing.add(createTeacher("Nursing", "Department of Nursing and Health Professions Chair"));
		    Nursing.add(createTeacher("Nursing", "Louise Dean-Kelly"));
		    Nursing.add(createTeacher("Nursing", ""));
		    Nursing.add(createTeacher("Nursing", "Faculty:"));
		    Nursing.add(createTeacher("Nursing", "Louise Dean-Kelly"));
		    Nursing.add(createTeacher("Nursing", "Elizabeth Campbell"));
		    Nursing.add(createTeacher("Nursing", "Kathleen Sellers"));
		    Nursing.add(createTeacher("Nursing", "Jennifer Klimek-Yingling"));
		    Nursing.add(createTeacher("Nursing", "Kathleen Marollo"));
		    Nursing.add(createTeacher("Nursing", "Ildiko Monahan"));
		    Nursing.add(createTeacher("Nursing", "Francia Reed"));
		    Nursing.add(createTeacher("Nursing", "Doreen Rogers"));
		    Nursing.add(createTeacher("Nursing", "Kathleen Rourke"));
		    Nursing.add(createTeacher("Nursing", ""));
		    Nursing.add(createTeacher("Nursing", "Part-time Faculty:"));
		    Nursing.add(createTeacher("Nursing", "Mary Lou Wranesh Cook"));
		    Nursing.add(createTeacher("Nursing", "George Markwardt"));
		    Nursing.add(createTeacher("Nursing", "Diane Price"));
		    Nursing.add(createTeacher("Nursing", ""));
		    Nursing.add(createTeacher("Nursing", "Full-time Health Information Management Faculty:"));
		    Nursing.add(createTeacher("Nursing", "Lorraine Kane"));
		    Nursing.add(createTeacher("Nursing", "Jerome Niyirora"));
		    Nursing.add(createTeacher("Nursing", "Donna Silsbee"));
		    Nursing.add(createTeacher("Nursing", ""));
		    Nursing.add(createTeacher("Nursing", "Staff:"));
		    Nursing.add(createTeacher("Nursing", "Christine Paye"));
		    

		    Social.add(createTeacher("Social", "Social Science Department"));
		    Social.add(createTeacher("Social", ""));
		    Social.add(createTeacher("Social", "Department Chair"));
		    Social.add(createTeacher("Social", "Veronica J. Tichenor"));
		    Social.add(createTeacher("Social", ""));
		    Social.add(createTeacher("Social", "Faculty:"));
		    Social.add(createTeacher("Social", "Kazuko Behrens"));
		    Social.add(createTeacher("Social", "Joanne M. Joseph"));
		    Social.add(createTeacher("Social", "Vinod Kool"));
		    Social.add(createTeacher("Social", "Kenneth Mazlen"));
		    Social.add(createTeacher("Social", "Paul H. Schulman"));
		    Social.add(createTeacher("Social", "Veronica J. Tichenor"));
		    Social.add(createTeacher("Social", "Linda Weber"));
	
		    Comm.add(createTeacher("Comm", "Communication Department"));
		    Comm.add(createTeacher("Comm", ""));
		    Comm.add(createTeacher("Comm", "Department Chair:"));
		    Comm.add(createTeacher("Comm", "Steven Schneider"));
		    Comm.add(createTeacher("Comm", ""));
		    Comm.add(createTeacher("Comm", "Program Coordinators:"));
		    Comm.add(createTeacher("Comm", "Mary Krenitsky Perrone"));
		    Comm.add(createTeacher("Comm", "Daryl E. Lee"));
		    Comm.add(createTeacher("Comm", "Kathryn Stam"));
		    Comm.add(createTeacher("Comm", ""));
		    Comm.add(createTeacher("Comm", "Faculty:"));
		    Comm.add(createTeacher("Comm", "Kristina A. Boylan"));
		    Comm.add(createTeacher("Comm", "Maarten Heyboer"));
		    Comm.add(createTeacher("Comm", "Russell Kahn"));
		    Comm.add(createTeacher("Comm", "Ryan Lizardi"));
		    Comm.add(createTeacher("Comm", "Patricia E. Murphy"));
		    Comm.add(createTeacher("Comm", "Ibrahim Yucel"));
		    Comm.add(createTeacher("Comm", ""));
		    Comm.add(createTeacher("Comm", "Staff:"));
		    Comm.add(createTeacher("Comm", "Patricia Sarner"));
		    	

	   }

		private HashMap<String, String> createTeacher(String key, String name) {
		    HashMap<String, String> staff = new HashMap<String, String>();
		    staff.put(key, name);

		    return staff;
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
