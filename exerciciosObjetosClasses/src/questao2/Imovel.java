package questao2;

public class Imovel {
	
	String tipo, imobiliaria;
	int numeroPavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	Imovel(String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra){
		this.tipo = "Casa";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	Imovel(String imobiliaria, int numeroPavimentos, int pavimento, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador,
			boolean piscina, boolean quadra){
		this.tipo = "Apartamento";
		this.imobiliaria = imobiliaria;
		this.numeroPavimentos = numeroPavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}
	
	double calculaPreco(){
		double preco = 0;
		double precoMetro = metrosQuadrados * 5000;
		preco += precoMetro;
		if(tipo == "Apartamento" && pavimento > 5) {
			int pavimentoAtual = 5;
			while(pavimentoAtual < pavimento) {
				preco += 2000;
				pavimentoAtual += 1;
			}
		}
		if(elevador)
			preco += 2500;
		if(piscina)
			preco += 2500;
		if(quadra)
			preco += 2500;
		
		return preco;
	}
	
	public String toString() {
		String descricao = "";
		descricao += tipo + "\n";
		descricao += "Imobiliária " + imobiliaria + "\n";
		if(tipo == "Apartamento") {
			descricao += numeroPavimentos + " andares" + "\n";
			descricao += "Apartamento no pavimento " + pavimento + "\n";
		}
		descricao += quartos + " quartos" + "\n";
		descricao += suites + " suítes" + "\n";
		descricao += banheiros + " banheiros" + "\n";
		descricao += metrosQuadrados + " m²" + "\n";
		if(elevador) {
			descricao += "Possui elevador" + "\n";
		}else {
			descricao += "Não possui elevador" + "\n";
		}
		if(piscina) {
			descricao += "Possui piscina" + "\n";
		}else {
			descricao += "Não possui piscina" + "\n";
		}
		if(quadra) {
			descricao += "Possui quadra" + "\n";
		}else {
			descricao += "Não possui quadra" + "\n";
		}
		
		descricao += "Preço: " + calculaPreco() + "\n";
		descricao += "#############################################";
		
		return descricao;
	}

}
