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
public class FornecedorTableModel extends AbstractTableModel {

	private static final int NOME = 0;

	private static final int CNPJ = 1;

	private static final int TELEFONE = 2;

	private final List<Fornecedor> fornecedores;

	private final String[] colunas = new String[]{"Nome", "CNPJ", "Telefone"};

	public FornecedorTableModel(List<Fornecedor> fornecedores) {

		this.fornecedores = fornecedores;

	}

	@Override
	public int getRowCount() {

		return this.fornecedores.size();
	}

	@Override
	public int getColumnCount() {

		return 3;
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Pega o sócio referente a linha especificada.
		Fornecedor fornecedor = this.fornecedores.get(rowIndex);
		switch (columnIndex) {
			case NOME:
				return fornecedor.getNome();
			case CNPJ:
				return fornecedor.getCNPJ();
			case TELEFONE:
				return fornecedor.getTelefone();

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
