package by.epam.java_introduction.basic;

public class CyclesTask5 {

	public static void main(String[] args) {
		double e = 0.000000004, sum = 0, x;
		boolean isDo = true;
		int n = 0;

		while (isDo) {
			x = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
			n++;
			if (Math.abs(x) >= e) {
				sum += x;
			} else {
				isDo = false;
			}
		}

		System.out.println("Сумма членов ряда, модуль которых больше или равен е = " + sum);

	}

}
