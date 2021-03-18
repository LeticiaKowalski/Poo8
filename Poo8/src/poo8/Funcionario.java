package poo8;

public class Funcionario 
	extends Pessoa
	implements Interface {

	private static String registro;

	public final static String getRegistro() {
		return registro;
	}

	public final static void setRegistro(String registro) {
		Funcionario.registro = registro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		return builder.toString();
	}
	
	@Override
	public boolean falar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean andar() {
		// TODO Auto-generated method stub
		return true;
	}

}
