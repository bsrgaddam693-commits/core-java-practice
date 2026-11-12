package logicalstatements.whileloop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int binary = 0;
		int r = 0;
		int place = 1;

		while (n > 0) {
			r = n % 2;
			binary = binary + r * place;
			place = place * 10;
			n = n / 2;
		}
		System.out.println("Binary Number:" + binary);
	}

}
