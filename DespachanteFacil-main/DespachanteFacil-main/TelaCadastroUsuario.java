/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.sun.java.accessibility.util.SwingEventMonitor;
import com.sun.security.auth.module.JndiLoginModule;
import controller.ModuleConexao;
import controller.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private ListSelectionModel listModel;
    List<Usuario> listaUsuarios;

    public TelaCadastroUsuario() {
        initComponents();
    }
     
    public void listar() {
        UsuarioDAO dao = new UsuarioDAO();
       
        tableModel = (DefaultTableModel) jTableUsuario.getModel();
        if (jTxtFiltroCliente.getText().isEmpty()) {
            listaUsuarios = dao.consultaUsuarios();
        } else {
            listaUsuarios = dao.consultaUsuarioNome(jTxtFiltroCliente.getText());
        }
        tableModel.setNumRows(0);
        for (Usuario usuario : listaUsuarios) {
            tableModel.addRow(new Object[]{
                usuario.getId(),
                usuario.getNome(),
                usuario.getLogin(),
                usuario.getSenha(),
                usuario.getPerfil()});
        }

    }

    private void mostraDetalheUsuario() {
        if (jTableUsuario.getSelectedRow() != -1) {
            int indice = jTableUsuario.getSelectedRow();
            jCodigo.setText(String.valueOf(listaUsuarios.get(indice).getId()));
            jTxtNome.setText(listaUsuarios.get(indice).getNome());
            jTxtLogin.setText(listaUsuarios.get(indice).getLogin());
            jTxtSenha.setText(listaUsuarios.get(indice).getSenha());
            jCbxPerfil.setSelectedItem(listaUsuarios.get(indice).getPerfil());
        } else {
            jCodigo.setText(null);
            jTxtNome.setText(null);
            jTxtLogin.setText(null);
            jTxtSenha.setText(null);
            jCbxPerfil.setSelectedItem(null);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JPanielDadosUsuario = new javax.swing.JTabbedPane();
        Dados = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtLogin = new javax.swing.JTextField();
        jTxtSenha = new javax.swing.JTextField();
        jCbxPerfil = new javax.swing.JComboBox<>();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        Consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTxtFiltroCliente = new javax.swing.JTextField();
        jBtnBusca = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Dados.setPreferredSize(new java.awt.Dimension(500, 355));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Nome: ");

        jTxtNome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Perfil: ");

        jTxtLogin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTxtSenha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jCbxPerfil.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador" }));

        jBtnCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBtnCadastrar.setMnemonic('c');
        jBtnCadastrar.setText("Cadastrar");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jBtnEditar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBtnEditar.setMnemonic('e');
        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnExcluir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBtnExcluir.setMnemonic('d');
        jBtnExcluir.setText("Deletar");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Codigo: ");

        jCodigo.setEditable(false);
        jCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnCadastrar)
                                .addGap(97, 97, 97)
                                .addComponent(jBtnEditar)
                                .addGap(89, 89, 89)
                                .addComponent(jBtnExcluir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnCadastrar, jBtnEditar, jBtnExcluir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnExcluir))
                .addGap(212, 212, 212))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnCadastrar, jBtnEditar, jBtnExcluir});

        javax.swing.GroupLayout DadosLayout = new javax.swing.GroupLayout(Dados);
        Dados.setLayout(DadosLayout);
        DadosLayout.setHorizontalGroup(
            DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DadosLayout.setVerticalGroup(
            DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanielDadosUsuario.addTab("Dados Usuários", Dados);

        jTableUsuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Login", "Senha", "Perfil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Nome: ");

        jTxtFiltroCliente.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTxtFiltroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtFiltroClienteKeyPressed(evt);
            }
        });

        jBtnBusca.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBtnBusca.setText("Buscar");

        javax.swing.GroupLayout ConsultaLayout = new javax.swing.GroupLayout(Consulta);
        Consulta.setLayout(ConsultaLayout);
        ConsultaLayout.setHorizontalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ConsultaLayout.setVerticalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBusca))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanielDadosUsuario.addTab("Consutas", Consulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanielDadosUsuario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanielDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        Usuario usuario = new Usuario();
        usuario.setNome(jTxtNome.getText());
        usuario.setLogin(jTxtLogin.getText());
        usuario.setSenha(jTxtSenha.getText());
        usuario.setPerfil((String) jCbxPerfil.getSelectedItem());

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (usuario != null) {
            usuarioDAO.cadastrarUsuario(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }
        listar(); 
        jCodigo.setText("");
        jTxtNome.setText("");
        jTxtLogin.setText("");
        jTxtSenha.setText("");
        jCbxPerfil.setSelectedIndex(1);
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void jTxtFiltroClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtFiltroClienteKeyPressed
        String nome = jTxtFiltroCliente.getText();
        UsuarioDAO dao = new UsuarioDAO();
        List<Usuario> lista = dao.consultaUsuarioNome(nome);
        DefaultTableModel dados = (DefaultTableModel) jTableUsuario.getModel();
        dados.setRowCount(0);
        for (Usuario usuario : lista) {
            dados.addRow(new Object[]{
                usuario.getNome(),
                usuario.getLogin(),
                usuario.getSenha(),
                usuario.getPerfil(),
            });
            
        }

    }//GEN-LAST:event_jTxtFiltroClienteKeyPressed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        UsuarioDAO usuarioDao = new UsuarioDAO();
        if(usuarioDao.excluirUsuario(listaUsuarios.get(jTableUsuario.getSelectedRow()))){
            JOptionPane.showMessageDialog(this, "Dados do usuário excluídos com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            listar();
            jCodigo.setText("");
            jTxtNome.setText("");
            jTxtLogin.setText("");
            jTxtSenha.setText("");
            jCbxPerfil.setSelectedIndex(1);
           
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir os dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        JPanielDadosUsuario.setSelectedIndex(0);
        mostraDetalheUsuario();
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        if (jTxtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o nome do Cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            Usuario usuario = new Usuario();
            usuario.setId(listaUsuarios.get(jTableUsuario.getSelectedRow()).getId());
            usuario.setNome(jTxtNome.getText().trim());
            usuario.setLogin(jTxtLogin.getText().trim());
            usuario.setSenha(jTxtSenha.getText().trim());
            usuario.setPerfil(jCbxPerfil.getSelectedItem().toString());

            UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (usuarioDAO.alterarUsuario(usuario)) {
            JOptionPane.showMessageDialog(this, "Dados alterados com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar Dados!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
        listar();
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
      
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigoActionPerformed
       try {
    Connection conexao = ModuleConexao.conectar();
    PreparedStatement stmt = conexao.prepareStatement("INSERT INTO usuario (nome) VALUES (?)");
    stmt.setString(1, "Nome do Registro");

    stmt.executeUpdate();

    stmt.close();
    ModuleConexao.desconectar(conexao);
} catch (SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jCodigoActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consulta;
    private javax.swing.JPanel Dados;
    private javax.swing.JTabbedPane JPanielDadosUsuario;
    private javax.swing.JButton jBtnBusca;
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JComboBox<String> jCbxPerfil;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTxtFiltroCliente;
    private javax.swing.JTextField jTxtLogin;
    private javax.swing.JTextField jTxtNome;
    public static javax.swing.JTextField jTxtSenha;
    // End of variables declaration//GEN-END:variables
}
