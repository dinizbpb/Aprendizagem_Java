package br.com.generation.Lista01;

import java.util.Scanner;

public class Resposta03 {

	public static void main(String[] args) {
		Scanner ini = new Scanner(System.in);
		
		int idade[] = new int[10];
		
		int entrada, idadeMenos21, idadeMas50, vezes;
		
		idadeMenos21 = 0;
		idadeMas50= 0;
		
		entrada = 0;
		
			while (entrada <= 99) {
				System.out.println("Digite 10 idades SE DIGITAR MAIOR DE 99 ANOS O SITEMA QUEBRA EM");
				System.out.println("                ");
				System.out.println("Pode começar com a primeira");
				entrada= ini.nextInt();
				idade[0] = entrada;
					if(entrada < 21) {
						idadeMenos21 += 1;
					}
					if(entrada > 50 ) {
						idadeMas50 += 1;
					}
				
				
					if (entrada <= 99) {
						
						for (int i = 1; i <= 9; i++ ) {
							
							if (entrada <= 99) {
								System.out.println("Digite a "+ (i + 1) + " ª Idade");
								entrada= ini.nextInt();
								idade[i] = entrada;
									
								if(entrada < 21) {
									idadeMenos21 += 1;
								}
								if(entrada > 50 ) {
									idadeMas50 += 1;
								}
								
							}
							
							else {
								System.out.println("Opa digite uma idade válida");
								System.out.println("                           ");
								break;
							}
						}
						
						
					}
					
					else {
						System.out.println("Opa digite uma idade válida");
						System.out.println("                           ");
						break;
						
					}
					
				
				for (int i = 0; i <= 9; i++ ) {
					System.out.println("As idades digitadas foram: " + idade[i]);
				}
				
				System.out.println("O total de idades abaixo de 21 Anos é : " + idadeMenos21);
				System.out.println("                                        ");
				System.out.println("O total de idades acima de 50 Anos é : " + idadeMas50 );
				break;
			}

	}
}
