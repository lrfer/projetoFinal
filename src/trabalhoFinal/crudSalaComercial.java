/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lr_fe
 */
public class crudSalaComercial extends javax.swing.JFrame {
    DadosImoveis dadosImoveis;
    DadosClientes clientes;
    ArrayList<SalaComercial> salas = new ArrayList<SalaComercial>();
    String modo;
    public crudSalaComercial(DadosClientes prop, DadosImoveis imoveis) {
        initComponents();
        this.dadosImoveis = imoveis;
        this.clientes = prop;
        this.salas = this.dadosImoveis.getSalasComercial();
        modo = "Navegar";
        this.DisplayBtn(modo);
        this.LoadTable();
    }

    private crudSalaComercial() {
                initComponents();
    }
    
   private void LoadTable(){
        DefaultTableModel model = new DefaultTableModel(new Object[]{
        "N#","Rua", "Numero", "Cep", "Cidade", "Bairro", "Qtd Comodos", "Qtd Banheiros", "Area", "E venda?",
        },0);
        if(this.salas.size() > 0){
            for(SalaComercial c : salas){
                Object linha []= new Object[]{salas.indexOf(c),c.endereco.getRua(),c.endereco.getNro(),
                c.endereco.getCep(),c.endereco.getCidade(),c.endereco.getBairro(),c.getQtdComodos(),
                c.getQtdBanheiros(),c.getArea(),c.isVenda()};
                model.addRow(linha);
            }
        }
      this.modelo.setModel(model);
    }
   
   public void DisplayBtn(String mode){
       switch(mode)
       {
           case "Navegar":
               this.disableForm();
               novo.setEnabled(true);
               update.setEnabled(false);
               save.setEnabled(false);
               delete.setEnabled(false);
               break;
           case "New":
               this.enableForm();
               novo.setEnabled(false);
               update.setEnabled(false);
               save.setEnabled(true);
               delete.setEnabled(false);
               break;
           case "Update":
               novo.setEnabled(false);
               update.setEnabled(false);
               save.setEnabled(true);
               delete.setEnabled(false);
               break;
           case "Delete":
               novo.setEnabled(true);
               update.setEnabled(false);
               save.setEnabled(false);
               delete.setEnabled(false);
               break;
           case "Selection":
               novo.setEnabled(true);
               update.setEnabled(true);
               save.setEnabled(false);
               delete.setEnabled(true);
               break;
               
           default:System.out.print("Não definido");
       }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRua = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CEP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        isVenda = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo = new javax.swing.JTable();
        novo = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtdBanheiros = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        qtdComodos = new javax.swing.JTextField();
        gerarArquivo = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelRua.setText("Rua");

        jLabel1.setText("Numero");

        jLabel2.setText("CEP");

        jLabel3.setText("Cidade");

        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });

        jLabel4.setText("Bairro");

        isVenda.setText("É venda? (Se for locação deixar desmarcado)");

        modelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rua", "Numero", "Cep", "Cidade", "Bairro", "Area", "Qtd Comodos", "Qtd Banheiros"
            }
        ));
        modelo.getTableHeader().setReorderingAllowed(false);
        modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(modelo);
        if (modelo.getColumnModel().getColumnCount() > 0) {
            modelo.getColumnModel().getColumn(4).setResizable(false);
        }

        novo.setLabel("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        update.setText("Atualizar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Deletar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Area");

        jLabel6.setText("Quantidade Banheiros");

        jLabel7.setText("Quantidade Comodos");

        gerarArquivo.setText("Gerar Arquivo binario");
        gerarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarArquivoActionPerformed(evt);
            }
        });

        save.setText("Salvar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelRua)
                                    .addComponent(jLabel5)
                                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(33, 33, 33)
                                                        .addComponent(jLabel4))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(qtdComodos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(187, 187, 187))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gerarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isVenda)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(qtdBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelRua)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CEP)
                        .addComponent(cidade)
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtdBanheiros)
                            .addComponent(qtdComodos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(isVenda)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(cancelar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gerarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        modo = "New";
        DisplayBtn(modo);
    }//GEN-LAST:event_novoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_cancelarActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        modo = "Update";
        DisplayBtn(modo);
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         int index = modelo.getSelectedRow();
        if(index >= 0 && index < salas.size()){
            salas.remove(index);
        }
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(modo.equals("New")){
        SalaComercial novo = new SalaComercial();
        novo = this.parseFormToObjetct();
        salas.add(novo);
        }
        if(modo.equals("Update")){
            int index = modelo.getSelectedRow();
            salas.get(index);
        }
        this.clearForm();
        LoadTable();
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_saveActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMouseClicked
        int index = modelo.getSelectedRow();
        modo = "Selection";
        if(index >= 0 && index < salas.size()){
        DisplayBtn(modo);
        }
    }//GEN-LAST:event_modeloMouseClicked

    private void gerarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarArquivoActionPerformed
        if(this.salas.size() > 0)
            this.dadosImoveis.GerarArquivoBinarioSala(this.salas,"Salas");
        else
           System.out.print("Lista vazia");
    }//GEN-LAST:event_gerarArquivoActionPerformed
    private SalaComercial parseFormToObjetct(){
        SalaComercial result = new SalaComercial();
        result.endereco = new Endereco();
        result.endereco.setRua(rua.getText());
        result.endereco.setNro(Integer.parseInt(numero.getText()));
        result.endereco.setCep(Integer.parseInt(CEP.getText()));
        result.endereco.setCidade(cidade.getText());
        result.endereco.setBairro(bairro.getText());
        result.setArea(area.getText());
        result.setQtdBanheiros(Integer.parseInt(qtdBanheiros.getText()));
        result.setQtdComodos(Integer.parseInt(qtdComodos.getText()));
        result.setVenda(isVenda.isSelected());
        return result;
    }
    private void clearForm(){
        rua.setText("");
        numero.setText("");
        CEP.setText("");
        cidade.setText("");
        bairro.setText("");
        area.setText("");
        qtdBanheiros.setText("");
        qtdComodos.setText("");
        isVenda.setSelected(false);
    }
    private void disableForm(){
        rua.setEnabled(false);
        numero.setEnabled(false);
        CEP.setEnabled(false);
        cidade.setEnabled(false);
        bairro.setEnabled(false);
        area.setEnabled(false);
        qtdBanheiros.setEnabled(false);
        qtdComodos.setEnabled(false);
        isVenda.setEnabled(false);
    }
    private void enableForm(){
         rua.setEnabled(true);
        numero.setEnabled(true);
        CEP.setEnabled(true);
        cidade.setEnabled(true);
        bairro.setEnabled(true);
        area.setEnabled(true);
        qtdBanheiros.setEnabled(true);
        qtdComodos.setEnabled(true);
        isVenda.setEnabled(true);
    }

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
            java.util.logging.Logger.getLogger(crudSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudSalaComercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField area;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cidade;
    private javax.swing.JButton delete;
    private javax.swing.JButton gerarArquivo;
    private javax.swing.JCheckBox isVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRua;
    private javax.swing.JTable modelo;
    private javax.swing.JButton novo;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField qtdBanheiros;
    private javax.swing.JTextField qtdComodos;
    private javax.swing.JTextField rua;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
