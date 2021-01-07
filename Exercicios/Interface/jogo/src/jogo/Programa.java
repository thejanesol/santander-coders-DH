package jogo;

public class Programa {
	public static void main (String args[]) {
		Jogador j1 = new Jogador();
		j1.setArma(new Arma2());
		j1.getArma().recarregar();
		j1.getArma().atirar();
		j1.getArma().atirar();
		j1.getArma().atirar();
		j1.getArma().atirar();
		j1.getArma().atirar();
		
		Arma2 arma = (Arma2) j1.getArma();
		System.out.println(arma.getMunicao());
		
		
		Jogador j2 = new Jogador();
		j2.setArma(new Arma1());
		j2.getArma().recarregar();
		j2.getArma().atirar();
		j2.getArma().atirar();
		j2.getArma().atirar();
		j2.getArma().recarregar();	
		
		Arma1 arma1 = (Arma1) j2.getArma();
		System.out.println(arma1.getMunicao());
		
		

	}
}
