package aulas.aula05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataAtual {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		int anoAtual = gc.get(GregorianCalendar.YEAR);
		System.out.println(anoAtual);
	}

}