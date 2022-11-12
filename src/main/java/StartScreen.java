
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author teddycormier
 */
public class StartScreen extends javax.swing.JFrame {
    /**
     * Creates new form Start
     */
    public StartScreen() throws IOException{
        initComponents();

    }
    GameScreen gameScreen = new GameScreen();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        header_label = new javax.swing.JLabel();
        start_button = new javax.swing.JButton();
        header_background = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("START");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 25, 505, 340));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(926, 567));
        setSize(new java.awt.Dimension(926, 567));
        getContentPane().setLayout(null);

        header_label.setFont(new java.awt.Font("Phosphate", 1, 14)); // NOI18N
        header_label.setForeground(new java.awt.Color(204, 204, 204));
        header_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        header_label.setText("BLACKJACK - BLACKJACK - BLACKJACK - BLACKJACK - BLACKJACK - BLACKJACK - BLACKJACK - BLACKJACK - BLACKJACK - BLACKJACK - ");
        getContentPane().add(header_label);
        header_label.setBounds(-4, 2, 950, 10);

        start_button.setBackground(new java.awt.Color(204, 204, 204));
        start_button.setFont(new java.awt.Font("Times New Roman", 0, 8)); // NOI18N
        start_button.setText("CLICK HERE TO START");
        start_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(start_button);
        start_button.setBounds(420, 290, 100, 30);

        header_background.setBackground(new java.awt.Color(0, 51, 0));
        header_background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        header_background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                header_backgroundActionPerformed(evt);
            }
        });
        getContentPane().add(header_background);
        header_background.setBounds(-10, -4, 940, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed

    gameScreen.setLocationRelativeTo(null);
    gameScreen.setVisible(true);

    this.setVisible(false);
    // TODO add your handling code here:
    }//GEN-LAST:event_start_buttonActionPerformed

    private void header_backgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_header_backgroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_header_backgroundActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        StartScreen window = new StartScreen();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton header_background;
    private javax.swing.JLabel header_label;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JButton start_button;
    // End of variables declaration//GEN-END:variables
}
