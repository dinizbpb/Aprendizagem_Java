package br.com.generation.Lista01;

import java.util.Scanner;

public class Resposta05 {

	public static void main(String[] args) {

		Scanner ini = new Scanner(System.in);
		
		int numero, media, mediaf, cont;
		
		mediaf = 0;
		media = 0;
		cont = 0;
		
		
		do {
			System.out.println("Digite varios numeros inteiros...DIGITE 0 PARA PARAR");
			numero = ini.nextInt();
			
				if (numero > 0) {
					if (numero % 3 == 0) {
						 media= numero;
						 mediaf +=media; 
						 cont += 1;
					}
				}
			
		}while(numero >0);
		
		
		System.out.println("A média dos numeros multiplos de 3 é:  " + mediaf / cont);
		
		
	

}
}
