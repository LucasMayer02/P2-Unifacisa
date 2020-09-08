package exerciciosBasicos;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade = 0;
		int somaDosValores = 0;
		while(quantidade < 50) {
			int valor = entrada.nextInt();
			if(valor % 3 == 0) {
				somaDosValores += valor;
			}
		quantidade += 1;
		}
		System.out.println("A soma dos multiplos de 3 é " + somaDosValores);
		

	}

}
