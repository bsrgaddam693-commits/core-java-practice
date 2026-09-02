package com.javaproject;

public class Test3 {
	void show() {
		System.out.println("Welcome to java");
		System.out.println("Welcome to java");
		
	}
		
	public static void welcome() {
		System.out.println("Hello welcome ");
		System.out.println("Hello welcome");
		
	}
		public static void main(String[]args) {
			System.out.println("main methid started");
			welcome();
			Test3 T = new Test3();
			T.show();
			System.out.println("main method ended");
	}

}
