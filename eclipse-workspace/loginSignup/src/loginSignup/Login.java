package loginSignup;
import java.util.*;
public class Login {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String Username = null;
		String Password = null;
		boolean on = true;
		while (on) {
			System.out.println("-----\nLogin\n-----");
			System.out.println("Hello, would you like to login or signup?\n[1]: Login\n[2]: Signup");

			char choice = '0';
			while ((choice != '1') && choice != '2' ) {
				System.out.print(">> ");
				choice = in.nextLine().charAt(0);
			}
			if (choice == '2') {
				System.out.println("------\nSignup\n------");  
				
				System.out.print("Please create your username\n>> ");
				Username = in.nextLine();
				System.out.print("Please create your password\n>> ");
				Password = in.nextLine();
			}else if (choice == '1') {
				System.out.print("Please input your username\n>> ");
				String UsernameCheck = in.nextLine();
				if (!UsernameCheck.equals(Username)) { 
					System.out.println("\nThat Username does not exist");
					continue;
				}
				System.out.print("\nPlease input your password\n>> ");
				String PassCheck = in.nextLine();
				if (!PassCheck.equals(Password)) {
					System.out.println("\nIncorrect password");
					continue;
				} else {
					System.out.println("\nWelcome, " + Username);
					System.out.println("Would you like to exit or signout?\n[1]: exit\n[2]: signout");
					char stayOrLeave = '0';
					while (stayOrLeave != '1' && stayOrLeave != '2') {
						System.out.print(">> ");
						stayOrLeave = in.next().charAt(0);
					}
					if (stayOrLeave == '1') {
						on = false;
					}
				}
				
			}
		}

		in.close();
	}
}
