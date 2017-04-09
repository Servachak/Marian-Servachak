package cinemaServachak;

public class Time {
 
	private int hour;
	private int min;
	
	public Time(int hour,int min){
		this.hour = hour;
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour <= 24){
		this.hour = hour;
		}else{
			System.out.println("Day has 24 hours");
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(min >= 0 && min <= 60){
			this.min = min;
		}else{
			System.out.println("Hour has 60 min");
		}
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}
 
}
