package Hitss.Treinamento;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {
		
		System.out.println("");
		/// *** Pula 1 linha conceito de perfumaria
		System.out.println("      Hitss Treinamento");
		/// *** T�tulo do Programa
		System.out.println("");
		/// *** Pula 1 linha para o enunciado n�o ficar muito colado em cima
		System.out.println("Digite um n�mero:");
		/// *** Enunciado do Programa
		System.out.println("");
		/// *** Pula 1 Linha para o Resultado n�o ficar muito colado em cima
		try {
			/// *** Inicializa��o do Tratamento
			Scanner teclado = new Scanner(System.in);
			/// *** Comando para digitar o valor pelo teclado
			int num = teclado.nextInt();
			/// *** Declara��o da vari�vel onde vai ser digitado o n�mero
			System.out.println("");
			/// *** Pula 1 Linha
			switch (num) {
			/// *** Coloca a vari�vel de n�mero para atrelar ao comando case
			case 2:
				/// *** Caso o n�emro seja 2
				System.out.println("O Valor est� na Faixa Permitida.");
				/// *** Imprima: O Valor est� na Faixa Permitida. 
				break;
				/// *** Para o Programa
			case 3:
				/// *** Caso o N�mero seja 3
				System.out.println("O Valor est� na Faixa Permitida.");
				/// *** Imprima: O Valor est� na Faixa Permitida.
				break;
				/// *** Para o Programa
			case 4:
				/// *** Caso o n�mero seja 4
				System.out.println("O Valor est� na Faixa Permitida.");
				/// *** Imprima: O Valor est� na Faixa Permitida. 
				break;
				/// *** Para o Programa
			case 5:
				/// *** Caso o N�mero seja 5
				System.out.println("O Valor est� na Faixa Permitida.");
				/// *** Imprima: O Valor est� na Faixa Permitida. 
				break;
				/// *** Para o programa
			case 6:
				/// *** Caso o N�mero seja 6
				System.out.println("O Valor est� na Faixa Permitida.");
				/// *** Imprima O Valor est� na Faixa Permitida.
				break;
				/// *** Para o programa
			case 7:
				/// *** Caso o n�mero seja igual a 7
				System.out.println("O Valor est� na Faixa Permitida.");
				/// *** Imprima: O Valor est� na Faixa Permitida.
				break;
				/// *** Para o programa
			case 8:
				/// *** Caso o n�mero seja 8
				System.out.println("O Valor est� na Faixa Permitida.");
				/// *** Imprima: O Valor est� na Faixa Permitida. 
				break;
				/// *** Para o Programa
			default:
				/// *** E por padr�o
				System.out.println("O Valor est� Fora da Faixa Permitida.");
				/// *** Imprima: O Valor est� Fora da Faixa Permitida.
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
