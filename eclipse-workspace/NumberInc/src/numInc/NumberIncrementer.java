package numInc;
import java.util.*;
public class NumberIncrementer {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("-----------------\nNumberIncrementer\n-----------------");
		System.out.println("This program is stupid! It will increment numbers and print out even numbers. It will also give you the sum of all the numbers combined.");
		int totalCalc = 0;
		int num = 0;
		boolean on = true;
		while (on) {
			num++;
			if (num%2 == 0) {
				System.out.println(num);
				
			}
			totalCalc += num;
			System.out.println("The running total is now: " + totalCalc);
			System.out.println("Would you like to continue?\n[0]: No\n[1]: Yes");
			boolean asked = true;
			while (asked) {
				System.out.print(">> ");
				String ans = in.nextLine();
				if (ans.equals("1")) {
					asked = false;
				} else if (ans.equals("0")) {
					asked = false;
					on = false;
				} else {
					asked = true;
				}
			}
		}
		in.close();
	}
}
