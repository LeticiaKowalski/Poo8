package poo8;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		Menu tipo = Menu.CLIENTE;
		
		switch (tipo) {
		case CLIENTE:
			Cliente.setNome("Nome do cliente: Maria");
			Cliente.setNumTelefone("Número de telefone: 2020-2002");
			Cliente.setRua("Nome da rua: Avenida Oscar Barcelos");
			cliente.falar();
			cliente.andar();
			Pizza.setNumComanda("Número da comanda: 14");
			Pizza.setTamanho("Tamanho da pizza: P");
			Pizza.setSabor("Sabor da pizza: Marguerita");
			System.out.println("\n--- Informações do Cliente ---");
			System.out.println(Cliente.getNome());
			System.out.println(Cliente.getNumTelefone());
			System.out.println(Cliente.getRua());
			System.out.println("O cliente está falando? " + cliente.falar());
			System.out.println("O cliente está andando? " + cliente.andar());
			System.out.println("\n-----       Pedido       -----");
			System.out.println(Pizza.getNumComanda());
			System.out.println(Pizza.getTamanho());
			System.out.println(Pizza.getSabor());
			break;
			
		case FUNCIONARIO:
			Pessoa.setNome("Nome do funcionário: Roberto");
			Funcionario.setRegistro("Número do registro: 123");
			Atendente.setCpf("Número do CPF: 100.200.300-00");
			funcionario.falar();
			funcionario.andar();
			System.out.println("\n--- Informações do Funcionário ---");
			System.out.println(Pessoa.getNome());
			System.out.println(Funcionario.getRegistro());
			System.out.println(Atendente.getCpf());
			System.out.println("O funcionário está falando? " + funcionario.falar());
			System.out.println("O funcionário está andando? " + funcionario.andar());
			break;
			
		default:System.out.println("ERRO!!!");
			break;
		}
	}

}
