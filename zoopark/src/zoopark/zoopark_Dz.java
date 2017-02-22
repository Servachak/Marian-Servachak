package zoopark;

import java.util.Scanner;

public class zoopark_Dz {

	public static void main(String[] args) {
		String zviri[] = { "ВЕДМІДЬ", "ЛИСИЦЯ", null, "ЗАЄЦЬ", "КАБАН", null, "КАЧКА", null, null, null };
		Scanner scanner = new Scanner(System.in);
		String yes = "так";
		String ofCource = "";
		do {
			System.out.println("1 - Перевірити наявність тварини");
			System.out.println("2 - Добавити тварину в зоопарк");
			System.out.println("3 - Видалити тварину з зоопарку");
			System.out.println("4 - Переглянути всіх тварин");

			String choice = scanner.next();
			switch (choice) {
			case "1": {
				System.out.println("Введіть назву тварини");
				String nazvaTvaryny = scanner.next().toUpperCase();
				for (int i = 0; i < zviri.length; i++) {
					if (nazvaTvaryny.equalsIgnoreCase(zviri[i]) == true) {
						System.out.println("Така тварина є " + nazvaTvaryny);
					} else {
						System.out.println("Цієї тварини немає " + nazvaTvaryny);
						break;
					}
				}
				break;
			}
			case "2": {
				System.out.println("Яку тварину добавити");
				String newZvir = scanner.next().toUpperCase();
				for (int i = 0; i < zviri.length; i++) {
					if (newZvir.equalsIgnoreCase(zviri[i]) == true) {
						System.out.println("Така тварина є " + newZvir);
						break;
					}
					if (zviri[i] == null)  {
						System.out.println("Добавлений до зоопарку " + newZvir);
						zviri[i] = newZvir;
						break;
					}
				}
				break;
			}
			case "3": {
				System.out.println("Яку тварину видалити");
				String oldZvir = scanner.next().toUpperCase();
				for (int i = 0; i < zviri.length; i++) {
					if (oldZvir.equalsIgnoreCase(zviri[i]) == true) {
						zviri[i] = null;

						System.out.println("Ви видалили " + oldZvir);
						break;
					}
				}
				break;
			}
			case "4": {
				for (int i = 0; i < zviri.length; i++) {
					System.out.println(zviri[i]);
				}
				break;
			}
			}
			System.out.println("Бажаєте продовжити");
			ofCource = scanner.next().toLowerCase();
		} while (ofCource.equals(yes) == true);
		System.out.println("Nice day(Гарного дня");
		scanner.close();
	}
}
