package logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemoLS3 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.println("Fibonacci series");
		
		for(int i=1;i<=n;i++) {
			System.out.println(a+"");
			int c=a+b;
			
			a=b;
			b=c;
		}
	}

}
