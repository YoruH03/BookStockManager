/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Yuri
 */

public class areaCliente extends javax.swing.JFrame {

    /**
     * Creates new form areaCliente
     */
    public areaCliente() {
        initComponents();
        
        setLocationRelativeTo(null);
        disableClienteFields();
        disableCarrinhoFields();
        btnSalvarCliente.setEnabled(false);
        btnCancelarCliente.setEnabled(false);
        btnCancelarCarrinho.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        public void disableClienteFields(){

        txtNomeCliente.setEnabled(false);
        txtCPFCliente.setEnabled(false);
        txtEmailCliente.setEnabled(false);
        txtSenhaCliente.setEnabled(false);
        txtEnderecoCliente.setEnabled(false);
        ftxNascimentoCliente.setEnabled(false);
        ftxTelefone.setEnabled(false);
        
        
        lblNomeCliente.setEnabled(false);
        lblCPFCliente.setEnabled(false);
        lblEmailCliente.setEnabled(false);
        lblSenhaCliente.setEnabled(false);
        lblEnderecoCliente.setEnabled(false);
        lblNascimentoCliente.setEnabled(false);
        lblCelularCliente.setEnabled(false);
        }
        public void disableCarrinhoFields(){
            txtNumCarrinho.setEnabled(false);
            txtData.setEnabled(false);
            txtProdutos.setEnabled(false);
            txtCodPedido.setEnabled(false);
            txtCodRastreio.setEnabled(false);
            txtTotal.setEnabled(false);
            
            lblNumCarrinho.setEnabled(false);
            lblData.setEnabled(false);
            lblProdutos.setEnabled(false);
            lblCodPedido.setEnabled(false);
            lblCodRastreio.setEnabled(false);
            lblTotal.setEnabled(false);
        }
        public void enableClienteFields(){
        txtNomeCliente.setEnabled(true);
        txtCPFCliente.setEnabled(true);
        txtEmailCliente.setEnabled(true);
        txtSenhaCliente.setEnabled(true);
        txtEnderecoCliente.setEnabled(true);
        ftxNascimentoCliente.setEnabled(true);
        ftxTelefone.setEnabled(true);
        
        lblNomeCliente.setEnabled(true);
        lblCPFCliente.setEnabled(true);
        lblEmailCliente.setEnabled(true);
        lblSenhaCliente.setEnabled(true);
        lblEnderecoCliente.setEnabled(true);
        lblNascimentoCliente.setEnabled(true);
        lblCelularCliente.setEnabled(true);
        }
        
        public void enableCarrinhoFields(){
            txtNumCarrinho.setEnabled(true);
            txtData.setEnabled(true);
            txtProdutos.setEnabled(true);
            txtCodPedido.setEnabled(true);
            txtCodRastreio.setEnabled(true);
            txtTotal.setEnabled(true);
            
            lblNumCarrinho.setEnabled(true);
            lblData.setEnabled(true);
            lblProdutos.setEnabled(true);
            lblCodPedido.setEnabled(true);
            lblCodRastreio.setEnabled(true);
            lblTotal.setEnabled(true);
            
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAreaCliente = new javax.swing.JLabel();
        lblDadosCliente = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblCPFCliente = new javax.swing.JLabel();
        lblEmailCliente = new javax.swing.JLabel();
        lblSenhaCliente = new javax.swing.JLabel();
        lblEnderecoCliente = new javax.swing.JLabel();
        lblNascimentoCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtSenhaCliente = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        btnSalvarCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        lblCelularCliente = new javax.swing.JLabel();
        ftxNascimentoCliente = new javax.swing.JFormattedTextField();
        ftxTelefone = new javax.swing.JFormattedTextField();
        txtCPFCliente = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblCarrinhosAnteriores = new javax.swing.JLabel();
        btnSairCliente = new javax.swing.JButton();
        lblNumCarrinho = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCodPedido = new javax.swing.JLabel();
        lblCodRastreio = new javax.swing.JLabel();
        txtNumCarrinho = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtCodPedido = new javax.swing.JTextField();
        txtCodRastreio = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        btnPesquisarCarrinho = new javax.swing.JButton();
        btnCancelarCarrinho = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProdutos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Área do cliente");

        lblAreaCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaCliente.setText("Área do Cliente");

        lblDadosCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDadosCliente.setText("meus dados");

        lblNomeCliente.setText("Nome");

        lblCPFCliente.setText("CPF");

        lblEmailCliente.setText("E-mail");

        lblSenhaCliente.setText("Senha");

        lblEnderecoCliente.setText("Endereço");

        lblNascimentoCliente.setText("data de nascimento");

        txtNomeCliente.setToolTipText("Nome do cliente");
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        txtEmailCliente.setToolTipText("email cadastrado");

        txtSenhaCliente.setToolTipText("senha do cliente");

        txtEnderecoCliente.setToolTipText("endereço salvo");

        btnSalvarCliente.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.setToolTipText("salvar as alterações");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setBackground(new java.awt.Color(255, 255, 0));
        btnAlterarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.setToolTipText("alterar os dados");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.setToolTipText("cancelar a operação");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        lblCelularCliente.setText("Celular");

        try {
            ftxNascimentoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxNascimentoCliente.setToolTipText("data de nascimento do cliente");

        try {
            ftxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxTelefone.setToolTipText("número de contato");

        try {
            txtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCliente.setToolTipText("CPF do cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosCliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNomeCliente)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCPFCliente)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAlterarCliente)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(lblNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnSalvarCliente)
                                .addGap(164, 164, 164)
                                .addComponent(btnCancelarCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblEmailCliente)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(lblSenhaCliente)))
                                    .addComponent(lblCelularCliente))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ftxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSenhaCliente))))
                                .addGap(37, 37, 37)
                                .addComponent(lblEnderecoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(lblAreaCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblAreaCliente)
                .addGap(1, 1, 1)
                .addComponent(lblDadosCliente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailCliente)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnderecoCliente)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFCliente)
                    .addComponent(lblSenhaCliente)
                    .addComponent(lblNascimentoCliente)
                    .addComponent(txtSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelularCliente)
                    .addComponent(ftxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarCliente)
                    .addComponent(btnSalvarCliente)
                    .addComponent(btnCancelarCliente))
                .addContainerGap())
        );

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NumCarrinho", "Data do pedido", "Produtos", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        lblCarrinhosAnteriores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCarrinhosAnteriores.setText("Consultar Carrinhos");

        btnSairCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/exit_icon-icons.com_70975.png"))); // NOI18N
        btnSairCliente.setText("Sair");
        btnSairCliente.setToolTipText("Sair da área do cliente");
        btnSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairClienteActionPerformed(evt);
            }
        });

        lblNumCarrinho.setText("NumCarrinho");

        lblData.setText("Data");

        lblProdutos.setText("Produtos");

        lblTotal.setText("Total");

        lblCodPedido.setText("Cod.Pedido");

        lblCodRastreio.setText("Cod.Rastreio");

        txtNumCarrinho.setToolTipText("número do carrinho");

        txtTotal.setToolTipText("valor total");

        txtCodPedido.setToolTipText("código do pedido");

        txtCodRastreio.setToolTipText("código do rastreio");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setToolTipText("data do pedido");

        btnPesquisarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N
        btnPesquisarCarrinho.setText("Pesquisar");
        btnPesquisarCarrinho.setToolTipText("pesquisar por carrinho");
        btnPesquisarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCarrinhoActionPerformed(evt);
            }
        });

        btnCancelarCarrinho.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarCarrinho.setText("Cancelar");
        btnCancelarCarrinho.setToolTipText("cancelar operação");
        btnCancelarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCarrinhoActionPerformed(evt);
            }
        });

        txtProdutos.setColumns(20);
        txtProdutos.setRows(5);
        jScrollPane2.setViewportView(txtProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSairCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblProdutos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCodRastreio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodRastreio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblTotal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNumCarrinho)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblData)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCodPedido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnPesquisarCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarCarrinho)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCarrinhosAnteriores)
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblCarrinhosAnteriores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCarrinho)
                    .addComponent(txtNumCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodPedido)
                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdutos)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodRastreio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodRastreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarCarrinho)
                    .addComponent(btnCancelarCarrinho))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSairCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairClienteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_btnSairClienteActionPerformed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        // TODO add your handling code here:
        
        enableClienteFields();
        btnSalvarCliente.setEnabled(true);
        btnCancelarCliente.setEnabled(true);
        btnAlterarCliente.setEnabled(false);
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        // TODO add your handling code here:
        disableClienteFields();
        btnAlterarCliente.setEnabled(true);
        btnCancelarCliente.setEnabled(false);
        btnSalvarCliente.setEnabled(false);
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        // TODO add your handling code here:
        disableClienteFields();
        btnAlterarCliente.setEnabled(true);
        btnCancelarCliente.setEnabled(false);
        btnSalvarCliente.setEnabled(false);
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnPesquisarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCarrinhoActionPerformed
        // TODO add your handling code here:
        enableCarrinhoFields();
        btnCancelarCarrinho.setEnabled(true);
        btnPesquisarCarrinho.setEnabled(false);
    }//GEN-LAST:event_btnPesquisarCarrinhoActionPerformed

    private void btnCancelarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCarrinhoActionPerformed
        // TODO add your handling code here:
        disableCarrinhoFields();
        btnPesquisarCarrinho.setEnabled(true);
        btnCancelarCarrinho.setEnabled(false);
    }//GEN-LAST:event_btnCancelarCarrinhoActionPerformed

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
            java.util.logging.Logger.getLogger(areaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(areaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(areaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(areaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new areaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnCancelarCarrinho;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnPesquisarCarrinho;
    private javax.swing.JButton btnSairCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JFormattedTextField ftxNascimentoCliente;
    private javax.swing.JFormattedTextField ftxTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAreaCliente;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblCarrinhosAnteriores;
    private javax.swing.JLabel lblCelularCliente;
    private javax.swing.JLabel lblCodPedido;
    private javax.swing.JLabel lblCodRastreio;
    private javax.swing.JLabel lblDadosCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblNascimentoCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNumCarrinho;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblSenhaCliente;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCliente;
    private javax.swing.JFormattedTextField txtCPFCliente;
    private javax.swing.JTextField txtCodPedido;
    private javax.swing.JTextField txtCodRastreio;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumCarrinho;
    private javax.swing.JTextArea txtProdutos;
    private javax.swing.JTextField txtSenhaCliente;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
