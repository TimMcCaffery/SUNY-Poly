package com.example.Poly;

public class JsonItem {
	     

		private String UticaName = ""; //Name of Utica Topic
	
	    private String name = ""; //Name of Club
	    private String president = ""; //President of Club
	    
	    private String link = ""; // To send the list to onClick
	    
	    private String tid = ""; //ID to lead to website of teacher
	    private String Fname = ""; //First Name of Teacher
	    private String Lname = ""; //Last Name of Teacher
	    private String rating_Num = ""; //Rating Score of Teacher
	    private String rating_Word = ""; //Verbal Score of Teacher
	    
		public String getname() {
	        return name;
	    }
	 
	    public void setname(String name) {
	        this.name = name;
	    }
	 
	    public String getpresident() {
	        return president;
	    }
	 
	    public void setpresident(String president) {
	        this.president = president;
	    }
	    

		public String getTid() {
			return tid;
		}

		public void setTid(String tid) {
			this.tid = tid;
		}

		public String getFname() {
			return Fname;
		}

		public String getLname() {
			return Lname;
		}

		public String getRating_Num() {
			return rating_Num;
		}

		public String getRating_Word() {
			return rating_Word;
		}

		public void setFname(String fname) {
			Fname = fname;
		}

		public void setLname(String lname) {
			Lname = lname;
		}

		public void setRating_Num(String rating_Num) {
			this.rating_Num = rating_Num;
		}

		public void setRating_Word(String rating_Word) {
			this.rating_Word = rating_Word;
		}

		public String getlink(){
			if(tid != ""){
				return "http://www.ratemyprofessors.com/ShowRatings.jsp?tid=" + tid;
			}
	    	return link;
	    }
	    
	    public void setlink(String link){
	    	this.link = link;
	    }
	 
	    @Override
	    public String toString() {
	        String option = "Testing";
	        
	    	if(rating_Word == ""){
	    		option = name + "\n" + president;
	    	}else if(president == ""){
	    		option = Fname + " " + Lname + ": " + rating_Num + " (" + rating_Word +") ";	   
	    	}else if (UticaName != ""){
	    		option = UticaName;
	    	}
	    	
	    	return option;
	    }
	 
}
