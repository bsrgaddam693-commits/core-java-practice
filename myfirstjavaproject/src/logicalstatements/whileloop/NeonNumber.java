package logicalstatements.whileloop;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int square = n * n;
		int r = 0;
		int sum = 0;

		while (square > 0) {
			r = square % 10;
			sum = sum + r;
			square = square / 10;

		}
		if (sum == n) {
			System.out.println("It is a Neon Number");
		} else {
			System.out.println("It is not a Neon Number");
		}
	}

}
