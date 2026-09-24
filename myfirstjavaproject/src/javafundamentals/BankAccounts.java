package javafundamentals;

public class BankAccounts {
	int accountnumber;
	String customername;
	String accountType;
	double balance;
	
	BankAccounts(int accountnumber,String customername,String accountType,double balance)
	{
		this.accountnumber=accountnumber;
		this.customername=customername;
		this.accountType=accountType;
		this.balance=balance;
	}
	void displaydetails()
	{
		System.out.println("Account Number:"+accountnumber);
		System.out.println("Customer Name:"+customername);
		System.out.println("Account Type:"+accountType);
		System.out.println("Balance:"+balance);
		System.out.println("----------------------------------------------");
	}

	public static void main(String[] args) {
		BankAccounts b1=new BankAccounts(10001,"Ravi Kishore","Savings",25000);
		BankAccounts b2=new BankAccounts(10002,"Narasimha","Current",50000);
		
		b1.displaydetails();
		b2.displaydetails();
		

		

	}

}
