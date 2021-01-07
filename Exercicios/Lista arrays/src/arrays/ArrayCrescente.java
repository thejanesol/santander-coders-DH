package arrays;

import java.util.Arrays;

/*3 – Faça um programa que carregue de maneira ordenada (crescente) 
 * um array de 8 elementos. */

public class ArrayCrescente {
	public static void main (String args[]) {
		int arrayOrdenado[] = {2, 9, 7, 8, 3, 4};
		Arrays.sort(arrayOrdenado, 0, arrayOrdenado.length);
		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.println(arrayOrdenado[i]);
		}	
}
}
