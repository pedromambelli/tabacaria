/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.models;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author pedro
 */
public class ClienteTableModel extends AbstractTableModel {

    private final List<Cliente> clientes;
    private final String[] colunas = new String[] {"Nome", "CPF", "Nascimento", "Maior 18"};

    private static final int NOME = 0;
    private static final int CPF = 1;
    private static final int NASCIMENTO = 2;
    private static final int MAIORIDADE = 3;

    public ClienteTableModel(List<Cliente> clientes){
        this.clientes = clientes;
    
    }
    
    @Override
    public int getRowCount() {
        return this.clientes.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Cliente cliente = this.clientes.get(rowIndex);
        switch (columnIndex) {
        case NOME:
            return cliente.getNome();
        case CPF:
            return cliente.getCPF();
        case NASCIMENTO:
            return cliente.getNascimento().toString();
        case MAIORIDADE:
            return cliente.isDezoitoMais() ? "Sim" : "Nao";

        default:
            // Não deve ocorrer, pois só existem 5 colunas
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
}
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    };
}
