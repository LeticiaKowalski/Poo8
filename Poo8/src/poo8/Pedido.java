package poo8;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Cliente{
	
	private static String numComanda;
	private List<Pizza> lpizza = new ArrayList<Pizza>();
	
	public Pedido() {
		
	}
	
	public final boolean addPizza(String numComanda, String tamanho, String sabor) {
		Pizza p = new Pizza(numComanda, tamanho, sabor);
		return lpizza.add(p);
	}
	

	public static String getNumComanda() {
		return numComanda;
	}

	public static void setNumComanda(String numComanda) {
		Pedido.numComanda = numComanda;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(numComanda);
		for (Pizza pizza : lpizza) {
			builder.append(pizza.toString());
		}
		return builder.toString();
	}
}
