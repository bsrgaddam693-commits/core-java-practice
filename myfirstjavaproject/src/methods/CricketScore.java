package methods;

public class CricketScore {
	
	
	static int battingscore(int fours,int sixes) {
		return(fours*4)+(sixes*6);
	}
	
	static int addextras( int score,int extras) {
		return(score+extras);
	}
	
	int totalscore(int score,int wickets) {
		return score+(wickets*0);
	}
	
	int targetscore(int score,int bonus) {
		return score+bonus;
	}

	public static void main(String[] args) {
		CricketScore s=new CricketScore();
		int result=battingscore(5,3);
		System.out.println(addextras(result,10));
		System.out.println(s.totalscore(result,4));
		System.out.println(s.targetscore(result,40));
		
		
		

	}

}
