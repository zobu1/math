import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zobu
 */
public class NewJFrame1 extends javax.swing.JFrame {
    ImageIcon image1 = new ImageIcon("1.png");
    int score = 0;
    
    public NewJFrame1() {
        initComponents();
        labelPic.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        labelPic = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setText("Problem 1");

        labelPic.setText("labelPic");

        jButton1.setText("Show Problem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonA.setText("A");
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButtonB.setText("B");
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonD.setText("D");
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });

        jLabel2.setText("3x^2+2+C");

        jLabel3.setText("1/4x^4+x^2+C");

        jLabel4.setText("1/4x^4+x^2+3x+C");

        jLabel5.setText("1/4x^4+x^3+3x+C");

        jLabel6.setText("Points:");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jButtonA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonB)
                                .addGap(125, 125, 125)
                                .addComponent(jButtonC)
                                .addGap(153, 153, 153)
                                .addComponent(jButtonD))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)))
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addComponent(labelPic)
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonA)
                    .addComponent(jButtonB)
                    .addComponent(jButtonC)
                    .addComponent(jButtonD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(406, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Show math problem
        labelPic.setIcon(image1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        // Correct answer
        
        JOptionPane.showMessageDialog(null, "Correct!");
        this.setVisible(false);
        new NewJFrame2().setVisible(true);
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed

        NewJFrame2 frmtwo = new NewJFrame2();
        JOptionPane.showMessageDialog(null, "Incorrect!");
        this.setVisible(false);
        new Frame1Incorrect().setVisible(true);
        
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Incorrect!");
        this.setVisible(false);
        new Frame1Incorrect().setVisible(true);
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Incorrect!");
        this.setVisible(false);
        new Frame1Incorrect().setVisible(true);
    }//GEN-LAST:event_jButtonDActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonA;
    public javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelPic;
    // End of variables declaration//GEN-END:variables
}
