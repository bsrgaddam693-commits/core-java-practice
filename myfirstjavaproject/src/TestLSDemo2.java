import java.util.Scanner;

public class TestLSDemo2 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double total_price=0;
		
	do {
		System.out.println("Enter category like bisket/chocklet/colldrinks/aicreams");
		String catg = sc.next();
		
		switch(catg) {
		
		case"bisket"->{
			String byn ="";
			double bisket_total_price=0;
			
			do {
				System.out.println("Enter The Item:");
				String bisket_item = sc.next();
				
				switch(bisket_item) {
				
				case"darkfantacy"->{
					System.out.println("Darkfantacy- price is : 30/-rs");
					double darkfantacy_price=30;
					bisket_total_price += darkfantacy_price;
				} 
				case"barboon"->{
					System.out.println("barboon-price is : 10/-rs");
					double barboon_price=10;
					bisket_total_price +=barboon_price;
				}
				default->System.out.println("Enter Item Not Available");
				}
				System.out.println("Do You Want To Continue The Bisket Item : Click Y For YES N For No");
				byn =sc.next();
			}while(byn.equalsIgnoreCase("y"));
		
		
		System.out.println("Bisket_Total_Price:"+bisket_total_price);
		   total_price = bisket_total_price;
		}
		}
		System.out.println("Do You Want To Continue for category  : Click Y For YES N For No");
		yn = sc.next();
		
	}while (yn.equalsIgnoreCase("y"));
	System.out.println("Total_Price:"+total_price);
	
	}
	
}

