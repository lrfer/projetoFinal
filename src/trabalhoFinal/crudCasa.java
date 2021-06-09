
package trabalhoFinal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class crudCasa extends javax.swing.JFrame {
    DadosImoveis dadosImoveis;
    DadosClientes clientes;
    ArrayList<Casa> casas;
    List<Cliente> clientesProp;
     String modo;
    public crudCasa(DadosClientes clientes, DadosImoveis imoveis) {
        initComponents();
        this.dadosImoveis = imoveis;
        this.clientes = clientes;
        casas = this.dadosImoveis.getCasas();
        modo = "Navegar";
        LoadTable();
        this.clientesProp = clientes.getProprietarios();
        this.LoadList();
        this.DisplayBtn(modo);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProprietarios = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        changeProp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD Casa");

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

        lstProprietarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstProprietarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstProprietarios);

        jLabel10.setText("Clientes Proprietarios");

        changeProp.setText("Mudar proprietario");
        changeProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePropActionPerformed(evt);
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
                            .addComponent(isArmarioEmbutido)
                            .addComponent(isVenda)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(condominio)
                                    .addComponent(isPiscina))
                                .addGap(101, 101, 101)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(qtdQuartos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(labelRua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(qtdSuites, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jLabel9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(qtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(38, 38, 38)
                                                        .addComponent(changeProp))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(arquivoBinario)))))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cidade)
                        .addComponent(CEP)
                        .addComponent(bairro))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rua)
                        .addComponent(numero)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isVenda)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isArmarioEmbutido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(condominio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isPiscina)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar)
                            .addComponent(salvar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(changeProp)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(arquivoBinario))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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
             try{
        Casa novo = new Casa();
        novo = this.parseFormToObject();
        this.dadosImoveis.Cadastrar(novo);
             }
             catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "Há algum campo invalido");
             }
        }
        if(modo.equals("Update")){
            int index = modelo.getSelectedRow();
             Casa update = new Casa();
             update = this.parseFormToObject();
            casas.set(index,update);
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
        this.LoadTable();
        this.clearForm();
        modo = "Navegar";
        DisplayBtn(modo);
    }//GEN-LAST:event_deleteActionPerformed

    private void arquivoBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoBinarioActionPerformed
            if(this.casas != null && this.casas.size() > 0)
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

    private void modeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMousePressed
         int index = modelo.getSelectedRow();
        if(index >= 0 && index < casas.size()){
        var c = this.casas.get(index);
        this.clearForm();
        this.fillForm(c);
        modo = "Selection";
        DisplayBtn(modo);
        }
    }//GEN-LAST:event_modeloMousePressed

    private void changePropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePropActionPerformed
         this.clientesProp = clientes.getProprietarios();
         this.LoadList();
    }//GEN-LAST:event_changePropActionPerformed

        private Casa parseFormToObject(){
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
        result.lstCliente = new ArrayList<Cliente>();
        result.lstCliente.clear();
        int[] indexs = lstProprietarios.getSelectedIndices();
        for(int i =0; i< indexs.length; i++)
            result.lstCliente.add(this.clientesProp.get(indexs[i]));      
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
        this.clientesProp.clear();
        this.clientesProp = clientes.getProprietarios();
        this.LoadList();
    }
    private void disableForm(){
        this.lstProprietarios.setEnabled(false);
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
        this.lstProprietarios.setEnabled(false);
    }
    private void enableForm(){
        this.lstProprietarios.setEnabled(true);
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
        this.lstProprietarios.setEnabled(true);
    }
        private void fillForm(Casa ap){
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
        isPiscina.setSelected(ap.isPiscina());
        condominio.setSelected(ap.getCondominio());
        isArmarioEmbutido.setSelected(ap.isArmarioEmbutido());
        isVenda.setSelected(ap.isVenda());
        if(ap.lstCliente != null && ap.lstCliente.size() > 0){
        this.clientesProp.clear();
        for(Cliente c : ap.lstCliente)
            this.clientesProp.add(c);
        this.LoadList();
        this.lstProprietarios.getSelectionModel().setSelectionInterval(0, ap.lstCliente.size() - 1);
        }
    }
    
     public void DisplayBtn(String mode){
       switch(mode)
       {
           case "Navegar":
               this.disableForm();
               this.clearForm();
               novo.setEnabled(true);
               update.setEnabled(false);
               salvar.setEnabled(false);
               delete.setEnabled(false);
               changeProp.setEnabled(false);
               break;
           case "New":
               this.enableForm();
               this.LoadList();
               novo.setEnabled(false);
               update.setEnabled(false);
               salvar.setEnabled(true);
               delete.setEnabled(false);
               changeProp.setEnabled(false);
               break;
           case "Update":
               this.enableForm();
               novo.setEnabled(false);
               update.setEnabled(false);
               salvar.setEnabled(true);
               delete.setEnabled(false);
               changeProp.setEnabled(true);
               break;
           case "Delete":
               novo.setEnabled(true);
               update.setEnabled(false);
               salvar.setEnabled(false);
               delete.setEnabled(false);
               changeProp.setEnabled(false);
               break;
           case "Selection":
               novo.setEnabled(true);
               update.setEnabled(true);
               salvar.setEnabled(false);
               delete.setEnabled(true);
               changeProp.setEnabled(false);
               break;
               
           default:System.out.print("Não definido");
       }
   }
     public void LoadList(){
        DefaultListModel<String> listModel = new DefaultListModel<>();

     for(Cliente c : clientesProp)
         listModel.addElement(c.nome);
this.lstProprietarios.setModel(listModel);
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
    private javax.swing.JButton changeProp;
    private javax.swing.JTextField cidade;
    private javax.swing.JCheckBox condominio;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea descricao;
    private javax.swing.JCheckBox isArmarioEmbutido;
    private javax.swing.JCheckBox isPiscina;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelRua;
    private javax.swing.JList<String> lstProprietarios;
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
