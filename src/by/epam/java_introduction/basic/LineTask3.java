package by.epam.java_introduction.basic;

public class LineTask3 {
	public static void main(String[] args) {
		int x = 3, y = 5;
		double function = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println(function);
	}
}
