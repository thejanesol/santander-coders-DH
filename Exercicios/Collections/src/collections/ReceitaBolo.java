package collections;

public class ReceitaBolo {
	String nome;

	public ReceitaBolo(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Ingrediente: " + nome + "";
	}
	
	
}
