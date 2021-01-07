package arrays;

/* 2 – Faça um programa que carregue um array com oito números inteiros 
 * e mostre dois arrays resultantes. O primeiro array resultante deve 
 * conter os números positivos. O segundo array resultante deve conter os 
 * números negativos. Cada array resultante vai ter no máximo oito posições, 
 * sendo que nem todas devem obrigatoriamente serem utilizadas. */

public class PositivosVSNegativos {
	public static void main (String args[]) {
		int positivosENegativos [] = {1, -2, 3, -8, 5, 6, -5, 8};
		int positivos[] = new int[8];
		int negativos[] = new int[8];
		
		int indicePositivos = 0;
		int indiceNegativos = 0;
		
		
		for (int i = 0; i < positivosENegativos.length; i++) {
			if (positivosENegativos[i] >= 0) {
				positivos[indicePositivos] = positivosENegativos[i];
				indicePositivos++;
			} else {
				negativos[indiceNegativos] = positivosENegativos[i];
				indiceNegativos++;
			}
		}	
		
	}
}
