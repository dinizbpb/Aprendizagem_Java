package br.com.generation.lista31_01;

public class Paciente {
	
	String nome;
	String sobrenome;
	int idade;
	String sexo;
	int sintomas;
	int doenca;
	
	
	void compraratendimento (int solucao) {	
		
		solucao = sintomas - doenca;
	}
}
