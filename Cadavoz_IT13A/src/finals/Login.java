/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        setBounds(600, 300, 400, 250);
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextUsername = new javax.swing.JTextArea();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jLabelUsername.setText("Username:");
        getContentPane().add(jLabelUsername);

        jTextUsername.setColumns(20);
        jTextUsername.setRows(5);
        jScrollPane1.setViewportView(jTextUsername);

        getContentPane().add(jScrollPane1);

        jLabelPassword.setText("Password:");
        getContentPane().add(jLabelPassword);
        getContentPane().add(jPasswordField);

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButtonLoginActionPerformed(evt);
        });
        getContentPane().add(jButtonLogin);

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButtonCancelActionPerformed(evt);
        });
        getContentPane().add(jButtonCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String username = jTextUsername.getText();
        String password = new String(jPasswordField.getPassword());
        
        saveToFile(username,password);
        
        JOptionPane.showMessageDialog(this, "Account saved successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void saveToFile(String username, String password){
        try{
            File file = new File("C:\\Users\\ADMIN\\Documents\\User_credentials.txt");
    
            try (BufferedWriter userdata = new BufferedWriter(new FileWriter(file,true))) {
                userdata.write("Username:" + username + ", password: "+ password);
                userdata.newLine();
            }
    
    }catch (IOException e){
        JOptionPane.showMessageDialog(this, "Error Saving Account", "Error", JOptionPane.ERROR_MESSAGE);
    
        }  
    }
    
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jTextUsername.setText("");
        jPasswordField.setText("");
    }//GEN-LAST:event_jButtonCancelActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextUsername;
    // End of variables declaration//GEN-END:variables

   
}