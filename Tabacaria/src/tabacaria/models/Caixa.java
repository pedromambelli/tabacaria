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
    
    private ArrayList<Transacao> fluxo;
    private float saldo;

    public Caixa(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Transacao> getFluxo() {
        return fluxo;
    }

    
    public float gravaMovimentacao(Transacao t){
        
        fluxo.add(t);
        this.saldo += t.getMovimentacao();
        
        return this.saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
    
}
