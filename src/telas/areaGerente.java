/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Yuri
 */
public class areaGerente extends javax.swing.JFrame {

    /**
     * Creates new form areaGerente
     */
    public areaGerente() {
        initComponents();
        
        setLocationRelativeTo(null);
        disableGerenteFields();
        disableControleFuncionariosButtons();
        disableControleFuncionariosFields();
        
        btnCancelarGerente.setEnabled(false);
        btnSalvarGerente.setEnabled(false);
        btnAlterarGerente.setEnabled(true);
        
        btnNovoFuncionario.setEnabled(true);
        btnPesquisarFuncionario.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblAreaGerente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNomeGerente = new javax.swing.JLabel();
        lblCPFGerente = new javax.swing.JLabel();
        lblEmailGerente = new javax.swing.JLabel();
        lblSenhaGerente = new javax.swing.JLabel();
        lblIdGerente = new javax.swing.JLabel();
        txtNomeGerente = new javax.swing.JTextField();
        txtEmailGerente = new javax.swing.JTextField();
        txtSenhaGerente = new javax.swing.JTextField();
        txtIdGerente = new javax.swing.JTextField();
        ftxCPFGerente = new javax.swing.JFormattedTextField();
        lblDadosGerente = new javax.swing.JLabel();
        btnAlterarGerente = new javax.swing.JButton();
        btnSalvarGerente = new javax.swing.JButton();
        btnCancelarGerente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblControleFuncionarios = new javax.swing.JLabel();
        lblNomeFuncionario = new javax.swing.JLabel();
        lblCPFFuncionario = new javax.swing.JLabel();
        lblEmailFuncionario = new javax.swing.JLabel();
        lblSenhaFuncionario = new javax.swing.JLabel();
        lblIdFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtSenhaFuncionario = new javax.swing.JTextField();
        txtCodigoFuncionario = new javax.swing.JTextField();
        btnNovoFuncionario = new javax.swing.JButton();
        btnSalvarFuncionario = new javax.swing.JButton();
        btnCancelarFuncionario = new javax.swing.JButton();
        btnExcluirFuncionario = new javax.swing.JButton();
        btnPesquisarFuncionario = new javax.swing.JButton();
        btnBuscarFuncionario = new javax.swing.JButton();
        ftxCPFFuncionario = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblControleFuncionariosx = new javax.swing.JTable();
        btnSairGerente = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Área do Gerente");

        lblAreaGerente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaGerente.setText("Área do Gerente");

        lblNomeGerente.setText("Nome");

        lblCPFGerente.setText("CPF");

        lblEmailGerente.setText("E-mail");

        lblSenhaGerente.setText("Senha");

        lblIdGerente.setText("Id Gerente");

        txtNomeGerente.setToolTipText("insira o nome");
        txtNomeGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeGerenteActionPerformed(evt);
            }
        });

        txtEmailGerente.setToolTipText("insira o e-mail");

        txtSenhaGerente.setToolTipText("defina uma senha");

        txtIdGerente.setToolTipText("defina um Id Gerente");

        try {
            ftxCPFGerente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxCPFGerente.setToolTipText("insira o CPF");

        lblDadosGerente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDadosGerente.setText("meus dados");

        btnAlterarGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/62914memo_109205.png"))); // NOI18N
        btnAlterarGerente.setText("Alterar");
        btnAlterarGerente.setToolTipText("alterar os dados já existentes");
        btnAlterarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarGerenteActionPerformed(evt);
            }
        });

        btnSalvarGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/Save_37110.png"))); // NOI18N
        btnSalvarGerente.setText("Salvar");
        btnSalvarGerente.setToolTipText("Salvar os dados");
        btnSalvarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarGerenteActionPerformed(evt);
            }
        });

        btnCancelarGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/cancel_77947.png"))); // NOI18N
        btnCancelarGerente.setText("Cancelar");
        btnCancelarGerente.setToolTipText("Cancelar a operação");
        btnCancelarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosGerente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPFGerente)
                                .addGap(18, 18, 18)
                                .addComponent(ftxCPFGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAlterarGerente)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNomeGerente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblSenhaGerente)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmailGerente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmailGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIdGerente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnSalvarGerente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarGerente)
                            .addComponent(txtIdGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblDadosGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeGerente)
                            .addComponent(txtNomeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPFGerente)
                            .addComponent(ftxCPFGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailGerente)
                            .addComponent(lblIdGerente)
                            .addComponent(txtEmailGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenhaGerente))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarGerente)
                    .addComponent(btnSalvarGerente)
                    .addComponent(btnCancelarGerente))
                .addContainerGap())
        );

        lblControleFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblControleFuncionarios.setText("Controle de funcionários");

        lblNomeFuncionario.setText("Nome");

        lblCPFFuncionario.setText("CPF");

        lblEmailFuncionario.setText("E-mail");

        lblSenhaFuncionario.setText("Senha");

        lblIdFuncionario.setText("Código de funcionário");

        txtNomeFuncionario.setToolTipText("insira o nome do funcionario");

        txtEmailFuncionario.setToolTipText("Insira o email do funcionário");

        txtSenhaFuncionario.setToolTipText("insira a senha do funcionário");

        txtCodigoFuncionario.setToolTipText("insira o código do funcionário");

        btnNovoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/add_icon-icons.com_74429 (2).png"))); // NOI18N
        btnNovoFuncionario.setText("Novo");
        btnNovoFuncionario.setToolTipText("Adicionar novo funcionário");
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnSalvarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/Save_37110.png"))); // NOI18N
        btnSalvarFuncionario.setText("Salvar");
        btnSalvarFuncionario.setToolTipText("Salvar dados do funcionário");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/cancel_77947.png"))); // NOI18N
        btnCancelarFuncionario.setText("Cancelar");
        btnCancelarFuncionario.setToolTipText("cancelar a operação");
        btnCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFuncionarioActionPerformed(evt);
            }
        });

        btnExcluirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/delete_4219.png"))); // NOI18N
        btnExcluirFuncionario.setText("Excluir");
        btnExcluirFuncionario.setToolTipText("excluir funcionário");

        btnPesquisarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N
        btnPesquisarFuncionario.setText("Pesquisar");
        btnPesquisarFuncionario.setToolTipText("pesquisar por funcionários");
        btnPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFuncionarioActionPerformed(evt);
            }
        });

        btnBuscarFuncionario.setText("Buscar");
        btnBuscarFuncionario.setToolTipText("Buscar pelo funcionário");

        try {
            ftxCPFFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxCPFFuncionario.setToolTipText("insira o CPF do funcionário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomeFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCPFFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(ftxCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmailFuncionario)
                    .addComponent(lblSenhaFuncionario))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txtEmailFuncionario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscarFuncionario)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIdFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisarFuncionario)
                            .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblControleFuncionarios)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnNovoFuncionario)
                        .addGap(39, 39, 39)
                        .addComponent(btnSalvarFuncionario)
                        .addGap(46, 46, 46)
                        .addComponent(btnCancelarFuncionario)
                        .addGap(48, 48, 48)
                        .addComponent(btnExcluirFuncionario)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblControleFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(lblEmailFuncionario)
                    .addComponent(lblIdFuncionario)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenhaFuncionario)
                    .addComponent(btnBuscarFuncionario)
                    .addComponent(lblCPFFuncionario)
                    .addComponent(ftxCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarFuncionario)
                    .addComponent(btnSalvarFuncionario)
                    .addComponent(btnNovoFuncionario)
                    .addComponent(btnExcluirFuncionario)
                    .addComponent(btnPesquisarFuncionario))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tblControleFuncionariosx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "E-mail", "Senha", "Cód. Funcionário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblControleFuncionariosx.setToolTipText("Tabela com os dados de funcionários");
        jScrollPane1.setViewportView(tblControleFuncionariosx);

        btnSairGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/exit_icon-icons.com_70975.png"))); // NOI18N
        btnSairGerente.setText("Sair");
        btnSairGerente.setToolTipText("Sair da janela");
        btnSairGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(lblAreaGerente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(btnSairGerente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAreaGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSairGerente))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairGerenteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairGerenteActionPerformed

    private void txtNomeGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeGerenteActionPerformed

    private void btnAlterarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarGerenteActionPerformed
        // TODO add your handling code here:
        enableGerenteFields();
        btnAlterarGerente.setEnabled(false);
        btnSalvarGerente.setEnabled(true);
        btnCancelarGerente.setEnabled(true);
    }//GEN-LAST:event_btnAlterarGerenteActionPerformed

    private void btnSalvarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarGerenteActionPerformed
        // TODO add your handling code here:
        disableGerenteFields();
        btnAlterarGerente.setEnabled(true);
        btnSalvarGerente.setEnabled(false);
        btnCancelarGerente.setEnabled(false);
    }//GEN-LAST:event_btnSalvarGerenteActionPerformed

    private void btnCancelarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGerenteActionPerformed
        // TODO add your handling code here:
        disableGerenteFields();
        btnAlterarGerente.setEnabled(true);
        btnSalvarGerente.setEnabled(false);
        btnCancelarGerente.setEnabled(false);
    }//GEN-LAST:event_btnCancelarGerenteActionPerformed

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
        // TODO add your handling code here:
        enableControleFuncionariosFields();
        disableControleFuncionariosButtons();
        btnSalvarFuncionario.setEnabled(true);
        btnCancelarFuncionario.setEnabled(true);
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFuncionarioActionPerformed
        // TODO add your handling code here:
        disableControleFuncionariosFields();
        disableControleFuncionariosButtons();
        btnNovoFuncionario.setEnabled(true);
        btnPesquisarFuncionario.setEnabled(true);
        
    }//GEN-LAST:event_btnCancelarFuncionarioActionPerformed

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
        disableControleFuncionariosFields();
        disableControleFuncionariosButtons();
        btnNovoFuncionario.setEnabled(true);
        btnPesquisarFuncionario.setEnabled(true);
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void btnPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFuncionarioActionPerformed
        // TODO add your handling code here:
        disableControleFuncionariosFields();
        disableControleFuncionariosButtons();
        btnBuscarFuncionario.setEnabled(true);
        lblNomeFuncionario.setEnabled(true);
        txtNomeFuncionario.setEnabled(true);
        txtNomeFuncionario.requestFocus();
        
        
        btnCancelarFuncionario.setEnabled(true);
    }//GEN-LAST:event_btnPesquisarFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(areaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(areaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(areaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(areaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new areaGerente().setVisible(true);
                
            }
        });
    }
    
    public void disableGerenteFields(){
        txtNomeGerente.setEnabled(false);
        ftxCPFGerente.setEnabled(false);
        txtEmailGerente.setEnabled(false);
        txtSenhaGerente.setEnabled(false);
        txtIdGerente.setEnabled(false);
        
        lblNomeGerente.setEnabled(false);
        lblCPFGerente.setEnabled(false);
        lblEmailGerente.setEnabled(false);
        lblSenhaGerente.setEnabled(false);
        lblIdGerente.setEnabled(false);
    }
    
    public void enableGerenteFields(){
        txtNomeGerente.setEnabled(true);
        ftxCPFGerente.setEnabled(true);
        txtEmailGerente.setEnabled(true);
        txtSenhaGerente.setEnabled(true);
        txtIdGerente.setEnabled(true);
        
        lblNomeGerente.setEnabled(true);
        lblCPFGerente.setEnabled(true);
        lblEmailGerente.setEnabled(true);
        lblSenhaGerente.setEnabled(true);
        lblIdGerente.setEnabled(true);
        
    }
    
    public void disableControleFuncionariosButtons(){
        btnNovoFuncionario.setEnabled(false);
        btnSalvarFuncionario.setEnabled(false);
        btnCancelarFuncionario.setEnabled(false);
        btnExcluirFuncionario.setEnabled(false);
        btnPesquisarFuncionario.setEnabled(false);
        btnBuscarFuncionario.setEnabled(false);

    }
    
    public void disableControleFuncionariosFields(){
        txtNomeFuncionario.setEnabled(false);
        ftxCPFFuncionario.setEnabled(false);
        txtEmailFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);
        txtCodigoFuncionario.setEnabled(false);
        
        lblNomeFuncionario.setEnabled(false);
        lblCPFFuncionario.setEnabled(false);
        lblEmailFuncionario.setEnabled(false);
        lblSenhaFuncionario.setEnabled(false);
        lblIdFuncionario.setEnabled(false);
        
    }
    
    public void enableControleFuncionariosFields(){
        txtNomeFuncionario.setEnabled(true);
        ftxCPFFuncionario.setEnabled(true);
        txtEmailFuncionario.setEnabled(true);
        txtSenhaFuncionario.setEnabled(true);
        txtCodigoFuncionario.setEnabled(true);
        
        lblNomeFuncionario.setEnabled(true);
        lblCPFFuncionario.setEnabled(true);
        lblEmailFuncionario.setEnabled(true);
        lblSenhaFuncionario.setEnabled(true);
        lblIdFuncionario.setEnabled(true);
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarGerente;
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnCancelarFuncionario;
    private javax.swing.JButton btnCancelarGerente;
    private javax.swing.JButton btnExcluirFuncionario;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnPesquisarFuncionario;
    private javax.swing.JButton btnSairGerente;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JButton btnSalvarGerente;
    private javax.swing.JFormattedTextField ftxCPFFuncionario;
    private javax.swing.JFormattedTextField ftxCPFGerente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAreaGerente;
    private javax.swing.JLabel lblCPFFuncionario;
    private javax.swing.JLabel lblCPFGerente;
    private javax.swing.JLabel lblControleFuncionarios;
    private javax.swing.JLabel lblDadosGerente;
    private javax.swing.JLabel lblEmailFuncionario;
    private javax.swing.JLabel lblEmailGerente;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JLabel lblIdGerente;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblNomeGerente;
    private javax.swing.JLabel lblSenhaFuncionario;
    private javax.swing.JLabel lblSenhaGerente;
    private javax.swing.JTable tblControleFuncionariosx;
    private javax.swing.JTextField txtCodigoFuncionario;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtEmailGerente;
    private javax.swing.JTextField txtIdGerente;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNomeGerente;
    private javax.swing.JTextField txtSenhaFuncionario;
    private javax.swing.JTextField txtSenhaGerente;
    // End of variables declaration//GEN-END:variables
}
