/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

import java.util.ArrayList;
//import java.util.Date;

/**
 * @author pedro
 */
public abstract class Transacao {

	protected ArrayList<Item> lista;

	protected Funcionario responsavel;

	protected Data data;

	public ArrayList<Item> getLista() {

		return lista;
	}

	public void setLista(ArrayList<Item> lista) {

		this.lista = lista;
	}

	public Funcionario getResponsavel() {

		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {

		this.responsavel = responsavel;
	}

	public Data getData() {

		return data;
	}

	public void setData(Data data) {

		this.data = data;
	}

	public abstract float getMovimentacao();


}
