package fillers;

import tabacaria.models.Cliente;
import tabacaria.models.Fornecedor;
import tabacaria.models.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

	public static List<Cliente> getClientes() {

		return clientes;
	}

	private static List<Cliente> clientes = new ArrayList<>();

	private static List<Funcionario> funcionarios = new ArrayList<>();

	private static List<Fornecedor> fornecedores = new ArrayList<>();

	public static void addCliente(Cliente cliente) {

		clientes.add(cliente);
	}

}
