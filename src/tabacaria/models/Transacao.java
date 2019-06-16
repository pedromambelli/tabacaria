/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

import java.util.ArrayList;
//import java.util.Date;

/**
 *
 * @author pedro
 */
public abstract class Transacao implements Cloneable{
    protected static int cont = 0;
    protected ArrayList<Item> lista;
    protected Funcionario responsavel;
    protected Data data;
    protected int id;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Transacao(){
        this.lista = new ArrayList<>();
        cont++;
        this.id = cont;
        
    }
    public Transacao(int id){
        this.lista = new ArrayList<>();
        this.id = id;
        
    }
    
    public int incluirItem(Item item){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getProduto().getNome().toUpperCase().equals(item.getProduto().getNome().toUpperCase())){ //se houver produto com nome igual

                lista.get(i).setQuantidade(item.getQuantidade());
                return 1;
            }    
        }
        lista.add(item);
        return 2;
    }
    
    public int removerItem(Item item){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getProduto().getNome().toUpperCase().equals(item.getProduto().getNome().toUpperCase())){ //se houver produto com nome igual

                lista.remove(i);
                return 1;
            }    
        }
        return 2;
    }
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
