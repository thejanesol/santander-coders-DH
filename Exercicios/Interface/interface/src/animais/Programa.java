package animais;

public class Programa {
	public static void main(String[] args) {
		Cachorro scooby = new Cachorro ();
		scooby.setNome("Scooby ");
		scooby.mover();
		
		Passaro piupiu = new Passaro();
		piupiu.setNome("Piupiu ");
		piupiu.mover();
		piupiu.comer();
	}
}
