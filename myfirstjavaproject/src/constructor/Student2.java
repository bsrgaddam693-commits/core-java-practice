package constructor;

public class Student2 {
	
	String name;
	int age;
	
	Student2(){
		name="unkonwn";
	}
	
	Student2(String name){
		this.name=name;
	}
	
	Student2(String name,int age){
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		
		Student2 s=new Student2();
		Student2 s1=new Student2("Rishi");
		Student2 s2=new Student2("Ravi",21);
		
		System.out.println(s.name);
		System.out.println(s1.name);
		System.out.println(s2.name+" "+s2.age);
		

	}

}
