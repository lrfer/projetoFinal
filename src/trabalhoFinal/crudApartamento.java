/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class crudApartamento extends javax.swing.JFrame {
    Apartamento apartamento = new Apartamento();
    DadosImoveis dadosImoveis;
    DadosClientes clientes;
    ArrayList<Apartamento> aps = new ArrayList<Apartamento>();
    String modo;
    public crudApartamento(DadosClientes prop, DadosImoveis imoveis) {
        initComponents();
        this.dadosImoveis = imoveis;
        this.clientes= prop;
        this.aps = this.dadosImoveis.getApartamentos();
         modo = "Navegar";
        this.DisplayBtn(modo);
        LoadTable();
        
    }
    public crudApartamento(){
        initComponents();
    }
    
    private void LoadTable(){
        DefaultTableModel model = new DefaultTableModel(new Object[]{
        "N#","Rua", "Numero", "Cep", "Cidade", "Bairro", "Qtd quartos", "Qtd Suites", "Qtd Salas Estar", "Area", "E venda?", "Tem armario", "Descrição",
        "Portaria 24hs?", "Valor condomino","Andar"},0);
        if(this.aps.size() > 0){
            for(Apartamento c : aps){
                Object linha [] = new Object[]{aps.indexOf(c),c.endereco.getRua(),c.endereco.getNro(),
                c.endereco.getCep(),c.endereco.getCidade(),c.endereco.getBairro(),
                c.getQtdQuartos(), c.getQtdSuites(),c.getQtdSalasEstar(),
                c.getArea(),c.isVenda(),c.isArmarioEmbutido(),c.getDescricao(),
                c.isPortaria24hs(),c.getValorCondominio(),c.getAndar()};
                model.addRow(linha);
            }
        }
        this.modelo.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Labelrua = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        andar = new javax.swing.JTextField();
        portaria24 = new javax.swing.JCheckBox();
        textValor = new javax.swing.JLabel();
        valorCondominio = new javax.swing.JTextField();
        arqBinario = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD Apartamento");

        Labelrua.setText("Rua");

        jLabel1.setText("Numero");

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });
        numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numeroKeyPressed(evt);
            }
        });

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

        jLabel9.setText("Descrição");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        modelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rua", "Numero", "Cep", "Cidade", "Bairro", "Qtd quartos", "Qtd Suites", "Qtd Salas Estar", "Area", "E venda?", "Tem armario", "Descrição", "Portaria 24hs?", "Valor condomino", "Andar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        modelo.getTableHeader().setReorderingAllowed(false);
        modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modeloMousePressed(evt);
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

        jLabel10.setText("Andar");

        andar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andarActionPerformed(evt);
            }
        });

        portaria24.setText("Portaria 24hs?");

        textValor.setText("Valor condomnio(Ex: R$ 400,25)");

        arqBinario.setText("Gerar arquivo binario");
        arqBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arqBinarioActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        save.setText("Salvar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isVenda)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portaria24)
                            .addComponent(isArmarioEmbutido))
                        .addGap(299, 299, 299)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(andar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(qtdQuartos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(qtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(qtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Labelrua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelar)
                            .addComponent(save)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(novo)
                        .addGap(32, 32, 32)
                        .addComponent(update)
                        .addGap(36, 36, 36)
                        .addComponent(delete)
                        .addGap(31, 31, 31)
                        .addComponent(arqBinario))
                    .addComponent(jScrollPane2))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelrua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(rua, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(numero)
                    .addComponent(CEP)
                    .addComponent(cidade)
                    .addComponent(bairro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isVenda)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(isArmarioEmbutido)
                        .addGap(7, 7, 7)
                        .addComponent(portaria24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arqBinario)
                            .addComponent(novo)
                            .addComponent(delete)
                            .addComponent(update)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(save)
                                .addGap(18, 18, 18)
                                .addComponent(cancelar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtdSalasEstarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdSalasEstarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdSalasEstarActionPerformed

    private void andarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andarActionPerformed

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
        if(index >= 0 && index < aps.size()){
            aps.remove(index);
        }
        modo = "Navegar";
        DisplayBtn(modo);
        this.LoadTable();
    }//GEN-LAST:event_deleteActionPerformed

    private void arqBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arqBinarioActionPerformed
          if(this.aps.size() > 0)
           this.dadosImoveis.GerarArquivoBinarioApartamento(this.aps,"Aps");
        else
           System.out.print("Lista vazia");
    }//GEN-LAST:event_arqBinarioActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_cancelarActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(modo.equals("New")){
            try{
        Apartamento novo = new Apartamento();
        novo = this.parseFormToObject();
        aps.add(novo);
            }
            catch(Exception ex)
            {
            JOptionPane.showMessageDialog(null, "Há algum campo invalido");
            }
        }
        if(modo.equals("Update")){
            int index = modelo.getSelectedRow();
             Apartamento update = new Apartamento();
             update = this.parseFormToObject();
            aps.set(index,update);
        }
        this.clearForm();
        LoadTable();
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_saveActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyPressed
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_numeroKeyPressed

    private void modeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMousePressed
        int index = modelo.getSelectedRow();
        if(index >= 0 && index < aps.size()){
        var c = this.aps.get(index);
        this.clearForm();
        this.fillForm(c);
        modo = "Selection";
        DisplayBtn(modo);
        }
    }//GEN-LAST:event_modeloMousePressed
        private Apartamento parseFormToObject(){
        Apartamento result = new Apartamento();
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
        result.setAndar(Integer.parseInt(andar.getText()));
        result.setValorCondominio(valorCondominio.getText());
        result.setArmarioEmbutido(isArmarioEmbutido.isSelected());
        result.setPortaria24hs(portaria24.isSelected());
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
        andar.setText("");
        valorCondominio.setText("");
        portaria24.setSelected(false);
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
        andar.setEnabled(false);
        valorCondominio.setEnabled(false);
        portaria24.setEnabled(false);
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
        andar.setEnabled(true);
        valorCondominio.setEnabled(true);
        portaria24.setEnabled(true);
        isArmarioEmbutido.setEnabled(true);
        isVenda.setEnabled(true);
    }
    private void fillForm(Apartamento ap){
        rua.setText(ap.endereco.getRua());
        numero.setText(String.valueOf(ap.endereco.getNro()));
        CEP.setText(String.valueOf(ap.endereco.getCep()));
        cidade.setText(ap.endereco.getCidade());
        bairro.setText(ap.endereco.getBairro());;
        area.setText(ap.getArea());
        qtdQuartos.setText(String.valueOf(ap.getQtdQuartos()));
        qtdSuites.setText(String.valueOf(ap.getQtdSuites()));
        qtdSalasEstar.setText(String.valueOf(ap.getQtdSalasEstar()));
        descricao.setText(ap.getDescricao());
        andar.setText(String.valueOf(ap.getAndar()));
        valorCondominio.setText(ap.getValorCondominio());
        portaria24.setSelected(ap.isPortaria24hs());
        isArmarioEmbutido.setSelected(ap.isArmarioEmbutido());
        isVenda.setSelected(ap.isVenda());
    }
    public void DisplayBtn(String mode){
       switch(mode)
       {
           case "Navegar":
               this.disableForm();
               this.clearForm();
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
               this.enableForm();
               novo.setEnabled(false);
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

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crudApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudApartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JLabel Labelrua;
    private javax.swing.JTextField andar;
    private javax.swing.JTextField area;
    private javax.swing.JButton arqBinario;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cidade;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea descricao;
    private javax.swing.JCheckBox isArmarioEmbutido;
    private javax.swing.JCheckBox isVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable modelo;
    private javax.swing.JButton novo;
    private javax.swing.JTextField numero;
    private javax.swing.JCheckBox portaria24;
    private javax.swing.JTextField qtdQuartos;
    private javax.swing.JTextField qtdSalasEstar;
    private javax.swing.JTextField qtdSuites;
    private javax.swing.JTextField rua;
    private javax.swing.JButton save;
    private javax.swing.JLabel textValor;
    private javax.swing.JButton update;
    private javax.swing.JTextField valorCondominio;
    // End of variables declaration//GEN-END:variables
}
