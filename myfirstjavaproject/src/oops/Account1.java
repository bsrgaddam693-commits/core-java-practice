package oops;

public class Account1 {

	public static void main(String[] args) {
		
		Account acc=new Account();
		
		//setting values
		acc.setaccountNo(7967532);
		acc.setamount(50000);
		acc.setname("RaviKanth");
		
		//getting values
		
		System.out.println("Account Number:"+acc.getaccountNo());
		System.out.println("Amount:"+acc.getamount());
		System.out.println("Customer Name:"+acc.getname());

	}

}
