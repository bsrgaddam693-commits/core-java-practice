package logicalstatements.forloop;

import java.util.Scanner;

public class TestDemo1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Method Sterted");
		System.out.println("Enter a number");
		int n =sc.nextInt();
		infoforloop(n);
		
	}
	static void infoforloop(int n) {
		for(int i=1; i<=n ;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+" Fizz & Buzz:");
			}
			else if(i % 5 == 0) {
				System.out.println(i+" Fizz:");
			}
			else if(i % 3 == 0) {
				System.out.println(i+" Buzz:");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
