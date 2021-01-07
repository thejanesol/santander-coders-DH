package academia;

public class Funcionario extends Pessoa{
	private int matricula;
	private String turno;
	private double salario;
		
	@Override
	public String toString() {
		return "Funcionario: " + getNome()+ ", matricula: " + matricula + ", "
				+ "turno: " + turno + ", salario: " + salario
				+ ", Idade: " + getIdade() + ", Genero: "
				+ getGenero() + ", Telefone: "
				+ getTelefone() + ", Email: " + getEmail();
	}

	public Funcionario(double salario, String nome) {
		super(nome);
		this.salario = salario;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public double getSalario() {
		return salario;
	}

}
