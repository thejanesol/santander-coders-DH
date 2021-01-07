package arrays;

import java.util.Random;

/*5 – Faça um programa que receba o número sorteado em um dado durante 20 jogadas,
mostre os números sorteados e a frequência com que aparecem */ 

public class Dado {
	public static void main (String args[]) {
		int jogadasDado[] = new int [20];
		Random jogarDado = new Random();
		
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		int numero5 = 0;
		int numero6 = 0;
		
		for (int i = 0; i < jogadasDado.length; i++) {
			jogadasDado[i] = jogarDado.nextInt(6)+1;
			System.out.println(jogadasDado[i]);
			switch (jogadasDado[i]) {
			case 1:
				numero1++;
				break;
			case 2:
				numero2++;
				break;
			case 3:
				numero3++;
				break;
			case 4:
				numero4++;
				break;
			case 5:
				numero5++;
				break;
			case 6:
				numero6++;
				break;
			}
		}
		
		System.out.println("----------------------\nNumero 1 caiu " +
		numero1 + " vezes," + "\nNumero 2 caiu " + numero2 + " vezes," +
		"\nNumero 3 caiu " + numero3 + " vezes," +
		"\nNumero 4 caiu " + numero4 + " vezes," +
		"\nNumero 5 caiu " + numero5 + " vezes," +
		"\nNumero 6 caiu " + numero6 + " vezes.");
	}

}
