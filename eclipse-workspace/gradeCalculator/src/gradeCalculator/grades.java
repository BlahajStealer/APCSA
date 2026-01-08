package gradeCalculator;
import java.util.*;
public class grades {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("---------------\nGradeCalculator\n---------------\nPlease input your class>>");
		String classTaken = in.nextLine();
		System.out.print("Please input your grade>>");
		double grade = in.nextDouble();
		if (grade < 0) {
			System.out.print("You are so bad you're in the negatives...");
		}  else if (grade >= 60 && grade < 70) {
			System.out.print("You are currenty getting a D in " + classTaken);
		} else if (grade >= 70 && grade < 80) {
			System.out.println("You are currently getting a C in " + classTaken);
		}
		 else if (grade >= 80 && grade < 90) {
			System.out.println("You are currently getting a B in " + classTaken);
		}
		 else if (grade >= 90) {
			System.out.println("You are currently getting a A in " + classTaken);
		} else {
			System.out.println("You are currently failing " + classTaken);
		}
		in.close();
	}
}
