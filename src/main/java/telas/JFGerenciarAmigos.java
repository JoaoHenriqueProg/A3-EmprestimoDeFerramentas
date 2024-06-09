/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.AmigoDAO;
import dao.EmprestimoDAO;
import dao.FerramentaDAO;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;

/**
 *
 * @author joaoh
 */
public class JFGerenciarAmigos extends javax.swing.JFrame {

    /**
     * Creates new form JFAddFriend
     */
    public JFGerenciarAmigos() {
        initComponents();
        renderAmigosTable();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFNumero = new javax.swing.JTextField();
        JBAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAmigos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        JTFIdRemover = new javax.swing.JTextField();
        JBRemover = new javax.swing.JButton();
        JBAplicar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar amigos");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 550));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Endereço");

        JTFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEnderecoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Número");

        JTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumeroActionPerformed(evt);
            }
        });

        JBAdicionar.setBackground(new java.awt.Color(73, 159, 104));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JTAmigos.setBackground(new java.awt.Color(204, 204, 204));
        JTAmigos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JTAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Usuario inicial", null, "(48) 91234-5678"},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Endereco", "Número"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTAmigos.setGridColor(new java.awt.Color(51, 51, 51));
        JTAmigos.setShowGrid(false);
        jScrollPane1.setViewportView(JTAmigos);
        if (JTAmigos.getColumnModel().getColumnCount() > 0) {
            JTAmigos.getColumnModel().getColumn(0).setResizable(false);
            JTAmigos.getColumnModel().getColumn(1).setResizable(false);
            JTAmigos.getColumnModel().getColumn(1).setPreferredWidth(150);
            JTAmigos.getColumnModel().getColumn(2).setResizable(false);
            JTAmigos.getColumnModel().getColumn(3).setResizable(false);
            JTAmigos.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jLabel5.setText("Id");

        JTFIdRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIdRemoverActionPerformed(evt);
            }
        });

        JBRemover.setBackground(new java.awt.Color(186, 63, 29));
        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });

        JBAplicar.setBackground(new java.awt.Color(54, 70, 125));
        JBAplicar.setText("Aplicar mudanças");
        JBAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(JTFEndereco)
                    .addComponent(JTFNumero)
                    .addComponent(JTFIdRemover, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBAplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFIdRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(JBAplicar)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void renderAmigosTable() {
        AmigoDAO dao = new AmigoDAO();
        DefaultTableModel model = (DefaultTableModel) JTAmigos.getModel();
        while (model.getRowCount() != 0) {
            model.removeRow(0);
        }
        for (Amigo amigue : dao.getMinhaLista()) {
            model.addRow(new Object[]{amigue.getId(), amigue.getNome(), amigue.getEndereco(), amigue.getTelefone(), 0});
        }
    }

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JTFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEnderecoActionPerformed

    private void JTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumeroActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        if (JTFNome.getText().equals("") || JTFNumero.getText().equals("") || JTFEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos estão vazios!");
            return;
        }

        AmigoDAO dao = new AmigoDAO();
        String nome = JTFNome.getText();
        String endereco = JTFEndereco.getText();
        String numero = JTFNumero.getText();

        dao.insertAmigoBD(new Amigo(nome, endereco, numero, dao.maiorID() + 1));

        renderAmigosTable();
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JTFIdRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdRemoverActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        EmprestimoDAO empDao = new EmprestimoDAO();
        AmigoDAO dao = new AmigoDAO();
        
        if (JTFIdRemover.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo está vazio!");
            return;
        }
        
        // primeiro checa se há empréstimos em aberto
        for (Emprestimo emp : empDao.getMinhaLista()) {
            if (emp.getAmigo() == Integer.parseInt(JTFIdRemover.getText())) {
                if (emp.getQuantidade() > 0) {
                    JOptionPane.showMessageDialog(null, "Não é possível apagar amigos com empréstimos abertos.");
                    return;
                }
            }
        }
        // depois checa se há empréstimos passados
        for (Emprestimo emp : empDao.getMinhaLista()) {
            if (emp.getAmigo() == Integer.parseInt(JTFIdRemover.getText())) {
                String erro = "Há empréstimos passados asssociados a esse amigo.\nContinuar com essa mudança fará o nome dele(a) não aparecer nos registro.\n";
                erro += "Deseja continuar com essa ação?";
                int pedroCertezas = JOptionPane.showConfirmDialog(null, erro, "Operação perigosa", YES_NO_OPTION);
                if (pedroCertezas == 1 || pedroCertezas == -1) { // 1 = não e -1 = fechou a janela sem responder
                    return;
                }
                break;
            }
        }
        
        dao.deleteAmigoBD(Integer.parseInt(JTFIdRemover.getText()));
        renderAmigosTable();
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JBAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAplicarActionPerformed
        AmigoDAO dao = new AmigoDAO();
        for (int i = 0; i < JTAmigos.getRowCount(); i++) {
            String id = JTAmigos.getModel().getValueAt(i, 0).toString();
            String nome = JTAmigos.getModel().getValueAt(i, 1).toString();
            String endereco = JTAmigos.getModel().getValueAt(i, 2).toString();
            String numero = JTAmigos.getModel().getValueAt(i, 3).toString();
            dao.updateAmigoBD(new Amigo(nome, endereco, numero, Integer.parseInt(id)));
        }
        renderAmigosTable();
        JOptionPane.showMessageDialog(null, "Mudanças aplicadas com sucesso");
    }//GEN-LAST:event_JBAplicarActionPerformed

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
            java.util.logging.Logger.getLogger(JFGerenciarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAplicar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JTable JTAmigos;
    private javax.swing.JTextField JTFEndereco;
    private javax.swing.JTextField JTFIdRemover;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
