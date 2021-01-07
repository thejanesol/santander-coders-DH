package arrays;

/* 1 – Faça um programa que carregue um array de nove elementos numéricos 
 * inteiros e mostre os números primos e suas respectivas posições.*/

public class NumerosPrimos {
	public static void main (String args[]) {
		int numerosInteiros [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0; i < numerosInteiros.length; i++) {
			if (numerosInteiros[i] % 2 != 0) {
				System.out.println(numerosInteiros[i]);
			} else if (numerosInteiros[i] == 2) {
				System.out.println(numerosInteiros[i]);
			}
		}
		
	}
}
