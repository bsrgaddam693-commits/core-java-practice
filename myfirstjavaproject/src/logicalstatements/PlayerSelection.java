package logicalstatements;

import java.util.Scanner;

public class PlayerSelection {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Player Runs:");
		
		int runs=sc.nextInt();
		
		if (runs>=50) {
			System.out.println("Selected for next match");
		}
		else {
			System.out.println("Needs improvement");
			
		}
	}

}
