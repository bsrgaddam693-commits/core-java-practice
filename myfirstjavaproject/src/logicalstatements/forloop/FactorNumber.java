package logicalstatements.forloop;

import java.util.Scanner;

//write a program to print factor number
//input:12

public class FactorNumber {

	void factor(int n) {
		System.out.println("Factors of " + n + "are:");

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();

		FactorNumber fn = new FactorNumber();
		fn.factor(n);

		sc.close();
	}

}
