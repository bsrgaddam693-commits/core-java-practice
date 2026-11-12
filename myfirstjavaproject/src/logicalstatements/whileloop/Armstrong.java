package logicalstatements.whileloop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int r = 0;
		int sumP = 0;
		int digitcount = 0;
		int n1 = n;
		int temp = n;

		while (n > 0) {
			n = n / 10;
			digitcount++;
		}
		n = n1;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sumP = sumP + (int) Math.pow(r, digitcount);
		}

		if (sumP == temp) {
			System.out.println("It is a Armstrong Number");
		} else {
			System.out.println("It is not a Armstrong Number");
		}
	}

}
