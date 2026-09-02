package com.javaproject;

public class Cricketer {
	//static variables
	static int countryid;
	static String countryname;
	//instance variables
	int jerseynumber;
	String cricketername;
	
	

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		System.out.println("Welcome to indian cricket team");
		//initialization
		countryid=91;
		countryname="India";
		System.out.println("countryid:"+countryid);
		System.out.println("countryname:"+countryname);
		
		Cricketer king =new Cricketer();
		king.jerseynumber=18;
		king.cricketername="Virat kohli";
		
		System.out.println("jerseynumber:"+king.jerseynumber);
		System.out.println("cricketername:"+king.cricketername);
		
		Cricketer msd =new Cricketer();
		msd.jerseynumber=7;
		msd.cricketername="Mahendra singh dhoni";
		System.out.println("countryid:"+countryid);
		System.out.println("countryname:"+countryname);
		
		System.out.println("jerseynumber:"+msd.jerseynumber);
		System.out.println("cricketername:"+msd.cricketername);
		
		Cricketer hitman=new Cricketer();
		hitman.jerseynumber=45;
		hitman.cricketername="rohit sharma";
		countryid=92;
		countryname="Bharat";
		System.out.println("countryid:"+countryid);
		System.out.println("countryname:"+countryname);
		
		System.out.println("jerseynumber:"+hitman.jerseynumber);
		System.out.println("cricketername:"+hitman.cricketername);
		
		Cricketer spidey =new Cricketer();
		spidey.jerseynumber=17;
		spidey.cricketername="Rishab pant";
		System.out.println("countryid:"+countryid);
		System.out.println("countryname:"+countryname);
		
		System.out.println("jerseynumber:"+spidey.jerseynumber);
		System.out.println("cricketername:"+spidey.cricketername);
		
		Cricketer hp=new Cricketer();
		hp.jerseynumber=34;
		hp.cricketername="Hardik pandya";
		System.out.println("countryid:"+countryid);
		System.out.println("countryname:"+countryname);
		
		System.out.println("jerseynumber:"+hp.jerseynumber);
		System.out.println("cricketername:"+hp.cricketername);	
		
		
	System.out.println("Main method ended");
	}
}
