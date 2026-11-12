package javafundamentals;

public class Shopping {
	

	public static void main(String[] args) {
		int customermoney=2000;
		int shirtprice=750;
		int pantprice=900;
		int beltprice=250;
		
		int shoppingbill=shirtprice+pantprice+beltprice;
		int remainingbalance=customermoney-shoppingbill;
		
		System.out.println("Shopping bill:"+shoppingbill);

		System.out.println("Remaining Balance:"+remainingbalance);
		


	}

}
