package people;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("", "", 0);
		
		if (person.type.equals("MAN")) {
			Hanter hanter = new Hanter("", "", "");
			System.out.println(	person.name + " you will be :" + hanter.first + " , " + hanter.second + " , " + hanter.drink);
			
			}
		else{
			 Collector collector = new Collector("", "", "");
			 System.out.println(	person.name + " you will be :" + collector.first + " , " + collector.second + " , " + collector.drink);
			 
		}	 System.out.println("Bon appetit " + person.name);
		}
		

	}

