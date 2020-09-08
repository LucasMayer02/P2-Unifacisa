package exerciciosBasicos;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		
		multiplosDe4(valor1, valor2);
	}
	
	public static void multiplosDe4(int valor1, int valor2) {
		int numerosMultiplos = 0;
		int maiorValor;
		int menorValor;
		
		if(valor1 > valor2) {
			maiorValor = valor1;
			menorValor = valor2;	
		}else {
			maiorValor = valor2;
			menorValor = valor1;
		}
		for(int numero = menorValor; numero < maiorValor; numero++) {
			if(numero % 4 == 0) {
				numerosMultiplos += 1;
			}
		}
		
		System.out.println("entre " + menorValor + " e " + maiorValor + " existem " + numerosMultiplos + " numeros multiplos de 4");
	
	}
}