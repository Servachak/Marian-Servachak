package Monetky;

import java.util.Scanner;

public class Coints {

	public static void main(String[] args) {
		System.out.println("Enter some numeric");
	Scanner scanner = new Scanner(System.in);
	
	int coints[] = {1,2,5,10,25,50};// масив елемент≥в монеток
	int kilkist = 0;//  ≤Ћ№ ≤—“№ монеток
	int chyslo = scanner.nextInt();	// число €ке € вводжу наприклад 154
	for (int i = coints.length -1; i > 0; i--) {// цикл в €кому ми починаЇмо з к≥нц€
	if (chyslo > coints[i]){// €кщо моЇ число б≥льше елемента масиву
	 kilkist = chyslo / coints[i];// то число розд≥лити на елемент масивуб (в нашому випадку на останн≥й оск≥льки число б≥льше за 50 - максимальний елемент масиву)
	chyslo = chyslo % coints[i];}//переприсвоюЇмо число на залишок числа при д≥ленн≥ по модулю

	System.out.println(kilkist + " = " + coints[i]) ;// виводимо наш≥ значенн€ п≥лч циклу if
	}scanner.close();
	}

}
