package com.Logicalstatements.loops;

import java.util.Scanner;

public class TestDemoLp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		factor(n);
	
	}
	static void factor(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
	}

}
