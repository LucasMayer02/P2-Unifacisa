package exerciciosBasicos;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String produto = entrada.next();
		double valor = entrada.nextDouble();
		
		preco(produto, valor);
	}
	
	public static void preco(String produto, double valor) {
		if(valor > 0 && valor <= 100) {
			valor *= 0.95;
		}else if(valor > 100 && valor <= 500) {
			valor *= 0.90;
		}else {
			valor *= 0.85;
		}
		System.out.println(produto + " R$" + valor);
	}

}
