package questao1;

public class Carro {
	
	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico,direcaoEletrica;
	double precoBase;
	static boolean promocao;
	
	Carro(String nome, String marca, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.portas = 2;
		this.cor = "branco";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}
	
	Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado, boolean cambioAutomatico, 
			boolean direcaoEletrica, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	Carro(){}
	
	double calculaPreco() {
		
		double preco = precoBase;
		
		switch(cor) {
			case "branco": break;
			case "azul": break;
			case "vermelho": break;
			case "preto" : break;
			default: preco  += 1000;
		}
		
		if(vidroEletrico)
				preco += 1250;
		if(arCondicionado)
				preco += 1250;
		if(cambioAutomatico)
				preco += 1250;
		if(direcaoEletrica)
				preco += 1250;
		
		if(Carro.promocao)
			preco *= 0.9;
			
		return preco;
		
	}
	
	public String toString() {
		String descricao = "";
		descricao += "Nome: " + nome + "\n";
		descricao += "Marca: " + marca + "\n";
		descricao += "Cor: " + cor + "\n";
		descricao += "Possui " + portas + " portas" + "\n";
		if(vidroEletrico) {
			descricao += "Possui vidro el�trico" + "\n";
		}else {
			descricao += "N�o possui vidro el�trico" + "\n";
		}
		if(arCondicionado){
			descricao += "Possui ar condicionado" + "\n";
		}else {
			descricao += "N�o possui ar condicionado" + "\n";
		}if(cambioAutomatico) {
			descricao += "Possui cambio autom�tico" + "\n";
		}else {
			descricao += "N�o possui cambio autom�tico" + "\n";
		}if(direcaoEletrica) {
			descricao += "Possui dire��o el�trica" + "\n";
		}else {
			descricao += "N�o possui dire��o el�trica" + "\n";
		}
		descricao += "Pre�o: " + calculaPreco() + "\n";
		descricao += "#############################################";
		
		return descricao;
	}

}
