/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.forms;

import hms.dao.PatientAccess;
import hms.dao.ZumbaAccess;
import javax.swing.JOptionPane;

/**
 *
 * @author Deshan
 */
public class ZumbaMemeberDetailsForm extends javax.swing.JFrame {

    /**
     * Creates new form ZumbaMemeberDetailsForm
     */
    public ZumbaMemeberDetailsForm() {
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

        jLabel1 = new javax.swing.JLabel();
        memberTxt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        memberID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        genderTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        contactTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        daoTxt = new javax.swing.JTextField();
        dobTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Add Zumba member Details");

        jLabel2.setText("Member ID");

        jLabel7.setText("Gender");

        jLabel9.setText("Address");

        jLabel10.setText("ContactNo");

        contactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("dao");

        daoTxt.setText("2014-06-23");

        dobTxt.setText("1992-12-1");

        jLabel8.setText("DOB");

        javax.swing.GroupLayout memberTxtLayout = new javax.swing.GroupLayout(memberTxt);
        memberTxt.setLayout(memberTxtLayout);
        memberTxtLayout.setHorizontalGroup(
            memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberTxtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(contactTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(memberID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTxt)
                    .addComponent(genderTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobTxt, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        memberTxtLayout.setVerticalGroup(
            memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberTxtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(memberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(daoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(memberTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(memberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(memberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        if (memberID.getText() == null || memberID.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter Member ID !");

        } else if (daoTxt.getText() == null || daoTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter DOA !");

        } else if (contactTxt.getText() == null || contactTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter member contact number !");

        } else if (genderTxt.getText() == null || genderTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter mamber gender !");

        } else if (addressTxt.getText() == null || addressTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter member address !");

        } else if (dobTxt.getText() == null || dobTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter member date of birth !");

        }else if (!(memberID.getText().matches("[0-9]+"))){
            
            JOptionPane.showMessageDialog(this, "Please enter numbers for id !");
            
        }else {

            String memberId = memberID.getText();
            String dao = daoTxt.getText();
            String contact = contactTxt.getText();
            String gender = genderTxt.getText();
            String address = addressTxt.getText();
            String dob = dobTxt.getText();

            ZumbaAccess pa = new ZumbaAccess();
            boolean addPatient = pa.addZumbaMember(memberId, dao, contact, address, gender, dob);
            
            String message = "Added Sucessfully";
            
            if (!addPatient) {
                message = "cannot add";
            }
            
            JOptionPane.showMessageDialog(this, message);

        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        memberID.setText(null);
        daoTxt.setText(null);
        contactTxt.setText(null);
        genderTxt.setText(null);
        addressTxt.setText(null);
        dobTxt.setText(null);
        
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ZumbaMemeberDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZumbaMemeberDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZumbaMemeberDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZumbaMemeberDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZumbaMemeberDetailsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JTextField daoTxt;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField memberID;
    private javax.swing.JPanel memberTxt;
    // End of variables declaration//GEN-END:variables
}
