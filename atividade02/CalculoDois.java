package atividade02;

import java.util.Scanner;

public class CalculoDois {

	public static void calculo() {
		Scanner scan= new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Digite o primeiro número:");
		numero1= scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		numero2= scan.nextInt();
		
		if(numero1==numero2) {
			System.out.println("Os números são iguais");
		}
		else if(numero1 != numero2){
			System.out.println("Os números são diferentes");
		}
		 else if(numero1 > numero2){

             System.out.println("O primeiro número é maior");
         }
         else if (numero1 < numero2){

             System.out.println("O segundo número é maior");
         }
         else if (numero1 >= numero2){

             System.out.println("O primeiro número é maior");
         }
         else if (numero1 <= numero2){

             System.out.println("O segundo número é maior");
         }
	}
	
}
