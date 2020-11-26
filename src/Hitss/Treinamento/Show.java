package Hitss.Treinamento;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {
		
		System.out.println("");
		/// *** Pula 1 linha conceito de perfumaria
		System.out.println("      Hitss Treinamento");
		/// *** Título do Programa
		System.out.println("");
		/// *** Pula 1 linha para o enunciado não ficar muito colado em cima
		System.out.println("Digite um número:");
		/// *** Enunciado do Programa
		System.out.println("");
		/// *** Pula 1 Linha para o Resultado não ficar muito colado em cima
		try {
			/// *** Inicialização do Tratamento
			Scanner teclado = new Scanner(System.in);
			/// *** Comando para digitar o valor pelo teclado
			int num = teclado.nextInt();
			/// *** Declaração da variável onde vai ser digitado o número
			System.out.println("");
			/// *** Pula 1 Linha
			switch (num) {
			/// *** Coloca a variável de número para atrelar ao comando case
			case 2:
				/// *** Caso o núemro seja 2
				System.out.println("O Valor está na Faixa Permitida.");
				/// *** Imprima: O Valor está na Faixa Permitida. 
				break;
				/// *** Para o Programa
			case 3:
				/// *** Caso o Número seja 3
				System.out.println("O Valor está na Faixa Permitida.");
				/// *** Imprima: O Valor está na Faixa Permitida.
				break;
				/// *** Para o Programa
			case 4:
				/// *** Caso o número seja 4
				System.out.println("O Valor está na Faixa Permitida.");
				/// *** Imprima: O Valor está na Faixa Permitida. 
				break;
				/// *** Para o Programa
			case 5:
				/// *** Caso o Número seja 5
				System.out.println("O Valor está na Faixa Permitida.");
				/// *** Imprima: O Valor está na Faixa Permitida. 
				break;
				/// *** Para o programa
			case 6:
				/// *** Caso o Número seja 6
				System.out.println("O Valor está na Faixa Permitida.");
				/// *** Imprima O Valor está na Faixa Permitida.
				break;
				/// *** Para o programa
			case 7:
				/// *** Caso o número seja igual a 7
				System.out.println("O Valor está na Faixa Permitida.");
				/// *** Imprima: O Valor está na Faixa Permitida.
				break;
				/// *** Para o programa
			case 8:
				/// *** Caso o número seja 8
				System.out.println("O Valor está na Faixa Permitida.");
				/// *** Imprima: O Valor está na Faixa Permitida. 
				break;
				/// *** Para o Programa
			default:
				/// *** E por padrão
				System.out.println("O Valor está Fora da Faixa Permitida.");
				/// *** Imprima: O Valor está Fora da Faixa Permitida.
				break;
				/// *** Para o Programa
			}
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Fim do Programa!");
			/// *** Aviso de Fim do Programa
		} catch (Exception e) {
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Erro de processamento: " + e.getMessage());
			/// *** Se der Bug Imprima o Retorno do Erro a ser Informado
		}
	}
}
