package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LineTask6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		
		if ((x > 4) || (x < -4) || (y > 4) || (y < -3)) {
			System.out.println("false");
		} else if (((x > 2) && (y > 0 )) || ((x < -2) && (y > 0))) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
}
