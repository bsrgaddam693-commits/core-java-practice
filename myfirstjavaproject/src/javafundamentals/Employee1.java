package javafundamentals;

public class Employee1 {
	
	int employeeid=501;
	byte employeeage=25;
	double employeesalary=40000.5;
	char employeegrade='A';
	float yearsofexperience=3.5f;
	boolean employeeisactive=true;
	byte numberofleaves=4;
	long mobilenumber=9607889456L;
	
	public static void main(String[]args)
	{
		Employee1 e1=new Employee1();
	
	System.out.println("Employee id:"+e1.employeeid);
	System.out.println("Employee Age:"+e1.employeeage);
	System.out.println("Employee Salary:"+e1.employeesalary);
	System.out.println("Employee Grade:"+e1.employeegrade);
	System.out.println("Years of Experience:"+e1.yearsofexperience);
	System.out.println(" Number Of Leaves:"+e1. numberofleaves);
	System.out.println("Mobile Number:"+e1.mobilenumber);


	}

}
