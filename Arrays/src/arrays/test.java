package arrays;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		int []arr = new int[8];// створюЇмо масив на 8 елемент≥в
			for (int i = 0; i < arr.length; i++) { //запускаЇмо б≥гунц€ €кий нам буде записувати значенн€ в елементи масиву
			arr[i] = (int)(Math.random()*9+1); //генеруЇво випадкове число в≥д 1 до 9
			System.out.print(arr[i]); //виводемо згенерований масив
		}
			System.out.println();// розд≥л€Їмо строки
		for (int i = 0; i < arr.length; i++) {// запускаЇмо б≥гунц€ по згенерованому масив≥ €кий буде шукати не парн≥ числа
		if (arr[i]%2!=0) // €кщо число не парне
			arr[i] = 0; // то м≥н€Їмо значенн€ масива на 0( наприклад 5 на 0 , чи 7 на 0 ≥тд.) 
		System.out.print(arr[i]); // виводимо новий масив з уже зам≥н€ними значенн€ми 
		}

	}

}
