package animals;
public class Animal {
	String name;
	int age;
	String eyeColor;
	String sex;
	
}
class dog extends Animal {
	public String woof() {
		return "Woof";
	}
}
class cat extends Animal {
	public String Meow() {
		return "Meow :3";
	}
}
