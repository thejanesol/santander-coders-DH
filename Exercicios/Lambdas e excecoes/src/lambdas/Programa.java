package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Programa {
	public static void main(String[] args) {
		Calcula soma = (x, y) -> {return x+y;};
		soma.calculo(5, 2);
		
		Calcula multiplica = (x, y) -> {return x*y;};
		multiplica.calculo(2, 6);
		
		
		BinaryOperator<Integer> somab = (x, y) -> {return x+y;};
		BinaryOperator<Integer> multiplicab = (x, y) -> {return x*y;};
		
		Consumer<String> print = System.out::println;
		Consumer<String> saudacao = word -> System.out.println("Olá, boa tarde!"
				+ " Eu sou " + word);
		
		System.out.println(multiplica.calculo(2, 6));
		System.out.println(soma.calculo(5, 2));
		
		System.out.println(multiplicab.apply(2, 6));
		System.out.println(somab.apply(5, 2));
		
		List <String> nomes = new ArrayList<>();
		nomes.add("nome");
		nomes.add("nome1");
		nomes.add("nome2");
		nomes.add("nome3");
		
//		nomes.forEach(nome -> System.out.println(nome));
		nomes.forEach(print);
		nomes.forEach(saudacao);
		
	}
}
