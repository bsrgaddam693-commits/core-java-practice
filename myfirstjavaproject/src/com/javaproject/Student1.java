package com.javaproject;

public class Student1 {
	static String collegename="DNR College of Engineering and Technology";
	
	int studentid;
	String studentname;
	int studentmarks;
	

	public static void main(String[] args) {
		System.out.println("Student details of DNRE college");
		
		Student1 vk=new Student1();
		vk.studentid=503;
		vk.studentname="Rohit kumar";
		vk.studentmarks=100;
		System.out.println("Collegename:"+collegename);
		System.out.println("Studentid:"+vk.studentid);
		System.out.println("Studentname:"+vk.studentname);
		System.out.println("Studentmarks:"+vk.studentmarks);
		
		
		
		
		

	}

}
