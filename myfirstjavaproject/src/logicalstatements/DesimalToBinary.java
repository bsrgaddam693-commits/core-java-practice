package logicalstatements;

import java.util.Scanner;

public class DesimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int r = 0;
		String bin = "";

		while (n > 0) {
			r = n % 2;
			n = n / 2;
			bin = r + bin;
		}
		System.out.println("Binary value of a given number is;" + bin);
	}

}
