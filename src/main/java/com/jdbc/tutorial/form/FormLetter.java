/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.form;

/**
 *
 * @author asiro
 */
public class FormLetter extends javax.swing.JFrame {

    /**
     * Creates new form FromLetter
     */
    public FormLetter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LetterTable = new javax.swing.JTable();
        dataPanel = new javax.swing.JPanel();
        senderLabel = new javax.swing.JLabel();
        senderText = new javax.swing.JTextField();
        recipientLabel = new javax.swing.JLabel();
        recipientText = new javax.swing.JTextField();
        dataLabel = new javax.swing.JLabel();
        dataText = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        numberText = new javax.swing.JTextField();
        subjectLabel = new javax.swing.JLabel();
        subjectText = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        messageText = new javax.swing.JTextField();
        workerLabel = new javax.swing.JLabel();
        workerText = new javax.swing.JTextField();
        executorLabel = new javax.swing.JLabel();
        executorText = new javax.swing.JTextField();
        SenderPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FormLetter"); // NOI18N

        LetterTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(LetterTable);

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataPanel.setLayout(new java.awt.GridLayout(8, 2));

        senderLabel.setText("Sender");
        dataPanel.add(senderLabel);
        dataPanel.add(senderText);

        recipientLabel.setText("Recipient");
        dataPanel.add(recipientLabel);
        dataPanel.add(recipientText);

        dataLabel.setText("Data");
        dataPanel.add(dataLabel);
        dataPanel.add(dataText);

        numberLabel.setText("Number");
        dataPanel.add(numberLabel);
        dataPanel.add(numberText);

        subjectLabel.setText("Subject");
        dataPanel.add(subjectLabel);
        dataPanel.add(subjectText);

        messageLabel.setText("Message");
        dataPanel.add(messageLabel);
        dataPanel.add(messageText);

        workerLabel.setText("Worker");
        dataPanel.add(workerLabel);
        dataPanel.add(workerText);

        executorLabel.setText("Executor");
        dataPanel.add(executorLabel);
        dataPanel.add(executorText);

        SenderPanel.setBackground(new java.awt.Color(255, 255, 255));
        SenderPanel.setLayout(new java.awt.GridLayout(3, 1));

        addButton.setText("Add");
        SenderPanel.add(addButton);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        SenderPanel.add(editButton);

        removeButton.setText("Remove");
        SenderPanel.add(removeButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SenderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SenderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLetter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LetterTable;
    private javax.swing.JPanel SenderPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JTextField dataText;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel executorLabel;
    private javax.swing.JTextField executorText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageText;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberText;
    private javax.swing.JLabel recipientLabel;
    private javax.swing.JTextField recipientText;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel senderLabel;
    private javax.swing.JTextField senderText;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField subjectText;
    private javax.swing.JLabel workerLabel;
    private javax.swing.JTextField workerText;
    // End of variables declaration//GEN-END:variables
}
