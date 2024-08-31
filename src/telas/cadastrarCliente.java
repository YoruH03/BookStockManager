package telas;

import classes.Cliente;
import static classes.Cliente.listaClientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
     

/**
 *
 * @author Yuri
 */
public class cadastrarCliente extends javax.swing.JFrame {
    //static ArrayList<Cliente> listaClientes = new ArrayList();

    /**
     * Creates new form cadastrarCliente
     */
    public cadastrarCliente() {
        initComponents();
        

        setLocationRelativeTo(null);
        
    }
    
    public void clearClienteInfo(){
        txtNomeCliente.setText("");
        ftxCPFCliente.setText("");
        ftxDataCliente.setText("");
        txtEnderecoCliente.setText("");
        txtSenhaCliente.setText("");
        txtEmailCliente.setText("");
        ftxTelefoneCliente.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblEmailCliente = new javax.swing.JLabel();
        lblCPFCliente = new javax.swing.JLabel();
        lblSenhaCliente = new javax.swing.JLabel();
        lblEnderecoCliente = new javax.swing.JLabel();
        lblTelefoneCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtSenhaCliente = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        ftxTelefoneCliente = new javax.swing.JFormattedTextField();
        txtDataCliente = new javax.swing.JLabel();
        ftxDataCliente = new javax.swing.JFormattedTextField();
        ftxCPFCliente = new javax.swing.JFormattedTextField();
        btnCancelarCliente = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/person_user_customer_man_male_man_boy_people_1687 (1).png")).getImage());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Cliente");

        lblNomeCliente.setText("Nome");

        lblEmailCliente.setText("Email");

        lblCPFCliente.setText("CPF");

        lblSenhaCliente.setText("Senha");

        lblEnderecoCliente.setText("Endereço");

        lblTelefoneCliente.setText("Telefone");

        txtNomeCliente.setToolTipText("insira o nome do cliente");

        txtEmailCliente.setToolTipText("insira o email do cliente");

        txtSenhaCliente.setToolTipText("defina uma senha");

        txtEnderecoCliente.setToolTipText("insira o endereço do cliente");

        try {
            ftxTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxTelefoneCliente.setToolTipText("adicione o número de telefone");

        txtDataCliente.setText("Data de nascimento");

        try {
            ftxDataCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxDataCliente.setToolTipText("insira a data de nascimento do cliente");

        try {
            ftxCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxCPFCliente.setToolTipText("insira o CPF do cliente");
        ftxCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxCPFClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.setToolTipText("cancelar a operação");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnSalvarCliente.setBackground(new java.awt.Color(102, 255, 0));
        btnSalvarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.setToolTipText("Salvar dados do cliente");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCliente)
                            .addComponent(lblCPFCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ftxDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmailCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSenhaCliente)
                                    .addComponent(lblEnderecoCliente)
                                    .addComponent(btnSalvarCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblTelefoneCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelarCliente)
                                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataCliente)
                    .addComponent(ftxDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailCliente)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneCliente)
                    .addComponent(ftxTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPFCliente)
                    .addComponent(ftxCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnderecoCliente)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaCliente)
                    .addComponent(txtSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCliente)
                    .addComponent(btnSalvarCliente))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        // TODO add your handling code here:
        boolean jaExiste = false;
        if (txtNomeCliente.getText().equals("") || ftxCPFCliente.getText().equals("") ||
            ftxDataCliente.getText().equals("") || txtEnderecoCliente.getText().equals("")
                || txtSenhaCliente.getText().equals("")|| txtEmailCliente.getText().equals("")
                || ftxTelefoneCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser inseridos!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        }else{
        String nome = txtNomeCliente.getText();
        String cpf = ftxCPFCliente.getText();
        String nascimentoCliente = ftxDataCliente.getText();
        String endereco = txtEnderecoCliente.getText();
        String senha = txtSenhaCliente.getText();
        String email = txtEmailCliente.getText();
        String telefone = ftxTelefoneCliente.getText();
        
        for(Cliente pessoa : listaClientes){
            if(pessoa.getEmail().equals(email)){
                jaExiste=true;
                JOptionPane.showMessageDialog(null, "Já existe um cliente cadastrado com esse Email!", "Error ao criar conta", JOptionPane.ERROR_MESSAGE);
                break;
            }else{
                
            }
        }
        if(!jaExiste){
        Cliente cliente = new Cliente(nome,cpf,email,senha,endereco,nascimentoCliente,telefone);
        listaClientes.add(cliente);
        clearClienteInfo();
        JOptionPane.showMessageDialog(null,"Cliente criado com sucesso!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        this.setVisible(false);
        }
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void ftxCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxCPFClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JFormattedTextField ftxCPFCliente;
    private javax.swing.JFormattedTextField ftxDataCliente;
    private javax.swing.JFormattedTextField ftxTelefoneCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblSenhaCliente;
    private javax.swing.JLabel lblTelefoneCliente;
    private javax.swing.JLabel txtDataCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtSenhaCliente;
    // End of variables declaration//GEN-END:variables
}
