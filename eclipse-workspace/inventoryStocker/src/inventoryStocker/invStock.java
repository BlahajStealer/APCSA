package inventoryStocker;
import java.util.*;
import java.util.ArrayList;
public class invStock {
	public static void main(String args[]) {
		System.out.println("--------------------\nInventory Management\n--------------------");
		Scanner in = new Scanner(System.in);

		boolean on;
		Functions Stock = new Functions();
		do {
			System.out.println("Hello, welcome to your company provided Inventory Manager!\nPlease choose from the following. Please note the company is not responsible for damages such as broken ankles, feet, legs, hearts, intestines, or lungs!" +
					"\n[1]: Add a product\n[2]: Remove a product\n[3]: Add stock\n[4]: Withdraw Stock\n[5]: Quit");
			String choice;
			do {
				System.out.print(">> ");
				choice = in.nextLine();
			} while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5"));
			if (choice.equals("1")) {
				Stock.add(in, args);
			} else if (choice.equals("2")) {
				Stock.rem(in, args);
			} else if (choice.equals("3")) {
				Stock.addStock(in, args);
			} else if (choice.equals("4")) {
				Stock.remStock(in, args);
			}
			if (choice.equals("5")) {
				on = false;
			} else {
				on = true;
			}
		} while (on);
	}
}
