/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanproject;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sarthak
 */
public class LoanAnalay extends javax.swing.JFrame {

    boolean computePayment;

    public boolean validateDecimalNumber(JTextField tf) {
        String s = tf.getText().trim();
        boolean hasDecimal = false;
        boolean valid = true;
        if (s.length() == 0) {
            valid = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    continue;
                } else if (c == '.' && !hasDecimal) {
                    hasDecimal = true;
                } else {
                    valid = false;
                }
            }

        }
        tf.setText(s);
        if (!valid) {
            tf.requestFocus();
        }
        return (valid);
    }

    public LoanAnalay() {
        initComponents();
           this.setLocationRelativeTo(null);
      
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
        BalanceLebel = new javax.swing.JLabel();
        BalanceTextField1 = new javax.swing.JTextField();
        InterestLabel = new javax.swing.JLabel();
        InterestTextField = new javax.swing.JTextField();
        MonthLabel3 = new javax.swing.JLabel();
        MonthTextField = new javax.swing.JTextField();
        PaymentLabel4 = new javax.swing.JLabel();
        PaymentTextField = new javax.swing.JTextField();
        ComputeButtom = new javax.swing.JButton();
        NewLoanButton2 = new javax.swing.JButton();
        MonthButtom = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        AnalysisLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AnalaysisTextArea = new javax.swing.JTextArea();
        ExitButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOAN CALCULATOR");
        setBackground(new java.awt.Color(0, 51, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 255, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BalanceLebel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BalanceLebel.setText("LOAN BALANCE");

        BalanceTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BalanceTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceTextField1ActionPerformed(evt);
            }
        });

        InterestLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        InterestLabel.setText("INTEREST RATE");

        InterestTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InterestTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestTextFieldActionPerformed(evt);
            }
        });

        MonthLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MonthLabel3.setText("NUMBER OF PAYMENT");

        MonthTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MonthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthTextFieldActionPerformed(evt);
            }
        });

        PaymentLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PaymentLabel4.setText("MONTHLY PAYMENT");

        PaymentTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PaymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentTextFieldActionPerformed(evt);
            }
        });

        ComputeButtom.setBackground(new java.awt.Color(102, 255, 102));
        ComputeButtom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ComputeButtom.setText("COMPUTE MONTHLY PAYMENT");
        ComputeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeButtomActionPerformed(evt);
            }
        });

        NewLoanButton2.setBackground(new java.awt.Color(0, 153, 153));
        NewLoanButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewLoanButton2.setText("NEW LOAN");
        NewLoanButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewLoanButton2ActionPerformed(evt);
            }
        });

        MonthButtom.setBackground(new java.awt.Color(255, 102, 102));
        MonthButtom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MonthButtom.setText("X");
        MonthButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthButtomActionPerformed(evt);
            }
        });

        PaymentButton.setBackground(new java.awt.Color(255, 153, 0));
        PaymentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PaymentButton.setText("X");
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        AnalysisLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AnalysisLabel1.setText(" LOAN ANALYSIS");

        AnalaysisTextArea.setBackground(new java.awt.Color(255, 255, 204));
        AnalaysisTextArea.setColumns(20);
        AnalaysisTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        AnalaysisTextArea.setRows(5);
        AnalaysisTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AnalaysisTextAreaFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(AnalaysisTextArea);

        ExitButton1.setBackground(new java.awt.Color(255, 0, 51));
        ExitButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExitButton1.setText("EXIT");
        ExitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(ComputeButtom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PaymentLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MonthLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(MonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InterestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BalanceLebel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InterestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BalanceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MonthButtom)
                            .addComponent(PaymentButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AnalysisLabel1)
                        .addGap(88, 88, 88))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewLoanButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(ExitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BalanceLebel)
                            .addComponent(BalanceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InterestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InterestLabel))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MonthLabel3)
                            .addComponent(MonthButtom))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaymentLabel4)
                            .addComponent(PaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentButton))
                        .addGap(36, 36, 36)
                        .addComponent(ComputeButtom)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AnalysisLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewLoanButton2)
                    .addComponent(ExitButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("                                                                     LOAN CALCULATOR");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MonthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthTextFieldActionPerformed
        MonthTextField.transferFocus();
    }//GEN-LAST:event_MonthTextFieldActionPerformed

    private void NewLoanButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewLoanButton2ActionPerformed
        NewLoanButton2.setEnabled(false);
        if (computePayment) {
            PaymentTextField.setText("");
        } else {
            MonthTextField.setText("");
        }
        AnalaysisTextArea.setText("");
        ComputeButtom.setEnabled(true);
        NewLoanButton2.setEnabled(false);
        BalanceTextField1.requestFocus();
    }//GEN-LAST:event_NewLoanButton2ActionPerformed

    private void ExitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButton1ActionPerformed
        System.exit(0);
        ExitButton1.setFocusable(false);

    }//GEN-LAST:event_ExitButton1ActionPerformed

    private void MonthButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthButtomActionPerformed
        Color LightYellow = new Color(255, 255, 128);
        //boolean computePayment;
        MonthButtom.setFocusable(false);
        computePayment = false;
        PaymentButton.setVisible(true);
        MonthButtom.setVisible(false);
        MonthTextField.setEditable(false);
        MonthTextField.setText("");
        MonthTextField.setBackground(LightYellow);
        PaymentTextField.setEditable(true);
        PaymentTextField.setBackground(Color.white);
        PaymentTextField.setFocusable(true);
        ComputeButtom.setText("COMPUTE NUMBER OF PAYMENT");
        BalanceTextField1.requestFocus();


    }//GEN-LAST:event_MonthButtomActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        Color LightYellow = new Color(255, 255, 128);
        computePayment = true;
        PaymentButton.setFocusable(false);
        PaymentButton.setVisible(false);
        MonthButtom.setVisible(true);
        MonthTextField.setEditable(true);
        MonthTextField.setBackground(Color.white);
        PaymentTextField.setText("");
        PaymentTextField.setEditable(false);
        PaymentTextField.setBackground(LightYellow);
        ComputeButtom.setText("COMPUTE MONTHLY PAYMENT");
        BalanceTextField1.requestFocus();

    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void AnalaysisTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnalaysisTextAreaFocusGained
        AnalaysisTextArea.setFocusable(false);
        
    }//GEN-LAST:event_AnalaysisTextAreaFocusGained

    private void ComputeButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeButtomActionPerformed
        double balance, interest, payment;
        int months;
        double monthlyInterest, multiplier;
        double loanBalance, finalPayment;
        //==================================================
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd  HH:mm:ss");
             LocalDateTime now = LocalDateTime.now();
        //====================================================================
        if (validateDecimalNumber(BalanceTextField1)) {
            balance = Double.valueOf(BalanceTextField1.getText()).doubleValue();
        } else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty LoanBalance entry.\nPlease correct.", "Balance Input Error",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (validateDecimalNumber(InterestTextField)) {
            interest = Double.valueOf(InterestTextField.getText()).doubleValue();
        } else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty InterestRate entry.\nPlease correct.", " Interest Input Error",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        monthlyInterest = interest / 1200;
        //months = Integer.parseInt(MonthTextField.getText());
        // multiplier = Math.pow(1+monthlyInterest, months);

        /// payment = balance *monthlyInterest * multiplier/(multiplier-1);
        // PaymentTextField.setText(new DecimalFormat("0.00").format(payment));
        if (computePayment) {
            if (validateDecimalNumber(MonthTextField)) {
                months = Integer.parseInt(MonthTextField.getText());
            } else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty Number of payment entry.\nPlease correct.", " Number of Payment Error",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (interest == 0) {
                payment = balance / months;
            } else {
                multiplier = Math.pow(1 + monthlyInterest, months);
                payment = balance * monthlyInterest * multiplier / (multiplier - 1);
            }
            PaymentTextField.setText(new DecimalFormat("0.00").format(payment));
        } else {
            if (validateDecimalNumber(PaymentTextField)) {
                payment = Double.valueOf(PaymentTextField.getText()).doubleValue();
                if (payment <= (balance * monthlyInterest + 1.0)) {

                    if (JOptionPane.showConfirmDialog(null, "Minimum payment must be Rs." + new DecimalFormat("0.00").format((int) (balance * monthlyInterest + 1.0)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        PaymentTextField.setText(new DecimalFormat("0.00").format((int) (balance * monthlyInterest + 1.0)));
                        payment = Double.valueOf(PaymentTextField.getText()).doubleValue();
                    } else {

                        PaymentTextField.requestFocus();
                        return;

                    }
                }
            } else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //  payment = Double.valueOf(PaymentTextField.getText()).doubleValue();
            if (interest == 0) {
                months = (int) (balance / payment);
            } else {
                months = (int) ((Math.log(payment) - Math.log(payment - balance * monthlyInterest)) / Math.log(1 + monthlyInterest));
            }
            MonthTextField.setText(String.valueOf(months));
        }
        payment = Double.valueOf(PaymentTextField.getText()).doubleValue();
        AnalaysisTextArea.setText("Loan Balance : Rs." + new DecimalFormat("0.00").format(balance));
        AnalaysisTextArea.append("\n" + "Interest Rate :" + new DecimalFormat("0.00").format(interest) + "%");
        loanBalance = balance;
        for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++) {
            loanBalance += loanBalance * monthlyInterest - payment;
        }
        finalPayment = loanBalance;
        if (finalPayment > payment) {
            loanBalance += loanBalance * monthlyInterest - payment;
            finalPayment = loanBalance;
            months++;
            MonthTextField.setText(String.valueOf(months));
        }
        AnalaysisTextArea.append("\n\n" + String.valueOf(months - 1) + "  Payment of Rs."
                + new DecimalFormat("0.00").format(payment));
        AnalaysisTextArea.append("\n" + "Final Payment of: Rs." + new DecimalFormat("0.00").format(finalPayment));
        AnalaysisTextArea.append("\n" + "Total Payments: Rs." + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment));

        AnalaysisTextArea.append("\n" + "Interest Paid Rs."
                + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
        ComputeButtom.setEnabled(false);
        NewLoanButton2.setEnabled(true);
        NewLoanButton2.requestFocus();
        AnalaysisTextArea.append("\nDate and Time :" +dtf.format(now));
    

    }//GEN-LAST:event_ComputeButtomActionPerformed

    private void BalanceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceTextField1ActionPerformed
        BalanceTextField1.transferFocus();
    }//GEN-LAST:event_BalanceTextField1ActionPerformed

    private void InterestTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestTextFieldActionPerformed
        InterestTextField.transferFocus();
    }//GEN-LAST:event_InterestTextFieldActionPerformed

    private void PaymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentTextFieldActionPerformed
        PaymentTextField.transferFocus();
    }//GEN-LAST:event_PaymentTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoanAnalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAnalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAnalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAnalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAnalay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AnalaysisTextArea;
    private javax.swing.JLabel AnalysisLabel1;
    private javax.swing.JLabel BalanceLebel;
    private javax.swing.JTextField BalanceTextField1;
    private javax.swing.JButton ComputeButtom;
    private javax.swing.JButton ExitButton1;
    private javax.swing.JLabel InterestLabel;
    private javax.swing.JTextField InterestTextField;
    private javax.swing.JButton MonthButtom;
    private javax.swing.JLabel MonthLabel3;
    private javax.swing.JTextField MonthTextField;
    private javax.swing.JButton NewLoanButton2;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JLabel PaymentLabel4;
    private javax.swing.JTextField PaymentTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static class monthlyInterst {

        public monthlyInterst() {
        }
    }
}
