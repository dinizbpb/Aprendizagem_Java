package br.com.generation.lista31_01;

public class ContaBancaria {
	
	String nome;
	String sobrenome;
	int codigocliente;
	int idade;
	String sexo;
	Double saldo;
	
	 
	void sacar (Double saque) {	
		
		saque = saldo - saque;
	}
	
	void depositar (Double deposito) {	
		
		deposito = saldo + deposito;
	}
}
