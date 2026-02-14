package bankAccount;
import java.util.*;
public class BankAccount {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);	
		System.out.println("-----------\nBankAccount\n-----------");
		boolean on = true;
		System.out.print("Please enter your name!\n>> ");
		balance person = new balance();
		person.name = in.nextLine();
		while (on) {

			System.out.println("Welcome to your bank, please choose from one of the following options!\n[1]: Withdraw\n[2]: Deposit\n[3]: Check Balance\n[4]: Exit");
			String choice = "0";
			while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
				System.out.print(">> ");
				choice = in.nextLine();
			}
			if (choice.equals("1")) {
				person.Withdraw(args);
			}
			else if (choice.equals("2")) {
				person.Deposit(args);
			}
			else if (choice.equals("3")) {
				person.Balance(args);
			} else {
				on = false;
				System.out.println("Thanks!");
			}
		}
		in.close();		

	}
}
