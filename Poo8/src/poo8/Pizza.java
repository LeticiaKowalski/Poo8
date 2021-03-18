package poo8;


public class Pizza extends Pedido {
	
	private static String sabor;
	private static String tamanho;
	private static String numComanda;
	
	
	public Pizza() {
		
	}
	
	public Pizza(String numComanda, String tamanho, String sabor) {
		setNumComanda(numComanda);
		setTamanho(tamanho);
		setSabor(sabor);
	}

	
	public final static String getSabor() {
		return sabor;
	}

	public final static void setSabor(String sabor) {
		Pizza.sabor = sabor;
	}

	public final static String getTamanho() {
		return tamanho;
	}

	public final static void setTamanho(String tamanho) {
		Pizza.tamanho = tamanho;
	}

	public static String getNumComanda() {
		return numComanda;
	}

	public static void setNumComanda(String numComanda) {
		Pizza.numComanda = numComanda;
	}
}
