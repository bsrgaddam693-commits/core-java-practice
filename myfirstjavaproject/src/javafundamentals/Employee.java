package javafundamentals;

public class Employee {
	String name;
	int id;
	double salary;
	
	Employee(String name,int id, double salary)//parameterized constructor
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void displaydetails()
	{
		System.out.println("Employee Name:"+name);
		System.out.println("Employee id:"+id);
		System.out.println("Employee Salary:"+salary);
	}

	public static void main(String[] args) {
		Employee e1=new Employee("Virat",18,4000000);
		e1.displaydetails();
		

	}

}
