package logicalstatements;

import java.util.Scanner;

public class Armstrong {
	public static void main(String [] args) {
		System.out.println("Main method strted");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean flag=isArmstrong(n);
		
		if(flag) {
			System.out.println("The given number is Armstrong number");
		}else {
			System.out.println("The given number is not Armstrong numbder");
		}
	}
	
	 static boolean isArmstrong(int n) {
		 boolean status=false;
		 
		 int r=0;
		 int sump=0;
		 int digitcount=0;
		 
		 int n1=n;
		 int temp=n;
		 
		 while(n>0) {
			 n=n/10;
			 digitcount++;	 
		 }
		 while(n1>0) {
			 r=n1%10;
			 n1=n1/10;
			 sump=(int)(sump+Math.pow(r, digitcount));
			 
		 }
		 if(sump==temp) {
			 status=true;
		 }
		 return status;
	 }

}
