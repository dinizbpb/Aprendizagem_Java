programa
{	
	
	funcao inicio(){


	inteiro dia, mes, ano, dia_hoje, mes_hoje, ano_hoje, ano_final, mes_final, dia_final, mes_calc, dia_calc


	dia_hoje = 18
	mes_hoje = 01
	ano_hoje = 2022

		escreva("digite seu dia de nascimento ")
		leia(dia)

		escreva("digite o numero do mes do seu nascimento ")
		leia(mes)

		escreva("digite seu ano de nascimento {EX: 1995}")
		leia(ano)

			
		ano_final = ano_hoje - ano
		mes_calc = mes - mes_hoje
		dia_final = dia_hoje - dia 

			se (mes_calc ==0){
				mes_final = mes - mes_hoje
				}

			senao {
				mes_final = 12 -(mes - mes_hoje)
					}

		dia_calc = (ano_final * 12) *30		
			
			
			 

		escreva(ano_final, "  anos")
		escreva("\n",mes_final, "  meses")
		escreva("\n",dia_calc, "  dias")
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 623; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */