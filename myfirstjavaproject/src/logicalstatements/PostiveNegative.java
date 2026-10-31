package logicalstatements;

import java.util.Scanner;

public class PostiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter a number:");
			int number = sc.nextInt();

			String result = (number > 0) ? "postive" : (number < 0) ? "Negative" : "Zero";

			System.out.println("The number is:" + result);
			System.out.println("Do you want to contine..?click y for yes n for no");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		sc.close();
	}

}
