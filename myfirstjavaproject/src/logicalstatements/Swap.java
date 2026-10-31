package logicalstatements;

public class Swap {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int swap;

		System.out.println("Before swapping:");

		System.out.println(" a = " + a);
		System.out.println(" b = " + b);

		swap = a;
		a = b;
		b = swap;

		System.out.println("After swapping:");

		System.out.println(" a = " + a);
		System.out.println(" b = " + b);

	}

}
