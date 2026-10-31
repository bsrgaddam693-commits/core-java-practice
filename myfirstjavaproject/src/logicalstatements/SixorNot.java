package logicalstatements;

import java.util.Scanner;

public class SixorNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Runs scored on ball:");
		
		int runs=sc.nextInt();
		
		if(runs>5) {
			System.out.println("Its a Six");
		}
		else {
			System.out.println("Its not a Six");
		}
		sc.close();
	}

}
