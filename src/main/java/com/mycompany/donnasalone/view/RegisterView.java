/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.view;

import com.mycompany.donnasalone.controll.RegisterController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jonas
 */
public class RegisterView extends javax.swing.JFrame {
    private final RegisterController controller;
                

    /**
     * Creates new form RegisterView
     */
    public RegisterView() {
        initComponents();
         controller = new RegisterController(this);
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Nascimento = new javax.swing.JFormattedTextField();
        jTextFieldTelephone = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela cadastro");
        setLocation(new java.awt.Point(500, 30));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(180, 180, 224));
        jLabel1.setText("Tela de cadastro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 400, -1));

        jButtonSave.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 210, 30));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 290, -1));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 290, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 18)); // NOI18N
        jLabel2.setText("nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 110, -1));

        try {
            jTextField1Nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextField1Nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, -1));

        try {
            jTextFieldTelephone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextFieldTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 200, -1));

        jRadioButton1.setText("M");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jRadioButton2.setText("F");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 18)); // NOI18N
        jLabel3.setText("Sexo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 59, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 18)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 18)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, -1));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 18)); // NOI18N
        jLabel7.setText("Nascimento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 160, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/jonas/NetBeansProjects/donnaSalone/src/main/java/com/mycompany/donnasalone/img/free")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       
        
         if(this.getjRadioButton2().isSelected()){
            this.getjRadioButton1().setSelected(false);
        }else{
            this.getjRadioButton2().setSelected(false);
            
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(this.getjRadioButton1().isSelected()){
            this.getjRadioButton2().setSelected(false);
        }else{
            this.getjRadioButton1().setSelected(false);
            
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new ServiceView().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
      
        try {
            //cadastra client
            controller.createClient();
            this.setVisible(false);
            new ServiceView().setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    public JFormattedTextField getjTextField1Nascimento() {
        return jTextField1Nascimento;
    }

    public void setjTextField1Nascimento(JFormattedTextField jTextField1Nascimento) {
        this.jTextField1Nascimento = jTextField1Nascimento;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldName() {
        return jTextFieldName;
    }

    public void setjTextFieldName(JTextField jTextFieldName) {
        this.jTextFieldName = jTextFieldName;
    }

    public JFormattedTextField getjTextFieldTelephone() {
        return jTextFieldTelephone;
    }

    public void setjTextFieldTelephone(JFormattedTextField jTextFieldTelephone) {
        this.jTextFieldTelephone = jTextFieldTelephone;
    }

   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JFormattedTextField jTextField1Nascimento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JFormattedTextField jTextFieldTelephone;
    // End of variables declaration//GEN-END:variables
}
