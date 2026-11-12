package logicalstatements;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int r = 0;
		int dec = 0;
		int base = 8;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			dec = dec + (r * base);
			base = base * 2;
		}
		System.out.println("Decimal value of a given number is:" + dec);

	}

}
