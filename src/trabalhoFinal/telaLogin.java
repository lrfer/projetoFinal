/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lr_fe
 */
public class telaLogin extends javax.swing.JFrame {
    private DadosImoveis dadosImoveis = new DadosImoveis();
    private DadosClientes dadosClientes = new DadosClientes();
    private DadosCorretor dadosCorretor = new DadosCorretor();
    private DadosFuncionarios dadosFuncionario = new DadosFuncionarios();
    private DadosFormaPagamento dadosFormaPagamento = new DadosFormaPagamento();
    private DadosTransacao dadosTransacao = new DadosTransacao();
    private DadosLogin dadosLogin = new DadosLogin();
    public telaLogin() {
        initComponents();
        this.mock();
        this.Mock();
    }
     public telaLogin(DadosImoveis dadosImoveis,DadosClientes dadosClientes,DadosCorretor dadosCorretor,
            DadosFuncionarios dadosFuncionario, DadosFormaPagamento dadosFormaPagamento,
       DadosTransacao dadosTransacao, DadosLogin dadosLogin,boolean isRelog) {
        initComponents();
        this.mock();
        this.Mock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents                        
    private void initComponents() {

        usuarioLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuarioLabel.setText("Usuario");

        senhaLabel.setText("Senha");

        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton3.setText("Instru????es");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(senha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addComponent(usuario, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnCadastrar)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrar)
                    .addComponent(btnCadastrar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents                  

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed                
        Login check = new Login();
        check.Usuario = this.usuario.getText();
        check.Senha = this.senha.getText();
        var result = this.dadosLogin.Check(check);
        
        if(result == 0){
            telaPrincipal tela = new telaPrincipal(this.dadosImoveis, this.dadosClientes, this.dadosCorretor, this.dadosFuncionario,
                    this.dadosFormaPagamento, this.dadosTransacao, this.dadosLogin);
            tela.setVisible(true);
                    super.dispose();
        }
        if(result ==  -1){
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
        if(result == -2)
            JOptionPane.showMessageDialog(null, "Usuario n??o encontrado");
        
    }//GEN-LAST:event_entrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed                                 
        crudPrimeiroLogin login = new crudPrimeiroLogin(this.dadosFuncionario,this.dadosLogin);
        login.setVisible(true);
    }                                            

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JOptionPane.showMessageDialog(null, "Usuario padr??o : Admin \n Senha: 123 \n"
                + "Para adicionar qualquer objeto primeiro clique em novo depois adicione os dados \n"
                + "Para atualizar selecione ele na lista e depois clique atualizar \n"
                + "Para gerar o arquivo binario ?? preciso alterar o path por causa que no  meu pc est?? como \n"
                + "C:\\Users\\Public\\  por causa de Acess denied , tem que mudar no codigo infelizmente \n");
        
    }//GEN-LAST:event_btnCadastrarActionPerformed                                        
   private void mock(){
        Login mockLogin = new Login();
        mockLogin.Usuario = "Admin";
        mockLogin.Senha = "123";
        this.dadosLogin.Cadastrar(mockLogin);
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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField senha;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables                   
private void Mock(){
    Casa mockCasa = new Casa();
        mockCasa.endereco = new Endereco();
        mockCasa.endereco.setRua("Maria Dirce Ribeiro");
        mockCasa.endereco.setNro(2500);
        mockCasa.endereco.setCep(38408194);
        mockCasa.endereco.setCidade("Uberlandia");
        mockCasa.endereco.setBairro("Santa Monica");
        mockCasa.setArea("12M");
        mockCasa.setQtdQuartos(2);
        mockCasa.setQtdSalasEstar(1);
        mockCasa.setQtdSuites(1);
        mockCasa.setVenda(true);
        mockCasa.setArmarioEmbutido(true);
        mockCasa.setPiscina(true);

       Apartamento mockApartamento = new Apartamento();
        mockApartamento.endereco = new Endereco();
        mockApartamento.endereco.setRua("Maria das dores");
        mockApartamento.endereco.setNro(1500);
        mockApartamento.endereco.setCep(38400510);
        mockApartamento.endereco.setCidade("Uberlandia");
        mockApartamento.endereco.setBairro("Santa Monica");
        mockApartamento.setArea("12 Metros");
        mockApartamento.setQtdQuartos(5);
        mockApartamento.setQtdSalasEstar(4);
        mockApartamento.setQtdSuites(1);
        mockApartamento.setVenda(false);
        mockApartamento.setAndar(20);
        mockApartamento.setValorCondominio("R$4000,20");
        mockApartamento.setArmarioEmbutido(true);
        mockApartamento.setPortaria24hs(true);

        Cliente mockCliente = new Cliente();
        mockCliente.endereco = new Endereco();
        mockCliente.endereco.setRua("Maria Dirce Ribeiro");
        mockCliente.endereco.setNro(2500);
        mockCliente.endereco.setCep(38408194);
        mockCliente.endereco.setCidade("Uberlandia");
        mockCliente.endereco.setBairro("Santa Monica");
        mockCliente.setCpf("12345678909");
        mockCliente.setNome("Jos?? Rodrigues");
        mockCliente.setTelContato("(64)99266-88989");
        mockCliente.setEmail("email@gmail.com");
        mockCliente.setSexo("Masculino");
        mockCliente.setEstadoCivil("Casado");
        mockCliente.setProfissao("Desempregado");
        mockCliente.proprietario = true;


        Cliente mockCliente2 = new Cliente();
        mockCliente2.endereco = new Endereco();
        mockCliente2.endereco.setRua("Maria Dirce Ribeiro");
        mockCliente2.endereco.setNro(2500);
        mockCliente2.endereco.setCep(38408194);
        mockCliente2.endereco.setCidade("Uberlandia");
        mockCliente2.endereco.setBairro("Santa Monica");
        mockCliente2.setCpf("11169756611");
        mockCliente2.setNome("Dolores Cunha");
        mockCliente2.setTelContato("(32)32158888");
        mockCliente2.setEmail("dcunha@hotmail.com");
        mockCliente2.setSexo("N??o binario");
        mockCliente2.setEstadoCivil("Viuva");
        mockCliente2.setProfissao("Herdeira");
        mockCliente2.proprietario = true;

        BomPagador mockBomPagador = new BomPagador();
        mockBomPagador.Nome = "Jeremias silva";
        mockBomPagador.CPF = "12345678909";

         BomPagador mockBomPagador2 = new BomPagador();
        mockBomPagador2.Nome = "Jose carlos";
        mockBomPagador2.CPF = "12345678909";

        ClienteUsuario mockClienteUsuario = new ClienteUsuario();
        mockClienteUsuario.BomPagador = new ArrayList<BomPagador>();
        mockClienteUsuario.BomPagador.add(mockBomPagador);
        mockClienteUsuario.BomPagador.add(mockBomPagador2);
        mockClienteUsuario.endereco = new Endereco();
        mockClienteUsuario.endereco = new Endereco();
        mockClienteUsuario.endereco.setRua("Maria Dirce Ribeiro");
        mockClienteUsuario.endereco.setNro(2500);
        mockClienteUsuario.endereco.setCep(38408194);
        mockClienteUsuario.endereco.setCidade("Uberlandia");
        mockClienteUsuario.endereco.setBairro("Santa Monica");
        mockClienteUsuario.setCpf("12345678909");
        mockClienteUsuario.setNome("Silvio Cesar");
        mockClienteUsuario.setTelContato("(17)5555989898");
        mockClienteUsuario.setEmail("junin@hotmail.com");
        mockClienteUsuario.setSexo("Masculino");
        mockClienteUsuario.setEstadoCivil("Solteiro");
        mockClienteUsuario.setProfissao("Vendedor");
        mockClienteUsuario.proprietario = false;


        FormaPagamento mockFormaPagamento = new FormaPagamento();
        mockFormaPagamento.tipo = "A vista";

        FormaPagamento mockFormaPagamento2 = new FormaPagamento();
        mockFormaPagamento2.tipo = "12X no Cart??o";

        FormaPagamento mockFormaPagamento3 = new FormaPagamento();
        mockFormaPagamento3.tipo = "12X com Juros no Cart??o";

        FormaPagamento mockFormaPagamento4 = new FormaPagamento();
        mockFormaPagamento4.tipo = "48x no carn??";

        Login mockLogin = new Login();
        mockLogin.Usuario = "Admin";
        mockLogin.Senha = "123";

        Login mockLogin2 = new Login();
        mockLogin.Usuario = "Admin";
        mockLogin.Senha = "1234";

        Funcionario mockFuncionario = new Funcionario();
        mockFuncionario.endereco = new Endereco();
        mockFuncionario.endereco.setRua("Maria Dirce Ribeiro");
        mockFuncionario.endereco.setNro(2500);
        mockFuncionario.endereco.setCep(38408194);
        mockFuncionario.endereco.setCidade("Uberlandia");
        mockFuncionario.endereco.setBairro("Santa Monica");
        mockFuncionario.setCpf("12345678909");
        mockFuncionario.setNome("Mateus");
        mockFuncionario.setTelContato("(33)32329111");
        mockFuncionario.setTelCelular("(55)92999999");
        mockFuncionario.setTelefone("(24)9920929");
        mockFuncionario.setCargo("Gerente");
        mockFuncionario.login = mockLogin;

        Corretor mockCorretor = new Corretor();
        mockCorretor.endereco = new Endereco();
        mockCorretor.endereco.setRua("Maria Dirce Ribeiro");
        mockCorretor.endereco.setNro(2500);
        mockCorretor.endereco.setCep(38408194);
        mockCorretor.endereco.setCidade("Uberlandia");
        mockCorretor.endereco.setBairro("Santa Monica");
        mockCorretor.setCpf("12345678909");
        mockCorretor.setNome("Silvano");
        mockCorretor.setTelContato("(33)32329111");
        mockCorretor.setTelCelular("(55)92999999");
        mockCorretor.setTelefone("(24)9920929");
        mockCorretor.setCargo("Gerente Regional");
        mockCorretor.setCursoVendas("Docker");

        mockCasa.lstCliente = new ArrayList<Cliente>();
        mockCasa.lstCliente.add(mockCliente);
        
        this.dadosImoveis.Cadastrar(mockCasa);
        this.dadosImoveis.Cadastrar(mockApartamento);
        this.dadosClientes.Cadastrar(mockCliente);
        this.dadosClientes.Cadastrar(mockCliente2);
        this.dadosClientes.Cadastrar(mockClienteUsuario);
        this.dadosCorretor.Cadastrar(mockCorretor);
        this.dadosFuncionario.Cadastrar(mockFuncionario);
        this.dadosFormaPagamento.Cadastrar(mockFormaPagamento);
        this.dadosFormaPagamento.Cadastrar(mockFormaPagamento2);
        this.dadosFormaPagamento.Cadastrar(mockFormaPagamento3);
        this.dadosFormaPagamento.Cadastrar(mockFormaPagamento4);
}
}
