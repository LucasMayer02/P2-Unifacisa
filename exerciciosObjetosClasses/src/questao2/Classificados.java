package questao2;

public class Classificados {

	public static void main(String[] args) {
		
		Imovel falcao1 = new Imovel("Falcão", 3, 1, 2, 120, false, true, false);
		Imovel falcao2 = new Imovel("Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		Imovel altaman = new Imovel("Altaman", 4, 2, 3, 240, true, true, true);
		Imovel leblon = new Imovel("Leblon", 6, 3, 5, 540, true, true, true);
		Imovel altoBranco = new Imovel("Alto Branco", 3, 2, 2, 1, 2, 60, false, true, true);
		
		System.out.println(falcao1);
		System.out.println(falcao2);
		System.out.println(altaman);
		System.out.println(leblon);
		System.out.println(altoBranco);
	}

}
