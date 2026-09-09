package com.javaproject;

public class Method1 {
	//static methods
	static void method4()
	{
		System.out.println("Method 4 called");
		
	}
	static void method3()
	{
		System.out.println("Method 3 called");
		
	}
	//instance methods
	void method2()
	{
		System.out.println("Method 2 called");
		
	}
	void method1()
	{
		System.out.println("Method 1 called");
	
	method2();
	method3();
	method4();
	}
	

	public static void main(String[] args) {
		Method1 mc=new Method1();
		mc.method1();
		
		

	}

}
