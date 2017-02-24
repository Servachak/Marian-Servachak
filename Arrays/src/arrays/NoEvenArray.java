package arrays;

import java.util.Arrays;

public class NoEvenArray {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,9,0};
		int b = 0;
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
		}
		System.out.println();
		
		for (int i = 1; i < array.length; i++) {
			Arrays.sort(array);
		if (array[i]%2 == 0)
			System.out.print(array[i]);
			
		}

	}

}
