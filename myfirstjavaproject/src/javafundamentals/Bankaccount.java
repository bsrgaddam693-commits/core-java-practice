package javafundamentals;

public class Bankaccount {
	static int balance=1000;
	
	void deposit(int deposit)
	{
		balance=balance+deposit;
	}
	void withdraw(int withdraw)
	{
		balance=balance-withdraw;
	}
	

	public static void main(String[] args) {
		Bankaccount acc=new Bankaccount();
		acc.deposit(500);
		acc.withdraw(300);
		System.out.println("Final balance:"+balance);
		
		
}
}