package br.com.generation.lista31_01;

public class Aviao {

	//Atributos - variaveis
		String marca;
		String modelo;
		int anoFabricacao;
		int velocidade;
		
		//Métodos - verbos 
		void decolar(int aceleracao) {
			velocidade = velocidade + aceleracao;
		}
		
		void pouzar(int aceleracao) {
			velocidade = velocidade - aceleracao;
		}
}

