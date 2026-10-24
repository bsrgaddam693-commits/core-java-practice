package constructor;

public class Student1 {
	
	String name;
	int age;
	
	
	Student1(){
		name="Rahul";
		age=20;
	}

	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		
		System.out.println("Student Name is:"+s1.name);
		System.out.println("Student Age is:"+s1.age);
		
		
		

	}

}
