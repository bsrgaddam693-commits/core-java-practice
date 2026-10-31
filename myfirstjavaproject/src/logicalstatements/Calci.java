package logicalstatements;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String yn = "";
		
		
		do {
			System.out.println("Enter a number");
			int a=sc.nextInt();
			
			System.out.println("Enter b number");
			int b=sc.nextInt();
			
			System.out.println("Enter a symbol like +,-,*,%,/");
			char symbol=sc.next().charAt(0);
			int result=0;
			
			switch(symbol) {
			case '+'->result=a+b;
			case '-'->result=a-b;
			case '*'->result=a*b;
			case '%'->result=a%b;
			case '/'->result=a/b;
			
			default->{
			result=0;
			System.out.println("Enterd no is invalid");
			}
			
		}
         System.out.println("The resulted value is:"+result);
         System.out.println("Do You Want to continue..? Click y for yes n for no");
         yn=sc.next();
		}
		while(yn.equalsIgnoreCase("y"));
		System.out.println("Calculation closed");
        		 
	}

}
