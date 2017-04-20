package cinemaServachak;

import java.util.Scanner;

public class Main {
	
   static Scanner scanner = new Scanner(System.in);
   
	public static void main(String[] args) {

//
//		Time time = new Time();
//		System.out.println("Enter Hour");
//	    int hour = scanner.nextInt();
//		time.setHour(hour);
		
//		System.out.println("Enter min");
//		int min  = scanner.nextInt();
//		time.setMin(min);
//		
		Schedule schedule = new Schedule();
		for (int i = 0; i < 2; i++) {
			
			schedule.addSeance();
			System.out.println(schedule.getSeance());
		}
		System.out.println();
	
	
	


//		Movie movie = new Movie();
//		movie.setDuration(new Time(hour, min));
		
	}

}
