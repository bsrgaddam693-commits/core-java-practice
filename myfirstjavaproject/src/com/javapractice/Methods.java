package com.javapractice;

public class Methods {
	
	static int add(int a,int b) {
		return a+b;
	}
	
	int multiplication(int a,int b) {
		return a*b;
	}
	static int division(int a,int b) {
		return a/b;
	}
   int subtraction(int a,int b)
{
	return a-b;
}
	public static void main(String[] args) {
		
int result=add(10,5);
Methods m=new Methods();

System.out.println("Addition:"+result);
System.out.println("Multiplication:"+m.multiplication(result, 3));
System.out.println("Division:"+m.division(result,5));
System.out.println("Subtraction:"+m.subtraction(result,2));
	}

}
