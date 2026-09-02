package com.javaproject;

public class student {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		System.out.println("Welcome to java");
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Main method ended");

	}

}
