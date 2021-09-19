package controller;

public class Funcionario extends Pessoa {
	
	private double salario;
	private double imposto;
	
	public double salarioLiquido() {
		return this.salario * this.imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		this.salario = this.salario + (this.salario * porcentagem);
	}
	
	public void setImposto(double imposto){
		this.imposto = imposto;
	}
	
	public double getImposto(){
		return this.imposto;
	}
	
	public void setSalario(double newSalario) {
		this.salario = newSalario;
	}
	
	public double getSalario() {
		return this.salario;
	}
}
		