// Classe que representa um objeto do mundo real: bicicleta

public class Bicicleta {

	//Propriedades da bicicleta
	private String modelo;
	private String cor;
	
	// construtor para inicializar as propriedades
	public Bicicleta(String modelo, String cor) {
		this.cor = cor;
		this.modelo = modelo;
	}
	
	// Método para extrair o modelo da bike
	public String getBikeModelo() {
		return modelo;
	}
	
	// Métod para definir o modelo da bike
	public void setBikeModelo(String modelo) {
		this.modelo = modelo;
	}
	
	// Método para extrair a cor da bike
	public String getBikeCor() {
		return cor;
	}
	
	// Método para definir a cor
	public void setBikeCor(String cor) {
		this.cor = cor;
	}
	
	
	// Exibir Informações
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
	}
	
	// Método representando a bike andando
	public void AndarDeBike() {
		System.out.println("Andando de bike.......");
	}
	
	// Método representando a bike freiando
	public void FreiarABike() {
		System.out.println("Freiando a bike......");
	}
	
	// Testa código
	public static void main(String[] args) {
		
		Bicicleta MinhaBicicleta = new Bicicleta("Bicicleta Elétrica", "Vermelho");
		
		
		MinhaBicicleta.exibirInformacoes();
		
		MinhaBicicleta.AndarDeBike();
		
		MinhaBicicleta.FreiarABike();
	}
}
