package guessingGame;
import java.util.*;
import java.util.random.*;
public class GuessingGame {
	public static void main() {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("------------\nGuessingGame\n------------");
		System.out.println("Hiya! Welcome to this game. Please guess a number, and ill tell you if you're right!");
		int guesses = rand.nextInt(100) + 1;
		int num = 0;
		boolean on = true;
		while (on) {
			System.out.print("Please take a guess!\n>> ");
			int guess = in.nextInt();
			in.next();
			if (guess == guesses) {
				System.out.println("You won in " + num + "guesses");
				on = false;
			} else {
				num++;

				System.out.println("You did not get it this round!\n You are " + num + "guesses in");
			}
		}
	}
}
