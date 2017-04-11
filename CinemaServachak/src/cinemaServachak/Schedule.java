package cinemaServachak;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
	
	private Set<Seance> seance;

	public Schedule(Set<Seance> seance) {
		super();
		this.seance = new TreeSet<Seance>();
	}

	public Set<Seance> getSeance() {
		return seance;
	}

	public void setSeance(Set<Seance> seance) {
		this.seance = seance;
	}

	@Override
	public String toString() {
		return "Schedule [seance=" + seance + "]";
	}
	public void addSeance(){
		System.out.println("Enter Title a Film");
		String title = Main.scanner.nextLine();
		System.out.println("Enter Duration time at Hour ");
		int durationHour = Main.scanner.nextInt();
		System.out.println("Enter Duration time at Min");
		int durationMin = Main.scanner.nextInt();
		
		System.out.println("Enter Start time at Hour");
		int startTimeHour = Main.scanner.nextInt();
		System.out.println("Enter Start time at Min");
		int startTimeMin = Main.scanner.nextInt();
		
		seance.add(new Seance(new Movie(title, new Time(durationHour, durationMin)), new Time(startTimeHour, startTimeMin)));
	}
	public void removeSeance(){
		if(seance.isEmpty()){
			System.out.println("Create a new Seance");
		}else{
			System.out.println("Enter Title a Film for Remove ");
			String titleNameForRemove = Main.scanner.next();
			
			Iterator<Seance> iterator = seance.iterator();
			while(iterator.hasNext()){
				if (iterator.next().getMovie().getTitle().equalsIgnoreCase(titleNameForRemove)){
					iterator.remove();
				}
			}
		}
	}

}
