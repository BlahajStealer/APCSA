package tictactoe;
import java.util.*;

public class TTT {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------\nTicTacToe\n---------");
		boolean on;
		do {
			Builder board = new Builder();
			System.out.print("Please enter the name of player one\n>> ");
			String player1 = in.nextLine();
			System.out.print("Please enter the name of player two\n>> ");
			String player2 = in.nextLine();
			String currentPlayer;
			boolean game;
			board.boardBuilder(true);
			boolean player = false;

			do {
				if (player) {
					player = false;
					currentPlayer = player2;
				} else {
					player = true;
					currentPlayer = player1;
				}
				System.out.println("Please enter which move you would like corrosponding to the numpad, " + currentPlayer);
				int chosen;
				do {
					System.out.print(">> ");
					try {
						chosen = in.nextInt();

					} catch (InputMismatchException e) {
						continue;
					}
				} while (chosen <= 0 || chosen > 9);
				board.playerMove(chosen, player);
				game = true;
			} while (game);
			on = true;
		} while (on);
	}
}
