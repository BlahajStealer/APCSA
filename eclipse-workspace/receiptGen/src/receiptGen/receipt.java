package receiptGen;
import java.util.*;
public class receipt {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("----------\nReceiptGen\n----------\n");	
		
		System.out.print("This program will create a receipt based upon the given values!\nPrice>> ");
		double price = in.nextDouble();
		System.out.print("Tax>> ");
		double tax = in.nextDouble();
		char perc = 37;
		System.out.printf("\nYour subtotal is\t:\t $%.2f", price);
		System.out.printf("\nYour tax is\t\t:\t %.2f%c", tax, perc);
		System.out.printf("\nYour total is\t\t:\t $%.2f", ((tax/100) * price) + price);
	}
}
