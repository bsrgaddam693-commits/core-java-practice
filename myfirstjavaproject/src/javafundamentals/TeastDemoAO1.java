package javafundamentals;

import java.util.Scanner;

public class TeastDemoAO1 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a anumber");
		int a =sc.nextInt();
		System.out.println("Enater b number");
		int b = sc.nextInt();
		System.out.println("Addition of two numbers:"+(a+b));
		System.out.println("Subtraction of two numbers:"+(a-b));
		System.out.println("Multiplication oSystem.out.println(\"Difference of two numbers:\"+(a-b)); numbers:"+(a/b));
		System.out.println("Modulus of two numbers:"+(a%b));
	}

}
