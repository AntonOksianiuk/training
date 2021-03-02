package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LineTask4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double input = sc.nextDouble();
		
		double value = ((double)((int)input) / 1000) + (input % 1) * 1000  ;
		
		
		System.out.printf("%.3f", value);
	}
}
