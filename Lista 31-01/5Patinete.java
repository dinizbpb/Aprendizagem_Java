package br.com.generation.lista31_01;

public class Patinete {
	
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;
	
	 
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	
	void freiar(int aceleracao) {
		velocidade = velocidade - aceleracao;
	}
}
