package br.com.generation.aula01;

import java.util.Scanner;

public class ExemploWhileUsuario {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero, maior;
		
		maior = 0;
		
		
		
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("Digite o " + i + " º valor");
			numero = in.nextInt();
			
				
				if(numero > maior) {
					maior = numero;
			}
			
			else {}
		}
		
		
		
		System.out.println("O maior valor digitado foi : " + maior);
		
		
	
	}
}
		
	


