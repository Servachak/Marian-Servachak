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
			String yes = "так";
			String ofCource = "";
			do{
			System.out.println("Enter 1 for a credit(Натисніть 1 щоб зняти гроші)");
			System.out.println("Enter 2 for add into the balance(Натисніть 2 щоб покласти гроші)");
			System.out.println("Enter 3 for chack the balance(Натисніть 3 щоб перевірити баланс)");
			
			String choise = scanner.next();
			switch (choise){
			case "1":{
				System.out.println("Enter the amount(Введіть суму)");
				int amount = scanner.nextInt();
	                System.out.println("Your amount(Ваша сума): "+ amount);			
				if (balance >= amount){
					
					balance = balance - amount;
					System.out.println("Your balance(Ваш залишок) "+ balance);
					System.out.println("Take your money(Візьміть гроші)");
				}else{
				System.out.println("Insufficient funds in your Balance(недостатньо коштів)");
				System.out.println("Your balance "+ balance);
				}
				break;
			}
			case "2":{
				System.out.println("Make your money(Покласти гроші) ");
				int yourMany = scanner.nextInt();
				System.out.println("Your amount(Ваша сума): "+ yourMany);
				balance = balance + yourMany;
				System.out.println("Your balance(Ваш баланс) "+ balance);
				break;
			}
			case "3":{
				System.out.println("Your balance(Ваш баланс) "+ balance);
				break;
			}
			default : {
				break;
			}
			}
			System.out.println("Бажаєте продовжити");
			ofCource = scanner.next().toLowerCase();
			}while(ofCource.equals(yes) == true);
			System.out.println("Nice day(Гарного дня)");
			scanner.close();
		}
		}
	

