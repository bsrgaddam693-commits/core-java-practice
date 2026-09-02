package com.javaproject;

public class Student2 {
	static {
		System.out.println("School students");
	
	}
	
	public static void  Welcome(){
		System.out.println("student no1 called");
		Student2 S3 =new Student2();
		S3.rakesh1();
	}
	
     void method1(){ 
	System.out.println("Student rahul called");
		
	}
	public static void main(String[]args) {
		Welcome();
	System.out.println("main method started");
    Student2 S = new Student2();
 	S.method1();
	} 
 	void rakesh1() {
 		rakesh2();
 		System.out.println("student subbu called");
 	}
 	void rakesh2() {
 		rakesh4();
 		System.out.println("studrnt vamsi called");
 	}
 	static void rakesh4() {
 		System.out.println("student sanjay called");
 	
 		
 	}
}

