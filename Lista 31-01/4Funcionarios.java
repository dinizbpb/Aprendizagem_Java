package br.com.generation.lista31_01;

public class Funcionarios {
	String nome;
	String sobrenome;
	int idade;
	String sexo;
	int codigoIndentif;
	String departamento;
	String funcao;
	
	//Métodos - verbos 
	void trabalhar (int producao, int cargahrs) {	
		
		producao = producao * cargahrs;
	}
}
