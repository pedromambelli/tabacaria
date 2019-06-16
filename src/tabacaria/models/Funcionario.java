/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

/**
 *
 * @author pedro
 */
public class Funcionario {
    private long CPF;
    private String nome;
    private float salario;
    private String senha;
    private int acesso;

    public Funcionario(long CPF, String nome, float salario, String senha, int acesso) {
        this.CPF = CPF;
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
        this.acesso =  acesso;
    }

    public Funcionario() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAcesso() {
        return acesso;
    }

    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }
    
    
    
}
