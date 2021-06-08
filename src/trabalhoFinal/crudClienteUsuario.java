/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class crudClienteUsuario extends javax.swing.JFrame {
    DadosClienteUsuario dadosClientes;
    ArrayList<ClienteUsuario> clientes;
    String modo;
    ArrayList<BomPagador> pagador = new ArrayList<BomPagador>();
    
   public crudClienteUsuario(DadosClienteUsuario clientes){
       initComponents();
       this.dadosClientes = clientes;
       this.clientes = dadosClientes.getClientesUsuarios();
        modo = "Navegar";
        this.DisplayBtn(modo);
        LoadTable();
   }
    
    public crudClienteUsuario() {
        initComponents();
    }
    public void setBomPagador(BomPagador p){
        this.pagador.add(p);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane2 = new javax.swing.JScrollPane();
        lstBomPagador = new javax.swing.JList<>();
        bomPagador = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD Cliente Usuario");

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

        lstBomPagador.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstBomPagador);

        bomPagador.setText("Cadastrar bom pagador");
        bomPagador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomPagadorActionPerformed(evt);
            }
        });

        jLabel14.setText("Bom pagador");

        jLabel8.setText("Todos da lista vão ser inseridos");

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
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(nome))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(telContato)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(sexo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(rua, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cep, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addGap(40, 40, 40))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(103, 103, 103)
                                .addComponent(bomPagador)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(estadoCivil)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(profissao, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bairro)
                                    .addComponent(arqBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 49, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62)
                        .addComponent(update)
                        .addGap(281, 281, 281))
                    .addComponent(clienteProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(clienteProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arqBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bomPagador)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
            try{
        ClienteUsuario novo = new ClienteUsuario();
        if(!novo.isCPF(cpf.getText()))
            JOptionPane.showMessageDialog(null, "CPF INVALIDO");
        else{
        novo = this.parseFormToObjetct();
        clientes.add(novo);
        this.LoadList(true);
        }
            }
        
        catch(Exception ex)
                {
                JOptionPane.showMessageDialog(null, "Há algum campo invalido");
                }
         }
        if(modo.equals("Update")){
            int index = table.getSelectedRow();
            ClienteUsuario update = this.parseFormToObjetct();
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
       int index = table.getSelectedRow();
        if(index >= 0 && index < clientes.size()){
        var c = this.clientes.get(index);
        this.clearForm();
        this.fillForm(c);
        modo = "Selection";
        DisplayBtn(modo);
        }
    }//GEN-LAST:event_tableMousePressed

    private void bomPagadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomPagadorActionPerformed
        BomPagador pag = new BomPagador();
        crudBomPagador pagador = new crudBomPagador(this);
        pagador.setVisible(true);
        pagador.addWindowListener(new java.awt.event.WindowAdapter(){
          @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            LoadList(false);
        }});

    }//GEN-LAST:event_bomPagadorActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         modo = "Update";
        DisplayBtn(modo);
    }//GEN-LAST:event_updateActionPerformed
    private void LoadList(boolean clear){
    DefaultListModel<String> listModel = new DefaultListModel<>();
    if(!clear){
     for(BomPagador c : pagador)
     {
         listModel.addElement(c.Nome);
     }
    }
    if(clear){
        listModel.clear();
        this.pagador.clear();
    }
this.lstBomPagador.setModel(listModel);
}

    
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
               bomPagador.setEnabled(false);
               novo.setEnabled(true);
               salvar.setEnabled(false);
               delete.setEnabled(false);
               break;
           case "New":
               this.enableForm();
               bomPagador.setEnabled(true);
               novo.setEnabled(false);
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
               bomPagador.setEnabled(false);
               break;
           case "Selection":
               novo.setEnabled(true);
               salvar.setEnabled(false);
               delete.setEnabled(true);
               bomPagador.setEnabled(false);
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
        LoadList(true);
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
   private ClienteUsuario parseFormToObjetct(){
        ClienteUsuario result = new ClienteUsuario();
        result.BomPagador = new ArrayList<BomPagador>();
        for(BomPagador c: this.pagador)
            result.BomPagador.add(c);
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
      private void fillForm(ClienteUsuario c){
        rua.setText(c.endereco.getRua());
        numero.setText(String.valueOf(c.endereco.getNro()));
        cep.setText(String.valueOf(c.endereco.getCep()));
        cidade.setText(c.endereco.getCidade());
        bairro.setText(c.endereco.getBairro());
        cpf.setText(c.getCpf());
        nome.setText(c.getNome());
        telContato.setText(String.valueOf(c.getTelContato()));
        email.setText(c.getEmail());
        sexo.setText(c.getSexo());
        estadoCivil.setText(c.getEstadoCivil());
        profissao.setText(c.getProfissao());
        clienteProprietario.setSelected(c.proprietario);
        for(BomPagador b :c.BomPagador){
            this.pagador.add(b);
        }
        this.LoadList(false);
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
            java.util.logging.Logger.getLogger(crudClienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudClienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudClienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudClienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudClienteUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arqBinario;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton bomPagador;
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
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JList<String> lstBomPagador;
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
