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
public class FornecedorTableModel extends AbstractTableModel {
    
    private final ArrayList<Fornecedor> fornecedors;
    private final String[] colunas = new String[] {"Nome", "CNPJ", "Telefone"};
    
    private static final int NOME = 0;
    private static final int CNPJ = 1;
    private static final int TELEFONE = 2;


    public FornecedorTableModel(ArrayList<Fornecedor> fornecedors){
        this.fornecedors = fornecedors;
    
    }

    
    @Override
    public int getRowCount() {
        return this.fornecedors.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Fornecedor c = this.fornecedors.get(rowIndex);
        
        switch (columnIndex) {
        case NOME:
            return c.getNome();
        case CNPJ:
            return c.getCNPJ();
        case TELEFONE:
            return c.getTelefone();
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
