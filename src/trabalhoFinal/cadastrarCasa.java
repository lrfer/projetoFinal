
package trabalhoFinal;

import java.awt.Component;
import java.awt.Container;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class cadastrarCasa extends javax.swing.JFrame {
     Casa casa = new Casa();
     DadosImoveis imoveis;
     DadosClienteProprietario clientes;
    
    public cadastrarCasa(DadosImoveis imoveis, DadosClienteProprietario cliente) {
        initComponents();
        this.imoveis = imoveis;
        this.clientes = cliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelQtdQuartos = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        labelQtdSuites = new javax.swing.JLabel();
        labelQtdSalasEstar = new javax.swing.JLabel();
        textQtdSuites = new javax.swing.JTextField();
        textNroVagasGaragem = new javax.swing.JTextField();
        labelNroVagasGaragem = new javax.swing.JLabel();
        textQtdSalasEstar = new javax.swing.JTextField();
        labelArea = new javax.swing.JLabel();
        textArea = new javax.swing.JTextField();
        isArmarioEmbutidoCasa = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextArea();
        isPiscina = new javax.swing.JCheckBox();
        isCondominio = new javax.swing.JCheckBox();
        cadastrar = new javax.swing.JButton();
        labelRua = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        textQtdQuartos = new javax.swing.JTextField();
        textRua = new javax.swing.JTextField();
        textCidade = new javax.swing.JTextField();
        textCEP = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        textBairro = new javax.swing.JTextField();
        isVenda = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        dataConstrucao = new javax.swing.JTextField();
        listClienteProprietario = new javax.swing.JScrollPane();
        lstClienteProprietario = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelQtdQuartos.setText("Quantidade de quartos");

        textNumero.setText("0");
        textNumero.setToolTipText("");
        textNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroActionPerformed(evt);
            }
        });
        textNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNumeroKeyTyped(evt);
            }
        });

        labelQtdSuites.setText("Quantidade de suites");

        labelQtdSalasEstar.setText("Quantidade de salas de estar");

        textQtdSuites.setText("0");
        textQtdSuites.setToolTipText("");
        textQtdSuites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQtdSuitesActionPerformed(evt);
            }
        });
        textQtdSuites.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textQtdSuitesKeyTyped(evt);
            }
        });

        textNroVagasGaragem.setText("0");
        textNroVagasGaragem.setToolTipText("");
        textNroVagasGaragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNroVagasGaragemActionPerformed(evt);
            }
        });
        textNroVagasGaragem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNroVagasGaragemKeyTyped(evt);
            }
        });

        labelNroVagasGaragem.setText("Numero de vagas Garagem");

        textQtdSalasEstar.setText("0");
        textQtdSalasEstar.setToolTipText("");
        textQtdSalasEstar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQtdSalasEstarActionPerformed(evt);
            }
        });
        textQtdSalasEstar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textQtdSalasEstarKeyTyped(evt);
            }
        });

        labelArea.setText("Area");

        textArea.setText("0");
        textArea.setToolTipText("");
        textArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAreaActionPerformed(evt);
            }
        });
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaKeyTyped(evt);
            }
        });

        isArmarioEmbutidoCasa.setLabel("Tem armario embutido?");
        isArmarioEmbutidoCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isArmarioEmbutidoCasaActionPerformed(evt);
            }
        });
        isArmarioEmbutidoCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isArmarioEmbutidoCasaKeyPressed(evt);
            }
        });

        jLabel1.setText("Descrição");

        textDescricao.setColumns(20);
        textDescricao.setRows(5);
        textDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDescricaoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textDescricao);

        isPiscina.setText("Tem piscina?");
        isPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPiscinaActionPerformed(evt);
            }
        });
        isPiscina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isPiscinaKeyPressed(evt);
            }
        });

        isCondominio.setText("Condominio?");
        isCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isCondominioActionPerformed(evt);
            }
        });
        isCondominio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isCondominioKeyPressed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
        });
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        labelRua.setText("Rua");

        labelNumero.setText("Numero");

        labelCep.setText("CEP");

        labelCidade.setText("Cidade");

        textQtdQuartos.setText("0");
        textQtdQuartos.setToolTipText("");
        textQtdQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQtdQuartosActionPerformed(evt);
            }
        });
        textQtdQuartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textQtdQuartosKeyTyped(evt);
            }
        });

        textRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRuaActionPerformed(evt);
            }
        });

        textCEP.setText("0");
        textCEP.setToolTipText("");
        textCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCEPActionPerformed(evt);
            }
        });
        textCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCEPKeyTyped(evt);
            }
        });

        labelBairro.setText("Bairro");

        isVenda.setText("É venda?");

        jLabel2.setText("Data construção (DD/MM/AAAA)");
        jLabel2.setToolTipText("");

        dataConstrucao.setToolTipText("(DD/MM/AAAA)");
        dataConstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataConstrucaoActionPerformed(evt);
            }
        });

        lstClienteProprietario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listClienteProprietario.setViewportView(lstClienteProprietario);

        jLabel3.setText("Cliente Proprietario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textQtdQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(488, 488, 488))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isCondominio)
                            .addComponent(isPiscina)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNroVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isArmarioEmbutidoCasa, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBairro)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(isVenda)
                                            .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelQtdSalasEstar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelQtdSuites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelQtdQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textQtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textQtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelCidade)
                                            .addComponent(labelCep)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNumero)
                                            .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textRua, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelRua))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNroVagasGaragem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(271, 271, 271)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(listClienteProprietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(dataConstrucao, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdQuartos)
                    .addComponent(labelRua)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textQtdQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumero)
                            .addComponent(labelQtdSuites))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textQtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelQtdSalasEstar)
                            .addComponent(labelCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textQtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNroVagasGaragem)
                            .addComponent(labelCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNroVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelArea)
                            .addComponent(labelBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listClienteProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isArmarioEmbutidoCasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isPiscina)
                    .addComponent(isVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isCondominio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(cadastrar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumeroActionPerformed

    private void textNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNumeroKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textNumeroKeyTyped

    private void textQtdSuitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtdSuitesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtdSuitesActionPerformed

    private void textQtdSuitesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textQtdSuitesKeyTyped
         char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textQtdSuitesKeyTyped

    private void textNroVagasGaragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNroVagasGaragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNroVagasGaragemActionPerformed

    private void textNroVagasGaragemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNroVagasGaragemKeyTyped
                char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textNroVagasGaragemKeyTyped

    private void textQtdSalasEstarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtdSalasEstarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtdSalasEstarActionPerformed

    private void textQtdSalasEstarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textQtdSalasEstarKeyTyped
      char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textQtdSalasEstarKeyTyped

    private void textAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaActionPerformed

    private void textAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyTyped

    }//GEN-LAST:event_textAreaKeyTyped

    private void isArmarioEmbutidoCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isArmarioEmbutidoCasaActionPerformed
        
    }//GEN-LAST:event_isArmarioEmbutidoCasaActionPerformed

    private void isArmarioEmbutidoCasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isArmarioEmbutidoCasaKeyPressed

    }//GEN-LAST:event_isArmarioEmbutidoCasaKeyPressed

    private void isPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPiscinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPiscinaActionPerformed

    private void isPiscinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isPiscinaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPiscinaKeyPressed

    private void isCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isCondominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isCondominioActionPerformed

    private void isCondominioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isCondominioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_isCondominioKeyPressed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
    }//GEN-LAST:event_cadastrarActionPerformed

    private void textQtdQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtdQuartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtdQuartosActionPerformed

    private void textQtdQuartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textQtdQuartosKeyTyped
         char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textQtdQuartosKeyTyped

    private void textRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRuaActionPerformed

    private void textCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCEPActionPerformed

    private void textCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCEPKeyTyped
                char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textCEPKeyTyped

    private void dataConstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataConstrucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataConstrucaoActionPerformed

    private void textDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDescricaoKeyTyped
                
    }//GEN-LAST:event_textDescricaoKeyTyped

    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
     boolean fields = false;
    if(this.textRua.getText() == null || this.textRua.getText().isEmpty())
        fields =  false;
    if(this.textNumero.getText() == null || this.textNumero.getText().isEmpty())
        fields =   false;
    if(this.textCEP.getText() == null || this.textCEP.getText().isEmpty())
        fields =   false;
    if(this.textCidade.getText() == null || this.textCidade.getText().isEmpty())
        fields =   false;
    if(this.textBairro.getText() == null || this.textBairro.getText().isEmpty())
        fields =   false;
    if(this.textArea.getText() == null || this.textArea.getText().isEmpty())
        fields =   false;
    if(this.textQtdQuartos.getText() == null || this.textQtdQuartos.getText().isEmpty())
        fields =   false;
    if(this.textQtdSuites.getText() == null || this.textQtdSuites.getText().isEmpty())
        fields =   false;
    if(this.textQtdSalasEstar.getText() == null || this.textQtdSalasEstar.getText().isEmpty())
        fields =   false;
    if(this.textNroVagasGaragem.getText() == null || this.textNroVagasGaragem.getText().isEmpty())
        fields =   false;
    if(this.textDescricao.getText() == null ||  this.textDescricao.getText().isEmpty())
        fields =  false;
    else
        fields =   true;

      if(fields){
      Endereco endereco = new Endereco(this.textRua.getText(),Integer.parseInt(this.textNumero.getText()),Integer.parseInt(this.textCEP.getText()),this.textCidade.getText(),this.textBairro.getText());;
      this.casa.setVenda(this.isVenda.isSelected());
      this.casa.setLocacao(!this.isVenda.isSelected());
      this.casa.setValorRealAluguelVenda(0);
      this.casa.setValorDestinadoImob(0);
      this.casa.endereco = endereco;
      this.casa.setDataColocadoVendaAlugar(LocalDate.now());
      this.casa.setDisponivelLocacaoVenda(true);
      this.casa.setSituacao("ATIVO");
      this.casa.setArea(this.textArea.getSelectedText());
      this.casa.setQtdQuartos(Integer.parseInt(this.textQtdQuartos.getText()));
      this.casa.setQtdSuites(Integer.parseInt(this.textQtdSuites.getText()));
      this.casa.setQtdSalasEstar(Integer.parseInt(this.textQtdSalasEstar.getText()));
      this.casa.setNroVagasGaregem(Integer.parseInt(this.textNroVagasGaragem.getText()));
      this.casa.setPiscina(this.isPiscina.isSelected());
      this.casa.setCondominio(this.isCondominio.isSelected());
      this.imoveis.Cadastrar(this.casa);
      this.imoveis.Listar();
      super.dispose();
      }
    }//GEN-LAST:event_cadastrarMouseClicked

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastrarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField dataConstrucao;
    private javax.swing.JCheckBox isArmarioEmbutidoCasa;
    private javax.swing.JCheckBox isCondominio;
    private javax.swing.JCheckBox isPiscina;
    private javax.swing.JCheckBox isVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelNroVagasGaragem;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelQtdQuartos;
    private javax.swing.JLabel labelQtdSalasEstar;
    private javax.swing.JLabel labelQtdSuites;
    private javax.swing.JLabel labelRua;
    private javax.swing.JScrollPane listClienteProprietario;
    private javax.swing.JList<String> lstClienteProprietario;
    private javax.swing.JTextField textArea;
    private javax.swing.JTextField textBairro;
    private javax.swing.JTextField textCEP;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextArea textDescricao;
    private javax.swing.JTextField textNroVagasGaragem;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textQtdQuartos;
    private javax.swing.JTextField textQtdSalasEstar;
    private javax.swing.JTextField textQtdSuites;
    private javax.swing.JTextField textRua;
    // End of variables declaration//GEN-END:variables
}
