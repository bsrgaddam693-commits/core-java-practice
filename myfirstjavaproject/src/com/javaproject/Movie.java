package com.javaproject;

public class Movie {
	static String theatrename="Vijayalakshmi";
	static String theatrelocation="Kaikaluru";
	
	String moviename;
	String moviebudget;
	String moviereleasedate;

	public static void main(String[] args) {
		
		Movie mb=new Movie();
		mb.moviename="Varanasi";
		mb.moviebudget="1500 crores";
		mb.moviereleasedate="April-7-2027";
		
		System.out.println("Theatre name:"+theatrename);
		System.out.println("Theatre location:"+theatrelocation);
		System.out.println("Movie name:"+mb.moviename);
		System.out.println("Movie budget:"+mb.moviebudget);
		System.out.println("Movie releasedate:"+mb.moviereleasedate);
		
		
		
		
		
		
		
		

	}

}
