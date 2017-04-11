package cinemaServachak;

public class Time {

	private int hour;
	private int min;

	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		boolean trueHour = false;
		while (!trueHour) {
			if (hour >= 0 && hour <= 23) {
				this.hour = hour;
				trueHour = true;
			} else {
				System.out.println("Day has 24 hours");
				System.out.println("Enter again");
			}
		}

	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		boolean trueMin = false;
		while (!trueMin) {
			if (min >= 0 && min <= 59) {
				this.min = min;
				trueMin = true;
			} else {
				System.out.println("Hour has 60 min");
				System.out.println("Enter again");
			}
		}
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}

}
