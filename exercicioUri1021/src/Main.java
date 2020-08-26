import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double resto;
		resto = entrada.nextDouble();
		notas(resto);
	}

	public static void notas(double resto) {
		int notasCem = (int)resto / 100;
		resto = resto % 100;
		int notasCinquenta = (int)resto / 50;
		resto = resto % 50;
		int notasVinte = (int)resto / 20;
		resto = resto % 20;
		int notasDez = (int)resto / 10;
		resto = resto % 10;
		int notasCinco = (int)resto / 5;
		resto = resto % 5;
		int notasDois = (int)resto / 2;
		resto = resto % 2;
		
		resto *= 100;
		int moedaUmReal = (int)(resto/100);
		resto = resto % 100;
		int moedaCinquenta = (int)(resto/50);
		resto = resto % 50;
		int moedaVinteCinco = (int)(resto/25);
		resto = resto % 25;
		int moedaDez = (int)(resto/10);
		resto = resto % 10;
		int moedaCinco = (int)(resto/5);
		resto = resto % 5;
		int moedaUmCent = (int)(resto);
		
		System.out.println("NOTAS: ");
		System.out.println(notasCem + " nota(s) de R$ 100.00");
		System.out.println(notasCinquenta + " nota(s) de R$ 50.00");
		System.out.println(notasVinte + " nota(s) de R$ 20.00");
		System.out.println(notasDez + " nota(s) de R$ 10.00");
		System.out.println(notasCinco + " nota(s) de R$ 5.00");
		System.out.println(notasDois + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS: ");
		System.out.println(moedaUmReal + " moeda(s) de R$ 1.00");
		System.out.println(moedaCinquenta + " moeda(s) de R$ 0.50");
		System.out.println(moedaVinteCinco + " moeda(s) de R$ 0.25");
		System.out.println(moedaDez + " moeda(s) de R$ 0.10");
		System.out.println(moedaCinco + " moeda(s) de R$ 0.05");
		System.out.println(moedaUmCent + " moeda(s) de R$ 0.01");
		
	}

}
