package people;

import java.util.Scanner;

public class Collector {
	String first;
	String second;
	String drink;
	Scanner scan = new Scanner(System.in);

	public Collector(String first, String second, String drink) {
		super();
		System.out.println("Your is Collector");
		String yes = "yes";
		String ofCource = "";
		do{
		System.out.println("You have to eat fried eggs, soup and juice or coffee");
		System.out.println("Enter first course");
		
		this.first = scan.next().toLowerCase();
		if (this.first.equals("fried eggs")|| (this.first.equals("eggs"))) {
			this.first = "fried eggs";
			System.out.println("you will be " + this.first);
		} else {
			 first = this.first ;
			System.out.println("We don't have this " + first + " we have fried eggs");
		}
		
		System.out.println("Enter second course");
		this.second = scan.next().toLowerCase();
		if (this.second.equals("soup")) {
			this.second = "soup";
			System.out.println("you will be " + this.second);
		} else {
			second = this.second ;
			System.out.println(("We don't have this " + second + " we have soup"));
		}
		
		System.out.println("Enter drink ");
		this.drink = scan.next().toLowerCase();
		if (this.drink.equals("juice") || (this.drink.equals("coffee"))) {
			
			System.out.println("you will be " + this.drink );
		} else {
			drink = this.drink;
			System.out.println("We don't have this " + drink +" we have juice or cofe ");
		}
           System.out.println("you want to continue");
           ofCource = scan.next().toLowerCase();
	}while(ofCource.equals(yes) == true);
		
}
}