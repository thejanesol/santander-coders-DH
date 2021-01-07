//1 – Vamos criar um programa para uma academia. 
//Crie uma classe Pessoa que contenha atributos comuns tanto para 
//funcionários quanto para clientes da academia. 
//2 - Crie Classes que herdem de Pessoa e implementem 
//atributos e métodos específicos para funcionários e clientes.
//3 – Crie o Programa principal e instancie um cliente e atribua 
//valores a todos os atributos.
//4 – Instancie um funcionário e faça o mesmo.
//5 – Imprima todas as informações do cliente e do funcionário no seu console.

package academia;

public class Programa {
	public static void main(String[] args) {
	Funcionario f1 = new Funcionario(2000, "Pedro");
	f1.setIdade(23);
	f1.setTurno("manha");
	f1.setGenero("M");
	f1.setTelefone("54168648");
	f1.setEmail("pedrinho@hotmail.com");
	
	Cliente c1 = new Cliente(59, "Julia");
	c1.setIdade(30);
	c1.setGenero("F");
	c1.setPeso(50);
	c1.setTelefone("895312315");
	c1.setEmail("julialulia@hotmail.com");
	
	System.out.println(f1);
	System.out.println(c1);
}
}
