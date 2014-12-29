/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perosnalInformation;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PersonalInformation extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInformation
     */
    public PersonalInformation() {
        initComponents();
        this.setLocationRelativeTo(this);
        rbMale.setSelected(true);
        rootPane.setDefaultButton(btnSubmit);
        this.setTitle("Personal Information");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbnGender = new javax.swing.ButtonGroup();
        pnlDetails = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        cbxTitle = new javax.swing.JComboBox();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        lblDOB = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        lblDay = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        lblMonth = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        lblOccupation = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        pnlPersonalInformation = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPersonalInformation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Information");

        pnlDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        lblTitle.setText("Title:");

        cbxTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs." }));
        cbxTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTitleActionPerformed(evt);
            }
        });
        cbxTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxTitleKeyPressed(evt);
            }
        });

        lblFirstName.setText("First Name:");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyTyped(evt);
            }
        });

        lblLastName.setText("Last Name:");

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        lblGender.setText("Gender:");

        rbnGender.add(rbMale);
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        rbnGender.add(rbFemale);
        rbFemale.setText("Female");

        lblDOB.setText("Date Of Birth:");

        txtDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayActionPerformed(evt);
            }
        });
        txtDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDayKeyTyped(evt);
            }
        });

        lblDay.setText("(Day)");

        txtMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonthKeyTyped(evt);
            }
        });

        lblMonth.setText("(Month)");

        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearKeyTyped(evt);
            }
        });

        lblYear.setText("(Year)");

        lblNationality.setText("Nationality:");

        txtNationality.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNationalityKeyTyped(evt);
            }
        });

        lblOccupation.setText("Occupation:");

        txtOccupation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOccupationKeyTyped(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblGender))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(rbMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbFemale))
                                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblLastName)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName))
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(lblDOB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDay, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMonth)
                        .addGap(18, 18, 18)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblYear)
                        .addGap(26, 26, 26))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailsLayout.createSequentialGroup()
                                .addComponent(lblOccupation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addComponent(lblNationality)
                                .addGap(7, 7, 7)))
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNationality, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(txtOccupation))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap())
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(cbxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDay)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonth)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNationality)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOccupation)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit))
        );

        pnlPersonalInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Information"));

        txtPersonalInformation.setEditable(false);
        txtPersonalInformation.setColumns(20);
        txtPersonalInformation.setLineWrap(true);
        txtPersonalInformation.setRows(5);
        jScrollPane1.setViewportView(txtPersonalInformation);

        javax.swing.GroupLayout pnlPersonalInformationLayout = new javax.swing.GroupLayout(pnlPersonalInformation);
        pnlPersonalInformation.setLayout(pnlPersonalInformationLayout);
        pnlPersonalInformationLayout.setHorizontalGroup(
            pnlPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        pnlPersonalInformationLayout.setVerticalGroup(
            pnlPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPersonalInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rbMaleActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(txtDay.getText().trim());
        if ((value > 1) && (value < 31)) {
            txtDay.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a day number between 1 and 31", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int val = Integer.parseInt(txtMonth.getText().trim());
        if ((val > 1) && (val < 12)) {
            txtMonth.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a month number between 1 and 12", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int value1 = Integer.parseInt(txtYear.getText().trim());
        if ((value1 > 1900) && (value1 < 2100)) {
            txtYear.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a year number between 1900 and 2100", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (txtFirstName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter your First Name", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtLastName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter your Last Name", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else if ((txtDay.getText().trim().equals("")) || (txtMonth.getText().trim().equals("")) || (txtYear.getText().trim().equals(""))) {
            JOptionPane.showMessageDialog(this, "Please fill into your Date Of Birth", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtNationality.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter your Nationality", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String title = cbxTitle.getSelectedItem().toString();

            String firstName = txtFirstName.getText();

            String lastName = txtLastName.getText();

            String gender;
            if (rbMale.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }

            int dateOfBirth = Integer.parseInt(txtYear.getText().toString());

            String nationality = txtNationality.getText();

            String occupation = txtOccupation.getText();

            main m
                    = new main(title, firstName, lastName, gender, dateOfBirth, nationality, occupation);
            txtPersonalInformation.setText(m.getPersonalInformation());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbxTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTitleActionPerformed
        // TODO add your handling code here:
       
       
        if (cbxTitle.getSelectedItem().equals("Mr.")) {
            rbMale.isSelected();
        }

        else {
            rbFemale.isSelected();
        }
    }//GEN-LAST:event_cbxTitleActionPerformed

    private void txtDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDayActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtDayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayKeyTyped
        // TODO add your handling code here:
        if (txtDay.getText().length() >= 2) {
            evt.consume();
        }
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch))) {
            evt.consume();
        }

    }//GEN-LAST:event_txtDayKeyTyped

    private void txtMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonthKeyTyped
        // TODO add your handling code here:
        if (txtMonth.getText().length() >= 2) {
            evt.consume();
        }
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMonthKeyTyped

    private void txtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyTyped
        // TODO add your handling code here:
        if (txtYear.getText().length() >= 4) {
            evt.consume();
        }
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtYearKeyTyped

    private void txtFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFirstNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtNationalityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNationalityKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNationalityKeyTyped

    private void txtOccupationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOccupationKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtOccupationKeyTyped

    private void cbxTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxTitleKeyPressed
        // TODO add your handling code here:
        if (cbxTitle.toString().equals("Mr.")) {
            rbMale.isSelected();

        }

        if (cbxTitle.toString().equals("Mrs.")) {
            rbFemale.isSelected();
        }
    }//GEN-LAST:event_cbxTitleKeyPressed

    public void changeGender(String title) {
        switch (title) {
            case "Mr.":
                rbMale.isSelected();
                break;
            case "Mrs.":
                rbFemale.isSelected();
                break;
        }
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
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbxTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlPersonalInformation;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.ButtonGroup rbnGender;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextArea txtPersonalInformation;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
