package constructor;

public class Employee {
	
	String name;
	double sal;

	//Parameterized constructor
	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	public static void main(String[] args) {
		
		Employee e=new Employee("Revanth",100000);
		
		System.out.println("Employee Name:"+e.name);
		System.out.println("Employee Salary:"+e.sal);
		

	}

}
