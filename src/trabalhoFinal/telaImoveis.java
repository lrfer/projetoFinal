/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal;

public class telaImoveis extends javax.swing.JFrame {

    DadosImoveis dadosImoveis;
    DadosClientes clientesProprietarios;

    public telaImoveis(DadosImoveis imoveis, DadosClientes prop) {
        initComponents();
        this.dadosImoveis = imoveis;
        this.clientesProprietarios = prop;
    }
    
    public telaImoveis()
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btnCasa = new javax.swing.JButton();
        btnTerreno = new javax.swing.JButton();
        btnSalaComercial = new javax.swing.JButton();
        btnApartamento = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Imoveis");

        btnCasa.setText("Casa");
        btnCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCasaMouseClicked(evt);
            }
        });
        btnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasaActionPerformed(evt);
            }
        });

        btnTerreno.setText("Terreno");
        btnTerreno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTerrenoMouseClicked(evt);
            }
        });
        btnTerreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerrenoActionPerformed(evt);
            }
        });

        btnSalaComercial.setText("Sala comercial");
        btnSalaComercial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalaComercialMouseClicked(evt);
            }
        });

        btnApartamento.setText("Apartamento");
        btnApartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApartamentoMouseClicked(evt);
            }
        });
        btnApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(btnTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApartamentoActionPerformed

    private void btnTerrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerrenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerrenoActionPerformed

    private void btnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasaActionPerformed

    private void btnCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCasaMouseClicked
        crudCasa cadastro = new crudCasa(this.clientesProprietarios,this.dadosImoveis);
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnCasaMouseClicked

    private void btnApartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartamentoMouseClicked
        crudApartamento cadastro = new crudApartamento(this.clientesProprietarios,this.dadosImoveis);
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnApartamentoMouseClicked

    private void btnTerrenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerrenoMouseClicked
        crudTerreno cadastro = new crudTerreno(this.clientesProprietarios,this.dadosImoveis);
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnTerrenoMouseClicked

    private void btnSalaComercialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalaComercialMouseClicked
        crudSalaComercial cadastro = new crudSalaComercial(this.clientesProprietarios,this.dadosImoveis);
        cadastro.setVisible(true);        
    }//GEN-LAST:event_btnSalaComercialMouseClicked

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
            java.util.logging.Logger.getLogger(telaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaImoveis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartamento;
    private javax.swing.JButton btnCasa;
    private javax.swing.JButton btnSalaComercial;
    private javax.swing.JButton btnTerreno;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}
