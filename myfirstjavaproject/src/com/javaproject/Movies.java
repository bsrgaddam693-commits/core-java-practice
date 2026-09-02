package com.javaproject;

public class Movies {

	// static variable
	static String Moviename;
	static int Releasedate;

	// instance variable
	String Heroname;
	int Budget;
	int Heroremuniration;

	public static void main(String[] args) {
		Movies M = new Movies();
		System.out.println("main method started");

		Moviename = "Spritr";
		Releasedate = 2026;

		M.Heroname = "prabhas";
		M.Budget = 500;
		M.Heroremuniration = 100;
		
		System.out.println("Moviename:"+Moviename);
		System.out.println("Releasedate:"+Releasedate);
		System.out.println("Heroname:"+M.Heroname);
		System.out.println("Budget:"+M.Budget);
		System.out.println("Heroremuniration:"+M.Heroremuniration);

		Movies M1 = new Movies();	
		M1.Heroname="prabhas";
		M1.Budget=600;
		M1.Heroremuniration=150;
		
		System.out.println("Moviename:"+Moviename);
		System.out.println("Releasedate:"+Releasedate);
		System.out.println("Heroname:"+M1.Heroname);
		System.out.println("Budget:"+M1.Budget);
		System.out.println("Heroremuniration:"+M1.Heroremuniration);
		}
}