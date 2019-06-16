/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Compra extends Transacao {
    private Fornecedor fornecedor;

    public Compra() {
        super();
    }
    
    public Compra(int id) {
        super(id);
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
        for(int i= 0; i<super.lista.size(); i++){
            custoTotal += super.lista.get(i).getCusto();
        }
        return custoTotal*-1; //retorna negativo
    }
    
    public Compra clone() throws CloneNotSupportedException {
        Compra nc = new Compra(this.getId());
        nc.setFornecedor(this.fornecedor);
        ArrayList<Item> cplist = new ArrayList<>();
        ArrayList<Item> itens = this.getLista();
        for(int i =0 ; i < itens.size(); i++){ // para cada item 
            Produto p = itens.get(i).getProduto();
            cplist.add(new Item(p, itens.get(i).getQuantidade()));
        }
        
        nc.setLista(cplist);
        
        return nc;
    }
    
}
