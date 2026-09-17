package javafundamentals;

public class Arthemetic {
	
	int addition(int a,int b) 
	{
		int result=a+b;
		System.out.println("Addition:"+result);
		return subtraction(result,3);
	}
	int subtraction(int a,int b)
	{
		int result=a-b;
		System.out.println("Subtraction:"+result);
		return multiplication(result,2);
	}
	int multiplication(int a,int b)
	{
		int result=a * b;
		System.out.println("Multiplication:"+result);
		return division(result,4);
	}
     int division(int a,int b)
     {
    	 int result=a/b;
    	 System.out.println("Division:"+result);
    	 return result;
     }
	public static void main(String[] args) {
		Arthemetic a=new Arthemetic();
		int finalresult=a.addition(10, 5);
		System.out.println("Final result:"+finalresult);
		

	}

}
