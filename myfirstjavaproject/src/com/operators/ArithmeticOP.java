package com.operators;

import java.util.Scanner;

public class ArithmeticOP {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		System.out.println("Enter b value");
		int n1 = sc.nextInt();
		
		
		
		System.out.println("Addition of two numbers:"+(n+n1));
		System.out.println("Subraction of two numbers:"+(n-n1));
		System.out.println("Multiplication of two numbers:"+n*n1);
		System.out.println("Division of two numbers:"+n/n1);
		System.out.println("modulus of two numbers:"+n%n1);
	}

}
