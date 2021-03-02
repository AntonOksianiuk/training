package by.epam.java_introduction.basic;

public class BrunchingTask1 {
	
	public static void main(String[] args) {
	
		int a = 45;
		int b = 45;
		
		if ((a + b) >= 180) {
			System.out.println("Треугольник не существует");
		} else if ((a == b & b == 45) || ((a == 90) || (b == 90))) {
			System.out.println("Треугольник прямоугольный");
		} else {
			System.out.println("Треугольник существует");
		}
	}
}
