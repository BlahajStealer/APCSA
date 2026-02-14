package inventoryStocker;
import java.util.ArrayList;
import java.util.*;
public class Functions {
	ArrayList<String> stockItems = new ArrayList<>();
	ArrayList<Integer> stockCount = new ArrayList<>();
	public void add(Scanner in, String args[]) {

		System.out.print("Please enter the item you would like to add!\n>> ");
		String Added = in.nextLine();
		stockItems.add(Added);
		stockCount.add(0);
	}
	public void rem(Scanner in, String args[]) {
		for (int i = 0; i < stockItems.size(); i++) {
			System.out.println(i + ")\t" + stockItems.get(i) + ": " +stockCount.get(i));

		}
		System.out.println("Please enter the item you would like to remove!");
		int choice;
		do {
			System.out.print(">> ");
			
			choice = in.nextInt();
		} while(choice < 0 || choice >= stockItems.size());
		stockItems.remove(choice);
		stockCount.remove(choice);
	}
	public void addStock(Scanner in, String args[]) {
		for (int i = 0; i < stockItems.size(); i++) {
			System.out.println(i + ")\t" + stockItems.get(i) + ": " +stockCount.get(i));
		}
		System.out.println("Which of the items would you like to add items to?");
		int choice;
		do {
			System.out.print(">> ");
			choice = in.nextInt();
		} while (choice < 0 || choice >= stockItems.size());
		System.out.print("How many items are you adding?\n>> ");
		stockCount.set(choice, (in.nextInt() + stockCount.get(choice)));
	}
	public void remStock(Scanner in, String args[]) {
		
		for (int i = 0; i < stockItems.size(); i++) {
			System.out.println(i + ")\t" + stockItems.get(i) + ": " + stockCount.get(i));
		}
		System.out.println("Which of the items would you like to remove items from?");
		int choice;
		do {
			System.out.print(">> ");
			choice = in.nextInt();
		} while (choice < 0 || choice >= stockItems.size());
		System.out.print("How many items are you removing?\n>> ");
		int removed;
		do {
			System.out.print(">> ");
			removed = in.nextInt();
		} while(removed > stockCount.get(choice));
		stockCount.set(choice, (stockCount.get(choice) - removed));
	}
	
	
}
