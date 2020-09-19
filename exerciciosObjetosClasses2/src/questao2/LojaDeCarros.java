package questao2;

public class LojaDeCarros {

	public static void main(String[] args) {
		Carro palio1 = new Carro("Pálio", "Fiat", 35000);
		Carro palio2 = new Carro("Pálio", "Fiat", "prata", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "Honda", "amarelo", 4, true, true, true, true, 110000);
		Carro corolla = new Carro("Corolla", "Toyota", "verde", 4, true, true, false, true, 110000);
		Carro gol = new Carro();
		gol.nome = "Gol";
		gol.marca = "Volkswagen";
		gol.cor = "cinza";
		gol.portas = 4;
		gol.vidroEletrico = true;
		gol.arCondicionado = true;
		gol.cambioAutomatico = true;
		gol.direcaoEletrica = true;
		gol.precoBase = 55000;
		
		palio1.promocao = false;
		palio2.promocao = false;
		civic.promocao = false;
		corolla.promocao = false;
		gol.promocao = false;
		
		System.out.println(palio1);
		System.out.println(palio2);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);
		
		palio1.promocao = true;
		palio2.promocao = true;
		civic.promocao = true;
		corolla.promocao = true;
		gol.promocao = true;
		
		System.out.println(palio1);
		System.out.println(palio2);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);

	}

}
