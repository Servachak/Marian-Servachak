package zoopark;

import java.util.Scanner;

public class zoopark_Dz {

	public static void main(String[] args) {
		String zviri[] = { "���̲��", "������", null, "�����", "�����", null, "�����", null, null, null };
		Scanner scanner = new Scanner(System.in);
		String yes = "���";
		String ofCource = "";
		do {
			System.out.println("1 - ��������� �������� �������");
			System.out.println("2 - �������� ������� � �������");
			System.out.println("3 - �������� ������� � ��������");
			System.out.println("4 - ����������� ��� ������");

			String choice = scanner.next();
			switch (choice) {
			case "1": {
				System.out.println("������ ����� �������");
				String nazvaTvaryny = scanner.next().toUpperCase();
				for (int i = 0; i < zviri.length; i++) {
					if (nazvaTvaryny.equalsIgnoreCase(zviri[i]) == true) {
						System.out.println("���� ������� � " + nazvaTvaryny);
					} else {
						System.out.println("ֳ�� ������� ���� " + nazvaTvaryny);
						break;
					}
				}
				break;
			}
			case "2": {
				System.out.println("��� ������� ��������");
				String newZvir = scanner.next().toUpperCase();
				for (int i = 0; i < zviri.length; i++) {
					if (newZvir.equalsIgnoreCase(zviri[i]) == true) {
						System.out.println("���� ������� � " + newZvir);
						break;
					}
					if (zviri[i] == null)  {
						System.out.println("���������� �� �������� " + newZvir);
						zviri[i] = newZvir;
						break;
					}
				}
				break;
			}
			case "3": {
				System.out.println("��� ������� ��������");
				String oldZvir = scanner.next().toUpperCase();
				for (int i = 0; i < zviri.length; i++) {
					if (oldZvir.equalsIgnoreCase(zviri[i]) == true) {
						zviri[i] = null;

						System.out.println("�� �������� " + oldZvir);
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
			System.out.println("������ ����������");
			ofCource = scanner.next().toLowerCase();
		} while (ofCource.equals(yes) == true);
		System.out.println("Nice day(������� ���");
		scanner.close();
	}
}
