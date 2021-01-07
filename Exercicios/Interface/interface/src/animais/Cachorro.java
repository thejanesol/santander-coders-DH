package animais;

public class Cachorro implements Animal {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	@Override
	public void comer() {
		System.out.println(nome + "está comendo.");
		
	}

	@Override
	public void mover() {
		System.out.println(nome + "está movendo.");
		
	}

	@Override
	public void dormir() {
		System.out.println(nome + "está comendo dormindo.");
		
	}

}
