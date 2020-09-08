package exerciciosBasicos;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float valor1 = entrada.nextFloat();
		float valor2 = entrada.nextFloat();
		float valor3 = entrada.nextFloat();
		
		mediaAritmetica(valor1, valor2, valor3);
	}
	
	public static void mediaAritmetica(float valor1, float valor2, float valor3) {
		float media = (valor1 + valor2 + valor3)/ 3;
		System.out.println(media);
	}

}
