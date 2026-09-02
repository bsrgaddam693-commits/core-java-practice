package com.javaproject;

public class Test1 {
	

void player1() {
	player2();
	System.out.println("cricketer");
}

void player2() {
	player4();
	System.out.println("vollyball");
}

  public static void rakesh() {
	  Test1 T1 =new Test1();
	  T1.player3();
	  System.out.println("kbd");
 }
 
 void player3() {
	 player1();
	 System.out.println("runner");
 }
 
 void player4() {
	 player5();
	 System.out.println("athelit");
 }
 
 static void player5() {
	 System.out.println("footbal");
 }
 
 public static void main(String[]arg) {
	 rakesh();
	 System.out.println("main method ended");
	
	
}

}
