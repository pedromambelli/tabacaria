/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria.views;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import tabacaria.models.Funcionario;

/**
 *
 * @author pedro
 */
public class Login extends javax.swing.JPanel {

    private Index index;
    private ArrayList<Funcionario> funcionarios;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    public Login(Index tela, ArrayList<Funcionario> funcionarios) {
        this.index = tela;
        this.funcionarios = funcionarios;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoImg = new javax.swing.JLabel();
        FuncionarioTxt = new javax.swing.JLabel();
        SeparatorFuncionarioForm = new javax.swing.JSeparator();
        CPFLbl = new javax.swing.JLabel();
        CPFTxtField = new javax.swing.JTextField();
        SenhaLbl = new javax.swing.JLabel();
        SenhaField = new javax.swing.JPasswordField();
        CancelaBtn = new javax.swing.JButton();
        LoginBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        LogoImg.setBackground(new java.awt.Color(255, 255, 255));
        LogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabacaria/img/free_horizontal_on_white_by_logaster.png"))); // NOI18N

        FuncionarioTxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        FuncionarioTxt.setForeground(new java.awt.Color(255, 204, 51));
        FuncionarioTxt.setText("Login");

        SeparatorFuncionarioForm.setForeground(new java.awt.Color(255, 204, 0));

        CPFLbl.setText("CPF");

        CPFTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        SenhaLbl.setText("Senha");

        SenhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaFieldActionPerformed(evt);
            }
        });

        CancelaBtn.setText("Cancelar");
        CancelaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaBtnActionPerformed(evt);
            }
        });

        LoginBtn.setText("Entrar");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeparatorFuncionarioForm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CPFTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(LogoImg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(FuncionarioTxt)))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(CPFLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SenhaField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(SenhaLbl)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FuncionarioTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorFuncionarioForm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(CPFLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaFieldActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        int flag = 0;
        for(int i =0 ; i < funcionarios.size(); i++) {// para cada funcionario
            Funcionario f = funcionarios.get(i);
            if(Long.parseLong(CPFTxtField.getText()) == f.getCPF())
                if(String.valueOf(SenhaField.getPassword()).equals(f.getSenha())){
                    
                    flag =1;
                    entrar(f);
                    this.setVisible(false);
                }
                    
        
        }
        
        if(flag == 0){
            JOptionPane.showMessageDialog(null,
                "Dados incorretos, tente novamente");

            CPFTxtField.setText("");
            SenhaField.setText("");
            CPFTxtField.requestFocus();
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void CancelaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelaBtnActionPerformed

    public  void entrar(Funcionario func){
        JFrame janelaPrincipal = new JFrame("Tabacaria");
        janelaPrincipal.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janelaPrincipal.setSize(950,730);
        janelaPrincipal.setResizable(false);
        janelaPrincipal.setLocationRelativeTo(null);
        index.setFuncLogado(func);
        janelaPrincipal.add(index);
        janelaPrincipal.setVisible(true);
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFLbl;
    private javax.swing.JTextField CPFTxtField;
    private javax.swing.JButton CancelaBtn;
    private javax.swing.JLabel FuncionarioTxt;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel LogoImg;
    private javax.swing.JPasswordField SenhaField;
    private javax.swing.JLabel SenhaLbl;
    private javax.swing.JSeparator SeparatorFuncionarioForm;
    // End of variables declaration//GEN-END:variables
}