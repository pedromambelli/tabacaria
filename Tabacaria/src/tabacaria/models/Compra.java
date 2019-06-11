/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

/**
 * @author pedro
 */
public class Compra extends Transacao {

	private Fornecedor fornecedor;

	public Compra(Fornecedor fornecedor) {

		this.fornecedor = fornecedor;
	}


	public Fornecedor getFornecedor() {

		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {

		this.fornecedor = fornecedor;
	}

	@Override
	public float getMovimentacao() {

		float custoTotal = 0;
		for (int i = 0; i < super.lista.size(); i++) {
			custoTotal += super.lista.get(i).getCusto();
		}
		return custoTotal * -1; //retorna negativo
	}

}
