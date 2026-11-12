package com.javaproject;

public class Bank {
	String Bankname;
	static int Bankid=12897244;
	String location;
	static int userid=111;
	String uname;
    static	int Balance=1000000;
	

	public static void main(String[] args) {
		Bank B1 = new Bank();
		
		B1.Bankname="cggbank";
		Bankid=Bankid++;
		B1. location="valluru";
		userid=userid++;
		B1.uname="subbu";
		Balance = Balance++;
		
		
		
		System.out.println(B1.Bankname);
		System.out.println(Bankid);
		System.out.println(B1.location);
		System.out.println(userid);
		System.out.println(B1.uname);
	    System.out.println(Balance);
		
		

	}

}
