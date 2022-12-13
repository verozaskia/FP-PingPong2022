# FP-TicTacToe2022
Ini adalah FP TicTakToe 2022

Game ini akan dimainkan oleh 2 orang pemain. Terdapat 9 kotak yang tersusun 3x3. 
Pemain yang pertama kali membuat tanda X atau O secara Vertikal, Horizontal ataupun 
Diagonal adalah pemenang nya.
Langkah-langkah membuat game Tic-Tac-Toe adalah yang pertama mengimpor Import packages, lalu 
Inisialisasi User Interface, menambahkan actions atau tindakan ke buttons dan menambahkan fungsi untuk mengecek pemenangnya.

Reference :
https://data-flair.training/blogs/java-tic-tac-toe-game/#:~:text=Step%20to%20build%20Tic-Tac-Toe%20game%20using%20java%3A%201,4%204.%20Function%20to%20check%20the%20winner%3A%20

Aspek OOP FP (File FP_TicTacToe) :

TicTacToe.java :
- Constructor

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
        
- Override

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


- Encapsulation

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

- Polymorphism

          public class TicTacToe extends javax.swing.JFrame implements NewInterface {
          


- Inheritance

          public class TicTacToe extends javax.swing.JFrame implements NewInterface { 

                
- GUI

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


- Exception Handling

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


  
- Input Output

        private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {                                        
            //TODO add your handling code here:
            JFrame frame = new JFrame("Exit");
            if(YES_NO_OPTION == JOptionPane.showConfirmDialog(frame, "Apakah Anda Ingin Keluar?", "TicTacToe", JOptionPane.YES_NO_OPTION)) {
                System.exit(0);
            } 
        } 
    
NewInterface.java :
- Interface

        public interface NewInterface {

        /**
         * @return the btn1
         */
        JButton getBtn1();

        /**
         * @return the btn2
         */
        JButton getBtn2();

