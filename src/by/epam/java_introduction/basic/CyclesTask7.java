package by.epam.java_introduction.basic;

import java.util.Scanner;

public class CyclesTask7 {

	public static void main(String[] args) {
		System.out.print("Введите промежуток чисел через пробел : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int m;
		m = sc.nextInt();
		int n;
		n = sc.nextInt();

		while (m < n) {
			int count = 2;
			System.out.print("Делители " + m + " = ");

			while (count < m) {
				if (m % count == 0)
					System.out.print(count + ", ");
				count++;
			}

			System.out.println("");
			m++;
		}

	}

}
