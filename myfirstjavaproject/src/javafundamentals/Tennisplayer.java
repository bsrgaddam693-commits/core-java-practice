package javafundamentals;

public class Tennisplayer {
	String playername="Carlos Alcaraz";
	int playerid=1;
	int playerage=24;
	int grandslams=7;
	byte playerrating=1;
	char playergrade='A';
	
	void checkperformance()
	{
		System.out.println("Player name:"+ playername);
		System.out.println("Player Id:"+playerid );
		System.out.println("Player Age:"+ playerage);
		System.out.println("Grandslams Won:"+grandslams);
		System.out.println("Player Rating:"+playerrating );
		System.out.println("Player Grade:"+playergrade );
	
		if(grandslams>=5)
		{
			System.out.println("Status:Legendary Player");
		}
		else {
			System.out.println("Status:Needs improvement");
		}
	}

	public static void main(String[] args) {
		Tennisplayer t1=new Tennisplayer();
		t1.checkperformance();
	}
		

	}


