package trabalhoFinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class telaPrincipal extends javax.swing.JFrame {
    private DadosImoveis dadosImoveis;
    private DadosClientes dadosClientes;
    private DadosCorretor dadosCorretor ;
    private DadosFuncionarios dadosFuncionario ;
    private DadosFormaPagamento dadosFormaPagamento;
    private DadosTransacao dadosTransacao;
    private DadosLogin dadosLogin;
    public telaPrincipal() {
        initComponents();
        this.Check();
    }
    public telaPrincipal(DadosImoveis dadosImoveis,DadosClientes dadosClientes,DadosCorretor dadosCorretor,
            DadosFuncionarios dadosFuncionario, DadosFormaPagamento dadosFormaPagamento,
       DadosTransacao dadosTransacao, DadosLogin dadosLogin ){
        initComponents();
        this.dadosImoveis = dadosImoveis;
        this.dadosClientes = dadosClientes;
        this.dadosCorretor = dadosCorretor;
        this.dadosFuncionario = dadosFuncionario;
       this.dadosFormaPagamento = dadosFormaPagamento;
       this.dadosTransacao = dadosTransacao;
       this.dadosLogin = dadosLogin; 
        this.Check();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImoveis = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        crudTransacao = new javax.swing.JButton();
        Deslogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho Final");

        btnImoveis.setText("Imoveis");
        btnImoveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImoveisMouseClicked(evt);
            }
        });

        btnFuncionarios.setText("Funcionarios");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnClientes.setText("Cliente");
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });

        crudTransacao.setText("Fazer Transacao");
        crudTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudTransacaoActionPerformed(evt);
            }
        });

        Deslogar.setText("Deslogar");
        Deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeslogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnImoveis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crudTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Deslogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImoveis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crudTransacao, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Deslogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImoveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImoveisMouseClicked
        telaImoveis imoveis = new telaImoveis(this.dadosImoveis, this.dadosClientes);
        imoveis.setVisible(true);
    }//GEN-LAST:event_btnImoveisMouseClicked

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
                final JOptionPane optionPane = new JOptionPane(""
                + "Para modificar dados é só modificar na tabela"
               + "Para gerar arquivos tem que mudar a localização no codigo"
                + "Caso ao contrario ira dar erro Access denied",JOptionPane.QUESTION_MESSAGE,
    JOptionPane.YES_NO_OPTION);
        optionPane.setVisible(true);
        telaClientes clientes = new telaClientes(this.dadosClientes);
        clientes.setVisible(true);
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        telaFuncionario func = new telaFuncionario(this.dadosFuncionario,this.dadosCorretor);
        func.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void crudTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudTransacaoActionPerformed
        telaTransancao tran = new telaTransancao(this.dadosFormaPagamento,this.dadosTransacao,
        this.dadosCorretor,this.dadosImoveis,this.dadosClientes);
        tran.setVisible(true);
    }//GEN-LAST:event_crudTransacaoActionPerformed

    private void DeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeslogarActionPerformed
        telaLogin login = new telaLogin(dadosImoveis, dadosClientes, dadosCorretor, dadosFuncionario, dadosFormaPagamento, 
        dadosTransacao, dadosLogin,true);
        login.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_DeslogarActionPerformed
private void Check(){
    if(this.dadosImoveis == null)
        this.dadosImoveis =  new DadosImoveis();
    if(this.dadosClientes == null)
        this.dadosClientes= new DadosClientes();
    if(this.dadosCorretor == null)
        this.dadosCorretor = new DadosCorretor();
    if(this.dadosFuncionario == null)
        this.dadosFuncionario = new DadosFuncionarios();
    if(this.dadosFormaPagamento == null)
        this.dadosFormaPagamento = new DadosFormaPagamento();
    if( this.dadosTransacao == null)
        this.dadosTransacao = new DadosTransacao();
}
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deslogar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnImoveis;
    private javax.swing.JButton crudTransacao;
    // End of variables declaration//GEN-END:variables

}
