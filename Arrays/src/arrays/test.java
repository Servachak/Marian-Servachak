package arrays;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		int []arr = new int[8];// ��������� ����� �� 8 ��������
			for (int i = 0; i < arr.length; i++) { //��������� ������ ���� ��� ���� ���������� �������� � �������� ������
			arr[i] = (int)(Math.random()*9+1); //�������� ��������� ����� �� 1 �� 9
			System.out.print(arr[i]); //�������� ������������ �����
		}
			System.out.println();// ��������� ������
		for (int i = 0; i < arr.length; i++) {// ��������� ������ �� ������������� ����� ���� ���� ������ �� ���� �����
		if (arr[i]%2!=0) // ���� ����� �� �����
			arr[i] = 0; // �� ������ �������� ������ �� 0( ��������� 5 �� 0 , �� 7 �� 0 ���.) 
		System.out.print(arr[i]); // �������� ����� ����� � ��� ��������� ���������� 
		}

	}

}
