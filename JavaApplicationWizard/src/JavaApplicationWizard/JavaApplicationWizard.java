package JavaApplicationWizard;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel.*;
/**
 *
 * @author ultimatehackers
 */
public class JavaApplicationWizard extends JFrame {
    private JPanel contentPane;
    /**
     * Creates new form JavaAppWizard
     */
    public JavaApplicationWizard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        puzzleGame = new javax.swing.JButton();
        ipFinder = new javax.swing.JButton();
        pictureGame = new javax.swing.JButton();
        wCT = new javax.swing.JButton();
        ticTacToe = new javax.swing.JButton();
        sourceCodeGenerator = new javax.swing.JButton();
        examSys = new javax.swing.JButton();
        calculator = new javax.swing.JButton();
        notePad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Java Application World");

        puzzleGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/Puzzle Game.jpg"))); // NOI18N
        puzzleGame.setBorderPainted(false);
        puzzleGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleGameActionPerformed(evt);
            }
        });

        ipFinder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/ip.jpg"))); // NOI18N
        ipFinder.setBorderPainted(false);
        ipFinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFinderActionPerformed(evt);
            }
        });

        pictureGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/picturepuzzle.jpg"))); // NOI18N
        pictureGame.setBorderPainted(false);
        pictureGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureGameActionPerformed(evt);
            }
        });

        wCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/wct.jpg"))); // NOI18N
        wCT.setBorderPainted(false);
        wCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wCTActionPerformed(evt);
            }
        });

        ticTacToe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/tictactoe.jpg"))); // NOI18N
        ticTacToe.setBorderPainted(false);

        sourceCodeGenerator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/Source Code Generator.jpg"))); // NOI18N
        sourceCodeGenerator.setBorderPainted(false);

        examSys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/Exam System.jpg"))); // NOI18N
        examSys.setBorderPainted(false);

        calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/calculator.jpg"))); // NOI18N
        calculator.setBorderPainted(false);

        notePad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplicationWizard/notepad.jpg"))); // NOI18N
        notePad.setBorderPainted(false);
        notePad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notePadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ipFinder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pictureGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(puzzleGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ticTacToe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sourceCodeGenerator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(examSys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notePad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(examSys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puzzleGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ipFinder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ticTacToe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notePad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pictureGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sourceCodeGenerator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void puzzleGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleGameActionPerformed
	Puzzel.main(new String[]{});
        puzzleGame.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/Puzzle Game.jpg")));
    }//GEN-LAST:event_puzzleGameActionPerformed
      
    private void ipFinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipFinderActionPerformed
        IPFinder.main(new String[]{});
	ipFinder.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/ip.jpg")));
		
    }//GEN-LAST:event_ipFinderActionPerformed
    private void ticTacToeActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	TTT1.main(new String[]{});
	ticTacToe.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/tictactoe.jpg")));
		    
    }                                        
    private void sourceCodeGeneratorActionPerformed(java.awt.event.ActionEvent evt) {                                         
        SourceGetter.main(new String[]{});
	sourceCodeGenerator.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/Source Code Generator.jpg")));     
    }                                        
    private void examSysActionPerformed(java.awt.event.ActionEvent evt) {                                         
        OnlineTest.main(new String[]{});
       // examSys.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/Exam System.jpg")));   
    }                                        
    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Calculator.main(new String[]{});
	//Calculator.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/calculator.jpg")));	
    }                                        
    private void wCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wCTActionPerformed
        CharCount.main(new String[]{});
        wCT.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/wct.jpg")));
    }//GEN-LAST:event_wCTActionPerformed
    private void notePadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notePadActionPerformed
        Notepad.main(new String[]{});
	notePad.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/notepad.jpg")));	
    }//GEN-LAST:event_notePadActionPerformed

    private void pictureGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureGameActionPerformed
        Puzzel.main(new String[]{});
        pictureGame.setIcon(new ImageIcon(JavaApplicationWizard.class.getResource("/JavaApplicationWizard/picturepuzzle.jpg")));
    }//GEN-LAST:event_pictureGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaApplicationWizard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculator;
    private javax.swing.JButton examSys;
    private javax.swing.JButton ipFinder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton notePad;
    private javax.swing.JButton pictureGame;
    private javax.swing.JButton puzzleGame;
    private javax.swing.JButton sourceCodeGenerator;
    private javax.swing.JButton ticTacToe;
    private javax.swing.JButton wCT;
    // End of variables declaration//GEN-END:variables
}
