package by.epam.java_introduction.basic;

public class BrunchingTask3 {

	public static void main(String[] args) {
		int x1 = 2, x2 = 2, x3 = 4;
		int y1 = 8, y2 = 2, y3 = 3; 
		
		boolean answer = false;
		if ((x1 == x2 & x1 == x3) || (y1 == y2 & y1 == y3)) answer = true;
		System.out.println("Они находятся на одной линии ?  " + answer);
	
	}

}
