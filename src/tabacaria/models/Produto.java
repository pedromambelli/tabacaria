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
public class Produto {
    private String nome;
    private String descricao;
    private float pCompra;
    private float pVenda;
    //private int quantidade;
    private Categoria categoria;

    public Produto(String nome, String descricao, float pCompra, float pVenda) {
        this.nome = nome;
        this.descricao = descricao;
        this.pCompra = pCompra;
        this.pVenda = pVenda;
        this.categoria = new Categoria("categoria teste", "descricao teste", 5);
    }
    
    public Produto(String nome, String descricao, float pCompra, float pVenda, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.pCompra = pCompra;
        this.pVenda = pVenda;
        this.categoria = categoria;
    }

    public Produto() {
        this.categoria = new Categoria("categoria teste", "descricao teste", 5);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getpCompra() {
        return pCompra;
    }

    public void setpCompra(float pCompra) {
        this.pCompra = pCompra;
    }

    public float getpVenda() {
        return pVenda;
    }

    public void setpVenda(float pVenda) {
        this.pVenda = pVenda;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
