package enumerados;

import java.util.Scanner;

public class MainEnum {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a day of week");
		String day = read.next();
		read.close();
		DiasSemana dayS = null;
		try {
			dayS = DiasSemana.valueOf(day.toUpperCase());
		} catch (Exception e) {
			System.out.println("You must enter a valid day");
		}
		
		System.out.println(dayS.toString());
	}

}
