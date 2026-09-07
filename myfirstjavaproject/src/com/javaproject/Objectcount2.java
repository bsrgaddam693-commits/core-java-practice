package com.javaproject;

public class Objectcount2 {
	static int count=0;
	static
	{
		System.out.println("Static block executed");
	}
	
	{
		count++;
		System.out.println("Insatnce block executed");
	}

	public static void main(String[] args) {
		Objectcount2 obj=new Objectcount2();
		Objectcount2 obj1=new Objectcount2();
		Objectcount2 obj2=new Objectcount2();
		Objectcount2 obj3=new Objectcount2();
		Objectcount2 obj4=new Objectcount2();
		
	System.out.println("Total no of count:"+count);

	}

}
