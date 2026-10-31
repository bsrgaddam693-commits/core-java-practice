package logicalstatements;

import java.util.Scanner;

public class SportsAcademyManagement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String yn="";
		double total_price=0;
		
		do {
		
		System.out.println("============= Sports Academy ================");
		System.out.println("Enter Category");
		System.out.println("cricket/Football/badminton/tennis/swimming");
		
		String category=sc.next().toLowerCase();
		
		switch(category.toLowerCase()){
		
		case "cricket"->{
		
		String cyn="";
		double cricket_price=0;
		
		do {
			
		
		System.out.println("Enter Cricket Training:");
		System.out.println("Batting/Bowling/Fielding/WicketKeeping/Fitness");
		String crick=sc.next().toLowerCase();
		
		switch(crick.toLowerCase()) {
		case"batting"->{
		System.out.println("Batting Training=Rs.500");
		cricket_price+=500;
		}
		
		case"bowling"->{
		System.out.println("Bowling Training=Rs.500");
		cricket_price+=500;
		}
		
		case"fielding"->{
		System.out.println("Fielding Training=Rs.300");
		cricket_price+=300;
	}
		case"wicketKeeping"->{
			System.out.println("WicketKeeping Training=Rs.300");
			cricket_price+=300;
			}
		case"fitness"->{
			System.out.println("Fitness Training=Rs.200");
			cricket_price+=200;
			}
		default->System.out.println("Cricket Training Not Availble");
		}
		System.out.println("Continue with cricket training..?Y/N");
		 cyn=sc.next().toLowerCase();
		}
		while(cyn.equalsIgnoreCase("y"));
		System.out.println("Total Cricket Training Price:"+cricket_price); 
		total_price+=cricket_price;
		}
		
		case"football"->{
		String fyn="";
		double football_price=0;
		
		do {
			System.out.println("Enter Football Training:");
			System.out.println("Shooting/Dribbling/Goalkeeping/Defending/Fitness");
			
			String football=sc.next().toLowerCase();
			
			switch(football.toLowerCase()) {
			case"shooting"->{
			System.out.println("Shooting training=Rs 500");
			football_price+=500;
			}
			case"dribbling"->{
				System.out.println("Dribbling training=Rs 400");
				football_price+=400;
		}
			case"goalKeeping"->{
				System.out.println("GoalKeeping training=Rs 500");
				football_price+=500;
			}
			case"defending"->{
				System.out.println("Defending training=Rs 400");
				football_price+=400;
			}
			case"fitness"->{
				System.out.println("Fitness training=Rs 300");
				football_price+=300;
			}
			default->
			System.out.println("Football Training Not Availble");
			}
			System.out.println("Continue with Football training..?Y/N");
			 fyn=sc.next().toLowerCase();
			}
			while(fyn.equalsIgnoreCase("y"));
			System.out.println("Total football Training Price:"+football_price); 
			total_price+=football_price;
			}
case "badminton" -> {
    String byn = "";
    double badminton_price = 0;

    do {
        System.out.println("\nEnter Badminton Training:");
        System.out.println("singles / doubles / serving / smash / footwork");

        String item = sc.next().toLowerCase();

        switch (item.toLowerCase()) {

        case "singles" -> {
            System.out.println("Singles Practice = Rs. 250");
            badminton_price += 250;
        }
        case "doubles" -> {
            System.out.println("Doubles Practice = Rs. 300");
            badminton_price += 300;
        }
        case "serving" -> {
            System.out.println("Serving Practice = Rs. 150");
            badminton_price += 150;
        }
        case "smash" -> {
            System.out.println("Smash Training = Rs. 350");
            badminton_price += 350;
        }
        case "footwork" -> {
            System.out.println("Footwork Training = Rs. 200");
            badminton_price += 200;
        }
        default -> System.out.println("Badminton Training not available!");
        }

        System.out.println("Continue with Badminton Training? Y/N");
        byn = sc.next().toLowerCase();

    } while (byn.equalsIgnoreCase("y"));

    System.out.println("Total Badminton Training Price: Rs. " + badminton_price);
    total_price += badminton_price;
}
case "tennis" -> {
    String tyn = "";
    double tennis_price = 0;

    do {
        System.out.println("\nEnter Tennis Training:");
        System.out.println("forehand / backhand / serving / volley / smash");

        String Tennis = sc.next().toLowerCase();

        switch (Tennis.toLowerCase()) {

        case "forehand" -> {
            System.out.println("Forehand Practice = Rs. 250");
            tennis_price += 250;
        }
        case "backhand" -> {
            System.out.println("Backhand Practice = Rs. 300");
            tennis_price += 300;
        }
        case "serving" -> {
            System.out.println("Serving Practice = Rs. 200");
            tennis_price += 200;
        }
        case "volley" -> {
            System.out.println("Volley Training = Rs. 350");
            tennis_price += 350;
        }
        case "smash" -> {
            System.out.println("Smash Training = Rs. 400");
            tennis_price += 400;
        }
        default -> System.out.println("Tennis Training not available!");
        }

        System.out.println("Continue with Tennis Training? Y/N");
        tyn = sc.next().toLowerCase();

    } while (tyn.equalsIgnoreCase("y"));

    System.out.println("Total Tennis Training Price: Rs. " + tennis_price);
    total_price += tennis_price;
}
case"swimming"->{
String syn="";
double swimming_price=0;
do {
	System.out.println("Enter Swimming Practice:");
	System.out.println("beginner / freestyle / butterfly / backstroke / advanced");
	String swimming=sc.next().toLowerCase();
	switch(swimming.toLowerCase()) {
	case"beginner"->{
	System.out.println("Begginer Training Price:Rs.400");
	swimming_price+=400;
	}
	case"freestyle"->{
		System.out.println("Freestyle Training Price:Rs.500");
		swimming_price+=500;
		}
	case"butterfly"->{
		System.out.println("Butterfly Training Price:Rs.700");
		swimming_price+=700;
		}
	case"backstroke"->{
		System.out.println("Backstroke Training Price:Rs.600");
		swimming_price+=600;
		}
	case"advanced"->{
		System.out.println("Advanced Training Price:Rs.800");
		swimming_price+=800;
		}
	default->
	System.out.println("Swimming Training Not Avialable");
	}
	System.out.println("Continue with Swimming Training? Y/N");
	syn=sc.next();
}
while(syn.equalsIgnoreCase("y"));
System.out.println("Total Swimming Training Price is:"+swimming_price);
total_price+=swimming_price;
}
default->
System.out.println("Sports category not availble");
}
System.out.println("continue with another sports category..?Y/N");
yn=sc.next();
}
while(yn.equalsIgnoreCase("y"));
System.out.println("\n========== FINAL SPORTS ACADEMY BILL ==========");
System.out.println("Total Price: Rs. " + total_price);
System.out.println("Thank you for joining our Sports Academy!");
System.out.println("PLAY HARD! TRAIN HARD! WIN BIG!");
sc.close();
}
}


