package by.epam.java_introduction.basic;

public class BrunchingTask2 {

	public static void main(String[] args) {
		double a = 1.3, b = 5.5, c = 4, d = 2;
		System.out.println(max(min(a, b), min(c, d)));
		
	}
	
	private static double max(double a, double b) {
		double max = a;
		if (b > a) max = b;
		return max;
	}
	
	private static double min(double a, double b) {
		double min = a;
		if (a > b) min = b;
		return min;
	}
}
