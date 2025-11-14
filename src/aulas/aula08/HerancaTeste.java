package aulas.aula08;

public class HerancaTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alex", 1, "01/01/2000", 200011, "BSI");
		Pessoa p1 = a1;
		
		Pessoa p2 = new Pessoa("Maria", 2, "01/02/2021");
		Aluno a2 = (Aluno)p2;
	}

}
