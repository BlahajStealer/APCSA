package animals;
import java.util.*;
public class animals {
	public static void main(String args[]) {
		System.out.println("-------\nAnimals\n-------");
		dog Duncan = new dog();
		Duncan.name = "Duncan";
		Duncan.age = 15;
		Duncan.eyeColor = "Brown";
		Duncan.sex = "Male";
		System.out.println(Duncan.woof());
		cat Captain = new cat();
		Captain.name = "Captain";
		Captain.age = 17;
		Captain.eyeColor = "Orange";
		Captain.sex = "Male";
		System.out.println(Captain.Meow());
		printAnim(Duncan);
		printAnim(Captain);

	}
	private static void printAnim(Animal anim) {
		System.out.println(anim.name + "\n");
		System.out.println("Age: " + anim.age);
		System.out.println("Eye color: " + anim.eyeColor);
		System.out.println("Sex: " + anim.sex);


	}
}
