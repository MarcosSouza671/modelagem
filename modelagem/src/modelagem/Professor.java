package modelagem;

public class Professor {
	private String diciplina;

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	
	public void printAtributos() {
		System.out.println("Professor: "+nome+"\nIdade: "+idade+"\nDiciplina: "+diciplina);
	}
}
