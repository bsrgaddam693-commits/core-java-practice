package com.javaproject;

public class Bankaccount {
	 long accno;
	 String accountholdername;
	 double balance;
	 static int accountnogenerator=22367890;
	 
	 

	public static void main(String[] args) {
		accountnogenerator++;
		Bankaccount b1=new Bankaccount();
		b1.accno=accountnogenerator++;
		b1.accountholdername="Rohit";
		b1.balance=667575;
		
		System.out.println("Accno:"+b1.accno);
		System.out.println("Acountholdername:"+b1.accountholdername);
		System.out.println("Balance:"+b1.balance);
		
		
		Bankaccount b2=new Bankaccount();
		b2.accno=accountnogenerator++;
		b2.accountholdername="Rahul";
		b2.balance=667578;
		
		
		System.out.println("Accno:"+b2.accno);
		System.out.println("Acountholdername:"+b2.accountholdername);
		System.out.println("Balance:"+b2.balance);
		
		Bankaccount b3=new Bankaccount();
		b3.accno=accountnogenerator++;
		b3.accountholdername="Rahul";
		b3.balance=667579;
		
		
		System.out.println("Accno:"+b3.accno);
		System.out.println("Acountholdername:"+b3.accountholdername);
		System.out.println("Balance:"+b3.balance);
		
		

	}

}
