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
public class CaixaTableModel extends AbstractTableModel {
    
    private final Caixa caixa;
    private final String[] colunas = new String[] {"ID", "Tipo","Data", "Valor"};
    
    private static final int ID = 0;
    private static final int TIPO = 1;
    private static final int DATA = 2;
    private static final int VALOR = 3;


    public CaixaTableModel(Caixa caixa){
        this.caixa = caixa;
    
    }

    
    @Override
    public int getRowCount() {
        return this.caixa.getFluxo().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Transacao t = this.caixa.getFluxo().get(rowIndex);
        
        switch (columnIndex) {
        case ID:
            return t.getId();
        case TIPO:
            return t.getMovimentacao()>0 ? "Venda" : "Compra";
        case DATA:
            return t.getData();
        case VALOR:
            return t.getMovimentacao();
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
