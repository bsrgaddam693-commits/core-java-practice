package com.javaproject;

public class Employee {
	void rahul()
	{
	System.out.println("Rahul:flick shot");
	}
	public static void sachin()
	{
		Employee eee=new Employee();
		eee.rahul();
		System.out.println("Sachin:staright drive");
	}
	void surya()
	{
		sachin();
		System.out.println("Surya:supla shot");
	}
	
	public static void dhoni()
	{
		Employee ee=new Employee();
		ee.surya();
		System.out.println("Dhoni:Helicopter shot");
	}
	void rohit()
	{
		dhoni();
		System.out.println("rohit:pull shot");
	}
	
	public  static void virat()
	{
		Employee e=new Employee();
		e.rohit();
		System.out.println("virat:cover drive");
		
	}

	public static void main(String[] args) {
		System.out.println("best shots in cricket");
		virat();
		System.out.println("These are the best shots in cricket");
		

	}

}
