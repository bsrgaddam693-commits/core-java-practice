package logicalstatements.whileloop;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int r=0;
		int digitcount=0;
		
		while(n>0) {
			n=n/10;
			digitcount++;
		}
		
		System.out.println("Total digits count:"+digitcount);
				

	}

}
