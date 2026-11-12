package logicalstatements.forloop;

import java.util.Scanner;

public class TestDemo2 {
	public static void main(String[]args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a table you want to print");
		int n = sc.nextInt();
		System.out.println("whre we want to write ");
		int n1 = sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			System.out.println(n+ " "+"x "+i+"= "+n*i);
			
		}
		System.out.println("main method ended");
		
	}
	

}
