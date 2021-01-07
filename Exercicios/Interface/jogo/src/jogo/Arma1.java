package jogo;

public class Arma1 implements Arma {
	private int municao;

	@Override
	public void atirar() {
		if (municao > 0) {
			municao--;
			System.out.println("Atirando");
		} else {
			System.out.println("Arma sem munição.");
		}
	}

	@Override
	public void recarregar() {
		municao += 30;
		System.out.println("Recarregando");
		
	}

	public int getMunicao() {
		return municao;
	}

}
