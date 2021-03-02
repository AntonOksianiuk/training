package by.epam.java_introduction.algoritmization;

import java.util.ArrayList;
import java.util.Random;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class DecompositionTask6 {

	public static void main(String[] args) {
		
		areTheNumbersMutuallyPrime();
	
	}

	public static void areTheNumbersMutuallyPrime() {
		
		Random rand = new Random();
		int[] mass = new int[3];

		// Creating an array to store the remainders of numbers
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// Filling an array with random numbers
		for (int i = 0; i < mass.length; i++) {
			mass[i] = rand.nextInt(99) + 1;
			System.out.println(mass[i]);
		}

		boolean answer = false;
		int count = mass.length;
		int k = 0;

		// Logic for checking the coincidence of residuals
		while (count > 0) {
			for (int i = 2; i < mass[k] / 2; i++) {
				if (mass[k] % i == 0) {
					if (!arr.contains(i)) {
						arr.add(i);
					} else {
						count = 0;
					}
				}
			}
			count--;
			k++;
			if (count == 0) {
				answer = true;
			}
		}

		System.out.println(answer);
	}
}
