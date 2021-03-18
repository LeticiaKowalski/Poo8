package poo8;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		Menu tipo = Menu.CLIENTE;
		
		switch (tipo) {
		case CLIENTE:
			Cliente.setNome("Nome do cliente: Maria");
			Cliente.setNumTelefone("N�mero de telefone: 2020-2002");
			Cliente.setRua("Nome da rua: Avenida Oscar Barcelos");
			cliente.falar();
			cliente.andar();
			Pizza.setNumComanda("N�mero da comanda: 14");
			Pizza.setTamanho("Tamanho da pizza: P");
			Pizza.setSabor("Sabor da pizza: Marguerita");
			System.out.println("\n--- Informa��es do Cliente ---");
			System.out.println(Cliente.getNome());
			System.out.println(Cliente.getNumTelefone());
			System.out.println(Cliente.getRua());
			System.out.println("O cliente est� falando? " + cliente.falar());
			System.out.println("O cliente est� andando? " + cliente.andar());
			System.out.println("\n-----       Pedido       -----");
			System.out.println(Pizza.getNumComanda());
			System.out.println(Pizza.getTamanho());
			System.out.println(Pizza.getSabor());
			break;
			
		case FUNCIONARIO:
			Pessoa.setNome("Nome do funcion�rio: Roberto");
			Funcionario.setRegistro("N�mero do registro: 123");
			Atendente.setCpf("N�mero do CPF: 100.200.300-00");
			funcionario.falar();
			funcionario.andar();
			System.out.println("\n--- Informa��es do Funcion�rio ---");
			System.out.println(Pessoa.getNome());
			System.out.println(Funcionario.getRegistro());
			System.out.println(Atendente.getCpf());
			System.out.println("O funcion�rio est� falando? " + funcionario.falar());
			System.out.println("O funcion�rio est� andando? " + funcionario.andar());
			break;
			
		default:System.out.println("ERRO!!!");
			break;
		}
	}

}
