import java.util.Scanner;

public class bankomat_DZ1 {

	public static void main(String[] args) {
		int balance = 5000;
		Scanner scanner = new Scanner(System.in);
		String login = "servachak";
		String userName = "";
		while (userName.equals(login) != true){
		System.out.println("Enter user Name");
		userName = scanner.nextLine().toLowerCase();
		}
			String pass = "1234";
			String password = "";
			while (password.equals(pass) != true){
			System.out.println("Enter password");
			password = scanner.nextLine();
			}
			String yes = "���";
			String ofCource = "";
			do{
			System.out.println("Enter 1 for a credit(�������� 1 ��� ����� �����)");
			System.out.println("Enter 2 for add into the balance(�������� 2 ��� �������� �����)");
			System.out.println("Enter 3 for chack the balance(�������� 3 ��� ��������� ������)");
			
			String choise = scanner.next();
			switch (choise){
			case "1":{
				System.out.println("Enter the amount(������ ����)");
				int amount = scanner.nextInt();
	                System.out.println("Your amount(���� ����): "+ amount);			
				if (balance >= amount){
					
					balance = balance - amount;
					System.out.println("Your balance(��� �������) "+ balance);
					System.out.println("Take your money(³����� �����)");
				}else{
				System.out.println("Insufficient funds in your Balance(����������� �����)");
				System.out.println("Your balance "+ balance);
				}
				break;
			}
			case "2":{
				System.out.println("Make your money(�������� �����) ");
				int yourMany = scanner.nextInt();
				System.out.println("Your amount(���� ����): "+ yourMany);
				balance = balance + yourMany;
				System.out.println("Your balance(��� ������) "+ balance);
				break;
			}
			case "3":{
				System.out.println("Your balance(��� ������) "+ balance);
				break;
			}
			default : {
				break;
			}
			}
			System.out.println("������ ����������");
			ofCource = scanner.next().toLowerCase();
			}while(ofCource.equals(yes) == true);
			System.out.println("Nice day(������� ���)");
			scanner.close();
		}
		}
	

