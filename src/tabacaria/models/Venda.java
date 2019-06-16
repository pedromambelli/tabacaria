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
public class Venda extends Transacao {
    
    private Cliente cliente;

    public Venda() {
        super();
    }
    
    public Venda(int id) {
        super(id);
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    

    @Override
    public float getMovimentacao() {
        float ganho = 0;
        for(int i= 0; i<super.lista.size(); i++){
            ganho += super.lista.get(i).getValorVenda();
        }
        return ganho; //retorna positivo
    }
    
    /*@Override*/
    public Venda clone() throws CloneNotSupportedException {
        Venda nv = new Venda(this.getId());
        nv.setCliente(this.cliente);
        ArrayList<Item> cplist = new ArrayList<>();
        ArrayList<Item> itens = this.getLista();
        for(int i =0 ; i < itens.size(); i++){ // para cada item 
            Produto p = itens.get(i).getProduto();
            cplist.add(new Item(p, itens.get(i).getQuantidade()));
        }
        
        nv.setLista(cplist);
        
        return nv;
    }
    
    
}
