
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author teddycormier
 */
public class GameScreen extends javax.swing.JFrame {
    /**
     * Creates new form GameScreen
     * @throws java.io.IOException
     */
    ArrayList<Integer> player_cards = new ArrayList<Integer>();
    ArrayList<Integer> dealer_cards = new ArrayList<Integer>();
    
    public GameScreen() throws IOException {
        initComponents();
        
        dealer_cards.add(DeckResponse.getCardFromDeck());
        int dealer_card1 = dealer_cards.get(0);
        dealer_cards.add(DeckResponse.getCardFromDeck());
        int dealer_card2 = dealer_cards.get(1);
        int dealer_sum = 0;
        for (int number : dealer_cards){
            dealer_sum += number;
        }
        System.out.println("Dealer's Starting Cards: " + "\n" + dealer_card1 + "\n" + dealer_card2 + "\n" + "Dealer Current Hand Total: " + dealer_sum + "\n");  
        
        player_cards.add(DeckResponse.getCardFromDeck());
        int player_card1 = player_cards.get(0);
        player_cards.add(DeckResponse.getCardFromDeck());
        int player_card2 = player_cards.get(1);
        int player_sum = 0;
        for (int number : player_cards){
            player_sum += number;
        }
        System.out.println("Player's Starting Cards: " + "\n" + player_card1 + "\n" + player_card2 + "\n" + "Player Current Hand Total: " + player_sum + "\n");       
    }
    
    RulesScreen rulesScreen = new RulesScreen();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stand_button = new javax.swing.JButton();
        hit_button = new javax.swing.JButton();
        rules_button = new javax.swing.JButton();
        player_card_1 = new javax.swing.JLabel();
        player_card_2 = new javax.swing.JLabel();
        player_card_3 = new javax.swing.JLabel();
        dealer_card_1 = new javax.swing.JLabel();
        dealer_card_2 = new javax.swing.JLabel();
        bgr_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAME");
        setMinimumSize(new java.awt.Dimension(509, 340));
        getContentPane().setLayout(null);

        stand_button.setBackground(new java.awt.Color(204, 204, 204));
        stand_button.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        stand_button.setText("Stand");
        stand_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stand_button.setMaximumSize(new java.awt.Dimension(68, 22));
        stand_button.setMinimumSize(new java.awt.Dimension(68, 22));
        stand_button.setPreferredSize(new java.awt.Dimension(68, 22));
        stand_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stand_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(stand_button);
        stand_button.setBounds(420, 145, 68, 22);

        hit_button.setBackground(new java.awt.Color(204, 204, 204));
        hit_button.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        hit_button.setText("Hit");
        hit_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hit_button.setMaximumSize(new java.awt.Dimension(68, 22));
        hit_button.setMinimumSize(new java.awt.Dimension(68, 22));
        hit_button.setPreferredSize(new java.awt.Dimension(68, 22));
        hit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hit_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(hit_button);
        hit_button.setBounds(420, 180, 68, 22);

        rules_button.setBackground(new java.awt.Color(204, 204, 204));
        rules_button.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        rules_button.setText("Rules");
        rules_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rules_button.setMaximumSize(new java.awt.Dimension(30, 30));
        rules_button.setMinimumSize(new java.awt.Dimension(30, 30));
        rules_button.setPreferredSize(new java.awt.Dimension(30, 30));
        rules_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rules_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(rules_button);
        rules_button.setBounds(440, 10, 60, 20);
        getContentPane().add(player_card_1);
        player_card_1.setBounds(50, 220, 0, 0);
        getContentPane().add(player_card_2);
        player_card_2.setBounds(190, 220, 0, 0);
        getContentPane().add(player_card_3);
        player_card_3.setBounds(340, 220, 0, 0);
        getContentPane().add(dealer_card_1);
        dealer_card_1.setBounds(50, 30, 0, 0);
        getContentPane().add(dealer_card_2);
        dealer_card_2.setBounds(190, 30, 0, 0);

