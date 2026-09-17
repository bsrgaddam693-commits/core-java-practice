package javafundamentals;

public class Footballplayer {
	int playerid;
	String playername;
	String playersalary;
	
	void playerdetails()
	{
		System.out.println("Player Id:"+playerid);
		System.out.println("Player Name:"+playername);
		System.out.println("Player Salary:"+playersalary);
	
	
	}
	

	public static void main(String[] args) {
		System.out.println("Real madrid attackers");
		Footballplayer f1=new Footballplayer();
		f1.playerid=1;
		f1.playername="Cristiano Ronaldo";
		f1.playersalary="500cr";
		
		Footballplayer f2=new Footballplayer();
		f2.playerid=2;
		f2.playername="Karim Benzema";
		f2.playersalary="250cr";
		
		Footballplayer f3=new Footballplayer();
		f3.playerid=3;
		f3.playername="Gareth Bale";
		f3.playersalary="180cr";
		
		f1.playerdetails();
		
		f2.playerdetails();
		
		f3.playerdetails();
		
	}
}
