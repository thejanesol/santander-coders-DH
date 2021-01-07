package equals;

public class Pessoa {
	String nome;
	int idade;
	
	@Override
	public boolean equals (Object obj) {
		if (this == obj) {
			return true;
		} if (!(obj instanceof Pessoa)) {
			return false;
		}
		
	Pessoa pessoa = (Pessoa) obj;
	
	if (this.nome == null && pessoa.nome == null && this.idade == pessoa.idade)
		return true;
	
	if (this.nome.equals(pessoa.nome) && this.idade == pessoa.idade) {
		return true;
	}	
	return false;
}
}
