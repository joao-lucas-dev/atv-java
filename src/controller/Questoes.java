package controller;

import java.util.Scanner;



public class Questoes {
	
	public void Questao1() {
		
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa01 = new Pessoa();
		Pessoa pessoa02 = new Pessoa();
		
		System.out.println("Digite o nome da primeira pessoa: ");
		pessoa01.setName(ler.nextLine());
		System.out.println("Informe a idade da primeira pessoa: ");
		pessoa01.setIdade(ler.nextInt());
		
		System.out.println("Digite o nome da segunda pessoa: ");
		pessoa02.setName(ler.nextLine());
		System.out.println("Informe a idade da segunda pessoa: ");
		pessoa02.setIdade(ler.nextInt());
		
		
		if(pessoa01.getIdade() > pessoa02.getIdade()){
			
			System.out.println("A pessoa mais velha é: " + pessoa01.getName());
			
		}else if(pessoa01.getIdade() == pessoa02.getIdade()) {
			
			System.out.println("As duas pessoas tem a mesma idade");
			
		}else{
			
			System.out.println("A pessoa mais velha é: " + pessoa02.getName());
			
		}
	
	}
	
	public void Questao2(){
		
		Scanner ler = new Scanner(System.in);
		
		Funcionario funcionario01 = new Funcionario();
		Funcionario funcionario02 = new Funcionario();
		
		System.out.println("Informe o nome do primeiro funcionário: ");
		funcionario01.setName(ler.nextLine());
		
		System.out.println("Informe o salário do primeiro funcionário: ");
		funcionario01.setSalario(ler.nextDouble());
		
		
		System.out.println("Informe o nome do segundo funcionário: ");
		funcionario02.setName(ler.nextLine());
		
		System.out.println("Informe o salário do segundo funcionário: ");
		funcionario02.setSalario(ler.nextDouble());
		
		
		
		double media = (funcionario01.getSalario() + funcionario02.getSalario()) / 2;
		
		System.out.println("O salario medio é igual a " + media);
		
	}
	
	public double Questao3() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a largura do retangulo");
		double larg = ler.nextDouble();
		System.out.println("Informe a altura do retangulo");
		double alt = ler.nextDouble();
		double area = (larg * alt);
		double perimetro = 2 * (larg + alt);
		double diagonal = Math.sqrt((larg * larg) + (alt * alt ));
		
		System.out.println("Área: " + area + " "+ "Perimetro: " + perimetro+ " " +"Diagonal: " + diagonal);
		
		return area + perimetro + diagonal;
				
	}
	
	public void Questao4() {
		
		Scanner ler = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Informe o nome do funcionário: ");
		funcionario.setName(ler.nextLine());
		
		System.out.print("Informe o salário bruto do funcionário: ");
		funcionario.setSalario(ler.nextDouble());
		
		System.out.print("Informe o valor do imposto: ");
		funcionario.setImposto(ler.nextDouble());
		
		System.out.println("Nome do funcionário "+ funcionario.getName());
		System.out.println("Salário líquido: " + funcionario.salarioLiquido());
		System.out.println("Salário bruto: " + funcionario.getSalario());
		
		System.out.println("Porcentagem do aumento de salário: ");
		funcionario.aumentarSalario(ler.nextDouble());
		
		
		System.out.println("Informações do funcionário apos o aumento");
		System.out.println("Nome do funcionário "+ funcionario.getName());
		System.out.println("Salário líquido: " + funcionario.salarioLiquido());
		System.out.println("Salário bruto: " + funcionario.getSalario());
		
		
	}
	
	public void Questao5() {
		
		Scanner ler = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome Aluno: ");
		aluno.setName(ler.nextLine());
		
		System.out.println("Digite as três notas do aluno");
		for(int i = 1; i <= 3; i++) {
			System.out.print("Nota "+ i + ":");
			aluno.setNota(i, ler.nextDouble());
		}
		
		double nota_final = aluno.gerarNotaFinal();
		
		if(nota_final > 60) {
			System.out.println("APROVADO!");
			System.out.println("NOTA: "+ nota_final);
		}else {
			System.out.println("REPROVADO!");
			System.out.println("NOTA: "+ nota_final);
			System.out.println("FALTAM "+ (60 - nota_final) + " PONTOS");
		}
		
	}
	
}
