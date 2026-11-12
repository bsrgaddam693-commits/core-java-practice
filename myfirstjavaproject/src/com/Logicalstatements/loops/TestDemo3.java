package com.Logicalstatements.loops;

import java.util.Scanner;

public class TestDemo3 {
	public static void main(String[]args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		
		int fact =1;
		 for(int i=n;i>=1;i--) {
			 fact = fact*i;
			 
		 }
		 System.out.println("Factorial of a given number is:"+fact);
	}

}
