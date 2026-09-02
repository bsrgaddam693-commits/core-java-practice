package com.javaproject;

public class Institute {
	static String trianername1="Vishwanath";
	static String trianername2="Srikanth";
	
	int employeeid;
	String employename;
	String employeedesignation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vcube trainers details");
		
		Institute vc=new Institute();
		vc.employeeid=501;
		vc.employename="Vishwanath";
		vc.employeedesignation="Mysql Trainer";
		
		Institute cv=new Institute();
		cv.employeeid=502;
		cv.employename="Srikanth";
		cv.employeedesignation=" Java Trainer";
		
		System.out.println("Trainername:"+trianername1);
	
		System.out.println("Employeeid:"+vc.employeeid);
		System.out.println("Employename:"+vc.employename);
		System.out.println("employeedesignation:"+vc.employeedesignation);
		
		
		System.out.println("Trainername:"+trianername2);
		System.out.println("Employeeid:"+cv.employeeid);
		System.out.println("Employename:"+cv.employename);
		System.out.println("employeedesignation:"+cv.employeedesignation);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
