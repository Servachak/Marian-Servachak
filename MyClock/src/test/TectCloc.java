package test;


import java.util.Scanner;

public class TectCloc {
	static Scanner scanner = new Scanner(System.in);
	int hour;
	int min;
	
	public TectCloc(int hour, int min){
		this.hour = hour;
		this.min = min;
	}

	public void durationTime( int duration){
		
		min = min + duration;
		for (int i = 0; i <= 24; i++) {
			
			if (min > 60) {
				hour = hour + (min / 60);
				min = min % 60;
			} else {
				break;
			}
		}
		
		if (min < 10) {
			System.out.println(hour + " :" + 0 + "" + min);
		} else {
			System.out.println(hour + " :" + min);
		}}
	public static void main(String[] args) {

		TectCloc cloc = new TectCloc(2, 0);
		System.out.println("Enter duration");
		int duration = scanner.nextInt();
		cloc.durationTime(duration);
		
	}

}
