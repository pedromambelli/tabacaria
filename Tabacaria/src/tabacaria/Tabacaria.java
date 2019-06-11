/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria;

import fillers.BancoDeDados;
import fillers.EstoqueFiller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import tabacaria.models.*;
import tabacaria.views.*;

/**
 *
 * @author pedro
 */
public class Tabacaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EstoqueFiller ef = new EstoqueFiller();
        Estoque estoque = ef.getEstoque();
        
        
        
        
        Caixa caixa = new Caixa(0);

        BancoDeDados.addCliente(new Cliente("Gustavo", 126, new Data(04,07,87)));

        Index tela = new Index(estoque);
        
        JFrame janelaPrincipal = new JFrame("Tabacaria");
        janelaPrincipal.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janelaPrincipal.setSize(950,730);
        janelaPrincipal.setResizable(false);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.add(tela);
        janelaPrincipal.setVisible(true);
        
    }
    
}
