package heatMapAnalayzer;
import java.util.*;
public class HeatMapAnalyzer {
	public static void main(String args[]) {
		Heatmap hm;
		HeatmapBuilder hmb;
		System.out.println("---------------\nHeatmap Analayzer\n-----------------");
		System.out.println("\n\nBy tradition this program would upload a heatmap but I can't do allat so choose\n[1]: Random Generation\n[2]: Insert your own.");
		Scanner in = new Scanner(System.in);
		char choice;
		do {
			System.out.print(">> ");
			choice = in.next().toCharArray()[0];
		} while (choice != '1' && choice != '2');
		
		
	}
}
