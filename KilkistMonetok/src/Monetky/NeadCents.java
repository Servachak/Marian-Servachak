package Monetky;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class NeadCents {
	public static void main(String[] args) {
		int coins[] = { 1, 2, 5, 10, 25, 50 };

		Scanner scanner = new Scanner(System.in);
		scanner.close();
		System.out.println("Enter some numeric ");
		int numeric = scanner.nextInt();
		int numbers1 = 0;
		int kilkist = 0;
		int remainder = 0;
		for (int i = 0; i < coins.length; i++) {

			if (numeric >= coins[i] ) {
				numbers1 = coins[i];
				kilkist = numeric / numbers1;
				remainder = numeric % numbers1;
				}
				}
		System.out.println(numbers1 + " = " + kilkist);
		
		int numbers2 = 0;
		int kilkist2 = 0;
		int remainder2 = 0;
		for (int i = 0; i < coins.length; i++) {
			if ((remainder >= coins[i])&& remainder != 0){
				numbers2 = coins[i];
				kilkist2 = remainder / numbers2;
				remainder2 = remainder % numbers2;
				}break;
		}
				
		System.out.println(numbers2 + " = " + kilkist2);
		
		int numbers3 = 0;
		int kilkist3 = 0;
		int remainder3 = 0;
		for (int i = 0; i < coins.length; i++) {
			if ((remainder2 >= coins[i])&& remainder2 != 0){
				numbers3 = coins[i];
				kilkist3 = remainder2 / numbers3;
				remainder3 = remainder2 % numbers3;
				}
		}System.out.println(numbers3 + " = " + kilkist3);
		
		int numbers4 = 0;
		int kilkist4 = 0;
		int remainder4 = 0;
		for (int i = 0; i < coins.length; i++) {
			if ((remainder3 >= coins[i])&& remainder3 != 0){
				numbers4 = coins[i];
				kilkist4 = remainder3 / numbers4;
				remainder4 = remainder3 % numbers4;
				}
		}System.out.println(numbers4 + " = " + kilkist4);
			}
}

