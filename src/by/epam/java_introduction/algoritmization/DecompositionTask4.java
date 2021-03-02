package by.epam.java_introduction.algoritmization;

import java.util.Random;
import java.util.Scanner;

/*4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
	из пар точек самое большое расстояние. Указание. Координаты точек занести в массив*/
	

public class DecompositionTask4 {

	public static void main(String[] args) {
		findingAGreaterDistanceBetweenPoints();
	}

	public static void findingAGreaterDistanceBetweenPoints() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество точек (1-26)");
		int n = sc.nextInt();

		// Create a structure to store the name and coordinates
		Fraction[] a = new Fraction[n];
		Random rand = new Random();
		int[] mas = new int[n];

		// initialize the name with letters from the ASCI table
		for (int i = 0; i < n; i++) {
			a[i] = new Fraction();
			a[i].name = (char) (65 + i);
			a[i].coord = rand.nextInt(100);
			System.out.println("Имя точки : " + a[i].name + "\tКоордината : " + a[i].coord);

			mas[i] = a[i].coord;
		}

		System.out.println("До сортировки : ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		bubbleSort(mas);
		System.out.print("\nМассив после сортировки:\n");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		int maxDistance = 0;

		// Searching max distance between coordinates
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i + 1] - mas[i] > maxDistance) {
				maxDistance = mas[i + 1] - mas[i];
			}
		}
		System.out.print("\nМаксимальная разность = " + maxDistance);
	}

	public static class Fraction {
		char name;
		int coord;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

}
