package arrays;

/*7 – Faça um programa que gere os dez primeiros números primos acima de 100 e
armazene-os em um array, escrevendo ao final o array resultante. */ 

public class GerarNumerosPrimos {
	public static void main (String args[]) {
		int numero = 100;
		int numerosPrimos[] = new int[10];
		for (int i = 0; i < 10; i++) {
			if (numero % 2 != 0) {
				numerosPrimos[i] = numero;
				numero++;
			} else {
				i--;
				numero++;
			}
		}
		for (int j = 0; j < numerosPrimos.length; j++) {
			System.out.println(numerosPrimos[j]);
		}
	}
}
