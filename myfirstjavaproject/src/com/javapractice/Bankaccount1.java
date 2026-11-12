package com.javapractice;

public class Bankaccount1 {
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
		Bankaccount1 b1=new Bankaccount1();
		b1.deposit(500);
		b1.withdraw(300);
		System.out.println("Final balance:"+balance);

	}

}
