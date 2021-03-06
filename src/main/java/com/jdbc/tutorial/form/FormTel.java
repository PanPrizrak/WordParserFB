/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.form;

import com.jdbc.tutorial.entity.Tel;
import com.jdbc.tutorial.dao.TelDAO;
import com.jdbc.tutorial.model.TelTableModel;
import com.jdbc.tutorial.main.RunFormMain;


import javax.swing.table.TableModel;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author asiro
 */
public class FormTel extends javax.swing.JFrame {

    /**
     * Creates new form FormTel
     */
    
    private Tel tel = new Tel();
    private final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springFB.xml");
    private final TelDAO telDAO = context.getBean(TelDAO.class);
    private int NSR = 0;
    
    private void refresh(){
        TelTable.setModel(new TelTableModel(telDAO.listTel()));
    }
    
    private void addORupdate(String buf){
        tel.setTel(telText.getText());
        if (senderText.getText().toString().length() == 0) {
            tel.setSender_id(null);
        } else {
            tel.setSender_id(new Integer(senderText.getText()));
        }
        if (recipientText.getText().toString().length() == 0) {
            tel.setRecipient_id(null);
        } else {
            tel.setRecipient_id(new Integer(recipientText.getText()));
        }
        switch(buf){
            case "add":{
                telDAO.addTell(tel);
                break;
            }
            case "update": {
                tel.setId(NSR);
                telDAO.updateTel(tel);
                break;
            }
        }
        this.refresh();
        initComponents();
        
    }
    
    public FormTel() {
        initComponents();
        this.refresh();
    }
           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataPanel = new javax.swing.JPanel();
        telLabel = new javax.swing.JLabel();
        telText = new javax.swing.JTextField();
        senderLabel = new javax.swing.JLabel();
        senderText = new javax.swing.JTextField();
        recipientLabel = new javax.swing.JLabel();
        recipientText = new javax.swing.JTextField();
        senderPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TelTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setName("FormTel"); // NOI18N
        setSize(new java.awt.Dimension(600, 600));

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataPanel.setLayout(new java.awt.GridLayout(3, 2));

        telLabel.setText("Tel");
        dataPanel.add(telLabel);
        dataPanel.add(telText);

        senderLabel.setText("Sender");
        dataPanel.add(senderLabel);
        dataPanel.add(senderText);

        recipientLabel.setText("Recipient");
        dataPanel.add(recipientLabel);
        dataPanel.add(recipientText);

        senderPanel.setBackground(new java.awt.Color(255, 255, 255));
        senderPanel.setLayout(new java.awt.GridLayout(4, 1));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        senderPanel.add(addButton);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        senderPanel.add(editButton);

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        senderPanel.add(removeButton);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        senderPanel.add(backButton);

        TelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TelTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(senderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelTableMouseClicked
        // TODO add your handling code here:
        NSR = TelTable.getSelectedRow();
        TableModel model = TelTable.getModel();
        telText.setText(model.getValueAt(NSR, 1).toString());
        senderText.setText(model.getValueAt(NSR, 2).toString());
        recipientText.setText(model.getValueAt(NSR, 3).toString());
        NSR = (int) model.getValueAt(NSR, 0);
    }//GEN-LAST:event_TelTableMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        this.addORupdate("add");
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        this.addORupdate("update");
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        telDAO.removeTel(NSR);
        this.refresh();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        context.close();
        this.hide();
        RunFormMain.Run();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormTel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TelTable;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel recipientLabel;
    private javax.swing.JTextField recipientText;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel senderLabel;
    private javax.swing.JPanel senderPanel;
    private javax.swing.JTextField senderText;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField telText;
    // End of variables declaration//GEN-END:variables
}
