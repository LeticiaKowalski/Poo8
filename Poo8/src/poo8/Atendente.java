package poo8;

public class Atendente {
	
	private static String cpf;

	public final static String getCpf() {
		return cpf;
	}

	public final static void setCpf(String cpf) {
		Atendente.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		return builder.toString();
	}
}
