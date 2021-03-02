package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LineTask1 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a = ");
		int a = sc.nextInt();
		
		System.out.println("b = ");
		int b = sc.nextInt();
		
		System.out.println("c = ");
		int c = sc.nextInt();
		
		float z = ((a - 3) * b / 2) + c;
		
		System.out.println("z = " + z);
		}
}
