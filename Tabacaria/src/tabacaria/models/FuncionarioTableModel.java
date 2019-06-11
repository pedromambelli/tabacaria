/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * @author pedro
 */
public class FuncionarioTableModel extends AbstractTableModel {

	private static final int NOME = 0;

	private static final int CPF = 1;

	private static final int SALARIO = 2;

	private static final int ACESSO = 3;

	private final List<Funcionario> funcionarios;

	private final String[] colunas = new String[]{"Nome", "CPF", "Salario", "Acesso"};

	public FuncionarioTableModel(List<Funcionario> funcionarios) {

		this.funcionarios = funcionarios;

	}

	@Override
	public int getRowCount() {

		return this.funcionarios.size();
	}

	@Override
	public int getColumnCount() {

		return 4;
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Pega o sócio referente a linha especificada.
		Funcionario funcionario = this.funcionarios.get(rowIndex);
		switch (columnIndex) {
			case NOME:
				return funcionario.getNome();
			case SALARIO:
				return funcionario.getSalario();
			case CPF:
				return funcionario.getCPF();
			case ACESSO:
				return funcionario.getAcesso();

			default:
				// Não deve ocorrer, pois só existem 5 colunas
				throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	@Override
	public String getColumnName(int columnIndex) {

		return colunas[columnIndex];
	}

}
