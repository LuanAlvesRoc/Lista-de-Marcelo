package atividade12;
import java.util.Scanner;
public class Calculoparte2 {

	public static void main(String[] args) {
		Scanner menu = new Scanner (System.in);
		Calculo12 quest12 = new Calculo12();

        int opcao;
        
        do{
        	quest12.tela();
            opcao = menu.nextInt();
            
            switch(opcao){
            case 1:
           	 System.out.println("Você aprendeu");
                break;
                
            case 2:
           	 System.out.println("Você escreveu");
                break;
                
            case 3:
           	 System.out.println("Você falou");
                break;                
            
            default:
                System.out.println("O programa foi encerrado!!!");
            }
        } while(opcao != 0);
    }
}
