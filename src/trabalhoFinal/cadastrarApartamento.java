
package trabalhoFinal;

import java.time.LocalDate;


public class cadastrarApartamento extends javax.swing.JFrame {
    Apartamento ap = new Apartamento();
    DadosImoveis Imoveis;
    DadosClienteProprietario clientes;

    public cadastrarApartamento(DadosImoveis imoveis,DadosClienteProprietario clientes) {
        initComponents();
        this.Imoveis = imoveis;
        this.clientes = clientes;
        
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
        isArmarioEmbutido = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextArea();
        isPortaria24hs = new javax.swing.JCheckBox();
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
        jTextField1 = new javax.swing.JTextField();
        listClienteProprietario = new javax.swing.JScrollPane();
        lstClienteProprietario = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        labelAndar = new javax.swing.JLabel();
        textAndar = new javax.swing.JTextField();
        labelCondominio = new javax.swing.JLabel();
        textValorCondominio = new javax.swing.JTextField();

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

        isArmarioEmbutido.setLabel("Tem armario embutido?");
        isArmarioEmbutido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isArmarioEmbutidoActionPerformed(evt);
            }
        });
        isArmarioEmbutido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isArmarioEmbutidoKeyPressed(evt);
            }
        });

        jLabel1.setText("Descrição");

        textDescricao.setColumns(20);
        textDescricao.setRows(5);
        jScrollPane1.setViewportView(textDescricao);

        isPortaria24hs.setText("Portaria 24HS?");
        isPortaria24hs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPortaria24hsActionPerformed(evt);
            }
        });
        isPortaria24hs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isPortaria24hsKeyPressed(evt);
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

        jTextField1.setToolTipText("(DD/MM/AAAA)");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        listClienteProprietario.setViewportView(lstClienteProprietario);

        jLabel3.setText("Cliente Proprietario");

        labelAndar.setText("Andar");

        textAndar.setText("0");
        textAndar.setToolTipText("");
        textAndar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAndarActionPerformed(evt);
            }
        });
        textAndar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAndarKeyTyped(evt);
            }
        });

        labelCondominio.setText("Valor condominio");

        textValorCondominio.setText("0");
        textValorCondominio.setToolTipText("");
        textValorCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorCondominioActionPerformed(evt);
            }
        });
        textValorCondominio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textValorCondominioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isArmarioEmbutido)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textQtdQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(488, 488, 488))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textNroVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(195, 195, 195))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(75, 75, 75)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelBairro)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(isVenda)
                                                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(labelCep)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textQtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textQtdSalasEstar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(171, 171, 171))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(labelQtdQuartos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelQtdSuites, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelQtdSalasEstar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                                .addGap(81, 81, 81)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNumero)
                                            .addComponent(labelCidade)
                                            .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textRua, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelRua)))
                                    .addComponent(labelNroVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(listClienteProprietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelCondominio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(isPortaria24hs, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textValorCondominio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAndar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textQtdQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQtdSuites)
                            .addComponent(labelNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textQtdSuites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(isVenda)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAndar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCondominio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isArmarioEmbutido)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isPortaria24hs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

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

    private void isArmarioEmbutidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isArmarioEmbutidoActionPerformed
        
    }//GEN-LAST:event_isArmarioEmbutidoActionPerformed

    private void isArmarioEmbutidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isArmarioEmbutidoKeyPressed
        boolean b = evt.isActionKey();
        System.out.println(b);
    }//GEN-LAST:event_isArmarioEmbutidoKeyPressed

    private void isPortaria24hsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPortaria24hsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPortaria24hsActionPerformed

    private void isPortaria24hsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isPortaria24hsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPortaria24hsKeyPressed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarActionPerformed

    private void textQtdQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtdQuartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtdQuartosActionPerformed

    private void textQtdQuartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textQtdQuartosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtdQuartosKeyTyped

    private void textRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRuaActionPerformed

    private void textCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCEPActionPerformed

    private void textCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCEPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textCEPKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void textAndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAndarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAndarActionPerformed

    private void textAndarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAndarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textAndarKeyTyped

    private void textValorCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorCondominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorCondominioActionPerformed

    private void textValorCondominioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textValorCondominioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorCondominioKeyTyped

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
      this.ap.setVenda(this.isVenda.isSelected());
      this.ap.setLocacao(!this.isVenda.isSelected());
      this.ap.setValorRealAluguelVenda(0);
      this.ap.setValorDestinadoImob(0);
      this.ap.endereco = endereco;
      this.ap.setDataColocadoVendaAlugar(LocalDate.now());
      this.ap.setDisponivelLocacaoVenda(true);
      this.ap.setSituacao("ATIVO");
      this.ap.setArea(this.textArea.getSelectedText());
      this.ap.setQtdQuartos(Integer.parseInt(this.textQtdQuartos.getText()));
      this.ap.setQtdSuites(Integer.parseInt(this.textQtdSuites.getText()));
      this.ap.setQtdSalasEstar(Integer.parseInt(this.textQtdSalasEstar.getText()));
      this.ap.setNroVagasGaregem(Integer.parseInt(this.textNroVagasGaragem.getText()));
      this.ap.setAndar(Integer.parseInt(this.textAndar.getText()));
      this.ap.setPortaria24hs(this.isPortaria24hs.isSelected());
      this.Imoveis.Cadastrar(this.ap);
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
            java.util.logging.Logger.getLogger(cadastrarApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JCheckBox isArmarioEmbutido;
    private javax.swing.JCheckBox isPortaria24hs;
    private javax.swing.JCheckBox isVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelAndar;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCondominio;
    private javax.swing.JLabel labelNroVagasGaragem;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelQtdQuartos;
    private javax.swing.JLabel labelQtdSalasEstar;
    private javax.swing.JLabel labelQtdSuites;
    private javax.swing.JLabel labelRua;
    private javax.swing.JScrollPane listClienteProprietario;
    public javax.swing.JList<String> lstClienteProprietario;
    private javax.swing.JTextField textAndar;
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
    private javax.swing.JTextField textValorCondominio;
    // End of variables declaration//GEN-END:variables
}
