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
public class crudTerreno extends javax.swing.JFrame {
    DadosImoveis dadosImoveis;
    DadosClientes clientes;
    ArrayList<Terreno> terrenos = new ArrayList<Terreno>();
    String modo;
    public crudTerreno(DadosClientes prop, DadosImoveis imoveis) {
        initComponents();
        this.dadosImoveis = imoveis;
        this.clientes = prop;
        modo = "Navegar";
        this.DisplayBtn(modo);
        this.LoadTable();
    }

    private crudTerreno() {
                initComponents();
    }
    
        private void LoadTable(){
        DefaultTableModel model = new DefaultTableModel(new Object[]{
        "N#","Rua", "Numero", "Cep", "Cidade", "Bairro", "Aclive", "Declive",  "Area", "E venda?", "Largura","Comprimento",
        },0);
        if(this.terrenos.size() > 0){
            for(Terreno c : terrenos){
                Object linha []= new Object[]{terrenos.indexOf(c),c.endereco.getRua(),c.endereco.getNro(),
                c.endereco.getCep(),c.endereco.getCidade(),c.endereco.getBairro(),
                c.isAclive(), c.isDeclive(),c.isVenda(),
                c.getArea(),c.getLargura(),c.getComprimento()};
                model.addRow(linha);
            }
        }
      this.modelo.setModel(model);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ruaLabel = new javax.swing.JLabel();
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
        largura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comprimento = new javax.swing.JTextField();
        aclive = new javax.swing.JCheckBox();
        declive = new javax.swing.JCheckBox();
        gerarArquivoBinario = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ruaLabel.setText("Rua");

        jLabel1.setText("Numero");

        jLabel2.setText("CEP");

        jLabel3.setText("Cidade");

        jLabel4.setText("Bairro");

        isVenda.setText("É venda? (Se for locação deixar desmarcado)");
        isVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isVendaActionPerformed(evt);
            }
        });

        modelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rua", "Numero", "Cep", "Cidade", "Bairro", "Aclive", "Declive", "Area", "Largura", "Comprimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        modelo.getTableHeader().setReorderingAllowed(false);
        modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeloMouseClicked(evt);
            }
        });
        modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modeloKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(modelo);
        if (modelo.getColumnModel().getColumnCount() > 0) {
            modelo.getColumnModel().getColumn(4).setResizable(false);
        }

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

        jLabel5.setText("Area");

        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });

        jLabel6.setText("Largura");

        jLabel7.setText("Comprimento");

        aclive.setText("Aclive?");

        declive.setText("Declive?");

        gerarArquivoBinario.setText("Gerar Arquivo Binario");
        gerarArquivoBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarArquivoBinarioActionPerformed(evt);
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
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ruaLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel6))
                                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2)))
                                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(41, 41, 41)
                                                        .addComponent(cancelar)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(gerarArquivoBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(isVenda)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(largura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(aclive)
                            .addComponent(declive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ruaLabel)
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(area)
                    .addComponent(largura)
                    .addComponent(comprimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isVenda)
                .addGap(18, 18, 18)
                .addComponent(aclive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(declive)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelar)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gerarArquivoBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isVendaActionPerformed

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        modo = "New";
        DisplayBtn(modo);
    }//GEN-LAST:event_novoActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        modo = "Update";
        DisplayBtn(modo);
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int index = modelo.getSelectedRow();
        if(index >= 0 && index < terrenos.size()){
            terrenos.remove(index);
        }
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_deleteActionPerformed

    private void gerarArquivoBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarArquivoBinarioActionPerformed
                if(this.terrenos.size() > 0)
            this.dadosImoveis.GerarArquivoBinarioTerreno(this.terrenos,"Terrenos");
        else
           System.out.print("Lista vazia");
    }//GEN-LAST:event_gerarArquivoBinarioActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_cancelarActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
           if(modo.equals("New")){
        Terreno novo = new Terreno();
        novo = this.parseFormToObjetct();
        terrenos.add(novo);
        }
        if(modo.equals("Update")){
            int index = modelo.getSelectedRow();
            terrenos.get(index);
        }
        this.clearForm();
        LoadTable();
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_saveActionPerformed

    private void modeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloKeyPressed

    private void modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMouseClicked
         int index = modelo.getSelectedRow();
        modo = "Selection";
        if(index >= 0 && index < terrenos.size()){
        DisplayBtn(modo);
        }
    }//GEN-LAST:event_modeloMouseClicked

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
     
         private Terreno parseFormToObjetct(){
        Terreno result = new Terreno();
        result.endereco = new Endereco();
        result.endereco.setRua(ruaLabel.getText());
        result.endereco.setNro(Integer.parseInt(numero.getText()));
        result.endereco.setCep(Integer.parseInt(CEP.getText()));
        result.endereco.setCidade(cidade.getText());
        result.endereco.setBairro(bairro.getText());
        result.setArea(area.getText());
        result.setLargura(largura.getText());
        result.setComprimento(comprimento.getText());
        result.setVenda(isVenda.isSelected());
        result.setAclive(aclive.isSelected());
        result.setDeclive(declive.isSelected());
        return result;
    }
    private void clearForm(){
        rua.setText("");
        numero.setText("");
        CEP.setText("");
        cidade.setText("");
        bairro.setText("");
        area.setText("");
        largura.setText("");
        comprimento.setText("");
        isVenda.setSelected(false);
        aclive.setSelected(false);
        declive.setSelected(false);
    }
    private void disableForm(){
        rua.setEnabled(false);
        numero.setEnabled(false);
        CEP.setEnabled(false);
        cidade.setEnabled(false);
        bairro.setEnabled(false);
        area.setEnabled(false);
        comprimento.setEnabled(false);
        largura.setEnabled(false);
        isVenda.setEnabled(false);
        aclive.setEnabled(false);
        declive.setEnabled(false);
    }
    private void enableForm(){
         rua.setEnabled(true);
        numero.setEnabled(true);
        CEP.setEnabled(true);
        cidade.setEnabled(true);
        bairro.setEnabled(true);
        area.setEnabled(true);
        comprimento.setEnabled(true);
        largura.setEnabled(true);
        isVenda.setEnabled(true);
        aclive.setEnabled(true);
        declive.setEnabled(true);
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
            java.util.logging.Logger.getLogger(crudTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudTerreno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JCheckBox aclive;
    private javax.swing.JTextField area;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField comprimento;
    private javax.swing.JCheckBox declive;
    private javax.swing.JButton delete;
    private javax.swing.JButton gerarArquivoBinario;
    private javax.swing.JCheckBox isVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField largura;
    private javax.swing.JTable modelo;
    private javax.swing.JButton novo;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rua;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
