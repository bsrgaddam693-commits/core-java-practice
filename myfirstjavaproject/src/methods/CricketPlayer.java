package methods;

public class CricketPlayer {
	
	String playerName;
	int matchesPlayed;
	int runsScored;
	int fifties;
	int ballsPlaced;
	
	
	 double CaluculateAverage(int runsScored,int matchesPlayed) {
		 return(double) runsScored/matchesPlayed;
		 
	 }
	 int CalculateTotalFifties(int fifties) {
		 return fifties;
	 }
	 
	 double CalculateStrikeRate(int runsScored,int ballsPlaced) {
		 return(double)runsScored/ballsPlaced*100;
	 }
     void dispalyplayerSummary(double Average,int Fifties,double StrikeRate) {
    	 System.out.println("Player Name:"+playerName);
    	 System.out.println("Total Matches Played:"+matchesPlayed);
    	 System.out.println("Total Runs Scored:"+runsScored);
    	 System.out.println("Total Fifties:"+fifties);
    	 System.out.println("Batting Average:"+Average);
    	 System.out.println("Strike Rate:"+StrikeRate);
    	 System.out.println("--------------------------------------------------------------------");
     }
	public static void main(String[] args) {
		System.out.println("One Day Internationals data");
		
    CricketPlayer p1=new CricketPlayer();
    p1.playerName="Virat Kohli";
    p1.matchesPlayed=300;
    p1.runsScored=15000;
    p1.fifties=80;
    p1.ballsPlaced=9000;
    
    double avg1=p1.CaluculateAverage(p1.runsScored,p1.matchesPlayed);
    int f1=p1.CalculateTotalFifties(p1.fifties);
    double sr1=p1.CalculateStrikeRate(p1.runsScored,p1.ballsPlaced);
    p1.dispalyplayerSummary(avg1,f1,sr1);
    
    
    CricketPlayer p2=new CricketPlayer();
    p2.playerName="Rohit Sharma";
    p2.matchesPlayed=325;
    p2.runsScored=12000;
    p2.fifties=50;
    p2.ballsPlaced=10000;
    
    double avg2=p2.CaluculateAverage(p2.runsScored,p2.matchesPlayed);
    int f2=p2.CalculateTotalFifties(p2.fifties);
    double sr2=p2.CalculateStrikeRate(p2.runsScored,p2.ballsPlaced);
    p2.dispalyplayerSummary(avg2,f2,sr2);

	}

}
