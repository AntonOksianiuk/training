package by.epam.java_introduction.algoritmization;

/*	2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел	*/

public class DecompositionTask2 {

	public static void main(String[] args) {
		
		System.out.println(findingNOD4Numbers(1000, 2500, 403400, 100));
	
	}

	public static int findingNOD4Numbers(int a, int b, int c, int d) {
		int greatestCommonDivisor = 1;
		int count = d;

		if (a < b & a < c & a < d) {
			count = a;
		} else if (b < c & b < d) {
			count = b;
		} else if (c < d) {
			count = c;
		}

		for (int i = 2; i < count; i++) {
			if (a % i == 0 & b % i == 0 & c % i == 0 & d % i == 0) {
				greatestCommonDivisor = i;
			}
		}

		return greatestCommonDivisor;
	}
}
