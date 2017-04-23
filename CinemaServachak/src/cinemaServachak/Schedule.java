package cinemaServachak;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {

	private Set<Seance> seance;

	public Schedule() {

		seance = new TreeSet<Seance>(new Comparator<Seance>() {

			@Override
			public int compare(Seance o1, Seance o2) {
				int sortByStartTime1 = o1.getStartTime().getHour();
				int sotrByStartTime2 = o2.getStartTime().getHour();
				if (sortByStartTime1 > sotrByStartTime2) {
					return 1;
				} else if (sortByStartTime1 < sotrByStartTime2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	public Schedule(Set<Seance> seance) {
		super();
		this.seance = new TreeSet<Seance>(new Comparator<Seance>() {

			@Override
			public int compare(Seance o1, Seance o2) {
				int sortByStartTime1 = o1.getStartTime().getHour();
				int sotrByStartTime2 = o2.getStartTime().getHour();
				if (sortByStartTime1 > sotrByStartTime2) {
					return 1;
				} else if (sortByStartTime1 < sotrByStartTime2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
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

	public void addSeance() {
		System.out.println("Enter Title a Film");
		String title = Main.scanner.next();

		Time durationTime = new Time();

		System.out.println("Enter Duration time at Hour ");
		int durationHour = Main.scanner.nextInt();
		durationTime.setHour(durationHour);

		System.out.println("Enter Duration time at Min");
		int durationMin = Main.scanner.nextInt();
		durationTime.setMin(durationMin);

		Time startTime = new Time();

		System.out.println("Enter Start time at Hour");
		
		int startTimeHour = Main.scanner.nextInt();
		startTime.setHour(startTimeHour);

		System.out.println("Enter Start time at Min");
		int startTimeMin = Main.scanner.nextInt();
		startTime.setMin(startTimeMin);
		

		seance.add(new Seance(new Movie(title, durationTime), startTime));
		
		
	}

	public void removeSeance() {
		if (seance.isEmpty()) {
			System.out.println("Create a new Seance");
		} else {
			System.out.println("Enter Title a Film for Remove ");
			String titleNameForRemove = Main.scanner.next();

			Iterator<Seance> iterator = seance.iterator();
			while (iterator.hasNext()) {
				if (iterator.next().getMovie().getTitle().equalsIgnoreCase(titleNameForRemove)) {
					iterator.remove();
				}
			}
		}
	}

}
