package modelagem;

public class Aluno extends Pessoa{
	private int ra;
	private int ano;
	
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public void printAtributos() {
		System.out.println("RA: "+ra+"\nAluno: "+nome+"\nIdade: "+idade+"\nAno: "+ano+"º");
	}
}
