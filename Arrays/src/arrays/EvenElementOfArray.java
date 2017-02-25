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
		for (int i : arr) {
			if (i %2 !=0){
				i = 2;
				
			}System.out.print(i +" ");
		}
	}

}
