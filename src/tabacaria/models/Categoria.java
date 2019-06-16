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
public class Categoria {
    private String nome;
    private String descricao;
    private float taxa;

    public Categoria(String nome, String descricao, float taxa) {
        this.nome = nome;
        this.descricao = descricao;
        this.taxa = taxa;
    }

    public Categoria() {
        
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

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
    
    
    
}
