package testScores;
import java.util.*;
public class Tests {
	public static void main(String args[]) {
		System.out.println("-----------\nTest Scores\n-----------");
		Scanner in = new Scanner(System.in);
		System.out.print("Welcome! Please enter the number of tests you are going to input\n>> ");
		int num = in.nextInt();
		System.out.println("Please input them now!");
		float[] tests = new float[num];
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + ">> ");
			tests[i] = in.nextFloat();
		}
		boolean on = true;
		Methods meth = new Methods();
		while (on) {
			System.out.println("Please choose from the following:\n[1]: Average\n[2]: Max and Min\n[3]: Exit");
			String choice = "0";
			while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
				System.out.print(">> ");
				choice = in.nextLine();
			}
			if (choice.equals("1")) {
				meth.average(tests);
			} else if (choice.equals("2")) {
				meth.minMax(tests);

			} else {
				on = false;
				System.out.println("Bye!");
			}
		}
		
	}
	
}
