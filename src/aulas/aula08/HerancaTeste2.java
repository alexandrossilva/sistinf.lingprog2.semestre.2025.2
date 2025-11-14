package aulas.aula08;

public class HerancaTeste2 {

	public static void main(String[] args) {
		Object[] items = new Object[2];
		
		items[0] = new Aluno("Alex", 1, "01/01/2000", 200011, "BSI");
		items[1] = new Aluno("Maria", 2, "01/01/2002", 200012, "Química");
		
		System.out.println(((Aluno[])items)[0].getMatricula());
	}

}
