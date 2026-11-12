package logicalstatements.forloop;

import java.util.Scanner;

public class Testdemo3 {
	public static void main(String[]args) {
		System.out.println("main methiod started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("which table you want to print");
		int n = sc.nextInt();
		System.out.println("hom many times you want to print");
		int n1 = sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			System.out.println(n + "x" + i + "=" +(n*i));
		}
		
	}

}
