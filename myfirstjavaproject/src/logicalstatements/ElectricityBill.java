package logicalstatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn="";
		int rate=0;
		double total_electricitybill;
		do
		{
		System.out.println("Enter a connection type:");
		System.out.println("a.domestic/b.commercial");
		String type=sc.next();
		
		System.out.println("No of units consumed");
		int units=sc.nextInt();
		
		switch(type) {
		case "a"->{
			if(units<=100) {
				rate=2;
			}
			
			else if (units>300){
				rate=3;
			}
			else {
				rate=3;
			}
		
		total_electricitybill=units*rate;
		
		System.out.println("Connection type: Domestic");
		System.out.println("Units consumed:"+units); 
		System.out.println("Rate per unit:"+rate);
		System.out.println("Total Electricity Bill:"+total_electricitybill);
		}
		
		case "b"->{
			if(units<=100) {
				rate=4;
			}
			else if(units<=300) {
				rate=6;
			}
			else {
				rate=8;
			}
			total_electricitybill= units * rate;
			System.out.println("Connection type: Domestic");
			System.out.println("Units consumed:"+units); 
			System.out.println("Rate per unit:"+rate);
			System.out.println("Total Electricity Bill:"+total_electricitybill);
			
		}
		default->
		System.out.println("Invalid type");
		}
		

	
		System.out.println("Do you want to continue with types(y/n)");
		yn=sc.next();
	}
	while(yn.equalsIgnoreCase("y"));
		

}
}
