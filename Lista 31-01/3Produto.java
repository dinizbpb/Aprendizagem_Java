package br.com.generation.lista31_01;

public class Produto {
	String nome;
	String tipo;
	int codigo;
	Double preco;
	
	//Métodos - verbos 
	void vender (int compra, int estoque) {	
		
		compra = compra - estoque;
	}
}
