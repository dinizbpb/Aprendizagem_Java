package br.com.generation.lista31_01;

public class Produto {
	String nome;
	String tipo;
	int codigo;
	Double preco;
	
	//M�todos - verbos 
	void vender (int compra, int estoque) {	
		
		compra = compra - estoque;
	}
}
