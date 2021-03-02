package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LineTask2 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значения a, b, c через пробел : ");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		double function = (b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, (-2));
		
		System.out.println("function = " + function);
	}
}
