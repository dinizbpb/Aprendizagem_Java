package br.com.generation.Lista01;

import java.util.Scanner;

public class Resposta05 {

	public static void main(String[] args) {

		Scanner ini = new Scanner(System.in);
		
		int numero, soma;
		
		soma =0;
		
		
		do {
			System.out.println("DIgite um numero maior que zero, CASO DIGITAR ZERO O SISTEMA QUEBRA!!");
			numero = ini.nextInt();
				if (numero > 0) {
					soma += numero;
				}
			
		}while(numero >0);
		
		
		System.out.println("a soma dos valores digitas é:  " + soma);
		
	

}
}
