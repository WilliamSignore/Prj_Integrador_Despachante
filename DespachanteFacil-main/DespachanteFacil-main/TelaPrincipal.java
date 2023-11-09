package view;


public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnCadUsuario = new javax.swing.JMenuItem();
        jMnCadCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");

        jMenu1.setText("Cadastros");

        jMnCadUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnCadUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMnCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usario.png"))); // NOI18N
        jMnCadUsuario.setText("Cadastro de Usuário");
        jMnCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCadUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMnCadUsuario);

        jMnCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnCadCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMnCadCliente.setText("Cadastro de Cliente");
        jMnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCadClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMnCadCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatorio");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMnCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnCadUsuarioActionPerformed
        TelaCadastroUsuario tela = new TelaCadastroUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_jMnCadUsuarioActionPerformed

    private void jMnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnCadClienteActionPerformed
        TelaCliente tela = new TelaCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_jMnCadClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMnCadCliente;
    public static javax.swing.JMenuItem jMnCadUsuario;
    // End of variables declaration//GEN-END:variables
}
