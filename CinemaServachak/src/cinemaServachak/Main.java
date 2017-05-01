package cinemaServachak;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
   static Scanner scanner = new Scanner(System.in);
   
	public static void main(String[] args) {
		TreeMap<DaysWeek,Schedule> map = new TreeMap<>(new Comparator<DaysWeek>() {

			@Override
			public int compare(DaysWeek o1, DaysWeek o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		Schedule  schedule = new Schedule();
		schedule.addSeance();
		Cinema cinema = new Cinema();
		String day = Main.scanner.next();
		cinema.addSeansToDay(day);
//		cinema.workCinema();
//		map.values();
		

//
//		Time time = new Time();
//		System.out.println("Enter Hour");
//	    int hour = scanner.nextInt();
//		time.setHour(hour);
		
//		System.out.println("Enter min");
//		int min  = scanner.nextInt();
//		time.setMin(min);
		
//		System.out.println();
	
	
	


//		Movie movie = new Movie();
//		movie.setDuration(new Time(hour, min));
		
	}

}
