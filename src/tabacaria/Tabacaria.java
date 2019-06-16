/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria;

import helpers.Arquivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;
import tabacaria.models.*;
import tabacaria.views.*;
import tabacaria.views.Login;
/**
 *
 * @author pedro
 */
public class Tabacaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        
        
        Estoque estoque = new Estoque();
        
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        
        ArrayList<Categoria> categorias = new ArrayList<>();
        
        
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        
       
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        Caixa caixa = new Caixa(0);
        
        
        
        try{
            Arquivo.load(categorias, clientes, funcionarios, fornecedores, estoque, caixa, "./data/tabacaria.json");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo padrão não encontrado, utilize o cpf 000 e a senha admin para entrar pela primeira vez");
            funcionarios.add(
                    new Funcionario(000, "admin", 0, "admin", 1)
            );
        } catch (IOException e) {
            System.out.println(e);
        } 
        Index tela = new Index(estoque, clientes, categorias, fornecedores, funcionarios, caixa);
        
        Login telaLogin = new Login(tela, funcionarios);
        
        JFrame janelaLogin = new JFrame("Login");
        janelaLogin.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janelaLogin.setSize(400,370);
        janelaLogin.setResizable(false);
        janelaLogin.setLocationRelativeTo(null);
        janelaLogin.add(telaLogin);
        janelaLogin.setVisible(true);
        
        
        
    }
    
}
