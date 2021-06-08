/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author lr_fe
 */
public class efetuarTransacao extends javax.swing.JFrame {
    DadosFormaPagamento pag;
    DadosCorretor cor;
    DadosImoveis imov;
    DadosTransacao dados;
    ArrayList<FormaPagamento> formas;
    ArrayList<Corretor> corretores;
    List<Imoveis> imoveis;
    ArrayList<ClienteUsuario> cliente;
    public efetuarTransacao(DadosFormaPagamento pag,DadosCorretor cor, DadosImoveis imov,DadosTransacao dados,DadosClienteUsuario clientes){
        initComponents();
        this.pag = pag;
        this.cor = cor;
        this.imov = imov;
        this.corretores = cor.getCorretor();
        this.formas = pag.getFormaPagamento();
        this.imoveis = imov.getAtivos();
        this.cliente = clientes.getClientesUsuarios();
        this.dados = dados;
        this.LoadLstImov();
        this.LoadLstPagamento();
       this.LoadLstCorretor();
       this.LoadLstCliente();
    }
    public efetuarTransacao() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstImovel = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCorretor = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstFormaPagamento = new javax.swing.JList<>();
        btnEfetuar = new javax.swing.JButton();
        historicoTrasancao = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstClienteUsuario = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        numeroContrato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        valorSugeridoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valorRealVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        valorDestinadoImob = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstImovel.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstImovel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstImovel);

        jLabel1.setText("Imovel");

        jLabel2.setText("Corretor");

        lstCorretor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCorretor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstCorretor);

        jLabel3.setText("Forma de Pagamento");

        lstFormaPagamento.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstFormaPagamento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstFormaPagamento);

        btnEfetuar.setText("Fazer transação");
        btnEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarActionPerformed(evt);
            }
        });

        historicoTrasancao.setText("Historico de transaçõoes");
        historicoTrasancao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoTrasancaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Cliente imobiliaria");

        lstClienteUsuario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstClienteUsuario);

        jLabel5.setText("Numero Contrato");

        jLabel6.setText("Valor sugerido Cliente Venda/Alugar(R$XX,XX)");

        jLabel7.setText("Valor Real Venda/alugar(R$XX,XX)");

        jLabel8.setText("Valor destinado a Imob(R$XX,XX)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEfetuar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historicoTrasancao))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(valorSugeridoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(valorRealVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(valorDestinadoImob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorSugeridoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorRealVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorDestinadoImob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEfetuar)
                        .addGap(37, 37, 37)
                        .addComponent(historicoTrasancao))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historicoTrasancaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoTrasancaoActionPerformed
        historicoTransacao tr = new historicoTransacao(this.dados);
        tr.setVisible(true);
    }//GEN-LAST:event_historicoTrasancaoActionPerformed

    private void btnEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarActionPerformed
        try{
        int indexImovel = lstImovel.getSelectedIndex();
        int indexCorretor = lstCorretor.getSelectedIndex();
        int indexPagamento = lstFormaPagamento.getSelectedIndex();
        int indexCliente = lstClienteUsuario.getSelectedIndex();
        var imovel = this.imov.Get(indexImovel);
        var corretor = this.cor.get(indexCorretor);
        var pagamento = this.pag.Get(indexPagamento);
        var cliente = this.cliente.get(indexCliente);
        Transacao t = new Transacao();
        t.ValorDestinadoImob = this.valorDestinadoImob.getText();
        t.ValorReal = this.valorRealVenda.getText();
        t.valorCliente = this.valorSugeridoCliente.getText();
        t.corretor = new Corretor();
        t.corretor = corretor;
        t.formaPagamento = new FormaPagamento();
        t.formaPagamento = pagamento;
        t.clienteUsuario = new ClienteUsuario();
        t.clienteUsuario = cliente;
        t.imoveis = imovel;
        this.imov.setUso(imovel);
        this.LoadLstImov();
        }
        catch(Exception ex){
            
        }
        
        
    }//GEN-LAST:event_btnEfetuarActionPerformed
private void LoadLstCliente(){
     DefaultListModel<String> listModelPag = new DefaultListModel<>();
        for(ClienteUsuario p: cliente){
            listModelPag.addElement(p.nome);
        }
        
   this.lstClienteUsuario.setModel(listModelPag);
}
    private void LoadLstPagamento(){
        DefaultListModel<String> listModelPag = new DefaultListModel<>();
        for(FormaPagamento p: formas){
            listModelPag.addElement(p.tipo);
        }
        
   this.lstFormaPagamento.setModel(listModelPag);
    }
private void LoadLstCorretor(){
        DefaultListModel<String> listModelCorretor = new DefaultListModel<>();
        for(Corretor p: corretores){
            listModelCorretor.addElement(p.getNome());
        }
        this.lstCorretor.setModel(listModelCorretor);
    }
private void LoadLstImov(){
    DefaultListModel<String> listModelImov = new DefaultListModel<>();
        for(Imoveis p: imoveis){
            listModelImov.addElement(p.toString());
        }
        this.lstImovel.setModel(listModelImov);
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
            java.util.logging.Logger.getLogger(efetuarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(efetuarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(efetuarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(efetuarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new efetuarTransacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEfetuar;
    private javax.swing.JButton historicoTrasancao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstClienteUsuario;
    private javax.swing.JList<String> lstCorretor;
    private javax.swing.JList<String> lstFormaPagamento;
    private javax.swing.JList<String> lstImovel;
    private javax.swing.JTextField numeroContrato;
    private javax.swing.JTextField valorDestinadoImob;
    private javax.swing.JTextField valorRealVenda;
    private javax.swing.JTextField valorSugeridoCliente;
    // End of variables declaration//GEN-END:variables
}
