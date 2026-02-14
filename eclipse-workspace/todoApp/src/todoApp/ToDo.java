//Made by Ashley <3
package todoApp;
import java.util.*;
import java.util.ArrayList;
public class ToDo {
	public static void main(String args[]) {
		System.out.println("--------\nTodo App\n--------");
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome, let's get started, please enter your name!");
		String name = in.nextLine();
		System.out.println("Hello, " + name);
		boolean on;
		
		ArrayList<String> todo = new ArrayList<>();
		do {
			
			for (int i = 0; i < todo.size(); i++) {
				System.out.println(">> " + todo.get(i));
			}
			System.out.println("Please choose one of the following options!\n[1]: Add a task\n[2]: Remove a task\n[3]: Quit");
			String choice;
			do {
				System.out.print(">> ");
				choice = in.nextLine();
			} while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
			if (choice.equals("1")) {
				todo = Functions.add(todo, in);
			} else if (choice.equals("2") ) {
				todo = Functions.rem(todo, in);
			}
			if (choice.equals("3")) {
				on = false;
			} else {
				on = true;
			}
		} while (on);
	}
}
