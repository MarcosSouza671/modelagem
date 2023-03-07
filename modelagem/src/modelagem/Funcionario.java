package modelagem;

public class Funcionario extends Pessoa{
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void printAtributos() {
		System.out.println("Funcionário: "+nome+"\nIdade: "+idade+"\nCargo: "+cargo);
	}
	
}
