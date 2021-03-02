package by.epam.java_introduction.algoritmization;

/*	3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.	*/

public class DecompositionTask3 {

	public static void main(String[] args) {
		
		System.out.println(findingTheAreaOfAHexagon(20));
	
	}

	public static double findingTheAreaOfAHexagon(int a) {
		double area = 0;
		if (a <= 0) {
			System.out.println("Вы ввели недопустимое значение");		
		}
		
		area = Math.pow(a,2) * Math.sqrt(3) / 4;
		
		return area;
	}
}
