package atividade18;

public class Construtor {
	 public static void main(String[]args) {
	        Proprietario parada1= new Proprietario();	       
	        parada1.setNome("luan");
	        parada1.setRg("48.653.792-4");
	        parada1.setCpf("123.456.789-98");
	        System.out.println("Nome:"+parada1.getNome()+"\nCpf:"+parada1.getCpf()+"\nRg:"+parada1.getRg());
	    }
}
