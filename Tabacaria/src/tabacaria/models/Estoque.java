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
public class Estoque {
    private final ArrayList<Item> estoque;

    public Estoque() {
        this.estoque = new ArrayList<>();
    }
    
    public Item getItem(int ID){
        return this.estoque.get(ID);
    }
    
    public int incluir(Item item){
        for(int i = 0; i < estoque.size(); i++){
            if(estoque.get(i).getProduto().getNome().toUpperCase().equals(item.getProduto().getNome().toUpperCase())){ //se houver produto com nome igual
                if(estoque.get(i).getProduto().getpCompra() < item.getProduto().getpCompra()){ //observa-se o preço, mantendo-se o maior
                    estoque.get(i).getProduto().setpCompra(item.getProduto().getpCompra());
                    
                }
                estoque.get(i).addQuantidade(item.getQuantidade());
                return 1; // produto ja existia, quantidade atualizada
             }    
        }
        estoque.add(item);
        return 2;
    }
    
    public int remover(String nome, int quantidade){
        for(int i = 0; i < estoque.size(); i++){
            if(estoque.get(i).getProduto().getNome().toUpperCase().equals(nome.toUpperCase())){ //se houver produto com nome igual
                if(estoque.get(i).getQuantidade() >= quantidade){
                    estoque.get(i).subQuantidade(quantidade);
                    return estoque.get(i).getQuantidade();
                }
                else{
                    return -1; // não há produtos suficientes para executar esta venda
                }
             }    
        }
        return -2; // -2 representará que o produto não existe no estoque
    }
    
    public int produtosDiferentes(){
        return this.estoque.size();
    }
}
