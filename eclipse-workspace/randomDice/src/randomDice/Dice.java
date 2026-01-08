package randomDice;
import java.util.Random;
public class Dice {
	public static void main(String args[]) {
		System.out.println("----\nDice\n----");
		System.out.println("This will generate two different dice, if you score above a 6 you win, if you score less you lose!");
		int min = 1;
		int max = 6;
		
		int Die1 = min + (int)(Math.random() * ((max-min) + 1));
		int Die2 = min + (int)(Math.random() * ((max-min) + 1));
		System.out.println("The first die was a: " + Die1);
		System.out.println("The second die was a: " + Die2); 
		if (Die1 + Die2 > 6) {
			System.out.println("You Won!");
		} else {
			System.out.println("You Lost!");
		}
	}
}
 