package br.com.generation.Lista01;

import java.util.Scanner;
public class Resosta04 {

	public static void main(String[] args) {
		Scanner ini = new Scanner(System.in);
		
		Scanner ini2 = new Scanner(System.in);
		
		Scanner ini3 = new Scanner(System.in);
		
		int idade[] = new int[150];
		int sexo[] = new int[150];
		int tipo[] = new int[150];
		
		int pessoasCalmas, mulNervosas, hAgress, outCalmos, nerv40Mais, pessoCalmasMenos18, cont;
		
		pessoasCalmas = 0;
		mulNervosas = 0; 
		hAgress = 0;
		outCalmos = 0;
		nerv40Mais = 0;
		pessoCalmasMenos18= 0;
		cont = 0;
		
			while (cont <= 149) {
				System.out.println("Digite a sua idade ");
				idade[cont] = ini.nextInt();
				
				
				
				System.out.println("Qual é o seu Sexo ? ");
				System.out.println("                 ");
				System.out.println("Digite 1 - Feminino");
				System.out.println("                 ");
				System.out.println("Digite 2 - Masculino");
				System.out.println("                 ");
				System.out.println("Digite 3 - Outros");
				sexo[cont] = ini2.nextInt();
				
				
				System.out.println("Você se indentifica uma pessoa Calma, nervosa ou agressiva");
				System.out.println("                 ");
				System.out.println("Digite 1 - Calma(o)");
				System.out.println("                 ");
				System.out.println("Digite 2 - Nervosa(o)");
				System.out.println("                 ");
				System.out.println("Digite 3 - agressiva(o)");
				tipo[cont] = ini3.nextInt();
					
				
					
						
					if(tipo[cont] == 1) {
						pessoasCalmas+=1;
					}
					
					if(sexo[cont] == 1 && tipo[cont] == 2 ) {
						mulNervosas+=1;
					}
					
					if(sexo[cont] == 2 && tipo[cont] == 3) {
						hAgress+=1;
					}
					
					if(sexo[cont] == 3 && tipo[cont] == 1) {
						outCalmos+=1;
					}
					
					if(idade[cont] > 40  && tipo[cont] == 2  ) {
						nerv40Mais+=1;
					}
					
					if(idade[cont] < 18 && tipo[cont] == 1) {
						pessoCalmasMenos18+=1;
					}
					
					
					
				cont++;
					
			}
			
			
			
			System.out.println(" O numero de pessoas calmas é :  " + pessoasCalmas);
			System.out.println("                                                   ");
			System.out.println(" O numero de mulheres nervosas é :  " + mulNervosas);
			System.out.println("                                                   ");
			System.out.println(" O numero de homens  agressivos é :  " + hAgress);
			System.out.println("                                                   ");
			System.out.println(" O numero de outros calmos é :  " + outCalmos);
			System.out.println("                                                   ");
			System.out.println(" O numero de pessoas nervosas com mais de 40 anos :  " + nerv40Mais);
			System.out.println("                                                   ");
			System.out.println(" O numero de pessoas calmas com menos de 18 anos :  " + pessoCalmasMenos18);
			System.out.println("                                                   ");
			
		
			
			
			
			
			
	}
	
	
}
