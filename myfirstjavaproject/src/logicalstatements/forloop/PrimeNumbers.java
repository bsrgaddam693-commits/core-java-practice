package logicalstatements.forloop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Prime Numbers 1 to 100");
		
		for(int i=2;i<=100;i++) {
			int count=0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		
	}
}
