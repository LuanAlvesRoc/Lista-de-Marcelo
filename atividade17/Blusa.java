package atividade17;

public class Blusa extends Roupa{
	String camisa;
	String regata;
	
	public Blusa(String tamanho, String cor, String tipo, String camisa, String mangaLonga) {
		super(tamanho, cor, tipo);
		
	}
	
	public String Imprimir(){
        System.out.println("Tamanho: " + super.getTamanho() + "\n" + "Cor: " + super.getCor() + "\n" +
        	       "Marca: " + super.getTipo() +"\n" + "Tipo: " + camisa + "\n" + regata);
		return camisa;
	}
	
}
