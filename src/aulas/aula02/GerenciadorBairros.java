package aulas.aula02;

class Bairro {

	private String nome;
	
	public Bairro() {
	}
	
	public Bairro(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}

}

public class GerenciadorBairros {

	public static void main(String[] args) {
		Bairro bairro1 = new Bairro("Candeias");
		Bairro bairro2 = new Bairro();
		String nomeBairro3 = "Amazonas";
		nomeBairro3 = "América";
		
		bairro1.setNome("Brasil");
		System.out.println(bairro2.getNome());
		System.out.println("Hello World!");
	}

}