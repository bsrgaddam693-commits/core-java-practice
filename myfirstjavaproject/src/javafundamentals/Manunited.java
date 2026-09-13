package javafundamentals;

public class Manunited {
	
	String playername="Cristiano Ronaldo";
	int jerseynumber=07;
	long salary=20000000L;
	double height=6.1;
	float weight=72.5F;
	char playerrating='A';
	boolean cristianoisstarplayer=true;
	String playerposition="Forward";
	
	void displayManunited()
	{
		System.out.println("Player Name:"+playername);
		System.out.println("Jersey Number:"+jerseynumber);
		System.out.println("Salary:"+salary);
		System.out.println("Height:"+height);
		System.out.println("Weight:"+weight);
	    System.out.println("Player Rating:"+playerrating);
	    System.out.println("Cristiano is Star Player:"+cristianoisstarplayer);
	    System.out.println("Player Position:"+playerposition);
}
	
	

	public static void main(String[] args) {
		System.out.println("Manchester united MVP");
		System.out.println("Year:2008");
		Manunited mu=new Manunited();
		mu.displayManunited();

	}

}
