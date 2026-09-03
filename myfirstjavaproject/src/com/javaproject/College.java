package com.javaproject;

public class College {
	
	int studentid;
	String studentname;
	int marks;
	static int college=101;
	static int collegrmangement=65;
	
	public static void main(String[]args) {
		collegrmangement++;
		College C1 = new College();
		
		C1.studentid=college++;
		C1.studentname="subbu";
		C1.marks=collegrmangement++;
		
		System.out.println("studentid:"+C1.studentid);
		System.out.println("studentname:"+C1.studentname);
		System.out.println("marks:"+C1.marks);
		
		System.out.println("object2 info *****************************************************");
		
		College C2 =new College();
		
		C2.studentid=college++;
		C2.studentname="gani";
		C2.marks=collegrmangement++;
		
		
		System.out.println("studentid:"+C2.studentid);
		System.out.println("studentname:"+C2.studentname);
		System.out.println("marks:"+C2.marks);
		
		
	}

}
