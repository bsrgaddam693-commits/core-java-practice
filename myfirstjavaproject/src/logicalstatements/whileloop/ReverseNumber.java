package logicalstatements.whileloop;

import java.util.Scanner;

public class ReverseNumber {
	
	static int reversenumber(int n) {
		
		
     int r=0;
     int reverse=0;
     
     while(n>0) {
    	 r=n%10;
    	 
    	 n=n/10;
    	 
    	 reverse=reverse*10+r;
     }
     return reverse;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int reverse=reversenumber(n);
		
		if(n==reverse) {
			System.out.println("The Given Number is Palindrome");
		}
		else {
			System.out.println("the given number is not palindrome");
		}
System.out.println("The reverse of a given number is:"+reverse);
	}

}
