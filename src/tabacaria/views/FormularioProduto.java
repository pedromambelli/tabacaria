/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.views;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tabacaria.models.Categoria;
import tabacaria.models.Estoque;
import tabacaria.models.EstoqueTableModel;
import tabacaria.models.Item;
import tabacaria.models.Produto;

/**
 *
 * @author pedro
 */
public class FormularioProduto extends javax.swing.JFrame {

    private Item item;
    private Estoque estoque;
    private EstoqueTableModel estoqueTM;
    private int flag;
    private String oldName;
    private String[] nomesCategorias;
    private DefaultComboBoxModel categoriasModel;
    private ArrayList<Categoria> categorias;
    
    public FormularioProduto() {
        initComponents();
    }

    FormularioProduto(Item i, Estoque e, EstoqueTableModel etm, ArrayList<Categoria> categorias, int flag) { //flag diz se é pra adicionar ou atualizar
        this.item = i;
        this.estoque = e;
        this.estoqueTM = etm;
        this.flag = flag;
        this.setDefaultCloseOperation( JFrame.HIDE_ON_CLOSE );
        this.setSize(360, 295);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.oldName = i.getProduto().getNome();
        
        
        this.categorias = categorias;
        this.nomesCategorias = new String[categorias.size()];
        
        
        for(int j = 0; j<categorias.size(); j++){
            nomesCategorias[j] = categorias.get(j).getNome();
        }
        
        this.categoriasModel = new DefaultComboBoxModel(nomesCategorias);
        
        initComponents();
        
        if(flag == 1){ //se for para alterar
            NomeTxtField.setText(i.getProduto().getNome());
            PCusto.setValue(i.getProduto().getpCompra());
            PVenda.setValue(i.getProduto().getpVenda());
            Quantidade.setValue(i.getQuantidade());
            
            for (int j =0; j < nomesCategorias.length; j++){
                if(nomesCategorias[j].equals(item.getProduto().getCategoria().getNome()))
                    CategoriaCombo.setSelectedIndex(j);
            }
        }
        Quantidade.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormProdutoPanel = new javax.swing.JPanel();
        NomeTxtField = new javax.swing.JTextField();
        NomeLbl = new javax.swing.JLabel();
        ProdutoTxt = new javax.swing.JLabel();
        CategoriaLbl = new javax.swing.JLabel();
        CategoriaCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        PCustoLbl = new javax.swing.JLabel();
        QuantidadeLbl = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        CancelaBtn = new javax.swing.JButton();
        PVendaLbl = new javax.swing.JLabel();
        PCusto = new javax.swing.JSpinner();
        PVenda = new javax.swing.JSpinner();
        Quantidade = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(354, 274));

        FormProdutoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FormProdutoPanel.setMinimumSize(new java.awt.Dimension(354, 274));
        FormProdutoPanel.setPreferredSize(new java.awt.Dimension(354, 274));

        NomeTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        NomeLbl.setText("Nome");

        ProdutoTxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        ProdutoTxt.setForeground(new java.awt.Color(255, 204, 51));
        ProdutoTxt.setText("Produto");

        CategoriaLbl.setText("Categoria");

        CategoriaCombo.setModel(categoriasModel);
        CategoriaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaComboActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));

        PCustoLbl.setText("Preço de Custo");

        QuantidadeLbl.setText("Quantidade");

        SaveBtn.setText("Salvar");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        CancelaBtn.setText("Cancelar");
        CancelaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaBtnActionPerformed(evt);
            }
        });

        PVendaLbl.setText("Preço de Venda");

        PCusto.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.01f));
        PCusto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PVenda.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.01f));
        PVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Quantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout FormProdutoPanelLayout = new javax.swing.GroupLayout(FormProdutoPanel);
        FormProdutoPanel.setLayout(FormProdutoPanelLayout);
        FormProdutoPanelLayout.setHorizontalGroup(
            FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                .addGroup(FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(CancelaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NomeTxtField))
                    .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CategoriaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormProdutoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PCusto)
                            .addComponent(PCustoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGroup(FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(CategoriaLbl)
                                    .addComponent(PVendaLbl)
                                    .addComponent(NomeLbl)
                                    .addComponent(ProdutoTxt))
                                .addGap(40, 40, 40)
                                .addComponent(QuantidadeLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(PVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        FormProdutoPanelLayout.setVerticalGroup(
            FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormProdutoPanelLayout.createSequentialGroup()
                .addComponent(ProdutoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeLbl)
                .addGap(4, 4, 4)
                .addComponent(NomeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoriaLbl)
                .addGap(10, 10, 10)
                .addComponent(CategoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCustoLbl)
                    .addComponent(PVendaLbl)
                    .addComponent(QuantidadeLbl))
                .addGap(9, 9, 9)
                .addGroup(FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormProdutoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FormProdutoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoriaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaComboActionPerformed

    private void CancelaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaBtnActionPerformed
        dispose();
    }//GEN-LAST:event_CancelaBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
        Produto p;
        p = new Produto(NomeTxtField.getText(), categorias.get(CategoriaCombo.getSelectedIndex()).getDescricao()
                , (Float)(PCusto.getValue()), (Float) PVenda.getValue(), categorias.get(CategoriaCombo.getSelectedIndex()));
        Item i = new Item(p, (Integer) Quantidade.getValue());
        
        if(flag == 1) estoque.remover(oldName); //se a flag for 1  remove o produto antes de reinseri-lo com os dados adequados
        this.estoque.incluir(i);
        this.estoqueTM.refresh();
        dispose();
    }//GEN-LAST:event_SaveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaBtn;
    private javax.swing.JComboBox<String> CategoriaCombo;
    private javax.swing.JLabel CategoriaLbl;
    private javax.swing.JPanel FormProdutoPanel;
    private javax.swing.JLabel NomeLbl;
    private javax.swing.JTextField NomeTxtField;
    private javax.swing.JSpinner PCusto;
    private javax.swing.JLabel PCustoLbl;
    private javax.swing.JSpinner PVenda;
    private javax.swing.JLabel PVendaLbl;
    private javax.swing.JLabel ProdutoTxt;
    private javax.swing.JSpinner Quantidade;
    private javax.swing.JLabel QuantidadeLbl;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
