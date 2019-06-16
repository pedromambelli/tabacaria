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
public class Caixa {
    
    private final ArrayList<Transacao> fluxo;
    private float saldo;

    public Caixa(float saldo) {
        this.saldo = saldo;
        this.fluxo = new ArrayList<>();
    }

    public ArrayList<Transacao> getFluxo() {
        return fluxo;
    }

    
    public float gravaMovimentacao(Transacao t){
        
        fluxo.add(t);
        this.saldo += t.getMovimentacao();
        
        return this.saldo;
    }
    
    public float cancelaMovimentacao(Transacao t){
        System.out.println("Entrei em cancela Movimentação");
        System.out.println(t.getId());
        for(int i = 0; i < fluxo.size(); i++){
            if(fluxo.get(i).getId() == t.getId()){ //quando encontrar a transacao procurada
                System.out.println(i);
                fluxo.remove(i);
            }
        }
        this.saldo -= t.getMovimentacao();
        
        return this.saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void clear(int saldo){
        this.saldo = saldo;
        this.fluxo.clear();
    }
    
    
    
    
    
    
}
