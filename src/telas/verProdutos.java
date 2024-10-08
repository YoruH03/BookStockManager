
package telas;

import classes.Carrinho;
import static classes.Carrinho.listaProdutos;
import static classes.Estoque.estoque;
import classes.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author v
 */
public class verProdutos extends javax.swing.JFrame {

    /**
     * Creates new form verProdutos
     */
    public verProdutos() {
        initComponents();
        carregarTabelaProdutos();
        txtQuantidade.setText("1");
        Produto item;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        private void carregarTabelaProdutos(){
            DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Titulo","Autor","Gênero","Valor","Quant.Estoque"},0);
            
            for(int i=0;i<estoque.size();i++){
                Object linha[] = new Object[] {estoque.get(i).getTitulo(),
                                               estoque.get(i).getAutor(),
                                               estoque.get(i).getGenero(),
                                               estoque.get(i).getPreço(),
                                               estoque.get(i).getQuantidadeEstoque()};
                modeloTabelaProdutos.addRow(linha);
                
                
            }
            //Tabela recebe modelo de produtos do estoque
            tabela_produtos.setModel(modeloTabelaProdutos);
            
            tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabela_produtos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabela_produtos.getColumnModel().getColumn(2).setPreferredWidth(14);
            tabela_produtos.getColumnModel().getColumn(3).setPreferredWidth(8);
            tabela_produtos.getColumnModel().getColumn(4).setPreferredWidth(3);


            
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        lblResultadosPesquisa = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnSobre = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        titulo.setText("Produtos");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        Tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TabelaFocusGained(evt);
            }
        });

        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Gênero", "Valor", "quant. estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        Tabela.setViewportView(tabela_produtos);

        lblResultadosPesquisa.setText("Resultados da pesquisa");

        lblNome.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/information_info_1565.png"))); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/accept_icon-icons.com_74428.png"))); // NOI18N
        btnComprar.setText("Adicionar ao carrinho");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnSobre)
                        .addGap(199, 199, 199)
                        .addComponent(btnComprar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(lblResultadosPesquisa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisar)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(lblResultadosPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar)
                    .addComponent(btnSobre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        int i = tabela_produtos.getSelectedRow();
        String selected="";
        System.out.println(i);
        if(i>=0 && i<estoque.size()){
            Produto item = estoque.get(i);
            selected = item.getTitulo();
            System.out.println(item.getTitulo());
            txtTitulo.setText(item.getTitulo());
        }
        System.out.println("Item selecionado para compra foi: "+selected);
        Carrinho carrinho1 = new Carrinho(1,"27/08/2024");
        System.out.println("Carrinho Criado!");
        Produto itemComprado;
        for(Produto itemBusca : estoque){
            JOptionPane.showMessageDialog(null,"Busca Iniciada!", "Notificação Adicionar item ao carrinho",JOptionPane.PLAIN_MESSAGE);
            System.out.println("Busca inciada!");

            if(itemBusca.getTitulo().equals(selected)){
                JOptionPane.showMessageDialog(null,"Item Encontrado!", "Notificação Adicionar item ao carrinho",JOptionPane.PLAIN_MESSAGE);
                itemComprado = itemBusca;
                if(Integer.parseInt(txtQuantidade.getText())<itemComprado.getQuantidadeEstoque()){
                listaProdutos.add(itemComprado);
                itemComprado.setQuantidadeComprada(Integer.parseInt(txtQuantidade.getText()));
                itemBusca.setQuantidadeEstoque(itemBusca.getQuantidadeEstoque()-itemComprado.getQuantidadeComprada());
                JOptionPane.showMessageDialog(null,"Item adicionado ao carrinho com sucesso!", "Notificação Adicionar item ao carrinho",JOptionPane.PLAIN_MESSAGE);

                }
            }
        }
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void TabelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabelaFocusGained

    }//GEN-LAST:event_TabelaFocusGained

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        // TODO add your handling code here:
        int i = tabela_produtos.getSelectedRow();
        
        System.out.println(i);
        if(i>=0 && i<estoque.size()){
            Produto item = estoque.get(i);
            System.out.println(item.getTitulo());
            txtTitulo.setText(item.getTitulo());
        }
        
    }//GEN-LAST:event_tabela_produtosMouseClicked

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
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verProdutos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblResultadosPesquisa;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
