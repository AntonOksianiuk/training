package by.epam.java_introduction.algoritmization;

/*	1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел.	*/

public class DecompositionTask1 {

	public static void main(String[] args) {
		System.out.println(findingNOD(10,35));
		System.out.println(findingNOK(10,35));
	}
	
	public static int findingNOD(int a, int b) {
		int count;
		
		if (a == b) {
			System.out.println("Числа одинаковые");
		}
		
		if (a > b) {
			count = a;
		} else {
			count = b;
		}
		
		int greatestCommonDivisor = 1;
		
		for(int i=2;i<count;i++) {
			if (a % i == 0 & b % i == 0) {
				greatestCommonDivisor = i;
			}
		}
		
		return greatestCommonDivisor;
	}
	
	public static int findingNOK(int a, int b) {
		int leastCommonMultiple = 0;
		
		leastCommonMultiple = (a * b) / findingNOD(a, b);
		
		return leastCommonMultiple;
	}
}
