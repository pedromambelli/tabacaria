/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.views;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import tabacaria.models.Caixa;
import tabacaria.models.CaixaTableModel;
import tabacaria.models.CategoriaTableModel;
import tabacaria.models.Cliente;
import tabacaria.models.Data;
import tabacaria.models.Estoque;
import tabacaria.models.EstoqueTableModel;
import tabacaria.models.Venda;
import tabacaria.models.VendaTableModel;

/**
 *
 * @author pedro
 */
public class FormularioVenda extends javax.swing.JFrame {

    private Estoque estoque;
    private EstoqueTableModel estoqueTM;
    private TableRowSorter<EstoqueTableModel> sorterEstoque;
    private Venda venda;
    private VendaTableModel vendaTM;
    private String[] nomesClientes;
    private DefaultComboBoxModel clientesModel;
    private Venda oldVenda;
    private Caixa caixa;
    private ArrayList<Cliente> clientes;
    private CaixaTableModel caixaTM;
    private JLabel saldo;

    /**
     * Creates new form FormularioVendas
     */
    public FormularioVenda() {
        initComponents();
    }
    
    public FormularioVenda( Estoque estoque, EstoqueTableModel estoqueTM, Venda v, VendaTableModel vendaTM, ArrayList<Cliente> clientes
            , Caixa caixa, CaixaTableModel caixaTM, javax.swing.JLabel SaldoLbl, int flag) 
                throws CloneNotSupportedException{
        this.estoque = estoque ;
        this.estoqueTM = estoqueTM;
        this.sorterEstoque = new TableRowSorter<>(estoqueTM);
        
        this.oldVenda = (Venda) v.clone();
        this.venda = v;
        
        this.vendaTM = vendaTM;
        
        this.nomesClientes = new String[clientes.size()];
        
        
        for(int i = 0; i<clientes.size(); i++){
            nomesClientes[i] = clientes.get(i).getNome();
        }
        
        this.clientesModel = new DefaultComboBoxModel(nomesClientes);
        this.caixa = caixa;
        this.caixaTM = caixaTM;
        
        this.clientes = clientes;
        this.saldo = SaldoLbl;
        
        initComponents();
        
        if(flag == 1){
            for (int i =0; i < nomesClientes.length; i++){
                if(nomesClientes[i].equals(venda.getCliente().getNome()))
                    ClienteCombo.setSelectedIndex(i);
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OVPanel = new javax.swing.JPanel();
        EstoquePanel = new javax.swing.JPanel();
        EstoqueScrollPane = new javax.swing.JScrollPane();
        EstoqueJTable = new javax.swing.JTable();
        EstoqueLabel = new javax.swing.JLabel();
        ProdutoSearchTxtField = new javax.swing.JTextField();
        filtertxt = new javax.swing.JLabel();
        addtxt = new javax.swing.JLabel();
        SeparatorOrdensVenda = new javax.swing.JSeparator();
        OrdensVendaLbl = new javax.swing.JLabel();
        PedidoPanel = new javax.swing.JPanel();
        PedidoScrollPane3 = new javax.swing.JScrollPane();
        PedidoJTable3 = new javax.swing.JTable();
        OVLabel = new javax.swing.JLabel();
        removealteratxt = new javax.swing.JLabel();
        ClienteCombo = new javax.swing.JComboBox<>();
        ClienteLabel = new javax.swing.JLabel();
        TransferImg = new javax.swing.JLabel();
        FinalizaOVBtn = new javax.swing.JButton();
        CancelaOVBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OVPanel.setBackground(new java.awt.Color(255, 255, 255));

        EstoquePanel.setBackground(new java.awt.Color(255, 255, 255));
        EstoquePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 1, true));

        EstoqueJTable.setAutoCreateRowSorter(true);
        EstoqueJTable.setModel(estoqueTM);
        EstoqueJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstoqueJTableMouseClicked(evt);
            }
        });
        EstoqueScrollPane.setViewportView(EstoqueJTable);

        EstoqueLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EstoqueLabel.setText("Estoque");

        ProdutoSearchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoSearchTxtFieldActionPerformed(evt);
            }
        });
        ProdutoSearchTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ProdutoSearchTxtFieldrefreshFilterProduto(evt);
            }
        });

        filtertxt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        filtertxt.setText("(Filtre os produtos através do campo acima)");

        addtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addtxt.setText("Clique duas vezes em um produto para adicioná-lo à ordem de venda");

        javax.swing.GroupLayout EstoquePanelLayout = new javax.swing.GroupLayout(EstoquePanel);
        EstoquePanel.setLayout(EstoquePanelLayout);
        EstoquePanelLayout.setHorizontalGroup(
            EstoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstoquePanelLayout.createSequentialGroup()
                .addGroup(EstoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstoquePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EstoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EstoqueScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(ProdutoSearchTxtField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(EstoquePanelLayout.createSequentialGroup()
                        .addGroup(EstoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EstoquePanelLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(filtertxt))
                            .addGroup(EstoquePanelLayout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(EstoqueLabel))
                            .addGroup(EstoquePanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(addtxt)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EstoquePanelLayout.setVerticalGroup(
            EstoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstoquePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(EstoqueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProdutoSearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtertxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(EstoqueScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SeparatorOrdensVenda.setForeground(new java.awt.Color(255, 204, 0));

        OrdensVendaLbl.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 48)); // NOI18N
        OrdensVendaLbl.setForeground(new java.awt.Color(255, 204, 51));
        OrdensVendaLbl.setText("Ordem de Venda");

        PedidoPanel.setBackground(new java.awt.Color(255, 255, 255));
        PedidoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 1, true));

        PedidoJTable3.setAutoCreateRowSorter(true);
        PedidoJTable3.setModel(vendaTM);
        PedidoJTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedidoJTable3MouseClicked(evt);
            }
        });
        PedidoScrollPane3.setViewportView(PedidoJTable3);

        OVLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OVLabel.setText("Ordem de Venda");

        removealteratxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removealteratxt.setText("Clique duas vezes em um produto para removê-lo ou alterar a quandidade desejada");

        ClienteCombo.setModel(clientesModel);

        ClienteLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ClienteLabel.setText("Cliente:");

        javax.swing.GroupLayout PedidoPanelLayout = new javax.swing.GroupLayout(PedidoPanel);
        PedidoPanel.setLayout(PedidoPanelLayout);
        PedidoPanelLayout.setHorizontalGroup(
            PedidoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PedidoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PedidoPanelLayout.createSequentialGroup()
                        .addGroup(PedidoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PedidoScrollPane3)
                            .addComponent(ClienteCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidoPanelLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PedidoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidoPanelLayout.createSequentialGroup()
                                .addComponent(OVLabel)
                                .addGap(164, 164, 164))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidoPanelLayout.createSequentialGroup()
                                .addComponent(removealteratxt)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClienteLabel)
                .addGap(238, 238, 238))
        );
        PedidoPanelLayout.setVerticalGroup(
            PedidoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidoPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(OVLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClienteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PedidoScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removealteratxt)
                .addContainerGap())
        );

        TransferImg.setForeground(new java.awt.Color(255, 153, 51));
        TransferImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabacaria/img/horizontal (1).png"))); // NOI18N

        FinalizaOVBtn.setBackground(new java.awt.Color(255, 255, 255));
        FinalizaOVBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FinalizaOVBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabacaria/img/carrinho.png"))); // NOI18N
        FinalizaOVBtn.setText(" Finalizar Ordem de Venda");
        FinalizaOVBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizaOVBtnActionPerformed(evt);
            }
        });

        CancelaOVBtn.setBackground(new java.awt.Color(255, 255, 255));
        CancelaOVBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CancelaOVBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabacaria/img/erro.png"))); // NOI18N
        CancelaOVBtn.setText(" Cancelar Ordem de Venda");
        CancelaOVBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaOVBtnActionPerformed(evt);
            }
        });

        voltarBtn.setText("Voltar");

        javax.swing.GroupLayout OVPanelLayout = new javax.swing.GroupLayout(OVPanel);
        OVPanel.setLayout(OVPanelLayout);
        OVPanelLayout.setHorizontalGroup(
            OVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OVPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeparatorOrdensVenda)
                    .addGroup(OVPanelLayout.createSequentialGroup()
                        .addComponent(EstoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TransferImg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(PedidoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OVPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(CancelaOVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FinalizaOVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(OVPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312)
                .addComponent(OrdensVendaLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OVPanelLayout.setVerticalGroup(
            OVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OVPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrdensVendaLbl)
                    .addComponent(voltarBtn))
                .addGap(20, 20, 20)
                .addComponent(SeparatorOrdensVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(OVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OVPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(OVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EstoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PedidoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(OVPanelLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(TransferImg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinalizaOVBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelaOVBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OVPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OVPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EstoqueJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstoqueJTableMouseClicked

        if (2 == evt.getClickCount()) {

            JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            adicionaAoPedido(row);
        }
    }//GEN-LAST:event_EstoqueJTableMouseClicked

    private void ProdutoSearchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoSearchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutoSearchTxtFieldActionPerformed

    private void ProdutoSearchTxtFieldrefreshFilterProduto(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProdutoSearchTxtFieldrefreshFilterProduto

    }//GEN-LAST:event_ProdutoSearchTxtFieldrefreshFilterProduto

    private void PedidoJTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedidoJTable3MouseClicked
        if (2 == evt.getClickCount()) {

            JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            alteraProdutoPedido(row);
        }
    }//GEN-LAST:event_PedidoJTable3MouseClicked

    private void FinalizaOVBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizaOVBtnActionPerformed
        
        Cliente c = clientes.get(ClienteCombo.getSelectedIndex());
        venda.setCliente(c);
        Calendar cal = Calendar.getInstance();
        venda.setData(new Data(
                cal.get(Calendar.DAY_OF_MONTH)
                , Calendar.MONTH +1
                , Calendar.YEAR
                       
        ));
        
        for(int i =0; i< oldVenda.getLista().size(); i++){ // para cada item presente na antiga lista de vendas
            estoque.incluir(oldVenda.getLista().get(i)); //incluo de volta ao estoque os produtos
            System.out.println("Quantidade de produto inserido");
            System.out.println(oldVenda.getLista().get(i).getQuantidade());
        
        }
        
        caixa.cancelaMovimentacao(oldVenda);
        
        
        for(int i =0; i< venda.getLista().size(); i++){ // para cada item presente na nova lista de vendas
            estoque.vender(venda.getLista().get(i).getProduto().getNome(), venda.getLista().get(i).getQuantidade() ); //vendo os produtos
        
        }
        
        
        caixa.gravaMovimentacao(venda);
        
        estoqueTM.refresh();
        caixaTM.refresh();
        saldo.setText("R$: "+Float.toString(caixa.getSaldo()));
        dispose();
        
        
        
    }//GEN-LAST:event_FinalizaOVBtnActionPerformed

    private void CancelaOVBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaOVBtnActionPerformed
        
        
        if(JOptionPane.showConfirmDialog(null, "Tem que deseja cancelar esta Venda?") == 0){ //se clicar em confirmar
            for(int i =0; i< oldVenda.getLista().size(); i++){ // para cada item presente na antiga lista de vendas
                estoque.incluir(oldVenda.getLista().get(i)); //incluo de volta ao estoque os produtos
        
            }
            caixa.cancelaMovimentacao(oldVenda); //remove a transação
            this.caixaTM.refresh();
            saldo.setText("R$: "+Float.toString(caixa.getSaldo()));
            this.dispose();
        }
        
        
        caixa.cancelaMovimentacao(oldVenda);
    }//GEN-LAST:event_CancelaOVBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaOVBtn;
    private javax.swing.JComboBox<String> ClienteCombo;
    private javax.swing.JLabel ClienteLabel;
    private javax.swing.JTable EstoqueJTable;
    private javax.swing.JLabel EstoqueLabel;
    private javax.swing.JPanel EstoquePanel;
    private javax.swing.JScrollPane EstoqueScrollPane;
    private javax.swing.JButton FinalizaOVBtn;
    private javax.swing.JLabel OVLabel;
    private javax.swing.JPanel OVPanel;
    private javax.swing.JLabel OrdensVendaLbl;
    private javax.swing.JTable PedidoJTable3;
    private javax.swing.JPanel PedidoPanel;
    private javax.swing.JScrollPane PedidoScrollPane3;
    private javax.swing.JTextField ProdutoSearchTxtField;
    private javax.swing.JSeparator SeparatorOrdensVenda;
    private javax.swing.JLabel TransferImg;
    private javax.swing.JLabel addtxt;
    private javax.swing.JLabel filtertxt;
    private javax.swing.JLabel removealteratxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables

    private void adicionaAoPedido(int row) {
        
        AlteracaoQuantidadeVenda ffunc = new AlteracaoQuantidadeVenda(estoque.getItem(row), venda, vendaTM, 0);
        
        
    }

    private void alteraProdutoPedido(int row) {
        AlteracaoQuantidadeVenda ffunc = new AlteracaoQuantidadeVenda(venda.getLista().get(row), venda, vendaTM, 1);
    }
}
