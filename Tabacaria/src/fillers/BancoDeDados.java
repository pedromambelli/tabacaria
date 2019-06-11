package fillers;

import tabacaria.models.Cliente;
import tabacaria.models.Fornecedor;
import tabacaria.models.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

	private static List<Cliente> clientes = new ArrayList<>();

	private static List<Funcionario> funcionarios = new ArrayList<>();

	private static List<Fornecedor> fornecedores = new ArrayList<>();

	public static List<Cliente> getClientes() {

		return clientes;
	}

	public static List<Funcionario> getFuncionarios() {

		return funcionarios;
	}

	public static List<Fornecedor> getFornecedores() {

		return fornecedores;
	}

	public static void addCliente(Cliente cliente) {

		clientes.add(cliente);
	}

	public static void addFornecedor(Fornecedor fornecedor) {

		fornecedores.add(fornecedor);
	}

	public static void addFuncionario(Funcionario funcionario) {

		funcionarios.add(funcionario);
	}

}
