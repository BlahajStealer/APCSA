package gridArray;
import java.util.Arrays;
public class GridArray {
	public static void main(String args[]) {
		int[][] grid = new int[5][5];
		for (int i = 0; i < grid.length; i++)
		{
			for (int f = 0; f < grid[0].length; f++) {
				System.out.print("o ");
			}
			System.out.println();
		}
	}
}
