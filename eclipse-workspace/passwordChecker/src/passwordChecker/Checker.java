package passwordChecker;
import java.util.*;
public class Checker {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------------\nPasswordChecker\n---------------");
		System.out.print("\nPlease input your password below!\n>> ");
		String password = in.nextLine();
		int secRating = 0;
		if (password.indexOf('@') != -1 || password.indexOf('#') != -1 || password.indexOf('!') != -1) {
		
			secRating++;
		}
		for (int i = 65; i <= 90; i++) {
			if (password.indexOf(i) != -1) {
				secRating++;
				break;
			}		
		}
		for (int i = 97; i <= 122; i++) {
			if (password.indexOf(i) != -1) {
				secRating++;
				break;
			}		
		}
		if (password.length() >= 12) {
			secRating++;
			
		}
		String[] Praise = {"WTF IS THAT", "weak", "ok", "good", "great"};
		System.out.print("Your password is " + Praise[secRating] + "\nOut of 5, we rate it a " + (secRating+1));
	}
}
