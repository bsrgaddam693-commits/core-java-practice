package logicalstatements;

import java.util.Scanner;

public class CricketCentury {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter runs scored by bastman:");
		
		int runs=sc.nextInt();
		
		if(runs>100) {
			System.out.println("Century Scored");
		}
        sc.close();
	}

}
