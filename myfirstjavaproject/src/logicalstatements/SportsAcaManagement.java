package logicalstatements;

import java.util.Scanner;

public class SportsAcaManagement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String yn="";
		double total_bill=0;
		do {
		System.out.println("Enter Sports Category:");
		System.out.println("cricket/football/badminton/basketball/swimming"); 
		
		String category=sc.next().toLowerCase();
		
		switch(category.toLowerCase()){
		case "cricket"->{
		
		System.out.println("Cricket Training:Rs.2000");
		total_bill+=2000;
		}
		case "football"->{
			
			System.out.println("Football Training:Rs.1500");
			total_bill+=1500;
			}
		case "badminton"->{
			
			System.out.println("Badminton Training:Rs.1000");
			total_bill+=1000;
			}
		case "basketball"->{
			
			System.out.println("Basketball Training:Rs.1800");
			total_bill+=1800;
			}
		case "swimming"->{
			
			System.out.println("Swiiming Training:Rs.2500");
			total_bill+=2500;
			}
		default->
		System.out.println("Sports Category not availble");
		}
		System.out.println(" Continue With Sports Training..?(y/n)");
		yn=sc.next();
		}
		while(yn.equalsIgnoreCase("y"));
		System.out.println("Total_bill .Rs:"+total_bill);
		
		sc.close();
}
}
