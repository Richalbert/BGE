package tools;

public class Tool {

	private static final int DEC_NB = 2; // I want 2 digits after ,


	private double round(double A, int B) {
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

}
