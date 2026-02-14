package seatingChart;
import java.util.*;
public class Seating {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("------------\nSeatingChart\n------------");
		boolean seats[];
		seats = new boolean[20];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = true;
		}
		boolean on = true;
		while (on) {
			System.out.println("Would you like to reserve a seat?\n[1]: Yes\n[2]: No");
			String choice = "0";
			while (!choice.equals("1") && !choice.equals("2")) {
				System.out.print(">> ");
				choice = in.nextLine();
			}
			if (choice.equals("2")) {
				System.out.println("Kay, bye!");
				on = false;
			} else if (choice.equals("1")) {
				for (int i = 0; i < seats.length; i++) {
					if (i % 5 == 0) {
						System.out.println();
					}
					if (seats[i] == true) {
						System.out.print("a ");

					} else {
						System.out.print("n ");
					}

					
				}
				System.out.println("\nPlease choose an (a)vailable seat, 1-20!");
				int seatchoice = 100;
				boolean seatgood = false;
				while (!seatgood) {
					if (seatchoice > 19 || seatchoice < 0) {
						System.out.print(">> ");
						seatchoice = in.nextInt();
						seatchoice--;
					} else if (!seats[seatchoice]) {
						System.out.print(">> ");
						seatchoice = in.nextInt();
						seatchoice--;
					} else {
						seats[seatchoice] = false;
						seatgood = true;
					}
				}

			}
		}

		
	}
}
