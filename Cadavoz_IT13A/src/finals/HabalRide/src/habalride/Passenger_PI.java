package habalride;

import javax.swing.JOptionPane;


public class Passenger_PI extends javax.swing.JFrame {
    public static String dropOffLocation = "";
    public static String serviceFee = "";
    
    public Passenger_PI() {
        initComponents();
        setSize(650, 450);
        
        String[] userInfo = Register.getLatestUser();
    if (userInfo[0] != null && userInfo[1] != null) {
        Username.setText("Username: " + userInfo[0]);
        Contact_No.setText("Contact No: " + userInfo[1]);
    } else {
        Username.setText("Username: N/A");
        Contact_No.setText("Contact No: N/A");
    }
    }

    public Passenger_PI(String username) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        Contact_No = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Logout1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Alae_Button = new javax.swing.JRadioButton();
        Sankanan_Button = new javax.swing.JRadioButton();
        Philips_Button = new javax.swing.JRadioButton();
        Lunocan_Button = new javax.swing.JRadioButton();
        Dalirig_Button = new javax.swing.JRadioButton();
        Lingion_Button = new javax.swing.JRadioButton();
        Dicklum_Button = new javax.swing.JRadioButton();
        Bliss_Button = new javax.swing.JRadioButton();
        SanMiguel_Button = new javax.swing.JRadioButton();
        Kihare_Button = new javax.swing.JRadioButton();
        Damilag_Button = new javax.swing.JRadioButton();
        Tankulan_Button = new javax.swing.JRadioButton();
        ENTER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 450));
        setSize(new java.awt.Dimension(650, 450));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username");

        Contact_No.setBackground(new java.awt.Color(0, 102, 102));
        Contact_No.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Contact_No.setForeground(new java.awt.Color(255, 255, 255));
        Contact_No.setText("Contact Number");

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habalride/image/logo.jpg"))); // NOI18N

        Logout1.setBackground(new java.awt.Color(0, 102, 153));
        Logout1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout1.setForeground(new java.awt.Color(255, 255, 255));
        Logout1.setText("Log Out");
        Logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Contact_No, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout1)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Contact_No, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(Logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 0));
        jScrollPane1.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Alae_Button.setText("Alae, Manolo Fortich Bukidnon                           P 50.00");
        Alae_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alae_ButtonActionPerformed(evt);
            }
        });

        Sankanan_Button.setText("Sankanan, Manolo Fortich Bukidnon                   P 120.00");
        Sankanan_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sankanan_ButtonActionPerformed(evt);
            }
        });

        Philips_Button.setText("Philips, Manolo Fortich Bukidnon                        P 100.00");

        Lunocan_Button.setText("Lunocan, Manolo Fortich Bukidnon                     P 20.00");

        Dalirig_Button.setText(" St. Joseph, Manolo Fortich Bukidnon                  P 20.00");

        Lingion_Button.setText("Lingi-on, Manolo Fortich Bukidnon                     P 50.00");
        Lingion_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lingion_ButtonActionPerformed(evt);
            }
        });

        Dicklum_Button.setText("Dicklum, Manolo Fortich Bukidnon                     P 30.00");

        Bliss_Button.setText("Bliss, Manolo Fortich Bukidnon                           P 60.00");

        SanMiguel_Button.setText("San Miguel, Manolo Fortich Bukidnon                P 50.00");

        Kihare_Button.setText("Kihare, Manolo Fortich Bukidnon                        P  20.00   ");

        Damilag_Button.setText("Damilag, Manolo Fortich Bukidnon                    P 100.00");

        Tankulan_Button.setText("Tankulan, Manolo Fortich Bukidnon                    P 20.00");

        ENTER.setBackground(new java.awt.Color(0, 102, 153));
        ENTER.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ENTER.setForeground(new java.awt.Color(255, 255, 255));
        ENTER.setText("ENTER");
        ENTER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kihare_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tankulan_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alae_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sankanan_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Philips_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lunocan_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dalirig_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lingion_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dicklum_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bliss_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SanMiguel_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Damilag_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Kihare_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tankulan_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alae_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sankanan_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Philips_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lunocan_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dalirig_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lingion_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dicklum_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bliss_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SanMiguel_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Damilag_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ENTER)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTERActionPerformed

    if (Kihare_Button.isSelected()) {
        dropOffLocation = "Kihare, Manolo Fortich Bukidnon";
        serviceFee = "P 20.00";
    } else if (Tankulan_Button.isSelected()) {
        dropOffLocation = "Tankulan, Manolo Fortich Bukidnon";
        serviceFee = "P 20.00";
    } else if (Alae_Button.isSelected()) {
        dropOffLocation = "Alae, Manolo Fortich Bukidnon";
        serviceFee = "P 50.00";
    } else if (Sankanan_Button.isSelected()) {
        dropOffLocation = "Sankanan, Manolo Fortich Bukidnon";
        serviceFee = "P 120.00";
    } else if (Philips_Button.isSelected()) {
        dropOffLocation = "Philips, Manolo Fortich Bukidnon";
        serviceFee = "P 100.00";
    } else if (Lunocan_Button.isSelected()) {
        dropOffLocation = "Lunocan, Manolo Fortich Bukidnon";
        serviceFee = "P 20.00";
    } else if (Dalirig_Button.isSelected()) {
        dropOffLocation = "St. Joseph, Manolo Fortich Bukidnon";
        serviceFee = "P 20.00";
    } else if (Lingion_Button.isSelected()) {
        dropOffLocation = "Lingi-on, Manolo Fortich Bukidnon";
        serviceFee = "P 50.00";
    } else if (Dicklum_Button.isSelected()) {
        dropOffLocation = "Dicklum, Manolo Fortich Bukidnon";
        serviceFee = "P 30.00";
    } else if (Bliss_Button.isSelected()) {
        dropOffLocation = "Bliss, Manolo Fortich Bukidnon";
        serviceFee = "P 60.00";
    } else if (SanMiguel_Button.isSelected()) {
        dropOffLocation = "San Miguel, Manolo Fortich Bukidnon";
        serviceFee = "P 50.00";
    } else if (Damilag_Button.isSelected()) {
        dropOffLocation = "Damilag, Manolo Fortich Bukidnon";
        serviceFee = "P 100.00";
    } else {
        JOptionPane.showMessageDialog(this, "Please select a drop-off location.");
        return;
    }
    JOptionPane.showMessageDialog(
        this,
        "Passenger PI selected. Redirecting to driver match...",
        "Redirecting",
        JOptionPane.INFORMATION_MESSAGE
    );

    
    Passenger_DriverMatch matchScreen = new Passenger_DriverMatch();
    matchScreen.setVisible(true);
    matchScreen.setLocationRelativeTo(null); 
    this.dispose();


    }//GEN-LAST:event_ENTERActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        int response = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to log out?",
        "Confirm Logout",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );

    if (response == JOptionPane.YES_OPTION) {
        this.dispose(); 
        new HomeScreen().setVisible(true);
    }
    }//GEN-LAST:event_Logout1ActionPerformed

    private void Lingion_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lingion_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lingion_ButtonActionPerformed

    private void Sankanan_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sankanan_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sankanan_ButtonActionPerformed

    private void Alae_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alae_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alae_ButtonActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passenger_PI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passenger_PI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Alae_Button;
    private javax.swing.JRadioButton Bliss_Button;
    private javax.swing.JLabel Contact_No;
    private javax.swing.JRadioButton Dalirig_Button;
    private javax.swing.JRadioButton Damilag_Button;
    private javax.swing.JRadioButton Dicklum_Button;
    private javax.swing.JButton ENTER;
    private javax.swing.JRadioButton Kihare_Button;
    private javax.swing.JRadioButton Lingion_Button;
    private javax.swing.JButton Logout1;
    private javax.swing.JRadioButton Lunocan_Button;
    private javax.swing.JRadioButton Philips_Button;
    private javax.swing.JRadioButton SanMiguel_Button;
    private javax.swing.JRadioButton Sankanan_Button;
    private javax.swing.JRadioButton Tankulan_Button;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
