package exerciciosBasicos;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float valor1 = entrada.nextFloat();
		float valor2 = entrada.nextFloat();
		
		maiorNumero(valor1, valor2);
	}
	
	public static void maiorNumero(float valor1, float valor2) {
		if(valor1 > valor2) {
			System.out.println(valor1);
		}else if(valor2 > valor1) {
			System.out.println(valor2);
		}else {
			System.out.println("Valores Iguais");
		}
	}

}
