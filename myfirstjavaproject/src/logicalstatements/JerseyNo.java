package logicalstatements;

import java.util.Scanner;

public class JerseyNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Jersry No:");
		
		int jerseyno=sc.nextInt();
		
		switch(jerseyno) {
		case 18->{
		System.out.println("VK:Virat Kohli");
		System.out.println("Virat Kohli is greatest of all time ");
		}
		
		case 45->{
		System.out.println("RS:Rohit Sharma");
		System.out.println("Hitman,Lazy alligence");
		}
		
		case 7->{
		System.out.println("MSD:Mahendra Singh Dhoni");
		System.out.println("Captain cool");
		}
		
		case 1->{
		System.out.println("KLR:Kannur Lokesh Rahul");
		System.out.println("Classy bastman");
		}
		default->
		System.out.println("Enterd jersey no is not avaialble in my list");
		
		}
		sc.close();
	}

}
