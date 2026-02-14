package triangleType;
import java.util.*;
public class Triangle {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------------\nTriangleTypeDet\n---------------");
		System.out.print("This program will give you the type of triangle you have based on your inputs\nSide 1 Length>> ");
		double Side1 = in.nextDouble();
		System.out.print("Side 2 Length>> ");
		double Side2 = in.nextDouble();
		System.out.print("Side 3 Length>> ");
		double Side3 = in.nextDouble();
 		if (Side1 == Side2 && Side2 == Side3) {
			System.out.println("You have inputted a equilateral triangle!");
		} else if (Side1 == Side2 || Side2 == Side3 || Side3 == Side2) {
			System.out.println("Your triangle is isoceles");
		} else if (Side1 != Side2 && Side2 != Side3 && Side3 != Side2){
			System.out.println("You inputted a scalene triangle");
		} else {
			System.out.println("You are a failure");
		}
	}
}
