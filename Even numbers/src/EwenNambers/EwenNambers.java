package EwenNambers;

public class EwenNambers {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };
		for (int i = 1; i < array.length; i += 2) {
			if (i <= 20) {
				System.out.print(array[i] + "  ");

			}
		}System.out.println();
		for (int i = 1; i < array.length; i += 2) {
			if (i <= 20) {
				System.out.println(array[i] + "  ");
			}
		}
	}
}
