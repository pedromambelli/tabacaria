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
public class CategoriaTableModel extends AbstractTableModel {
    
    private final ArrayList<Categoria> categorias;
    private final String[] colunas = new String[] {"Nome", "Descrição", "Taxa de Imposto"};
    
    private static final int NOME = 0;
    private static final int DESCRICAO = 1;
    private static final int TAXA = 2;


    public CategoriaTableModel(ArrayList<Categoria> categorias){
        this.categorias = categorias;
    
    }

    public CategoriaTableModel(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return this.categorias.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Categoria c = this.categorias.get(rowIndex);
        
        switch (columnIndex) {
        case NOME:
            return c.getNome();
        case DESCRICAO:
            return c.getDescricao();
        case TAXA:
            return c.getTaxa();
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
