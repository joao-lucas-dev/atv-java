package controller;

public class Aluno extends Pessoa{
	
	private double n1, n2, n3, media;
	
	public boolean setNota(int idTeste, double nota) {
		
		switch(idTeste) {
			case 1:
				
				if(nota > 30)
				{
					this.n1 = 30;
					break;
				}
				
				this.n1 = nota;
				
				break;
			case 2:
				
				if(nota > 35)
				{
					this.n2 = 35;
					break;
				}
				
				this.n2 = nota;
				
				break;
			case 3:
				
				if(nota > 35)
				{
					this.n3 = 35;
					break;
				}
				
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

		this.media = (this.n1 + this.n2 + this.n3);
		return this.media;
	}
	
	
}
