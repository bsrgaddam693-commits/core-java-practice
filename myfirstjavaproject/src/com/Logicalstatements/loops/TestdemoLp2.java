package com.Logicalstatements.loops;

import java.util.Scanner;

public class TestdemoLp2 {
	public static void main(String [] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater the number");
		int n =sc.nextInt();
		boolean status=isperfect(n);
		if(status) {
			System.out.println("the given number is perfec:");
		}else{
			System.out.println("the given number is not perfec:");
		}
		System.out.println("Main method ended");
				
	}
	static boolean isperfect(int n) {
		boolean status=false;
				int sum=0;
				
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum =sum+i;
			}
		}
		if(sum == n) {
			status =true;
			
		}
		return status;
	}
	

}
