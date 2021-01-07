package arrays;

/* 4 – Faça um programa que receba a temperatura média de cada mês do ano e
armazene-as em um array. Mostre a maior e a menor temperatura do ano e em que mês
elas ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro, ...).
Obs: Desconsiderar empates. */ 

public class TemperaturasDoAno {
	public static void main (String args[]) {
	double temperaturasMes[] = {35.5, 28.2, 27.3, 15.8, 24.9, 
			18.1, 19.7, 18.2, 17.7, 22.8, 38.3, 31.5};
	double temperaturaMinima = temperaturasMes[1];
	double temperaturaMaxima = 0;
	int mesMaxima = 0;
	int mesMinima = 0;
	
	String mestemperaturaMaxima = "";
	String mestemperaturaMinima = "";
	
	for (int i = 0; i < temperaturasMes.length; i++) {
		if (temperaturasMes[i] > temperaturaMaxima) {
			temperaturaMaxima = temperaturasMes[i];
			mesMaxima = i;
		} else if (temperaturasMes[i] < temperaturaMinima){
			temperaturaMinima = temperaturasMes[i];
			mesMinima = i;
		}	
	}
	switch (mesMaxima) {
	case 0:
		mestemperaturaMaxima = "Janeiro";
		break;
	case 1:
		mestemperaturaMaxima = "Fevereiro";
		break;
	case 2: 
		mestemperaturaMaxima = "Março";
		break;
	case 3: 
		mestemperaturaMaxima = "Abril";
		break;
	case 4: 
		mestemperaturaMaxima = "Maio";
		break;
	case 5:
		mestemperaturaMaxima = "Junho";
		break;
	case 6:
		mestemperaturaMaxima = "Julho";
		break;
	case 7: 
		mestemperaturaMaxima = "Agosto";
		break;
	case 8: 
		mestemperaturaMaxima = "Setembro";
		break;
	case 9:
		mestemperaturaMaxima = "Outubro";
		break;
	case 10:
		mestemperaturaMaxima = "Novembro";
		break;
	case 11: 
		mestemperaturaMaxima = "Dezembro";
		break;
	}
	
	switch (mesMinima) {
	case 0:
		mestemperaturaMinima = "Janeiro";
		break;
	case 1:
		mestemperaturaMinima = "Fevereiro";
		break;
	case 2: 
		mestemperaturaMinima = "Março";
		break;
	case 3: 
		mestemperaturaMinima = "Abril";
		break;
	case 4: 
		mestemperaturaMinima = "Maio";
		break;
	case 5:
		mestemperaturaMinima = "Junho";
		break;
	case 6:
		mestemperaturaMinima = "Julho";
		break;
	case 7: 
		mestemperaturaMinima = "Agosto";
		break;
	case 8: 
		mestemperaturaMinima = "Setembro";
		break;
	case 9:
		mestemperaturaMinima = "Outubro";
		break;
	case 10:
		mestemperaturaMinima = "Novembro";
		break;
	case 11: 
		mestemperaturaMinima = "Dezembro";
		break;
	}
	
	System.out.println("A temperatura mínima do ano foi: "
	+ temperaturaMinima + "°C no mês de " + mestemperaturaMinima + 
	"\nE a máxima de " + temperaturaMaxima + "°C no mês de " 
	+ mestemperaturaMaxima);
	}
}
