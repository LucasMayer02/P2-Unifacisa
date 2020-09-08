package exerciciosBasicos;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = 0;
		int somaDosValoresPares = 0;
		int divisao = 0;
		while(valor != 100) {
			valor = entrada.nextInt();
			if(valor % 2 == 0 && valor != 100) {
				somaDosValoresPares += valor;
				divisao += 1;
			}
		}
		double media = (double)somaDosValoresPares / divisao;
		System.out.println("A media dos numeros pares é " + media);

	}

}
