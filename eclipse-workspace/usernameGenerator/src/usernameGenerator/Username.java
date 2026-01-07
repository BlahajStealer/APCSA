package usernameGenerator;
import java.util.*;
public class Username {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("-----------\nUsernameGen\n-----------");
		
		System.out.print("Please input your first name then your last name to generate yourself a username!\nFirst Name>> ");
		String firstName = in.nextLine();
		System.out.print("\nLast Name>> ");
		String lastName = in.nextLine();
		System.out.print("\nPick a random number that is less than your first name\n>> ");
		int num1 = in.nextInt();		
		System.out.print("\nPick a random number that is less than your last name\n>> ");
		int num2 = in.nextInt();		
		
		
		String userName = firstName.toLowerCase().substring(num1) + lastName.toLowerCase().substring(num2);
		System.out.println("Your username is " + userName);

		
	}
}
