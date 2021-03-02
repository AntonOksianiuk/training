package by.epam.java_introduction.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LineTask5 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("Hч:mм:sс");
		Date currentDate = new Date();
		System.out.println(sdf.format(currentDate));
	}
}
