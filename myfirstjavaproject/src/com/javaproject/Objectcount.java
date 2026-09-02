package com.javaproject;

public class Objectcount {
	static  int count;
	{
		count++;
	}
	
	
	
	

	public static void main(String[] args) {
		
		Objectcount c=new Objectcount();
		Objectcount c1=new Objectcount();
		Objectcount c2=new Objectcount();
		Objectcount c3=new Objectcount();
		System.out.println("Total no of count:"+count);
		
		
		

	}

}
