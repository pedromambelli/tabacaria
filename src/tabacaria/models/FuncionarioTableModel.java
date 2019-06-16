/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

import java.awt.Event;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pedro
 */
public class FuncionarioTableModel extends AbstractTableModel {
    
    private final ArrayList<Funcionario> funcionarios;
    private final String[] colunas = new String[] {"Nome", "CPF", "Salário", "Funcão"};
    
    private static final int NOME = 0;
    private static final int CPF = 1;
    private static final int SALARIO = 2;
    private static final int FUNCAO = 3;


    public FuncionarioTableModel(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    
    }

    
    @Override
    public int getRowCount() {
        return this.funcionarios.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Funcionario c = this.funcionarios.get(rowIndex);
        
        switch (columnIndex) {
        case NOME:
            return c.getNome();
        case CPF:
            return c.getCPF();
        case SALARIO:
            return c.getSalario();
        case FUNCAO:
            if(c.getAcesso() == 0) return "Funcionário";
            else return "Gerente";
            
            
        default:
            // Não deve ocorrer, pois só existem 5 colunas
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
}
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    };

    public void refresh() {
        super.fireTableDataChanged();
    }
}
