/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author PRANJAL
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentJPanel
     */
    
    JSplitPane splitPane;
    JPanel workArea;
    
    public StudentJPanel(JSplitPane splitPane, JPanel workArea) {
        initComponents();
        this.workArea = workArea;
        this.splitPane = splitPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentSplitPane = new javax.swing.JSplitPane();
        studentControlArea = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        studentWorkArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        studentControlArea.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Felix Titling", 3, 16)); // NOI18N
        jButton3.setText("<-- LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        jButton4.setText("REVIEW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentControlAreaLayout = new javax.swing.GroupLayout(studentControlArea);
        studentControlArea.setLayout(studentControlAreaLayout);
        studentControlAreaLayout.setHorizontalGroup(
            studentControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentControlAreaLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentControlAreaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(studentControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        studentControlAreaLayout.setVerticalGroup(
            studentControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentControlAreaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(73, 73, 73)
                .addComponent(jButton2)
                .addGap(61, 61, 61)
                .addComponent(jButton4)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        studentSplitPane.setLeftComponent(studentControlArea);

        studentWorkArea.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 19, 110));
        jLabel1.setText("STUDENT PORTAL");

        javax.swing.GroupLayout studentWorkAreaLayout = new javax.swing.GroupLayout(studentWorkArea);
        studentWorkArea.setLayout(studentWorkAreaLayout);
        studentWorkAreaLayout.setHorizontalGroup(
            studentWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentWorkAreaLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        studentWorkAreaLayout.setVerticalGroup(
            studentWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentWorkAreaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(505, Short.MAX_VALUE))
        );

        studentSplitPane.setRightComponent(studentWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        StudentCreateJPanel studentCreatePanel = new StudentCreateJPanel();   
        studentSplitPane.setRightComponent(studentCreatePanel);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        StudentViewJPanel studentViewPanel = new StudentViewJPanel();   
        studentSplitPane.setRightComponent(studentViewPanel);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        ReviewJPanel reviewPanel = new ReviewJPanel();   
        studentSplitPane.setRightComponent(reviewPanel);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.splitPane.setRightComponent(this.workArea);
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel studentControlArea;
    private javax.swing.JSplitPane studentSplitPane;
    private javax.swing.JPanel studentWorkArea;
    // End of variables declaration//GEN-END:variables
}
