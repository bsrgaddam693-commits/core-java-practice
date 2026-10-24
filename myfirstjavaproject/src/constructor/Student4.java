package constructor;

public class Student4 {
	
	String name;
	int age;
	
	Student4(){
		this("Vijay",21);
	}
	
	Student4(String name,int age){
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		
		Student4 s4=new Student4();
		
		System.out.println("Name:"+s4.name);
		System.out.println("Age:"+s4.age);
		

	}

}
