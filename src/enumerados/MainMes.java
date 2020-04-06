package enumerados;

import java.util.Scanner;

public class MainMes {

	public static void main(String[] args) {
		Mes [] meses = Mes.values();
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number days");
		int days=0;
		try {
			days=read.nextInt();
		} catch (Exception e) {
			System.out.println("Enter a valid value");
		}
		read.close();
		
		for (Mes mes : meses) {
			if(mes.getNumDias()==days) {
				System.out.println(mes.toString());
			}
		}
	}

}
