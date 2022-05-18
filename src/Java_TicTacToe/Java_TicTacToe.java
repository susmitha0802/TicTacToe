/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_TicTacToe;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author susmitha
 */
public class Java_TicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    
    public Java_TicTacToe() {
        initComponents();
    }
    
    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void winningGame()
    {
        String b1 = jbtnTic1.getText();
        String b2 = jbtnTic2.getText();
        String b3 = jbtnTic3.getText();
        String b4 = jbtnTic4.getText();
        String b5 = jbtnTic5.getText();
        String b6 = jbtnTic6.getText();
        String b7 = jbtnTic7.getText();
        String b8 = jbtnTic8.getText();
        String b9 = jbtnTic9.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        
        if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.MAGENTA);
            jbtnTic4.setBackground(Color.MAGENTA);
            jbtnTic7.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.YELLOW);
            jbtnTic6.setBackground(Color.YELLOW);
            jbtnTic9.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
        }
        
        if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic9.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        
        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic7.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        
        if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);
            oCount++;
            gameScore();
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            oCount++;
            gameScore();
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        
        if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.MAGENTA);
            jbtnTic4.setBackground(Color.MAGENTA);
            jbtnTic7.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic8.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.YELLOW);
            jbtnTic6.setBackground(Color.YELLOW);
            jbtnTic9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
        }
        
        if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic9.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        
        if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic7.setBackground(Color.CYAN);
            oCount++;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnNewGame = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic3.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 210, 200));

        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 200));

        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 200));

        jbtnTic1.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 200));

        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 210, 200));

        jbtnTic2.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 210, 200));

        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 210, 200));

        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 210, 200));

        jbtnTic6.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 210, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 670, 640));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 680, 760));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 680, 760));

        jbtnExit.setBackground(new java.awt.Color(240, 240, 240));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 310, 140));

        jbtnNewGame.setBackground(new java.awt.Color(240, 240, 240));
        jbtnNewGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnNewGame.setText("New Game");
        jbtnNewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 150));

        jbtnReset.setBackground(new java.awt.Color(240, 240, 240));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 140));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 650, 330));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 680, 760));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel7.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 310, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Player 0:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanel7.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 310, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel5.setText("Player X:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 260));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 680, 640));

        jPanel9.setBackground(new java.awt.Color(95, 158, 160));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(240, 240, 240));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tic Tac Toe Game");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1360, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        // TODO add your handling code here:
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
                
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        // TODO add your handling code here:
        jbtnTic1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        // TODO add your handling code here:
        jbtnTic2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        // TODO add your handling code here:
        jbtnTic3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        // TODO add your handling code here:
        jbtnTic4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        // TODO add your handling code here:
        jbtnTic5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        // TODO add your handling code here:
        jbtnTic6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        // TODO add your handling code here:
        jbtnTic7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        // TODO add your handling code here:
        jbtnTic8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        // TODO add your handling code here:
        jbtnTic9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

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
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
