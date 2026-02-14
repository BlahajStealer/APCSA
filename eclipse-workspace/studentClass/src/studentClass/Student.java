package studentClass;
import java.util.*;
public class Student {
	

	public static void main(String args[]) {
		boolean on = true;
		Scanner in = new Scanner(System.in);
		System.out.println("------------\nStudentClass\n------------");
		System.out.println("Please enter your name");
		stu newStudent = new stu();
		System.out.print(">> ");
		newStudent.name = in.nextLine();
		System.out.println("Hello, " + newStudent.name);
		while (on) {

			System.out.println("Please choose one of the following options!\n[1]: Change Name\n[2]: Change GPA\n[3]: Report an"
					+ " absence\n[4]: Change current grade\n[5]: Exit");
			String choice = "0";
			while ((!choice.equals("1")) && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5")) {
				System.out.print(">> ");
				choice = in.nextLine();
			}		
			if (choice.equals("1")) {
				newStudent = changeName(newStudent);
			} else if (choice.equals("2")) {
				newStudent = gpa(newStudent);
			} else if (choice.equals("3")) {
				newStudent = Absence(newStudent);
			} else if (choice.equals("4")) {
				newStudent = Grade(newStudent);
			} else {
				System.out.println("Goodbye, " + newStudent.name);
				on = false;
			}
		}

		in.close();
	}
	static stu changeName(stu newStudent) {
		Scanner in = new Scanner(System.in);

		System.out.print("\nWhat would you like to change your name to?\n>> ");
		newStudent.name = in.nextLine();
		System.out.println("Thanks, " + newStudent.name);
		return newStudent;
	}
	static stu gpa(stu newStudent) {
		Scanner in = new Scanner(System.in);
		System.out.println("\nWhat is your current GPA?");
		newStudent.GPA = in.nextFloat();
		
		return newStudent;
	}
	static stu Absence(stu newStudent) {
		Scanner in = new Scanner(System.in);
		System.out.println("\nYou're absent?\n[1]: Absent\n[2]: Not absent\n[3]: Tardy");
		String choice = "0";
		while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
			System.out.print(">> ");
			choice = in.nextLine();
		}
		if (choice.equals("1")) {
			newStudent.absent = "Absent";
		}
		else if (choice.equals("2")) {
			newStudent.absent = "Present";
		}
		else if (choice.equals("3")) {
			newStudent.absent = "Tardy";
		}
		System.out.println("Thank you so much, " + newStudent.name);
		return newStudent;
	}
	static stu Grade(stu newStudent) {
		Scanner in = new Scanner(System.in);
		System.out.println("What grade are you in?\n[1]: Freshman\n[2]: Sophomore\n[3]: Junior\n[4]: Senior");
		String choice = "0";
		while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
			System.out.print(">> ");
			choice = in.nextLine();
		}		
		if (choice.equals("1")) {
			newStudent.absent = "Freshman";
		}
		else if (choice.equals("2")) {
			newStudent.absent = "Sophomore";
		}
		else if (choice.equals("3")) {
			newStudent.absent = "Junior";
		}
		else if (choice.equals("4")) {
			newStudent.absent = "Senior";
		}
		System.out.println("Thanks, " + newStudent.name);
		return newStudent;
	}
	
}
