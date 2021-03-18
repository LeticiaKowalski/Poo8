package poo8;

public class Pessoa {
	
	private static String nome;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		if (nome.length() > 0)
			Pessoa.nome = nome;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}

	public boolean falar() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean andar() {
		
		return false;
	}
}
