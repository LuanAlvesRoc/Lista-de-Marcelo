package atividade03;
import java.util.Scanner;
public class Calculo3 {
	public static void main(String []args) {
		Scanner scan= new Scanner(System.in);
		int numero1;
		
		
		System.out.println("Digite o primeiro número:");
		numero1= scan.nextInt();
		
		if(numero1 % 2==0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
	}
}
