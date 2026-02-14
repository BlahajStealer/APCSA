package tictactoe;
import java.util.ArrayList;
public class Builder {
	char[][] board = new char[3][3];
	char block = 9632;
	public void boardBuilder(boolean start) {
		
		for (int i = 0; i < board.length; i++) {
			for (int f = 0; f < board[0].length; f++) {
				if (start) {
					board[i][f] = block;
				}
				System.out.print(board[i][f] + " ");
			}
			System.out.println();
		}
		
	}
	public void playerMove(int chosen, boolean player) {
		char playerMarker;
		if (player) {
			playerMarker = 'X';
		} else {
			playerMarker = 'O';
		}
		int l;
		if (chosen - 3 <= 0) {
			l = 2;
		} else if (chosen -6 <= 0) {
			l = 1;
		} else {
			l = 0;
		}
		int w;
		if (chosen % 3 == 0) {
			w = 2;
		} else if (chosen % 3 == 1)
		{
			w = 0;
		} else {
			w = 1;
		}
		board[l][w] = playerMarker;
		boardBuilder(false);
	}
}

//789
//456
//123
