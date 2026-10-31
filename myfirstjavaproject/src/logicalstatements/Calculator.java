package logicalstatements;

import java.util.Scanner;

public class Calculator {
	

	static void addition(int a, int b) {
		System.out.println("Addition = " + (a + b));
	}

	static void subtraction(int a, int b) {
		System.out.println("Subtraction = " + (a - b));
	}

	static void multiplication(int a, int b) {
		System.out.println("Multiplication = " + (a * b));
	}

	static void division(int a, int b) {
		if (b != 0) {
			System.out.println("Division =" + (a / b));
		}

		else {
			System.out.println("Cannot divided by zero");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number:");
		int a = sc.nextInt();

		System.out.println("Enter a second number:");
		int b = sc.nextInt();

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		System.out.println("Enter your choice:");
		int choice = sc.nextInt();

		switch (choice) {
		case 1 -> addition(a, b);
		case 2 -> subtraction(a, b);
		case 3 -> multiplication(a, b);
		case 4 -> division(a, b);

		default -> System.out.println("Invalid choice");

		}

		sc.close();
	}

}
