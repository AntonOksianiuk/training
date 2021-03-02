package by.epam.java_introduction.basic;

public class BrunchingTask4 {

	public static void main(String[] args) {
		
		boolean answer = false;
		int x = 10, y = 3, z = 8;
		int a = 10, b = 3;
		
		if (a >= x) {
			if (b >= y || b >= z) answer = true;
		} else if (a >= y) {
			if (b >= z || b >= x) answer = true;
		} else if (a >= z) {
			if (b >= x || b >= y) answer = true;
		}

		System.out.println("Пройдёт ли кирпич через отверстие?  " + answer);
	}

}
