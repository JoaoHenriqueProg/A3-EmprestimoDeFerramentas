package telas;

import dao.AmigoDAO;
import dao.FerramentaDAO;
import modelo.Amigo;
import modelo.Ferramenta;

public class JFCriarAluguel extends javax.swing.JFrame {

    public JFCriarAluguel() {
        initComponents();

        renderFerramentasList();
        setAmigosList();
        setFerramentaList();
    }

    @SuppressWarnings("unchecked")

    private void setAmigosList() {
        AmigoDAO dao = new AmigoDAO();
        JCBAmigos.removeAllItems();
        for (Amigo amigue : dao.getMinhaLista()) {
            JCBAmigos.addItem(amigue.getId() + " - " + amigue.getNome());
        }
    }

    private void setFerramentaList() {
        FerramentaDAO dao = new FerramentaDAO();
        JCBFerramentas.removeAllItems();
        for (Ferramenta ferros : dao.getMinhaLista()) {
            JCBFerramentas.addItem(ferros.getId() + " - " + ferros.getNome());
        }
    }

    private void renderFerramentasList() {
        FerramentaDAO dao = new FerramentaDAO();
//         DefaultTableModel model = (DefaultTableModel) JTFerramentas.getModel();
//        while (model.getRowCount() != 0) {
//            model.removeRow(0);
//        }
//        for (Ferramenta ferros : dao.getMinhaLista()) {
//            model.addRow(new Object[]{ferros.getNome(), ferros.getQuantidade()});
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        JLFerramenta = new javax.swing.JLabel();
        JLQuantidade = new javax.swing.JLabel();
        JLInicioAluguel = new javax.swing.JLabel();
        JTFNumeroLocador = new javax.swing.JTextField();
        JBGerarAluguel = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        JCBAmigos = new javax.swing.JComboBox<>();
        JLIdLocador1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTFerramentas = new javax.swing.JTable();
        JCBFerramentas = new javax.swing.JComboBox<>();
        JLInicioAluguel1 = new javax.swing.JLabel();
        JLIdLocador3 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Id do Locador:");

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
        setTitle("Criar aluguel");

        jPanel3.setBackground(new java.awt.Color(54, 70, 125));

        JLFerramenta.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JLFerramenta.setForeground(new java.awt.Color(240, 240, 240));
        JLFerramenta.setText("Ferramenta");

        JLQuantidade.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        JLQuantidade.setForeground(new java.awt.Color(240, 240, 240));
        JLQuantidade.setText("Quantidade: ???");

        JLInicioAluguel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JLInicioAluguel.setForeground(new java.awt.Color(240, 240, 240));
        JLInicioAluguel.setText("Locador");

        JTFNumeroLocador.setEditable(false);
        JTFNumeroLocador.setPreferredSize(new java.awt.Dimension(64, 26));
        JTFNumeroLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumeroLocadorActionPerformed(evt);
            }
        });

        JBGerarAluguel.setBackground(new java.awt.Color(73, 159, 104));
        JBGerarAluguel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JBGerarAluguel.setText("Alugar");
        JBGerarAluguel.setPreferredSize(new java.awt.Dimension(129, 22));
        JBGerarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerarAluguelActionPerformed(evt);
            }
        });

        JBLimpar.setBackground(new java.awt.Color(186, 63, 29));
        JBLimpar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JBLimpar.setText("Cancelar");
        JBLimpar.setPreferredSize(new java.awt.Dimension(129, 22));
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JCBAmigos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JLIdLocador1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JLIdLocador1.setForeground(new java.awt.Color(240, 240, 240));
        JLIdLocador1.setText("Data:");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        JTFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JTFerramentas);
        if (JTFerramentas.getColumnModel().getColumnCount() > 0) {
            JTFerramentas.getColumnModel().getColumn(0).setResizable(false);
            JTFerramentas.getColumnModel().getColumn(1).setResizable(false);
        }

        JCBFerramentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBFerramentas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBFerramentasItemStateChanged(evt);
            }
        });
        JCBFerramentas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JCBFerramentasPropertyChange(evt);
            }
        });

        JLInicioAluguel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JLInicioAluguel1.setForeground(new java.awt.Color(240, 240, 240));
        JLInicioAluguel1.setText("Ferramenta");

        JLIdLocador3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JLIdLocador3.setForeground(new java.awt.Color(240, 240, 240));
        JLIdLocador3.setText("Quantidade");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBGerarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCBAmigos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(JLInicioAluguel)
                                                .addComponent(JLIdLocador1)
                                                .addComponent(JTFNumeroLocador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCBFerramentas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLInicioAluguel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLIdLocador3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLFerramenta)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(176, 176, 176))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFerramenta)
                    .addComponent(JLInicioAluguel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JCBAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLInicioAluguel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLIdLocador3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNumeroLocador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLIdLocador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGerarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNumeroLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumeroLocadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumeroLocadorActionPerformed

    private void JBGerarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerarAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBGerarAluguelActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBLimparActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void JCBFerramentasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JCBFerramentasPropertyChange
        // TODO: achar um jeito de remover essa função
    }//GEN-LAST:event_JCBFerramentasPropertyChange

    private void JCBFerramentasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBFerramentasItemStateChanged
        int novoI = JCBFerramentas.getSelectedIndex();
        if (novoI != -1) {
            FerramentaDAO dao = new FerramentaDAO();
            int novoId = Integer.parseInt(JCBFerramentas.getItemAt(novoI).split(" ")[0]);
            JLQuantidade.setText("Disponível: " + dao.carregaFerramenta(novoId).getQuantidade());
        }
    }//GEN-LAST:event_JCBFerramentasItemStateChanged

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
            java.util.logging.Logger.getLogger(JFCriarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCriarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCriarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCriarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCriarAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGerarAluguel;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JComboBox<String> JCBAmigos;
    private javax.swing.JComboBox<String> JCBFerramentas;
    private javax.swing.JLabel JLFerramenta;
    private javax.swing.JLabel JLIdLocador1;
    private javax.swing.JLabel JLIdLocador3;
    private javax.swing.JLabel JLInicioAluguel;
    private javax.swing.JLabel JLInicioAluguel1;
    private javax.swing.JLabel JLQuantidade;
    private javax.swing.JTextField JTFNumeroLocador;
    private javax.swing.JTable JTFerramentas;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
