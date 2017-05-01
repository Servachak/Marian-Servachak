package cinemaServachak;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Cinema {
	protected  Time openTime = new Time(12, 00);
	protected Time closeTime = new Time(23, 30);
	private TreeMap<DaysWeek,Schedule> map;
	
	public Cinema() {
		super();
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.map =  new TreeMap<>(new Comparator<DaysWeek>() {

			@Override
			public int compare(DaysWeek o1, DaysWeek o2) {
				return 0;
			}
		});
	}
	
	
	DaysWeek [] days = DaysWeek.values();
	DaysWeek day = days[0];
	
	
	public void addMovie(Movie movie, Time time){
		List <Movie> movies = new ArrayList<>();
		Seance seance = new Seance();
		
	
		if(openTime.getHour() < seance.getStartTime().getHour() && openTime.getMin() < seance.getStartTime().getMin()){
			System.out.println("Enter");
			
			System.out.println("Enter title a Film");
			String title = Main.scanner.next();
			
			System.out.println("Enter duration hor");
			int hour = Main.scanner.nextInt();
			
			System.out.println("Enter duration hor");
			int min = Main.scanner.nextInt();
			
			movies.add(new Movie(title, new Time(hour, min)));	
			}
	}
	public void addDaysToMap(){
		map.put(DaysWeek.MONDAY, new Schedule());
		map.put(DaysWeek.TYESDAY, new Schedule());
		map.put(DaysWeek.WEDNESDAY, new Schedule());
		map.put(DaysWeek.THURSDAY, new Schedule());
		map.put(DaysWeek.FRIDAY, new Schedule());
		map.put(DaysWeek.SATURDAY, new Schedule());
		map.put(DaysWeek.SUNDAY, new Schedule());
		
	}
	public void addSeansToDay(String day){
		
		for (DaysWeek daysWeek : days) {
			if (daysWeek.name().equalsIgnoreCase(day)){
				System.out.println(map.get(daysWeek));
//				String title = Main.scanner.next();
//				s
//				if ()
				
				
			}
			
		}
	}
//	public void addSeanceToDay(String day){
//		Schedule schedule = new Schedule();
//		for(int i = 0; i < days.length; i++)
//		if (day.equalsIgnoreCase(days[i].name())){
//			System.out.println(days[i]);
//			map.put(days[i], null);
//		}
//		
//	}
	
	public void workCinema(){
		boolean cinemaWork = true;
		while(cinemaWork){
			System.out.println("Enter 1 for add movie" + "\nEnter 2 for add Seances " 
		+"\nEnter 3 to remove Movie"+ "\nEnter 4 for remove Seanse"+"\nEnter 5 to exit");
		
			String choise = Main.scanner.next();
			switch(choise){
			case "1":{
				
				break;
			}
			case "2":{
				System.out.println("Enter day ");
				String day = Main.scanner.next().toUpperCase();
//				addSeansToDay(day);
				break;
			}
			case "3":{
				
				break;
			}
			case "4":{
				
				break;
			}
			case "5":{
				cinemaWork = false;
				break;
			}
			default : {
				System.out.println("Input error");
			}
			}
		}
	}

	
	
	
	
	
	

	
	

	

}
