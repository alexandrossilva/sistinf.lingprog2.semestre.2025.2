package aquecimento.atividade03.questao01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Util {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GregorianCalendar dataHoraCorrente = new GregorianCalendar();      // data e hora corrente

		System.out.printf("Digite ano de nascimento: ");
		int anoNascimento = scanner.nextInt();                     // entrada de ano de nascimento

		int idade = dataHoraCorrente.get(Calendar.YEAR) - anoNascimento;   // cálculo de idade

		// listagem de idade
		System.out.printf("Idade ao final do ano corrente: %d ano(s)\n", idade);

		scanner.close();
	}

}