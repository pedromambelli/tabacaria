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
public class Venda extends Transacao{
    
    private Cliente cliente;

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
        return ganho; //retorna negativo
    }
    
    
}
