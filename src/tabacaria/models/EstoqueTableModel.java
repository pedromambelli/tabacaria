/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

import java.awt.Event;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pedro
 */
public class EstoqueTableModel extends AbstractTableModel {
    
    private final Estoque estoque;
    private final String[] colunas = new String[] {"Nome", "Categoria", "Preço de Custo", "Preço de Venda", "Quantidade"};
    
    private static final int NOME = 0;
    private static final int CATEGORIA = 1;
    private static final int PCUSTO = 2;
    private static final int PVENDA = 3;
    private static final int QUANTIDADE = 4;

    public EstoqueTableModel(Estoque estoque){
        this.estoque = estoque;
    
    }
    
    @Override
    public int getRowCount() {
        return this.estoque.produtosDiferentes();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Item item = this.estoque.getItem(rowIndex);
        Produto p = item.getProduto();
        switch (columnIndex) {
        case NOME:
            return p.getNome();
        case CATEGORIA:
            return p.getCategoria().getNome();
        case PCUSTO:
            return p.getpCompra();
        case PVENDA:
            return p.getpVenda();
        case QUANTIDADE:
            return item.getQuantidade();

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
