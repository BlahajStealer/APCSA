package multiplicationTable;
import java.util.*;
public class Multiplication {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("-------------------\nMultiplicationTable\n-------------------");
		System.out.println("This program prints out a multiplication table!");
		for(int i = 1; i <= 10; i++) {
			System.out.println();
			for (int n = 1; n <= 10; n++) {
				System.out.print(i*n + "\t");
			}
		}
	}
}
