package constructor;

public class Car {
	
	String brand;
	double price;
	
	Car(String brand,double price){
		
		this.brand=brand;
		this.price=price;
	}

	public static void main(String[] args) {
		
		System.out.println("Brands and prices of cars");
		
		System.out.println("----------------------------------------------------");
		
		Car c=new Car("Bmw",21000000);
		Car c1=new Car("Bugatti",30000000);
		
		System.out.println("Brand:"+c.brand);
		System.out.println("Price:"+c.price);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Brand:"+c1.brand);
		System.out.println("Price:"+c1.price);
		

	}

}
