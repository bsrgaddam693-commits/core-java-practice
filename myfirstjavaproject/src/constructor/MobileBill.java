package constructor;


import java.util.Scanner;

public class MobileBill {
	
	String model;
	int quantity;
	double price;
	double deliverycharge;
	double mobilecost;
	double finalbill;
	
	//no-arg constructor
	MobileBill()
	{
		this("Not given",0,0.0,0.0);
	}
	//one parameter constructor
    MobileBill(String model)
    {
    	this(model,0,0.0,0.0);
    }
    //two parameter constructor
    MobileBill(String model,int quantity)
    {
    	this(model,quantity,0.0,0.0);
    }
    //three parameter constructor
    MobileBill(String model,int quantity,double price)
    {
    	this(model,quantity,price,0.0);
    }
    //four parameter constructor
    MobileBill(String model,int quantity,double price,double deliverycharge)
    {
    
    
    
    this.model=model;
    this.quantity=quantity;
    this.price=price;
    this.deliverycharge=deliverycharge;
    
    mobilecost=price*quantity;
    finalbill=mobilecost+deliverycharge;
    }

    void displaybill()
    {
    	System.out.println("\n--------------Mobile Bill-------------");
    	System.out.println("Model:"+model);
    	System.out.println("Quantity:"+quantity);
    	System.out.println("Price of mobile: Rs. "+price);
    	System.out.println("Dlivery Charge : Rs. "+deliverycharge);
    	System.out.println("Mobile Cost: Rs. "+mobilecost);
    	System.out.println("Final Bill: Rs. "+finalbill);
    	
    }


    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Mobile Model :");
		String model=sc.nextLine();
		
		System.out.println("Enter Mobile Quantity :");
		int quantity=sc.nextInt();
		
		System.out.println("Enter Price Per Mobile :");
		double price=sc.nextDouble();
		
		System.out.println("Enter Delivery Charge :");
		double deliverycharge=sc.nextDouble();
		
		MobileBill mb=new MobileBill( model, quantity, price, deliverycharge);
		
		mb.displaybill();
		sc.close();
		
	}
		
}
		
		

	
    
