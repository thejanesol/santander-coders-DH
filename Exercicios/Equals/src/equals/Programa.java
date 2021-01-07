package equals;

public class Programa {
	public static void main (String args[]) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Julia";
		pessoa.idade = 12;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Julia";
		pessoa2.idade = 12;
		
		
		Pessoa pessoa3 = new Pessoa();
		
		System.out.println(pessoa.equals(pessoa2));
		System.out.println(pessoa.equals(pessoa3));
	}
}
