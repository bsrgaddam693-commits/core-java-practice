package com.javaproject;

public class Method2 {
	
	
	static void method1()
	{
	System.out.println("method 1 called");
	}
	
	static void method2()
	{
	System.out.println("method 2 called");
	}
	
	 void method3()
	{
	System.out.println("method 3 called");
	}
	
	 void method4()
	{
	System.out.println("method 4 called");
	}
	static
	{
		Method2 m2=new Method2();
		method1();
		method2();
		m2.method3();
		m2.method4();
		
		
		
	}

	public static void main(String[] args) {
		

	}

}
