package br.com.generation.aula02;

import java.util.Scanner;

public class VetorExemplo02 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		
		double []notas = new double[5];
		double entrada, notaMaior;
		
		notaMaior = 0.0;
		
		
		for (int i = 0; i<= 4; i++) {
			System.out.println("Digite a " + (i + 1) + " Nota");
			entrada = num.nextDouble();
			notas[i] = entrada;
			if (entrada > notaMaior) {
				notaMaior = entrada;
			}
			
		}
		
		
		
		for (int i = 0; i<= 3; i++) {
		System.out.println("As notas digitadas foram : " + notas[i]);
		}
		
		System.out.println("A maior nota foi  : " + notaMaior);
	}

}
