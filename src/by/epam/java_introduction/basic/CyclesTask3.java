package by.epam.java_introduction.basic;

public class CyclesTask3 {

	public static void main(String[] args) {
		int buffer = 0;
		for (int i = 0; i < 100; i++) {
			buffer += Math.pow(i, 2);
		}
		System.out.println("Сумма квадратов первых 100 чисел равна = " + buffer);

	}

}
