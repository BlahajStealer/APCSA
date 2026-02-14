package heatMapAnalayzer;
import java.util.*;
public class HeatmapBuilder {
	public static Heatmap start(int choice) {
		if (choice == 1) {
			return buildRand();
		} else if (choice == 2) {
			return buildWith();
		} else {
			return buildRand();
		}
	}
	private static Heatmap buildRand() {
		Random rand = new Random();
		int gridSize1 = (rand.nextInt(10) + 1);
		int gridSize2 = (rand.nextInt(10) + 1);
		int x = (rand.nextInt(10) + 1);
		int y = (rand.nextInt(10) + 1);
		x--;
		y--;
		Heatmap hm = new Heatmap();
		hm.heatInitial(gridSize1, gridSize2, x, y);
		return hm;
	}
	private static Heatmap buildWith() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease choose the size of the grid you would like, max 10x10.");
		int choice1;
		do {
			System.out.print(">> ");
			choice1 = in.nextInt();
		} while (choice1 <= 0 || choice1 > 10);
		int choice2;
		do {
			System.out.print(">> ");
			choice2 = in.nextInt();
		} while (choice2 <= 0 || choice2 > 10);
		System.out.println("\nPlease choose somewhere to place the heat. x then y");
		int x;
		do {
			System.out.print(">> ");
			x = in.nextInt();
		} while (x <= 0 || x > 10);
		int y;
		do {
			System.out.print(">> ");
			y = in.nextInt();
		} while (y <= 0 || y > 10);
		x--;
		y--;
		Heatmap hm = new Heatmap();
		hm.heatInitial(choice1, choice2, x, y);
		return hm;
	}
}
