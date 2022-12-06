package atividade01;

import java.util.Scanner;

public class Calculo {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		double TempoGasto;
		double Velocidade;
		double LitrosUsado;
		double Distancia;
		
		System.out.println("Digite o tempo gasto na viagem:");
		TempoGasto = scan.nextDouble();
		
		System.out.println("Digite a Velocidade Média em que você fez a sua viagem:");
		Velocidade = scan.nextDouble();
		
		Distancia=Velocidade * TempoGasto;
		LitrosUsado=Distancia/12;
		
		System.out.print("Velocidade média = " + Velocidade + " Km/h\n");
		System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
		System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
		System.out.print("Quantidade de Combustível utilizado: " + LitrosUsado + " litros\n");

	}
	
}
