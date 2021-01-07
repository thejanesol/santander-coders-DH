package arrays;

import java.util.Scanner;

/*6- Faça um programa que leia um código numérico inteiro e um array 
 * de cinco posições de números reais. Se o código for zero, termine o
 * programa. Se o código for 1, mostre o array na ordem direta. 
 * Se o código for dois mostre o array na ordem inversa. */

public class LeituraArray {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número entre 0 e 2: ");
		int codigo = scan.nextInt();
		double numerosReais[] = {1, 2, -3, 1.5, 4};
		
		switch (codigo) {
		case 1:
			for (int j = 0; j < numerosReais.length; j++) {
				System.out.println(numerosReais[j]);
			}
			break;
		case 2:
			for (int i = numerosReais.length-1; i > 0; i--) {
				System.out.println(numerosReais[i]);
			}
			break;
		}		
		
		scan.close();
	}

}
