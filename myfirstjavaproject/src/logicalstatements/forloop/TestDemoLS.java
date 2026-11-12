package logicalstatements.forloop;
//wap to print sum of the gidits from given number
import java.util.Scanner;

public class TestDemoLS {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		
		int r = 0;
		int sum = 0;
		
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = sum+r;
		}
		System.out.println("Sumof its digits is :"+sum);
		 
	}

}
