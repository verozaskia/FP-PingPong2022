/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GameTicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author USER
 */
public class TicTacToe extends javax.swing.JFrame implements NewInterface { //super class
    //Properties
    private int xCount = 0;
    private int oCount = 0;
    private String startGame = "X";
    
    private boolean checker;
    
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    
    private void gameScore(){
        //Constructor
        getLblX().setText(String.valueOf(getxCount()));
        getLblO().setText(String.valueOf(getoCount()));
    }
    
    private void Choose_a_Player(){
        if(getStartGame().equalsIgnoreCase("X")) {
            setStartGame("O");
        } else {
            setStartGame("X");
        }
    }     
    
    void pemenang() {
        String b1 = getBtn1().getText();
        String b2 = getBtn2().getText();
        String b3 = getBtn3().getText();
        String b4 = getBtn4().getText();
        String b5 = getBtn5().getText();
        String b6 = getBtn6().getText();
        String b7 = getBtn7().getText();
        String b8 = getBtn8().getText();
        String b9 = getBtn9().getText();
        
        
        if (getBtn1().getText() == "X" && getBtn2().getText() == "X" && getBtn3().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore();             
        }
        
        if (getBtn4().getText() == "X" && getBtn5().getText() == "X" && getBtn6().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore(); 
        }
        
        if (getBtn7().getText() == "X" && getBtn8().getText() == "X" && getBtn9().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore(); 
        }
                
        if (getBtn1().getText() == "X" && getBtn5().getText() == "X" && getBtn9().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore(); 
        }
        
        if (getBtn3().getText() == "X" && getBtn5().getText() == "X" && getBtn7().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore(); 
        }
        
        if (getBtn1().getText() == "X" && getBtn4().getText() == "X" && getBtn7().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore(); 
        }
        
        if (getBtn2().getText() == "X" && getBtn5().getText() == "X" && getBtn8().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore(); 
        }
        
        if (getBtn3().getText() == "X" && getBtn6().getText() == "X" && getBtn9().getText() == "X") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah X", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setxCount(getxCount() + 1);
            gameScore(); 
        }
        
        if (getBtn1().getText() == "O" && getBtn2().getText() == "O" && getBtn3().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore();             
        }
        
        if (getBtn4().getText() == "O" && getBtn5().getText() == "O" && getBtn6().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore(); 
        }
        
        if (getBtn7().getText() == "O" && getBtn8().getText() == "O" && getBtn9().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore(); 
        }
                
        if (getBtn1().getText() == "O" && getBtn5().getText() == "O" && getBtn9().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore(); 
        }
        
        if (getBtn3().getText() == "O" && getBtn5().getText() == "O" && getBtn7().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore(); 
        }
        
        if (getBtn1().getText() == "O" && getBtn4().getText() == "O" && getBtn7().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore(); 
        }
        
        if (getBtn2().getText() == "O" && getBtn5().getText() == "O" && getBtn8().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore(); 
        }
        
