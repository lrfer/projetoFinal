
package trabalhoFinal;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class crudCasa extends javax.swing.JFrame {
    DadosImoveis dadosImoveis;
    DadosClientes clientes;
    ArrayList<Casa> casas = new ArrayList<Casa>();
     String modo;
    public crudCasa(DadosClientes clientes, DadosImoveis imoveis) {
        initComponents();
        this.dadosImoveis = imoveis;
        this.clientes = clientes;
        casas = this.dadosImoveis.getCasas();
        modo = "Navegar";
        this.DisplayBtn(modo);
        LoadTable();
    }
    
    private crudCasa() {
                initComponents();
                LoadTable();
    }
    
    private void LoadTable(){
        DefaultTableModel model = new DefaultTableModel(new Object[]{
        "N#","Rua", "Numero", "Cep", "Cidade", "Bairro", "Qtd quartos", "Qtd Suites", "Qtd Salas Estar", "Area", "E venda?", "Tem armario", "Descrição",
        "Piscina?", "Condominio?"},0);
        if(this.casas.size() > 0){
            for(Casa c : casas){
                Object linha []= new Object[]{casas.indexOf(c),c.endereco.getRua(),c.endereco.getNro(),
                c.endereco.getCep(),c.endereco.getCidade(),c.endereco.getBairro(),
                c.getQtdQuartos(), c.getQtdSuites(),c.getQtdSalasEstar(),
                c.getArea(),c.isVenda(),c.isArmarioEmbutido(),c.getDescricao(),
                c.isPiscina(),c.getCondominio()};
                model.addRow(linha);
            }
        }
      this.modelo.setModel(model);
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
        jLabel5 = new javax.swing.JLabel();
        qtdQuartos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtdSuites = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        qtdSalasEstar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        isArmarioEmbutido = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo = new javax.swing.JTable();
        novo = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        condominio = new javax.swing.JCheckBox();
        isPiscina = new javax.swing.JCheckBox();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        arquivoBinario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelRua.setText("Rua");

        jLabel1.setText("Numero");

        jLabel2.setText("CEP");

        jLabel3.setText("Cidade");

        jLabel4.setText("Bairro");

        isVenda.setText("É venda? (Se for locação deixar desmarcado)");

        jLabel5.setText("Quantidade de quartos");

        jLabel6.setText("Quantidade Suites");

        jLabel7.setText("Quantidade Salas de estar");

        qtdSalasEstar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdSalasEstarActionPerformed(evt);
            }
        });

        jLabel8.setText("Area");

        isArmarioEmbutido.setText("Tem armario embutido?");
        isArmarioEmbutido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isArmarioEmbutidoActionPerformed(evt);
            }
        });

        jLabel9.setText("Descrição");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        modelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rua", "Numero", "Cep", "Cidade", "Bairro", "Qtd quartos", "Qtd Suites", "Qtd Salas Estar", "Area", "E venda?", "Tem armario", "Descrição", "Pisicina?", "Condominio?"
            }
        ));
        modelo.getTableHeader().setReorderingAllowed(false);
        modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(modelo);

        novo.setText("Novo");
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

        condominio.setText("Condominio?");

        isPiscina.setText("Tem piscina?");

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

        arquivoBinario.setText("Gerar Arquivo binario");
        arquivoBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoBinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(qtdQuartos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelRua))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(qtdSuites, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addContainerGap(436, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(qtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(357, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel4)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isPiscina)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isVenda)
                                    .addComponent(isArmarioEmbutido)
                                    .addComponent(condominio))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(arquivoBinario)))))))
                        .addGap(60, 60, 60))
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
                    .addComponent(CEP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isVenda)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(isArmarioEmbutido)
                        .addGap(18, 18, 18)
                        .addComponent(condominio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isPiscina)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arquivoBinario))
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtdSalasEstarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdSalasEstarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdSalasEstarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
         modo = "New";
        DisplayBtn(modo);
    }//GEN-LAST:event_novoActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        modo = "Update";
        DisplayBtn(modo);
    }//GEN-LAST:event_updateActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
         modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_cancelarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
         if(modo.equals("New")){
        Casa novo = new Casa();
        novo = this.parseFormToObjetct();
        casas.add(novo);
        }
        if(modo.equals("Update")){
            int index = modelo.getSelectedRow();
            casas.get(index);
        }
        this.clearForm();
        LoadTable();
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_salvarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         int index = modelo.getSelectedRow();
        if(index >= 0 && index < casas.size()){
            casas.remove(index);
        }
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_deleteActionPerformed

    private void arquivoBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoBinarioActionPerformed
            if(this.casas.size() > 0)
           this.dadosImoveis.GerarArquivoBinarioCasa(this.casas,"Casas");
        else
           System.out.print("Lista vazia");
    }//GEN-LAST:event_arquivoBinarioActionPerformed

    private void modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMouseClicked
          int index = modelo.getSelectedRow();
        modo = "Selection";
        if(index >= 0 && index < casas.size()){
        DisplayBtn(modo);
        }
    }//GEN-LAST:event_modeloMouseClicked

    private void isArmarioEmbutidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isArmarioEmbutidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isArmarioEmbutidoActionPerformed

        private Casa parseFormToObjetct(){
        Casa result = new Casa();
        result.endereco = new Endereco();
        result.endereco.setRua(rua.getText());
        result.endereco.setNro(Integer.parseInt(numero.getText()));
        result.endereco.setCep(Integer.parseInt(CEP.getText()));
        result.endereco.setCidade(cidade.getText());
        result.endereco.setBairro(bairro.getText());
        result.setArea(area.getText());
        result.setQtdQuartos(Integer.parseInt(qtdQuartos.getText()));
        result.setQtdSalasEstar(Integer.parseInt(qtdSalasEstar.getText()));
        result.setQtdSuites(Integer.parseInt(qtdSuites.getText()));
        result.setVenda(isVenda.isSelected());
        result.setArmarioEmbutido(isArmarioEmbutido.isSelected());
        result.setPiscina(isPiscina.isSelected());
        return result;
    }
    private void clearForm(){
        rua.setText("");
        numero.setText("");
        CEP.setText("");
        cidade.setText("");
        bairro.setText("");
        area.setText("");
        qtdQuartos.setText("");
        qtdSuites.setText("");
        qtdSalasEstar.setText("");
        descricao.setText("");
        isPiscina.setSelected(false);
        condominio.setSelected(false);
        isArmarioEmbutido.setSelected(false);
        isVenda.setSelected(false);
    }
    private void disableForm(){
        rua.setEnabled(false);
        numero.setEnabled(false);
        CEP.setEnabled(false);
        cidade.setEnabled(false);
        bairro.setEnabled(false);
        area.setEnabled(false);
        qtdQuartos.setEnabled(false);
        qtdSuites.setEnabled(false);
        qtdSalasEstar.setEnabled(false);
        descricao.setEnabled(false);
        isPiscina.setEnabled(false);
        condominio.setEnabled(false);
        isArmarioEmbutido.setEnabled(false);
        isVenda.setEnabled(false);
    }
    private void enableForm(){
         rua.setEnabled(true);
        numero.setEnabled(true);
        CEP.setEnabled(true);
        cidade.setEnabled(true);
        bairro.setEnabled(true);
        area.setEnabled(true);
        qtdQuartos.setEnabled(true);
        qtdSuites.setEnabled(true);
        qtdSalasEstar.setEnabled(true);
        descricao.setEnabled(true);
        isPiscina.setEnabled(true);
        condominio.setEnabled(true);
        isArmarioEmbutido.setEnabled(true);
        isVenda.setEnabled(true);
    }
    
     public void DisplayBtn(String mode){
       switch(mode)
       {
           case "Navegar":
               this.disableForm();
               novo.setEnabled(true);
               update.setEnabled(false);
               salvar.setEnabled(false);
               delete.setEnabled(false);
               break;
           case "New":
               this.enableForm();
               novo.setEnabled(false);
               update.setEnabled(false);
               salvar.setEnabled(true);
               delete.setEnabled(false);
               break;
           case "Update":
               novo.setEnabled(false);
               update.setEnabled(false);
               salvar.setEnabled(true);
               delete.setEnabled(false);
               break;
           case "Delete":
               novo.setEnabled(true);
               update.setEnabled(false);
               salvar.setEnabled(false);
               delete.setEnabled(false);
               break;
           case "Selection":
               novo.setEnabled(true);
               update.setEnabled(true);
               salvar.setEnabled(false);
               delete.setEnabled(true);
               break;
               
           default:System.out.print("Não definido");
       }
   }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crudCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudCasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField area;
    private javax.swing.JButton arquivoBinario;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cidade;
    private javax.swing.JCheckBox condominio;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea descricao;
    private javax.swing.JCheckBox isArmarioEmbutido;
    private javax.swing.JCheckBox isPiscina;
    private javax.swing.JCheckBox isVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRua;
    private javax.swing.JTable modelo;
    private javax.swing.JButton novo;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField qtdQuartos;
    private javax.swing.JTextField qtdSalasEstar;
    private javax.swing.JTextField qtdSuites;
    private javax.swing.JTextField rua;
    private javax.swing.JButton salvar;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
