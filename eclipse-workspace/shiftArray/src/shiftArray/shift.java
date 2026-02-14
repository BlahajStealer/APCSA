package shiftArray;
import java.util.*;
import java.util.Arrays;
public class shift {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("----------\nShiftArray\n----------");
		System.out.print("Please input the number of strings you would like to add to this array\n>> ");
		int num = in.nextInt();
		String strings[] = new String[num];
		in.nextLine();
		for (int i = 0; i < strings.length; i++) {
			System.out.print(">> ");
			strings[i] = in.nextLine();
		}
		boolean on = true;
		while (on) {
			System.out.println("Would you like to:\n[1]: Shift the array right\n[2]: Shift the array left\n[3]: Print all\n[4]: Quit");
			String choice = "0";
			while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
				System.out.print(">> ");
				choice = in.nextLine();
			}
			if (choice.equals("1")) {
				String arraycopy[] = Arrays.copyOf(strings, strings.length);
				for (int i = 0; i < strings.length; i++) {
					if (i == strings.length - 1) {
						strings[0] = arraycopy[i];
					} else {
						strings[i+1] = arraycopy[i];

					}
				}
			
			}

				
			
			else if (choice.equals("2")) {
				String arraycopy[] = Arrays.copyOf(strings, strings.length);
				for (int i = 0; i < strings.length; i++) {
					if (i == 0) {
						strings[strings.length - 1] = arraycopy[0];
					} else {
						strings[i - 1] = arraycopy[i];
					}
				}
			} else if (choice.equals("3")) {
				for (int i = 0; i < strings.length; i++) {
					System.out.println(strings[i]);
				}
			} else {
				on = false;
			}
		}
	}
}
