package Monetky;

import java.util.Scanner;

public class Coints {

	public static void main(String[] args) {
		System.out.println("Enter some numeric");
	Scanner scanner = new Scanner(System.in);
	
	int coints[] = {1,2,5,10,25,50};// ����� �������� �������
	int kilkist = 0;// ʲ��ʲ��� �������
	int chyslo = scanner.nextInt();	// ����� ��� � ������ ��������� 154
	for (int i = coints.length -1; i > 0; i--) {// ���� � ����� �� �������� � ����
	if (chyslo > coints[i]){// ���� �� ����� ����� �������� ������
	 kilkist = chyslo / coints[i];// �� ����� �������� �� ������� ������� (� ������ ������� �� ������� ������� ����� ����� �� 50 - ������������ ������� ������)
	chyslo = chyslo % coints[i];}//�������������� ����� �� ������� ����� ��� ����� �� ������

	System.out.println(kilkist + " = " + coints[i]) ;// �������� ���� �������� ��� ����� if
	}scanner.close();
	}

}
