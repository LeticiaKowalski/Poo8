package poo8;

public class Cliente 
	extends Pessoa
	implements Interface {

	private static String numTelefone;
	private static String rua;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String numTelefone, String rua) {
		setNumTelefone(numTelefone);
		setRua(rua);
	}
	

	public final static String getNumTelefone() {
		return numTelefone;
	}

	public final static void setNumTelefone(String numTelefone) {
		if (numTelefone.length() > 0)
			Cliente.numTelefone = numTelefone;
	}

	public final static String getRua() {
		return rua;
	}

	public final static void setRua(String rua) {
		if (rua.length() > 0)
			Cliente.rua = rua;
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
		return true;
	}

	@Override
	public boolean andar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
