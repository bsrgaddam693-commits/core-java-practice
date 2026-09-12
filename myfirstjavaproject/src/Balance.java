
public class Balance {


	
	
	public static void main(String[] args) {
		int usermoney=100;
		int pencilcost=7;
		
		int pencils=usermoney / pencilcost;
		int balance=usermoney % pencilcost;
		
		System.out.println("How many pencils can be bouhgt:"+pencils);
		System.out.println("Balance money left:"+balance);
		

	}

}
