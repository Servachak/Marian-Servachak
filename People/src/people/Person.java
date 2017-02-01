package people;

import java.util.Scanner;

public class Person {
 String name = "";
 String type = "";
 int vik;
 Scanner scan = new Scanner(System.in);
 public Person(String name, String type, int vik) {
	super();
	System.out.println("Enter your Name");
	this.name = scan.nextLine().toUpperCase();
	System.out.println("Is your Man or Women");
	this.type = scan.nextLine().toUpperCase();
	System.out.println("Hove old are you");
	this.vik = scan.nextInt();
}

}
