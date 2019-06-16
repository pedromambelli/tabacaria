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
public class ClienteTableModel extends AbstractTableModel {
    
    private final ArrayList<Cliente> clientes;
    private final String[] colunas = new String[] {"Nome", "Cpf", "Data de Nascimento"};
    
    private static final int NOME = 0;
    private static final int CPF = 1;
    private static final int NASCIMENTO = 2;


    public ClienteTableModel(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    
    }

    
    @Override
    public int getRowCount() {
        return this.clientes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Cliente c = this.clientes.get(rowIndex);
        
        switch (columnIndex) {
        case NOME:
            return c.getNome();
        case CPF:
            return c.getCPF();
        case NASCIMENTO:
            return c.getNascimento();
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
