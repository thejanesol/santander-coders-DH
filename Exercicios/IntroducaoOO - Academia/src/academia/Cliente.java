package academia;

public class Cliente extends Pessoa {
	private double peso;
	private double mensalidade;
	
	
	public Cliente(double mensalidade, String nome) {
		super(nome);
		this.mensalidade = mensalidade;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + getNome()+ ", mensalidade: " + mensalidade
				+ ", peso: " + peso
				+ ", Idade: " + getIdade() + ", Genero: "
				+ getGenero() + ", Telefone: "
				+ getTelefone() + ", Email: " + getEmail();
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getMensalidade() {
		return mensalidade;
	}
	
	

}
