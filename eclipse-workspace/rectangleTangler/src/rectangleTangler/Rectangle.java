package rectangleTangler;

public class Rectangle {
	public float W;
	public float L;
	public float area() {
		return W * L;
	}
	public float per() {
		return (W*2) + (L*2);
	}
	public void scale(float scale, String args[]) {
		System.out.println("The rectangle's area scaled = " + (L*scale * W*scale));
		System.out.println("The rectangle's perimiter scaled = " + (((L*scale *2) + (W*scale * 2))));
	}
}
