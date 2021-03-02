package by.epam.java_introduction.basic;

import java.util.Scanner;

public class CyclesTask2 {

	public static void main(String[] args) {
		System.out.println("Введите значение a, b (отрезок), h через пробел");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt();
		int x = a;
		
		while (x < b) {
			if (x <= 2) {
				System.out.println("y = " + (-x));
			} else {
				System.out.println("y = " + x);
			}

			x += h;
		}

	}

}
