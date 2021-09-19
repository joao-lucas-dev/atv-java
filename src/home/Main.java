package home;

import java.util.Locale;
import java.util.Scanner;

import controller.Questoes;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Locale.setDefault(Locale.US);
		
		Questoes questoes = new Questoes();
		
		int escolha;
		
		System.out.println("Escolha a questão: ");
		System.out.println();
		System.out.println("1 - Questão 1 ");
		System.out.println("2 - Questão 2 ");
		System.out.println("3 - Questão 3 ");
		System.out.println("4 - Questão 4 ");
		System.out.println("5 - Questão 5 ");
		System.out.println("6 - Sair ");
		System.out.print("R: ");
		
		escolha = sc.nextInt();
		sc.nextLine();
		
		switch (escolha) {
		
		case 1:
			questoes.Questao1();
			break;
		
		case 2:
			questoes.Questao2();
			break;
			
		case 3:
			questoes.Questao3();
			break;
			
		case 4:
			questoes.Questao4();
			break;
		case 5:
			questoes.Questao5();
			break;
			
		default:
			System.out.println("Escolha uma opção valida");
		
		break;

		}
		
	}
}
