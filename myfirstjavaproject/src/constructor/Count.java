package constructor;

public class Count {
	
	static int count=0;
	
	Count(){
		count++;
	}

	public static void main(String[] args) {
		Count c=new Count();
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		System.out.println("Count of the objects:"+count);
		
		

	}

}
