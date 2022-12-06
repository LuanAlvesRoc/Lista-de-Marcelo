package atividade17;

public class Calca extends Roupa {
	String social;
	String infantil;
	
	public Calca(String tamanho, String cor, String tipo, String camisa, String mangaLonga) {
		super(tamanho, cor, tipo);
	}
	
	public String Imprimir(){
        System.out.println(
        		"Tamanho: " + 
	        	super.getTamanho() + 
	        	"\n" + "Cor: " + 
	        	super.getCor() + 
	        	"\n" + "Marca: " + 
	        	super.getTipo() +
	        	"\n" + "Tipo: " + 
	        	social + 
	        	"\n" + infantil);
		return social;
    		
	}
}