        if (getBtn3().getText() == "O" && getBtn6().getText() == "O" && getBtn9().getText() == "O") {
            JOptionPane.showMessageDialog(this, "Pemenangnya adalah O", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            setoCount(getoCount() + 1);
            gameScore(); 
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btntitle = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        lblO = new javax.swing.JButton();
        btnewgame = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        lblX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(0, 102, 102));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 120, 100));

        btn1.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 100));

        btn2.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn2.setBorder(null);
        btn2.setMaximumSize(new java.awt.Dimension(72, 6));
        btn2.setMinimumSize(new java.awt.Dimension(72, 6));
        btn2.setPreferredSize(new java.awt.Dimension(72, 6));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, 100));

        btn4.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        btn5.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, 100));

        btn6.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 120, 100));

        btn7.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 100));

        btn8.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 120, 100));

        btntitle.setBackground(new java.awt.Color(0, 102, 102));
        btntitle.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btntitle.setForeground(new java.awt.Color(255, 255, 255));
        btntitle.setText("Tic Tac Toe Game");
        jPanel.add(btntitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 90));

        jButton10.setText("jButton1");
        jPanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 100));

        btn9.setFont(new java.awt.Font("Arial", 1, 69)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 120, 100));

        btnreset.setFont(new java.awt.Font("Arial", 1, 49)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 210, 100));

        btnexit.setFont(new java.awt.Font("Arial", 1, 49)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 210, 100));

        lblO.setFont(new java.awt.Font("Arial", 1, 49)); // NOI18N
        jPanel.add(lblO, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 200, 50));

        btnewgame.setFont(new java.awt.Font("Arial", 1, 49)); // NOI18N
        btnewgame.setText("New Game");
        btnewgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewgameActionPerformed(evt);
            }
        });
        jPanel.add(btnewgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 430, 80));

        btnX.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        btnX.setText("Player X");
        jPanel.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 220, 50));

        btnO.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        btnO.setText("Player O");
        jPanel.add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 220, 50));

        lblX.setFont(new java.awt.Font("Arial", 1, 49)); // NOI18N
        jPanel.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 200, 50));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        getBtn2().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        getBtn5().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        getBtn8().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        getBtn1().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        getBtn3().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        //TODO add your handling code here:
        getBtn4().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        //TODO add your handling code here:
        getBtn6().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang(); 
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        //TODO add your handling code here:
        getBtn7().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        //TODO add your handling code here:
        getBtn9().setText(getStartGame());
        setChecker(!startGame.equalsIgnoreCase("X"));
        Choose_a_Player();
        pemenang();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        getBtn1().setText("");
        getBtn1().setEnabled(true);
        getBtn2().setText("");
        getBtn2().setEnabled(true);
        getBtn3().setText("");
        getBtn3().setEnabled(true);
        getBtn4().setText("");
        getBtn4().setEnabled(true);
        getBtn5().setText("");
        getBtn5().setEnabled(true);
        getBtn6().setText("");
        getBtn6().setEnabled(true);
        getBtn7().setText("");
        getBtn7().setEnabled(true);
        getBtn8().setText("");
        getBtn8().setEnabled(true);
        getBtn9().setText("");
        getBtn9().setEnabled(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewgameActionPerformed
        // TODO add your handling code here:
        getBtn1().setEnabled(true);
        getBtn2().setEnabled(true);
        getBtn3().setEnabled(true);
        getBtn4().setEnabled(true);
        getBtn5().setEnabled(true);
        getBtn6().setEnabled(true);
        getBtn7().setEnabled(true);
        getBtn8().setEnabled(true);
        getBtn9().setEnabled(true);
        
        getLblX().setText("0");
        getLblO().setText("0");
        
        getBtn1().setText("");
        getBtn2().setText("");
        getBtn3().setText("");
        getBtn4().setText("");
        getBtn5().setText("");
        getBtn6().setText("");
        getBtn7().setText("");
        getBtn8().setText("");
        getBtn9().setText("");
    }//GEN-LAST:event_btnewgameActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(YES_NO_OPTION == JOptionPane.showConfirmDialog(frame, "Apakah Anda Ingin Keluar?", "TicTacToe", JOptionPane.YES_NO_OPTION)){
            System.exit(0);
        } 
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnewgame;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntitle;
    private javax.swing.JButton jButton10;
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton lblO;
    private javax.swing.JButton lblX;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the xCount
     */
    @Override
    public int getxCount() {
        return xCount;
    }

    /**
     * @param xCount the xCount to set
     */
    @Override
    public void setxCount(int xCount) {
        this.xCount = xCount;
    }

    /**
     * @return the oCount
     */
    @Override
    public int getoCount() {
        return oCount;
    }

    /**
     * @param oCount the oCount to set
     */
    @Override
    public void setoCount(int oCount) {
        this.oCount = oCount;
    }

    /**
     * @return the startGame
     */
    @Override
    public String getStartGame() {
        return startGame;
    }

    /**
     * @param startGame the startGame to set
     */
    @Override
    public void setStartGame(String startGame) {
        this.startGame = startGame;
    }

    /**
     * @return the checker
     */
    @Override
    public boolean isChecker() {
        return checker;
    }

    /**
     * @param checker the checker to set
     */
    @Override
    public void setChecker(boolean checker) {
        this.checker = checker;
    }

    /**
     * @return the btn1
     */
    @Override
    public javax.swing.JButton getBtn1() {
        return btn1;
    }

    /**
     * @param btn1 the btn1 to set
     */
    @Override
    public void setBtn1(javax.swing.JButton btn1) {
        this.btn1 = btn1;
    }

    /**
     * @return the btn2
     */
    @Override
    public javax.swing.JButton getBtn2() {
        return btn2;
    }

    /**
     * @param btn2 the btn2 to set
     */
    @Override
    public void setBtn2(javax.swing.JButton btn2) {
        this.btn2 = btn2;
    }

    /**
     * @return the btn3
     */
    @Override
    public javax.swing.JButton getBtn3() {
        return btn3;
    }

    /**
     * @param btn3 the btn3 to set
     */
    @Override
    public void setBtn3(javax.swing.JButton btn3) {
        this.btn3 = btn3;
    }

    /**
     * @return the btn4
     */
    @Override
    public javax.swing.JButton getBtn4() {
        return btn4;
    }

    /**
     * @param btn4 the btn4 to set
     */
    @Override
    public void setBtn4(javax.swing.JButton btn4) {
        this.btn4 = btn4;
    }

    /**
     * @return the btn5
     */
    @Override
    public javax.swing.JButton getBtn5() {
        return btn5;
    }

    /**
     * @param btn5 the btn5 to set
     */
    @Override
    public void setBtn5(javax.swing.JButton btn5) {
        this.btn5 = btn5;
    }

    /**
     * @return the btn6
     */
    @Override
    public javax.swing.JButton getBtn6() {
        return btn6;
    }

    /**
     * @param btn6 the btn6 to set
     */
    @Override
    public void setBtn6(javax.swing.JButton btn6) {
        this.btn6 = btn6;
    }

    /**
     * @return the btn7
     */
    @Override
    public javax.swing.JButton getBtn7() {
        return btn7;
    }

    /**
     * @param btn7 the btn7 to set
     */
    @Override
    public void setBtn7(javax.swing.JButton btn7) {
        this.btn7 = btn7;
    }

    /**
     * @return the btn8
     */
    @Override
    public javax.swing.JButton getBtn8() {
        return btn8;
    }

    /**
     * @param btn8 the btn8 to set
     */
    @Override
    public void setBtn8(javax.swing.JButton btn8) {
        this.btn8 = btn8;
    }

    /**
     * @return the btn9
     */
    @Override
    public javax.swing.JButton getBtn9() {
        return btn9;
    }

    /**
     * @param btn9 the btn9 to set
     */
    @Override
    public void setBtn9(javax.swing.JButton btn9) {
        this.btn9 = btn9;
    }

    /**
     * @return the btnO
     */
    @Override
    public javax.swing.JButton getBtnO() {
        return btnO;
    }

    /**
     * @param btnO the btnO to set
     */
    @Override
    public void setBtnO(javax.swing.JButton btnO) {
        this.btnO = btnO;
    }

    /**
     * @return the btnX
     */
    @Override
    public javax.swing.JButton getBtnX() {
        return btnX;
    }

    /**
     * @param btnX the btnX to set
     */
    @Override
    public void setBtnX(javax.swing.JButton btnX) {
        this.btnX = btnX;
    }

    /**
     * @return the btnewgame
     */
    @Override
    public javax.swing.JButton getBtnewgame() {
        return btnewgame;
    }

    /**
     * @param btnewgame the btnewgame to set
     */
    @Override
    public void setBtnewgame(javax.swing.JButton btnewgame) {
        this.btnewgame = btnewgame;
    }

    /**
     * @return the btnexit
     */
    @Override
    public javax.swing.JButton getBtnexit() {
        return btnexit;
    }

    /**
     * @param btnexit the btnexit to set
     */
    @Override
    public void setBtnexit(javax.swing.JButton btnexit) {
        this.btnexit = btnexit;
    }

    /**
     * @return the btnreset
     */
    @Override
    public javax.swing.JButton getBtnreset() {
        return btnreset;
    }

    /**
     * @param btnreset the btnreset to set
     */
    @Override
    public void setBtnreset(javax.swing.JButton btnreset) {
        this.btnreset = btnreset;
    }

    /**
     * @return the btntitle
     */
    @Override
    public javax.swing.JButton getBtntitle() {
        return btntitle;
    }

    /**
     * @param btntitle the btntitle to set
     */
    @Override
    public void setBtntitle(javax.swing.JButton btntitle) {
        this.btntitle = btntitle;
    }

    /**
     * @return the jButton10
     */
    @Override
    public javax.swing.JButton getjButton10() {
        return jButton10;
    }

    /**
     * @param jButton10 the jButton10 to set
     */
    @Override
    public void setjButton10(javax.swing.JButton jButton10) {
        this.jButton10 = jButton10;
    }

    /**
     * @return the jPanel
     */
    @Override
    public javax.swing.JPanel getjPanel() {
        return jPanel;
    }

    /**
     * @param jPanel the jPanel to set
     */
    @Override
    public void setjPanel(javax.swing.JPanel jPanel) {
        this.jPanel = jPanel;
    }

    /**
     * @return the lblO
     */
    @Override
    public javax.swing.JButton getLblO() {
        return lblO;
    }

    /**
     * @param lblO the lblO to set
     */
    @Override
    public void setLblO(javax.swing.JButton lblO) {
        this.lblO = lblO;
    }

    /**
     * @return the lblX
     */
    @Override
    public javax.swing.JButton getLblX() {
        return lblX;
    }

    /**
     * @param lblX the lblX to set
     */
    @Override
    public void setLblX(javax.swing.JButton lblX) {
        this.lblX = lblX;
    }
}