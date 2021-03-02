package by.epam.java_introduction.basic;

public class BrunchingTask5 {

	public static void main(String[] args) {
		double f, x = 2.5;
		if (x <= 3) f = Math.pow(x, 2) - 3 * x + 9; else f = 1 / (Math.pow(x, 3) + 6); 
		System.out.println("Функция f = " + f);
	}

}
