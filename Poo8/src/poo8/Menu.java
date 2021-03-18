package poo8;

public enum Menu {
	CLIENTE(1),
	FUNCIONARIO(2);
	
	private final int valor;
	
	Menu(int valorOpcao) {
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}
}
