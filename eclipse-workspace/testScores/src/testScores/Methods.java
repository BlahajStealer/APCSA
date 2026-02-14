package testScores;

public class Methods {
	public void average(float[] tests) {
		float totalScore = 0;
		
		for (int i = 0; i < tests.length; i++) {
			totalScore+=tests[i];
		}
		System.out.println("The average is: " + (totalScore/tests.length));
		
		
	} 
	
	public void minMax(float[] tests) {
		float min = 1000;
		float max = 0;
		for (int i = 0; i < tests.length; i++) {
			if (tests[i] > max) {
				max = tests[i];
			}
			if (tests[i] < min) {
				min = tests[i];
			}
		}
		System.out.println("The max is: " + max);
		System.out.println("The min is: " + min);
	}
}
