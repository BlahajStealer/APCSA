package bankAccount;
import java.util.*;
public class balance {
	private float balance = 0;
	public String name;
	public float Withdraw(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much would you like to withdraw, " + name);
		float input = balance + 1;

		while (input > balance) {
			System.out.print(">> ");
			input = in.nextFloat();

		}
		balance -= input;
		System.out.println("Thank you so much for trusting our bank!");
		return input;
	}
	public void Deposit(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("How much would you like to deposit?\n>> ");
		balance += in.nextFloat();
		System.out.println("Thanks for trusting our sh... great bank!");
	}
	public void Balance(String args[]) {
		System.out.println("You currently have: $" + balance);
		
		
	}
}
