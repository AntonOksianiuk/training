package by.epam.java_introduction.algoritmization;

import java.util.ArrayList;
import java.util.Random;

/*	5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
	которое меньше максимального элемента массива, но больше всех других элементов).	*/
	


public class DecompositionTask5 {

	public static void main(String[] args) {
		findingTheSecondHighestNumber();
	}
	
	public static void findingTheSecondHighestNumber() {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		
		Random rand = new Random();
		int n, randomNumber;
		n = rand.nextInt(20) + 10;
		
		System.out.println("Чисел в массиве будет " + n);
		
		for (int i = 0; i < n;) {                //Checking for a match in an array
			randomNumber = rand.nextInt(1000);
			if (!array.contains(randomNumber)) {
				array.add(randomNumber);
				i++;
			}
		}
		
		System.out.println(array);
		int neg = 0, count = -1;
	
		//counting the number of numbers that are greater than the required number		
		
		while(neg != 1) {           
			neg = 0; 
			count ++;
			for (int i = 0; i < array.size(); i++) {
				if (neg > 1) {
					break;
				}
				if (array.get(i) > array.get(count)) {
					neg ++;
				}
			}
			
		}
		
		System.out.println("Второе число по убыванию " + array.get(count));
		
	}
}
