package people;

import java.util.Scanner;

public class Hanter {
	String first;
	String second;
	String drink;
	Scanner scan = new Scanner(System.in);

	public Hanter(String first, String second, String drink) {
		super();
		System.out.println("You is a Hanter");
		String yes = "yes";
		String ofCource = "";
		do {
			System.out.println("You have to eat steak, soup and tee or coffee");
			System.out.println("Enter first course");

			this.first = scan.next().toLowerCase();
			if (this.first.equals("steak")) {
				this.first = "steak";
				System.out.println("you will be " + this.first);
			} else {
				first = this.first;
				System.out.println("We don't have this " + first + " we have steak");
			}

			System.out.println("Enter second course");
			this.second = scan.next().toLowerCase();
			if (this.second.equals("soup")) {
				this.second = "soup";
				System.out.println("you will be " + this.second);
			} else {
				second = this.second;
				System.out.println(("We don't have this " + second + " we have soup"));
			}

			System.out.println("Enter drink ");
			this.drink = scan.next().toLowerCase();
			if (this.drink.equals("tee") || (this.drink.equals("coffee"))) {
				System.out.println("you will be " + this.drink);
			} else {
				drink = this.drink;
				System.out.println("We don't have this " + drink + " we have tee or cofe ");
			}
			System.out.println("you want to continue");
			ofCource = scan.next().toLowerCase();
		} while (ofCource.equals(yes) == true);
	}
}
