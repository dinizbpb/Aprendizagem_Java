package br.com.generation.aula01;

import java.util.Scanner;

public class ExemploWhileUsuario {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero1, numero2, numero3, maior, meio, menor;
		
		maior = 0;
		meio = 0;
		menor = 0;
		
		
		System.out.println("Digite o 1º valor");
		numero1 = in.nextInt();
		
		System.out.println("Digite o 2º valor");
		numero2 = in.nextInt();
		
		System.out.println("Digite o 3º valor");
		numero3 = in.nextInt();
		
			if (numero1 > numero2 && numero2 > numero3) {
				maior = numero1;
				meio = numero2;
				menor = numero3;
			}
			
			else if (numero1 > numero3 && numero2 > numero3) {
				maior = numero1;
				meio = numero3;
				menor = numero2;
			}
			
			else if (numero2 > numero1 && numero1 > numero3) {
				maior = numero2;
				meio = numero1;
				menor = numero3;
			}
			
			else if (numero2 > numero3 && numero3 > numero1) {
				maior = numero2;
				meio = numero3;
				menor = numero1;
			}
			
			else if (numero3 > numero2 && numero2 > numero1) {
				maior = numero3;
				meio = numero2;
				menor = numero1;
			}
		
		
		
		System.out.println("A ordem crescente dos numeros digitados é  " + menor);
		System.out.println("A ordem crescente dos numeros digitados é  " + meio);
		System.out.println("A ordem crescente dos numeros digitados é  " + maior);
		
	
	}
}
		

