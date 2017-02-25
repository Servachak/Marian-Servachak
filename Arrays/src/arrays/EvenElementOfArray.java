package arrays;

import java.util.Arrays;

public class EvenElementOfArray {

	public static void main(String[] args) {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 6 + 0);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i : arr) { // Звертаємось до самого значення в комірці
			if (i %2 !=0){  // якщо значення маси яке записано в комірку масиву 
				            //при діленні по модулю на 2 Не рівне 0 
				i = 2;     // то замінити його на 2 (наприклад 3 на 2, 5 на 2 і т.д)
				
			}System.out.print(i +" ");
		}
	}

}
