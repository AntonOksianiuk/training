package by.epam.java_introduction.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class CyclesTask8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int numberOne = sc.nextInt(), numberTwo = sc.nextInt();

		System.out.println("Цифры входящие в состав первого числа = " + numberEnter(numberOne));
		System.out.println("Цифры входящие в состав второго числа = " + numberEnter(numberTwo));

	}

	private static ArrayList<Integer> numberEnter(int a) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		while (a > 0) {
			int i = 0;
			array.add(i, a % 10);
			a = a / 10;
		}
		
		return array;
	}
}
