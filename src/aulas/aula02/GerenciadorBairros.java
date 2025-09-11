package aulas.aula02;

// Encapsulamento de dados de bairro
class Bairro {

	private String nome;	// nome do bairro
	
	// método construtor sem parâmetros (não inicialização de atributo de nome do bairro)
	public Bairro() {		
	}
	
	// método construtor com parâmetro (nome do bairro com o qual atributo será inicializado)
	public Bairro(String nome) {
		this.nome = nome;
	}
	
	// métogo getter para obtenção do nome atual do bairro
	public String getNome() {
		return nome;
	}
	
	// métogo setter para atualização do nome do bairro
	public void setNome(String novoNome) {
		nome = novoNome;
	}

}

// Demonstração de utilização da classe Bairro
public class GerenciadorBairros {

	public static void main(String[] args) {
		Bairro bairro1 = new Bairro("Candeias");		// instanciação de objeto da classe Bairro
		Bairro bairro2 = new Bairro();					// instanciação de segundo objeto da classe Bairro
		String nomeBairro3 = "Amazonas";				// atribuição de string literal
		nomeBairro3 = "América";						// atualização de variável objeto local a partir de atribuição de novo string literal
		
		bairro1.setNome("Brasil");						// atualização de nome de bairro indicado em primeiro objeto da classe Bairro
		System.out.println(bairro2.getNome());			// obtenção e listagem de nome do bairro de segundo ojeto da classe Bairro
		System.out.println("Hello World!");
	}

}