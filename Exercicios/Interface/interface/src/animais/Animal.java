package animais;

public interface Animal {
	
	void comer ();
	
	default void mover () {
		System.out.println("está movendo com patas.");
	}
	
	void dormir();
}
