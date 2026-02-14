package rectangleTangler;
import java.util.*;
public class Rectangler {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("--------------\nThe Rectangler\n--------------");
		boolean on = true;
		Rectangle newRect = new Rectangle();
		System.out.println("\nPlease enter Length then Width!");
		System.out.print(">> ");
		newRect.W = in.nextFloat();
		System.out.print(">> ");
		newRect.L = in.nextFloat();
		while (on) {
			System.out.println("\n\nPlease choose one of the following!\n[1]: Check Area\n[2]: Check Perimiter\n[3]: Scale\n[4]: Exit");
			String choice = "0";
			while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
				System.out.print(">> ");
				choice = in.nextLine();
			}
			if (choice.equals("1")) {
				float area = newRect.area();
				System.out.println("The area of the Rectangle is " + area);
			}
			else if (choice.equals("2")) {
				float per = newRect.per();
				System.out.println("The perimiter of the Rectangle is " + per);

			}
			else if (choice.equals("3")) {
				System.out.print("Please enter the scale!\n>> ");
				float scale = in.nextFloat();
				newRect.scale(scale, args);
			} else {
				on = false;
				System.out.println("Bye!");
			}
		}
	}
}
