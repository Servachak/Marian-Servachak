
//�������� ������ �� 15 ��������� ����� ����� �� ������� [0;9]. 
//�������� ������ �� �����. 
//����������� ������� � ������� ������ ��������� 
//� �������� ��� ���������� �� ����� �� ��������� ������.
package arrays;

import java.util.Random;

public class AnArrayRandomNumbers {

	public static void main(String[] args) {
		int[] array = new int[15];//��������� ����� �� 15 ��������
		int b = 0;// ��������� ����� ��� ��� ���� ��� �������� ������� ������ �����
		for (int i = 0; i < array.length; i++) {// ��������� ������ ���� �������� ������� �������� ������ ����� ��������� ��������
			Random random = new Random();// ����������� ��� ������
			array[i] = random.nextInt(10);// ������� �������� ������ ���������� ��������� �������� �� ���� �� 10-��
			System.out.print(array[i] +" ");// �������� ��� ����� � �������
  if(array[i]>0&array[i]%2==0)b++;// ���� ������� ������ >0 �� ������ ������ �� ������ �������� ������ �� 2 ����� 0 �� ������� ������ ����� �������� �� 1
        }
        System.out.println(" ");
        System.out.println("����� � ������� "+b+" ������");
	}
			
		

	}


