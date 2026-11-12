package com.javaproject;

public class Bankaccount {
	 long accno;
	 String accountholdername;
	 double balance;
	 static int accountnogenerator=45678;
	 static int balancegenerator=1000;
	 
	 

	public static void main(String[] args) {
		accountnogenerator++;
		balancegenerator++;
		Bankaccount b1=new Bankaccount();
		b1.accno=accountnogenerator++;
		b1.accountholdername="Rahul";
		b1.balance=balancegenerator++;
		
		System.out.println("Accountno:"+b1.accno);
	System.out.println("Accountholdername:"+b1.accountholdername);
	System.out.println("Balance:"+b1.balance);
	
	Bankaccount b2=new Bankaccount();
	b2.accno=accountnogenerator++;
	b2.accountholdername="adi";
	b2.balance=balancegenerator++;;
	
	System.out.println("Accountno:"+b2.accno);
System.out.println("Accountholdername:"+b2.accountholdername);
System.out.println("Balance:"+b2.balance);
		

Bankaccount b3=new Bankaccount();
b3.accno=accountnogenerator++;
b3.accountholdername="vignesh";
b3.balance=balancegenerator++;;

System.out.println("Accountno:"+b3.accno);
System.out.println("Accountholdername:"+b3.accountholdername);
System.out.println("Balance:"+b3.balance);

	}

}
