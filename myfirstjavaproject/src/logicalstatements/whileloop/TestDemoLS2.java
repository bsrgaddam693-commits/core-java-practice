package logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemoLS2 {
	public static void main(String[]args) {
		System.out.println("Main method stared");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		
		int r=0;
		int sum=0;
		int square=n*n;
		
		
		
		while(square>0) {
			r=square%10;
			square=square/10;
			sum=sum+r;
		}
		System.out.println("sum is:"+sum);
		if(sum==n) {
			System.out.println("The given number is neon number");
		}else {
			System.out.println("The given number is not neon number");
		}
		
	}
} 


	