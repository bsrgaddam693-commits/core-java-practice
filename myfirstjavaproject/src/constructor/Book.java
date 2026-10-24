package constructor;

public class Book {
	
	String title;
	int price;
	
	Book(String title,int price){
		this.title=title;
		this.price=price;
		
	}
	
	Book(Book other){
		this.title=other.title;
		this.price=other.price;
		
	}

	public static void main(String[] args) {
		
		Book b=new Book("Java",500);
		Book b1=new Book(b);
		
		System.out.println(b.title+" "+b.price);
		System.out.println(b1.title+" "+b1.price);
		
		

	}

}
