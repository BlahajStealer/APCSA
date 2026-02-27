package Example;

public class Player {
	String name;
	double qi;
	String CultRealm;
	double QiMult = 1;
	double QiDens = 1;
	double maxQi = 100;
	public void cultivate(String args[]) {
		if (qi >= maxQi || qi + (QiDens*QiMult) >= maxQi) {
			qi = maxQi;
			System.out.println("Max Qi Reached!");
			System.out.println("Qi: " + qi);
		} else {
			System.out.println(name + " Cultivates!");

			qi = qi + (QiDens * QiMult);
			QiMult+=.1;
			System.out.println("Qi is now: " + String.format("%.1f", qi) + "/" + maxQi);
		}
	}
}
