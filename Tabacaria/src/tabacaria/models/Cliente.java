/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

/**
 * @author pedro
 */
public class Cliente {

	private String nome;

	private long CPF;

	private Data nascimento;

	private boolean dezoitoMais;

	public Cliente(String nome, long CPF, Data nascimento) {

		this.nome = nome;
		this.CPF = CPF;
		this.nascimento = nascimento;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public long getCPF() {

		return CPF;
	}

	public void setCPF(long CPF) {

		this.CPF = CPF;
	}

	public Data getNascimento() {

		return nascimento;
	}

	public void setNascimento(Data nascimento) {

		this.nascimento = nascimento;
	}

	public boolean isDezoitoMais() {

		return dezoitoMais;
	}

	public void setDezoitoMais(boolean dezoitoMais) {

		this.dezoitoMais = dezoitoMais;
	}


}