        bgr_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BlackJackFelt3.png"))); // NOI18N
        bgr_image.setMixingCutoutShape(null);
        getContentPane().add(bgr_image);
        bgr_image.setBounds(0, 0, 510, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stand_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stand_buttonActionPerformed
        int player_sum = 0;
        for (int number : player_cards){
            player_sum += number;
        }
        int dealer_sum = 0;
        for (int number: dealer_cards){
            dealer_sum += number;
        }
        if ((player_sum < 21) && (player_sum > dealer_sum))
        {
            try {
                JOptionPane.showMessageDialog
                (null,"You beat the dealer", "", JOptionPane.OK_OPTION);
                
                dealer_cards.clear();
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss1 = dealer_cards.get(0);
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss2 = dealer_cards.get(1);
                int new_dealer_sum = 0;
                for (int number : dealer_cards){
                    new_dealer_sum += number;
                }
                System.out.println("Dealer's Starting Cards: " + "\n" + new_dealer_card_loss1 + "\n" + new_dealer_card_loss2 + "\n" + "Dealer Current Hand Total: " + new_dealer_sum + "\n");
        
                player_cards.clear();
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win1 = player_cards.get(0);
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win2 = player_cards.get(1);
                int new_sum = 0;
                for (int number : player_cards){
                    new_sum += number;
                }
                System.out.println("Starting Cards: " + "\n" + new_card_after_win1 + "\n" + new_card_after_win2 + "\n" + "Current Hand Total: " + new_sum + "\n");
            } catch (IOException ex) {
                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ((dealer_sum < 21) && (dealer_sum > player_sum))
        {
            try {
                JOptionPane.showMessageDialog
                (null,"You lost to the dealer", "", JOptionPane.OK_OPTION);
                
                dealer_cards.clear();
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss1 = dealer_cards.get(0);
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss2 = dealer_cards.get(1);
                int new_dealer_sum = 0;
                for (int number : dealer_cards){
                    new_dealer_sum += number;
                }
                System.out.println("Dealer's Starting Cards: " + "\n" + new_dealer_card_loss1 + "\n" + new_dealer_card_loss2 + "\n" + "Dealer Current Hand Total: " + new_dealer_sum + "\n");
        
                player_cards.clear();
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win1 = player_cards.get(0);
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win2 = player_cards.get(1);
                int new_sum = 0;
                for (int number : player_cards){
                    new_sum += number;
                }
                System.out.println("Starting Cards: " + "\n" + new_card_after_win1 + "\n" + new_card_after_win2 + "\n" + "Current Hand Total: " + new_sum + "\n");
            } catch (IOException ex) {
                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ((dealer_sum == player_sum))
        {
            try {
                JOptionPane.showMessageDialog
                (null,"It's a push", "", JOptionPane.OK_OPTION);
                
                dealer_cards.clear();
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss1 = dealer_cards.get(0);
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss2 = dealer_cards.get(1);
                int new_dealer_sum = 0;
                for (int number : dealer_cards){
                    new_dealer_sum += number;
                }
                System.out.println("Dealer's Starting Cards: " + "\n" + new_dealer_card_loss1 + "\n" + new_dealer_card_loss2 + "\n" + "Dealer Current Hand Total: " + new_dealer_sum + "\n");
        
                player_cards.clear();
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win1 = player_cards.get(0);
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win2 = player_cards.get(1);
                int new_sum = 0;
                for (int number : player_cards){
                    new_sum += number;
                }
                System.out.println("Starting Cards: " + "\n" + new_card_after_win1 + "\n" + new_card_after_win2 + "\n" + "Current Hand Total: " + new_sum + "\n");
            } catch (IOException ex) {
                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_stand_buttonActionPerformed

    private void rules_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rules_buttonActionPerformed
        rulesScreen.setLocationRelativeTo(null);
        rulesScreen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rules_buttonActionPerformed

    private void hit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hit_buttonActionPerformed
        try {
            player_cards.add(DeckResponse.getCardFromDeck());
            String card_image = DeckResponse.getCardImage();
            System.out.println(card_image);
            int sum = 0;
            for (int number : player_cards){
                sum += number;
            }
            System.out.println("Current Cards: ");
            for (int number : player_cards){
                System.out.println(number);
            }
            System.out.println("Current Hand Total: " + sum + "\n");
            if (sum == 21){
                JOptionPane.showMessageDialog(null,
                "BLACKJACK", "", JOptionPane.OK_OPTION);
                
                dealer_cards.clear();
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss1 = dealer_cards.get(0);
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_loss2 = dealer_cards.get(1);
                int new_dealer_sum = 0;
                for (int number : dealer_cards){
                    new_dealer_sum += number;
                }
                System.out.println("Dealer's Starting Cards: " + "\n" + new_dealer_card_loss1 + "\n" + new_dealer_card_loss2 + "\n" + "Dealer Current Hand Total: " + new_dealer_sum + "\n");
                
                player_cards.clear();
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win1 = player_cards.get(0);
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_win2 = player_cards.get(1);
                int new_sum = 0;
                for (int number : player_cards){
                    new_sum += number;
                }
                System.out.println("Starting Cards: " + "\n" + new_card_after_win1 + "\n" + new_card_after_win2 + "\n" + "Current Hand Total: " + new_sum + "\n");
            }
            if (sum > 21){
                JOptionPane.showMessageDialog(null,
                "Bust" + "\n" + "Dealer Wins Hand", "", JOptionPane.OK_OPTION);
                
                dealer_cards.clear();
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_win1 = dealer_cards.get(0);
                dealer_cards.add(DeckResponse.getCardFromDeck());
                int new_dealer_card_win2 = dealer_cards.get(1);
                int new_dealer_sum = 0;
                for (int number : dealer_cards){
                    new_dealer_sum += number;
                }
                System.out.println("Dealer's Starting Cards: " + "\n" + new_dealer_card_win1 + "\n" + new_dealer_card_win2 + "\n" + "Dealer Current Hand Total: " + new_dealer_sum + "\n");
                player_cards.clear();
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_loss1 = player_cards.get(0);
                player_cards.add(DeckResponse.getCardFromDeck());
                int new_card_after_loss2 = player_cards.get(1);
                int new_sum = 0;
                for (int number : player_cards){
                    new_sum += number;
                }
                System.out.println("Starting Cards: " + "\n" + new_card_after_loss1 + "\n" + new_card_after_loss2 + "\n" + "Current Hand Total: " + new_sum + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hit_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgr_image;
    private javax.swing.JLabel dealer_card_1;
    private javax.swing.JLabel dealer_card_2;
    private javax.swing.JButton hit_button;
    private javax.swing.JLabel player_card_1;
    private javax.swing.JLabel player_card_2;
    private javax.swing.JLabel player_card_3;
    private javax.swing.JButton rules_button;
    private javax.swing.JButton stand_button;
    // End of variables declaration//GEN-END:variables
}
