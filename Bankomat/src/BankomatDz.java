import java.util.Scanner;

public class BankomatDz {

	public static void main(String[] args) {
		int balance = 5000;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter user Name");
		String login = "servachak";
		String userName = scanner.nextLine().toLowerCase();
		if (login.equals(userName)){
			System.out.println("Enter password");
			String pass = "1234";
		String password = scanner.nextLine();
		if (password.equals(pass)){
			System.out.println("Enter 1 for a credit");
			System.out.println("Enter 2 for add into the balance");
			System.out.println("Enter 3 for chack the balance");
			
			String choise = scanner.next();
			switch (choise){
			case "1":{
				System.out.println("Enter the amount");
				int amount = scanner.nextInt();
				balance = balance - amount;
				break;
			}
			case "2":{
				System.out.println("Make your many ");
				int yourMany = scanner.nextInt();
				balance = balance + yourMany;
				break;
			}
			case "3":{
				System.out.println("Your balance "+ balance);
				break;
			}default:{
				break;
			}}
		}else{
			System.out.println("The password is invalid");
			}
		}else{
			System.out.println("The user name is invalid");
		}
	}

}
