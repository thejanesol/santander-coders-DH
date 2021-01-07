package jogo;

public class Arma2 implements Arma {
	private int municao;

	@Override
	public void atirar() {
		if (municao > 0) {
			this.municao--;
			System.out.println("Atirando");
		} else {
			System.out.println("Arma sem munição.");
		}
	}

	@Override
	public void recarregar() {
		this.municao += 60;
		System.out.println("Recarregando");		
	}

	public int getMunicao() {
		return this.municao;
	}

}
