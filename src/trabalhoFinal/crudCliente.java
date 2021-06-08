/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class crudCliente extends javax.swing.JFrame {
    DadosClientes dadosClientes;
    ArrayList<Cliente> clientes;
    String modo;
    
   public crudCliente(DadosClientes clientes){
       initComponents();
       this.dadosClientes = clientes;
       this.clientes = dadosClientes.getClientes();
        modo = "Navegar";
        this.DisplayBtn(modo);
        LoadTable();
   }
    
    public crudCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        telContato = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        estadoCivil = new javax.swing.JTextField();
        profissao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        clienteProprietario = new javax.swing.JCheckBox();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        novo = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        arqBinario = new javax.swing.JButton();
        update = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(714, 500));

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Tel de Contato");

        jLabel4.setText("Email");

        jLabel5.setText("Estado Civil");

        jLabel6.setText("Profissão");

        jLabel7.setText("Sexo / Gênero");

        jLabel9.setText("Rua");

        jLabel10.setText("Número");

        jLabel11.setText("CEP");

        jLabel12.setText("Cidade");

        jLabel13.setText("Bairro");

        clienteProprietario.setText("Cliente proprietario?");
        clienteProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteProprietarioActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        delete.setText("Deletar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        arqBinario.setText("Gerar arquivo binario");

        update.setText("Atualizar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(nome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telContato)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(sexo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(rua, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addComponent(clienteProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cep, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(estadoCivil)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(profissao, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(salvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 60, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(update)
                        .addGap(42, 42, 42)
                        .addComponent(arqBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(cpf)
                    .addComponent(telContato)
                    .addComponent(email)
                    .addComponent(estadoCivil)
                    .addComponent(profissao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(rua)
                    .addComponent(numero)
                    .addComponent(cep)
                    .addComponent(cidade)
                    .addComponent(bairro))
                .addGap(25, 25, 25)
                .addComponent(clienteProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arqBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteProprietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteProprietarioActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        modo = "New";
        DisplayBtn(modo);
    }//GEN-LAST:event_novoActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         int index = table.getSelectedRow();
        if(index >= 0 && index < clientes.size()){
            clientes.remove(index);
        }
        modo = "Navegar";
        DisplayBtn(modo);
        this.LoadTable();
    }//GEN-LAST:event_deleteActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(modo.equals("New")){
        Cliente novo = new Cliente();
        if(!novo.isCPF(cpf.getText()))
            JOptionPane.showMessageDialog(null, "CPF INVALIDO");
        else{
        novo = this.parseFormToObject();
        clientes.add(novo);
        }
        }
         if(modo.equals("Update")){
            int index = table.getSelectedRow();
            Cliente update = this.parseFormToObject();
            clientes.set(index, update);
        }
        this.clearForm();
        LoadTable();
        modo = "Navegar";
        DisplayBtn(modo); 
    }//GEN-LAST:event_salvarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_cancelarActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
       System.out.print(table.getSelectedRow());
        int index = table.getSelectedRow();
        if(index >= 0 && index < clientes.size()){
            var c = this.clientes.get(index);
        modo = "Selection";
        this.fillForm(c);
        DisplayBtn(modo);
        }
    }//GEN-LAST:event_tableMousePressed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        modo = "Update";
        DisplayBtn(modo);
    }//GEN-LAST:event_updateActionPerformed

   private void LoadTable(){
        DefaultTableModel model = new DefaultTableModel(new Object[]{
        "N#","Nome","CPF","Tel Contato","Email","Profissao","Rua", "Numero", "Cidade", "É proprietario?"
        },0);
        if(this.clientes.size() > 0){
            for(Cliente c : clientes){
                Object linha []= new Object[]{clientes.indexOf(c),c.getNome(),c.getCpf(),c.getTelContato(),
                 c.getEmail(),c.getProfissao(),c.endereco.getRua(),c.endereco.getNro(),c.proprietario,
                 c.endereco.getCidade()};
                model.addRow(linha);
            }
        }
      this.table.setModel(model);
    }
   public boolean isCellEditable(int row, int column) {
        return false;
    }
      public void DisplayBtn(String mode){
       switch(mode)
       {
           case "Navegar":
               this.disableForm();
               novo.setEnabled(true);
               salvar.setEnabled(false);
               delete.setEnabled(false);
               update.setEnabled(true);
               break;
           case "New":
               this.enableForm();
               novo.setEnabled(false);
               update.setEnabled(false);
               salvar.setEnabled(true);
               delete.setEnabled(false);
               break;
           case "Update":
               this.enableForm();
               novo.setEnabled(false);
               salvar.setEnabled(true);
               delete.setEnabled(false);
               break;
           case "Delete":
               novo.setEnabled(true);
               salvar.setEnabled(false);
               delete.setEnabled(false);
               break;
           case "Selection":
               this.disableForm();
               novo.setEnabled(true);
               salvar.setEnabled(false);
               delete.setEnabled(true);
               break;
               
           default:System.out.print("Não definido");
       }
   }
     private void clearForm(){
        rua.setText("");
        numero.setText("");
        cep.setText("");
        cidade.setText("");
        bairro.setText("");
        cpf.setText("");
        nome.setText("");
        telContato.setText("");
        email.setText("");
        sexo.setText("");
        estadoCivil.setText("");
        profissao.setText("");
        clienteProprietario.setSelected(false);
    }
    private void disableForm(){
        rua.setEnabled(false);
        numero.setEnabled(false);
        cep.setEnabled(false);
        cidade.setEnabled(false);
        bairro.setEnabled(false);
        cpf.setEnabled(false);
        nome.setEnabled(false);
        telContato.setEnabled(false);
        email.setEnabled(false);
        sexo.setEnabled(false);
        estadoCivil.setEnabled(false);
        profissao.setEnabled(false);
        clienteProprietario.setEnabled(false);
    }
    private void enableForm(){
         rua.setEnabled(true);
        numero.setEnabled(true);
        cep.setEnabled(true);
        cidade.setEnabled(true);
        bairro.setEnabled(true);
        cpf.setEnabled(true);
        nome.setEnabled(true);
        telContato.setEnabled(true);
        email.setEnabled(true);
        sexo.setEnabled(true);
        estadoCivil.setEnabled(true);
        clienteProprietario.setEnabled(true);
        profissao.setEnabled(true);
    }
   private Cliente parseFormToObject(){
        Cliente result = new Cliente();
        result.endereco = new Endereco();
        result.endereco.setRua(rua.getText());
        result.endereco.setNro(Integer.parseInt(numero.getText()));
        result.endereco.setCep(Integer.parseInt(cep.getText()));
        result.endereco.setCidade(cidade.getText());
        result.endereco.setBairro(bairro.getText());
        result.setCpf(cpf.getText());
        result.setNome(nome.getText());
        result.setTelContato(Integer.parseInt(telContato.getText()));
        result.setEmail(email.getText());
        result.setSexo(sexo.getText());
        result.setEstadoCivil(estadoCivil.getText());
        result.setProfissao(profissao.getText());
        result.proprietario = clienteProprietario.isSelected();
        return result;
    }
   private void fillForm(Cliente c){
        rua.setText(c.endereco.getRua());
        numero.setText(String.valueOf(c.endereco.getNro()));
        cep.setText(String.valueOf(c.endereco.getCep()));
        cidade.setText(c.endereco.getCidade());
        bairro.setText(c.endereco.getBairro());
        cpf.setText(c.getCpf());
        nome.setText(c.getNome());
        telContato.setText(c.getNome());
        email.setText(c.getEmail());
        sexo.setText(c.getSexo());
        estadoCivil.setText(c.getEstadoCivil());
        profissao.setText(c.getProfissao());
        clienteProprietario.setSelected(c.proprietario);
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
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arqBinario;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JCheckBox clienteProprietario;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField estadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton novo;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField profissao;
    private javax.swing.JTextField rua;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField sexo;
    private javax.swing.JTable table;
    private javax.swing.JTextField telContato;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
