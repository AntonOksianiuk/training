package by.epam.java_introduction.basic;

import java.util.Scanner;

public class CyclesTask1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите любое положительное целое число :   ");

		int number = sc.nextInt();
		int count = 1, sum = 0;

		while (count < number) {
			sum += count;
			count++;
		}

		System.out.println("Сумма чисел до введённого = " + sum);
	}

}
