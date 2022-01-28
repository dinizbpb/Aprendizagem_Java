package br.com.generation.aula01;

import java.util.Scanner;

public class L2R2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + " valor");
			numero = in.nextInt();
			
				if(numero % 2 == 0) {
					System.out.println( numero + " É par");
				}
				
				else {
					System.out.println( numero + " É impar");
				}
		}
		
		
		
		
		
		
		
		
		
		}

	}

