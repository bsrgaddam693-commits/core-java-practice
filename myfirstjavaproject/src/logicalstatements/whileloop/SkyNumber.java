package logicalstatements.whileloop;

import java.util.Scanner;

public class SkyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int temp = n;
		int r = 0;
		int sum = 0;
		int product = 1;

		while (n > 0) {
			r = n % 10;

			sum = sum + r;
			product = product * r;
			n = n / 10;
		}
		if (sum == product) {
			System.out.println("It is a SKy Number");
		} else {
			System.out.println("It is not a Sky Number");
		}
	}

}
