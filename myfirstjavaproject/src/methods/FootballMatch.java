package methods;

public class FootballMatch {
	
	int standings=2;
	
	int calculatepoints(int wins,int draws){
		return(wins*3+draws*1);
	}

	public static void main(String[] args) {
		FootballMatch fb=new FootballMatch();
		
		int points=fb.calculatepoints(6,3);
		
		System.out.println("Total Points:"+points);
        System.out.println("Standings in Points Table:"+fb.standings);
	}

}
