package by.epam.java_introduction.basic;

public class CyclesTask4 {

	public static void main(String[] args) {
		long buffer = 1;
		
		for (int i = 1; i <= 200; i++) {
			buffer *= Math.pow(i, 2);
		}
		
		System.out.println("������������ ��������� ������ 200 ����� =  " + buffer);

	}

}
