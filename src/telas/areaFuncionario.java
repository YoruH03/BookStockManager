/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Yuri
 */
public class areaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form areaFuncionario
     */
    public areaFuncionario() {
        initComponents();
        
        disableFuncionarioFields();
        disableEstoqueFields();
        disableEstoqueButtons();
        btnAddItem.setEnabled(true);
        btnPesquisarItem.setEnabled(true);
        
        btnSalvarFuncionario.setEnabled(false);
        btnCancelarFuncionario.setEnabled(false);
        
        setLocationRelativeTo(null);
    }
    
    public void disableFuncionarioFields(){
        txtNomeFuncionario.setEnabled(false);
        txtCPFFuncionario.setEnabled(false);
        txtEmailFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);
        txtCodigoFuncionario.setEnabled(false);
        
        lblNomeFuncionario.setEnabled(false);
        lblCPFFuncionario.setEnabled(false);
        lblEmailFuncionario.setEnabled(false);
        lblSenhaFuncionario.setEnabled(false);
        lblCodFuncionario.setEnabled(false);
        
    }
    public void enableFuncionarioFields(){
        txtNomeFuncionario.setEnabled(true);
        txtCPFFuncionario.setEnabled(true);
        txtEmailFuncionario.setEnabled(true);
        txtSenhaFuncionario.setEnabled(true);
        txtCodigoFuncionario.setEnabled(true);
        
        lblNomeFuncionario.setEnabled(true);
        lblCPFFuncionario.setEnabled(true);
        lblEmailFuncionario.setEnabled(true);
        lblSenhaFuncionario.setEnabled(true);
        lblCodFuncionario.setEnabled(true);
    }
    
    public void disableEstoqueFields(){
        txtTituloEstoque.setEnabled(false);
        txtPrecoEstoque.setEnabled(false);
        txtQuantiaEstoque.setEnabled(false);
        txtCodigoEstoque.setEnabled(false);
        txtDescricaoEstoque.setEnabled(false);
        
        lblTituloEstoque.setEnabled(false);
        lblPrecoEstoque.setEnabled(false);
        lblQuantiaEstoque.setEnabled(false);
        lblCodigoEstoque.setEnabled(false);
        lblDescricaoEstoque.setEnabled(false);

        
    }
    public void enableEstoqueFields(){
        txtTituloEstoque.setEnabled(true);
        txtPrecoEstoque.setEnabled(true);
        txtQuantiaEstoque.setEnabled(true);
        txtCodigoEstoque.setEnabled(true);
        txtDescricaoEstoque.setEnabled(true);
        
        lblTituloEstoque.setEnabled(true);
        lblPrecoEstoque.setEnabled(true);
        lblQuantiaEstoque.setEnabled(true);
        lblCodigoEstoque.setEnabled(true);
        lblDescricaoEstoque.setEnabled(true);
        
    }
    
    public void disableEstoqueButtons(){
        btnAddItem.setEnabled(false);
        btnAlterarItem.setEnabled(false);
        btnSalvarItem.setEnabled(false);
        btnExcluirItem.setEnabled(false);
        btnCancelarItem.setEnabled(false);
        btnPesquisarItem.setEnabled(false);
        btnBuscar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDadosFuncionario = new javax.swing.JLabel();
        lblNomeFuncionario = new javax.swing.JLabel();
        lblCPFFuncionario = new javax.swing.JLabel();
        lblEmailFuncionario = new javax.swing.JLabel();
        lblSenhaFuncionario = new javax.swing.JLabel();
        lblCodFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtCPFFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtSenhaFuncionario = new javax.swing.JTextField();
        txtCodigoFuncionario = new javax.swing.JTextField();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnCancelarFuncionario = new javax.swing.JButton();
        btnSalvarFuncionario = new javax.swing.JButton();
        lblAreaFuncionario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblControleEstoque = new javax.swing.JLabel();
        txtTituloEstoque = new javax.swing.JTextField();
        txtQuantiaEstoque = new javax.swing.JTextField();
        txtDescricaoEstoque = new javax.swing.JTextField();
        txtPrecoEstoque = new javax.swing.JTextField();
        txtCodigoEstoque = new javax.swing.JTextField();
        lblTituloEstoque = new javax.swing.JLabel();
        lblPrecoEstoque = new javax.swing.JLabel();
        lblQuantiaEstoque = new javax.swing.JLabel();
        lblCodigoEstoque = new javax.swing.JLabel();
        lblDescricaoEstoque = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnAlterarItem = new javax.swing.JButton();
        btnCancelarItem = new javax.swing.JButton();
        btnSalvarItem = new javax.swing.JButton();
        btnPesquisarItem = new javax.swing.JButton();
        btnExcluirItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Área do funcionário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDadosFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDadosFuncionario.setText("meus dados");

        lblNomeFuncionario.setText("Nome");

        lblCPFFuncionario.setText("CPF");

        lblEmailFuncionario.setText("e-mail");

        lblSenhaFuncionario.setText("senha");

        lblCodFuncionario.setText("Código de Funcionário");

        txtNomeFuncionario.setToolTipText("Nome do funcionário");

        txtCPFFuncionario.setToolTipText("CPF do funcionário");

        txtEmailFuncionario.setToolTipText("email do funcionário");

        txtSenhaFuncionario.setToolTipText("senha do funcionário");

        txtCodigoFuncionario.setToolTipText("código do funcionário");

        btnAlterarFuncionario.setBackground(new java.awt.Color(255, 255, 0));
        btnAlterarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterarFuncionario.setText("Alterar");
        btnAlterarFuncionario.setToolTipText("Alterar algum dado");
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarFuncionario.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarFuncionario.setText("Cancelar");
        btnCancelarFuncionario.setToolTipText("Cancelar a operação");
        btnCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFuncionarioActionPerformed(evt);
            }
        });

        btnSalvarFuncionario.setBackground(new java.awt.Color(102, 255, 0));
        btnSalvarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvarFuncionario.setText("Salvar");
        btnSalvarFuncionario.setToolTipText("salvar dados");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        lblAreaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaFuncionario.setText("Área do funcionário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNomeFuncionario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDadosFuncionario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(lblAreaFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAlterarFuncionario)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnSalvarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarFuncionario)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPFFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodFuncionario)
                                    .addComponent(lblSenhaFuncionario)
                                    .addComponent(lblEmailFuncionario))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(420, 420, 420))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(txtNomeFuncionario)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblAreaFuncionario)
                .addGap(26, 26, 26)
                .addComponent(lblDadosFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeFuncionario)
                            .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPFFuncionario)
                            .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(lblEmailFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaFuncionario)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodFuncionario)
                    .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarFuncionario)
                    .addComponent(btnSalvarFuncionario)
                    .addComponent(btnCancelarFuncionario))
                .addGap(57, 57, 57))
        );

        lblControleEstoque.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblControleEstoque.setText("Controle do estoque");

        txtTituloEstoque.setToolTipText("insira o título do produto");
        txtTituloEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloEstoqueActionPerformed(evt);
            }
        });

        txtQuantiaEstoque.setToolTipText("insira a quantia em estoque");

        txtDescricaoEstoque.setToolTipText("insira a descrição");

        txtPrecoEstoque.setToolTipText("insira o preço do produto");

        txtCodigoEstoque.setToolTipText("insira o código do produto");

        lblTituloEstoque.setText("Titulo");

        lblPrecoEstoque.setText("Preço");

        lblQuantiaEstoque.setText("Quantia em estoque");

        lblCodigoEstoque.setText("Código de produto");

        lblDescricaoEstoque.setText("Descrição");

        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("aperte para buscar pelo item");

        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/add_icon-icons.com_74429 (2).png"))); // NOI18N
        btnAddItem.setText("Adicionar Item");
        btnAddItem.setToolTipText("adicionar novo produto ao estoque");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnAlterarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/62914memo_109205.png"))); // NOI18N
        btnAlterarItem.setText("Alterar Item");
        btnAlterarItem.setToolTipText("alterar dados de algum produto");

        btnCancelarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/cancel_77947.png"))); // NOI18N
        btnCancelarItem.setText("Cancelar");
        btnCancelarItem.setToolTipText("cancelar operação");
        btnCancelarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarItemActionPerformed(evt);
            }
        });

        btnSalvarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/Save_37110.png"))); // NOI18N
        btnSalvarItem.setText("Salvar");
        btnSalvarItem.setToolTipText("salvar os dados");
        btnSalvarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarItemActionPerformed(evt);
            }
        });

        btnPesquisarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N
        btnPesquisarItem.setText("Pesquisar");
        btnPesquisarItem.setToolTipText("pesquisar por título");
        btnPesquisarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarItemActionPerformed(evt);
            }
        });

        btnExcluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/delete_4219.png"))); // NOI18N
        btnExcluirItem.setText("Excluir");
        btnExcluirItem.setToolTipText("Excluir algum produto do estoque");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarItem)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnPesquisarItem)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTituloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantiaEstoque)
                    .addComponent(lblCodigoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtQuantiaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescricaoEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblControleEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPrecoEstoque)
                        .addComponent(lblTituloEstoque))
                    .addContainerGap(808, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblControleEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblQuantiaEstoque)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEstoque)
                            .addComponent(txtCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantiaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricaoEstoque)
                            .addComponent(txtDescricaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnAlterarItem)
                    .addComponent(btnCancelarItem)
                    .addComponent(btnSalvarItem)
                    .addComponent(btnPesquisarItem)
                    .addComponent(btnExcluirItem)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(lblTituloEstoque)
                    .addGap(18, 18, 18)
                    .addComponent(lblPrecoEstoque)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );

        jScrollPane1.setToolTipText("tabela com os produtos em estoque");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Preço", "Qnt. Estoque", "Cód. Prod.", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(386, 386, 386))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(162, 162, 162)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        
        disableEstoqueButtons();
        enableEstoqueFields();
        
        btnSalvarItem.setEnabled(true);
        btnCancelarItem.setEnabled(true);
        
        
        
        
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void txtTituloEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloEstoqueActionPerformed

    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        // TODO add your handling code here:
        enableFuncionarioFields();
        btnAlterarFuncionario.setEnabled(false);
        btnSalvarFuncionario.setEnabled(true);
        btnCancelarFuncionario.setEnabled(true);
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed

    private void btnCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFuncionarioActionPerformed
        // TODO add your handling code here:
        disableFuncionarioFields();
        btnAlterarFuncionario.setEnabled(true);
        btnSalvarFuncionario.setEnabled(false);
        btnCancelarFuncionario.setEnabled(false);
        
        
    }//GEN-LAST:event_btnCancelarFuncionarioActionPerformed

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
        disableFuncionarioFields();
        btnAlterarFuncionario.setEnabled(true);
        btnSalvarFuncionario.setEnabled(false);
        btnCancelarFuncionario.setEnabled(false);
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void btnCancelarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarItemActionPerformed
        // TODO add your handling code here:
        
        disableEstoqueFields();
        disableEstoqueButtons();
        btnAddItem.setEnabled(true);
        btnPesquisarItem.setEnabled(true);
    }//GEN-LAST:event_btnCancelarItemActionPerformed

    private void btnSalvarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarItemActionPerformed
        // TODO add your handling code here:
        disableEstoqueFields();
        disableEstoqueButtons();
        btnAddItem.setEnabled(true);
        btnPesquisarItem.setEnabled(true);
    }//GEN-LAST:event_btnSalvarItemActionPerformed

    private void btnPesquisarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarItemActionPerformed
        // TODO add your handling code here:
        disableEstoqueFields();
        disableEstoqueButtons();
        btnCancelarItem.setEnabled(true);
        lblTituloEstoque.setEnabled(true);
        txtTituloEstoque.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtTituloEstoque.requestFocus();
    }//GEN-LAST:event_btnPesquisarItemActionPerformed

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
            java.util.logging.Logger.getLogger(areaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(areaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(areaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(areaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new areaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnAlterarItem;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarFuncionario;
    private javax.swing.JButton btnCancelarItem;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnPesquisarItem;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JButton btnSalvarItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAreaFuncionario;
    private javax.swing.JLabel lblCPFFuncionario;
    private javax.swing.JLabel lblCodFuncionario;
    private javax.swing.JLabel lblCodigoEstoque;
    private javax.swing.JLabel lblControleEstoque;
    private javax.swing.JLabel lblDadosFuncionario;
    private javax.swing.JLabel lblDescricaoEstoque;
    private javax.swing.JLabel lblEmailFuncionario;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblPrecoEstoque;
    private javax.swing.JLabel lblQuantiaEstoque;
    private javax.swing.JLabel lblSenhaFuncionario;
    private javax.swing.JLabel lblTituloEstoque;
    private javax.swing.JTextField txtCPFFuncionario;
    private javax.swing.JTextField txtCodigoEstoque;
    private javax.swing.JTextField txtCodigoFuncionario;
    private javax.swing.JTextField txtDescricaoEstoque;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtPrecoEstoque;
    private javax.swing.JTextField txtQuantiaEstoque;
    private javax.swing.JTextField txtSenhaFuncionario;
    private javax.swing.JTextField txtTituloEstoque;
    // End of variables declaration//GEN-END:variables
}
