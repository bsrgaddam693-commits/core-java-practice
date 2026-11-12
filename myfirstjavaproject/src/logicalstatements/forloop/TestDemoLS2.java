package logicalstatements.forloop;

import java.util.Scanner;

public class TestDemoLS2 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enetra number");
		int n= sc.nextInt();
		boolean flag=isarmstrong(n);
		
		if(flag) {
			System.out.println("The given number is armstring number");
		}else {
			System.out.println("The given number is not armstrong number");
		}
	}
	static boolean isarmstrong(int n) {
		boolean status = false;
		
		int r=0;
		int sump=0;
		int digicount=0;
		
		int n1=n;
		int temp=n;
		
		while(n>0) {
			n=n/10;
			digicount++;
		}
		while(n1>0) {
			r=n1%10;
			n1=n1/10;
			sump= (int) (sump+Math.pow(r, digicount));
		}
		if(sump==temp) {
			status=true;
		}
		return status;
	}

}
