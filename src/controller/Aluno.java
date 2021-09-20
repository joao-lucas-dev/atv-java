package controller;

public class Aluno extends Pessoa{
	
	private double n1, n2, n3, media;
	
	public boolean setNota(int idTeste, double nota) {
		
		switch(idTeste) {
			case 1:
			
				this.n1 = nota;
				
				break;
			case 2:
				
				this.n2 = nota;
				
				break;
			case 3:
				
				this.n3 = nota;
				
				break;
			default:
				return false;
		}
		
		return true;
	}
	
	public double getNotaFinal() {
		return this.media;
	}
	
	public double gerarNotaFinal() {

		this.media = ((this.n1 + this.n2 + this.n3) / (30 + 35 + 35)) * 100;
		return this.media;
	}
	
	
}
