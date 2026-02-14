package todoApp;
import java.util.*;
import java.util.ArrayList;
public class Functions {
	public static ArrayList<String> add(ArrayList<String> al, Scanner in) {
		System.out.print("What would you like to Add?\n>> ");
		String added;
		added = in.nextLine();
		al.add(added);
		return al;
	}
	public static ArrayList<String> rem(ArrayList<String> al, Scanner in) {
		System.out.print("What would you like to Remove?\n>> ");
		String rem;
		rem = in.nextLine();
		al.remove(rem);
		return al;
		
		
	}
}
