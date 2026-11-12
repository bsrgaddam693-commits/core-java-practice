package logicalstatements.forloop;

import java.util.Scanner;

//wap to prin the given number is a reverse order
public class TestDemo0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rev = reversenumber(n);
		System.out.println("the reverse number for a given number is:" + rev);

		if (rev == n) {
			System.out.println("the given number is palindrom");
		} else {
			System.out.println("the given number is not palindrom");
		}
	}

	

	static int reversenumber(int n) {
		int r = 0;
		int reverse = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			reverse = reverse * 10 + r;

			

		}
		return reverse;
	}
}
