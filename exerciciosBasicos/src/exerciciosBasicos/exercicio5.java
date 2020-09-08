package exerciciosBasicos;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade = 0;
		int numerosParesPositivos = 0;
		while(quantidade < 25) {
			System.out.print("Digite um numero: ");
			int valor = entrada.nextInt();
			if(valor % 2 == 0 && valor > 0) {
				numerosParesPositivos += 1;
			}
		quantidade += 1;
		}
		System.out.println(numerosParesPositivos + " numeros são pares e positivos");
	}
}
