/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.views;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tabacaria.models.Fornecedor;
import tabacaria.models.FornecedorTableModel;

/**
 *
 * @author pedro
 */
public class FormularioFornecedor extends javax.swing.JFrame {

    private Fornecedor fornecedor;
    ArrayList<Fornecedor> fornecedors;
    FornecedorTableModel fornecedorTM;
    private int flag;
    private String oldName;
    public FormularioFornecedor() {
        initComponents();
    }

    FormularioFornecedor(Fornecedor f, ArrayList<Fornecedor> fornecedors, FornecedorTableModel ctm, int flag) { //flag diz se é pra adicionar ou atualizar
        this.fornecedor = f;
        this.fornecedors = fornecedors;
        this.fornecedorTM = ctm;
        this.flag = flag;
        this.setDefaultCloseOperation( JFrame.HIDE_ON_CLOSE );
        this.setSize(360, 295);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.oldName = f.getNome();
        
        initComponents();
        
        if(flag == 1){ //se for para alterar
            NomeTxtField.setText(f.getNome());
            CNPJTxtField.setText(String.valueOf(f.getCNPJ()));
            TelefoneTxtField.setText(String.valueOf(f.getTelefone()));
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

        CategoriaCombo = new javax.swing.JComboBox<>();
        FormFornecedorPanel = new javax.swing.JPanel();
        NomeTxtField = new javax.swing.JTextField();
        NomeLbl = new javax.swing.JLabel();
        FornecedorTxt = new javax.swing.JLabel();
        CNPJLbl = new javax.swing.JLabel();
        SeparatorFuncionarioForm = new javax.swing.JSeparator();
        SaveBtn = new javax.swing.JButton();
        CancelaBtn = new javax.swing.JButton();
        ExcluirBtn = new javax.swing.JButton();
        CNPJTxtField = new javax.swing.JTextField();
        TelefoneLbl = new javax.swing.JLabel();
        TelefoneTxtField = new javax.swing.JTextField();

        CategoriaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria Teste" }));
        CategoriaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaComboActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(354, 274));

        FormFornecedorPanel.setBackground(new java.awt.Color(255, 255, 255));
        FormFornecedorPanel.setMinimumSize(new java.awt.Dimension(354, 274));
        FormFornecedorPanel.setPreferredSize(new java.awt.Dimension(354, 274));

        NomeTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        NomeLbl.setText("Nome");

        FornecedorTxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        FornecedorTxt.setForeground(new java.awt.Color(255, 204, 51));
        FornecedorTxt.setText("Fornecedor");

        CNPJLbl.setText("CNPJ");

        SeparatorFuncionarioForm.setForeground(new java.awt.Color(255, 204, 0));

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

        ExcluirBtn.setText("Excluir");
        ExcluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBtnActionPerformed(evt);
            }
        });

        CNPJTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        TelefoneLbl.setText("Telefone");

        TelefoneTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout FormFornecedorPanelLayout = new javax.swing.GroupLayout(FormFornecedorPanel);
        FormFornecedorPanel.setLayout(FormFornecedorPanelLayout);
        FormFornecedorPanelLayout.setHorizontalGroup(
            FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFornecedorPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFornecedorPanelLayout.createSequentialGroup()
                        .addComponent(NomeLbl)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFornecedorPanelLayout.createSequentialGroup()
                        .addComponent(CNPJLbl)
                        .addGap(161, 161, 161))))
            .addGroup(FormFornecedorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormFornecedorPanelLayout.createSequentialGroup()
                        .addGroup(FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomeTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeparatorFuncionarioForm)
                            .addComponent(CNPJTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormFornecedorPanelLayout.createSequentialGroup()
                                .addGroup(FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CancelaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FormFornecedorPanelLayout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(ExcluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormFornecedorPanelLayout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFornecedorPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FornecedorTxt)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFornecedorPanelLayout.createSequentialGroup()
                        .addGroup(FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFornecedorPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TelefoneLbl)
                                .addGap(136, 136, 136))
                            .addComponent(TelefoneTxtField))
                        .addContainerGap())))
        );
        FormFornecedorPanelLayout.setVerticalGroup(
            FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormFornecedorPanelLayout.createSequentialGroup()
                .addComponent(FornecedorTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorFuncionarioForm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeLbl)
                .addGap(4, 4, 4)
                .addComponent(NomeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(CNPJLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CNPJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelefoneLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelefoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FormFornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormFornecedorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormFornecedorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaBtnActionPerformed
        dispose();
    }//GEN-LAST:event_CancelaBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
        Fornecedor f;
        f = new Fornecedor(NomeTxtField.getText(),Long.parseLong(CNPJTxtField.getText()), Long.parseLong(TelefoneTxtField.getText()) );

        
        if(flag == 1){//se a flag for 1  remove o fornecedor antes de reinseri-lo com os dados adequados
            for(int i = 0; i < this.fornecedors.size(); i++){
                if(fornecedors.get(i).getNome().toUpperCase().equals(oldName.toUpperCase())){ //se houver fornecedor com nome igual
                    fornecedors.remove(i);
                 }    
            }
        } 
        this.fornecedors.add(f);
        this.fornecedorTM.refresh();
        dispose();
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ExcluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBtnActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Tem que deseja excluir este fornecedor?") == 0){ //se clicar em confirmar
            for(int i = 0; i < this.fornecedors.size(); i++){
                if(fornecedors.get(i).getNome().toUpperCase().equals(oldName.toUpperCase())){ //se houver fornecedor com nome igual
                    fornecedors.remove(i);
                 }    
            }
            this.fornecedorTM.refresh();
            this.dispose();
        }
        
    }//GEN-LAST:event_ExcluirBtnActionPerformed

    private void CategoriaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaComboActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormularioFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CNPJLbl;
    private javax.swing.JTextField CNPJTxtField;
    private javax.swing.JButton CancelaBtn;
    private javax.swing.JComboBox<String> CategoriaCombo;
    private javax.swing.JButton ExcluirBtn;
    private javax.swing.JPanel FormFornecedorPanel;
    private javax.swing.JLabel FornecedorTxt;
    private javax.swing.JLabel NomeLbl;
    private javax.swing.JTextField NomeTxtField;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JSeparator SeparatorFuncionarioForm;
    private javax.swing.JLabel TelefoneLbl;
    private javax.swing.JTextField TelefoneTxtField;
    // End of variables declaration//GEN-END:variables
}
