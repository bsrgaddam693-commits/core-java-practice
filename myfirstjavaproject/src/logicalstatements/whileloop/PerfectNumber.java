package logicalstatements.whileloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		while(n>9) {
			int sum=0;
			
			while(n>0) {
				int rem=n%10;
				sum=sum+rem;
				n=n/10;
				
				
			}
			n=sum;
			
		}
		if(n==1) {
			System.out.println("It is a Magic Number");
		}
		else {
			System.out.println("It is not a Magic NUmber");
		}
	}

}
