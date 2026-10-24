package constructor;

public class FootballPlayer {

	String name;
	int goals;
	
	//no-arg constructor
	FootballPlayer()
	{
		name="Ronaldo";
		goals=981;
	}
	
	//Parameterized constructor
	
	FootballPlayer(String name,int goals)
	{
		this.name=name;
		this.goals=goals;
	}
	public static void main(String[] args) {
		
		FootballPlayer f1=new FootballPlayer();
		f1.method();
		System.out.println("-------------------------------------------------------");
	FootballPlayer f2=new FootballPlayer("Messi",830);
		f2.method();
	}
	
	void method()
	{
		System.out.println("Player Name:"+name);
		System.out.println("Goals Scored:"+goals);
	}
	
		}
		
		
		
		

	

