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
public class Item {
    
    private Produto produto;
    private int quantidade;
    
    public Item(String nome, String descricao, float pCompra, float pVenda, int quantidade){
        this.produto = new Produto(nome, descricao, pCompra, pVenda);
        this.quantidade = quantidade;
    }

    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
    
    public float getCusto(){
        return this.quantidade*this.produto.getpCompra();
    }
    
    public float getImpostos(){
        return this.produto.getpVenda()*this.produto.getCategoria().getTaxa();
    }
    
    public float getValorVenda(){
        return this.quantidade*this.produto.getpVenda();
    }

    void addQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    void subQuantidade(int quantidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
