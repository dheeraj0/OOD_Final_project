/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.userinterface;

import edu.neu.csye6200.University;
import edu.neu.csye6200.userinterface.classroom.ClassRoomManagementHomeJPanel;
import edu.neu.csye6200.userinterface.classroomGroup.ClassRoomGroupManagementHomeJPanel;
import edu.neu.csye6200.userinterface.reviewManagement.TeacherStudentReviewHomeJPanel;
import edu.neu.csye6200.userinterface.student.StudentMangementHomeJPanel;
import edu.neu.csye6200.userinterface.teacher.TeacherManagementHomeJPanel;
import edu.neu.csye6200.userinterface.vaccination.VaccineManagementHomeJPanel;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.net.URL;

/**
 *
 * @author manojreddy
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private University university;
    
    
    public MainJFrame() {
        initComponents();
        initializeData();
        setDefaultUI();
    }
    
    private void setDefaultUI() {
        containerjPanel.removeAll();
        
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("DefaultPanel", new DefaultJPanel());
        cardLayout.next(containerjPanel);
    }
    
    private void initializeData() {
        university = new University("Northeastern University");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainjSplitPanel = new javax.swing.JSplitPane();
        controljPanel = new javax.swing.JPanel();
        studentManagejButton = new javax.swing.JButton();
        teacherManagejButton = new javax.swing.JButton();
        classroomManagejButton = new javax.swing.JButton();
        groupManagejButton = new javax.swing.JButton();
        vaccineManagejButton = new javax.swing.JButton();
        madeWithjLabel = new javax.swing.JLabel();
        lovejLabel = new javax.swing.JLabel();
        neujLabel = new javax.swing.JLabel();
        ratingManagejButton = new javax.swing.JButton();
        githubjButton = new javax.swing.JButton();
        containerjPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controljPanel.setBackground(new java.awt.Color(204, 204, 255));

        studentManagejButton.setText("Student-Management");
        studentManagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentManagejButtonActionPerformed(evt);
            }
        });

        teacherManagejButton.setText("Teacher-Management");
        teacherManagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherManagejButtonActionPerformed(evt);
            }
        });

        classroomManagejButton.setText("Classroom-Management");
        classroomManagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomManagejButtonActionPerformed(evt);
            }
        });

        groupManagejButton.setText("Groups-Management");
        groupManagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupManagejButtonActionPerformed(evt);
            }
        });

        vaccineManagejButton.setText("Vaccine-Management");
        vaccineManagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineManagejButtonActionPerformed(evt);
            }
        });

        madeWithjLabel.setText("Made with ");

        lovejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/userinterface/love.gif"))); // NOI18N

        neujLabel.setText("@neu");

        ratingManagejButton.setText("Rating-Management");
        ratingManagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingManagejButtonActionPerformed(evt);
            }
        });

        githubjButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        githubjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/github-2.png"))); // NOI18N
        githubjButton.setText("Github");
        githubjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                githubjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controljPanelLayout = new javax.swing.GroupLayout(controljPanel);
        controljPanel.setLayout(controljPanelLayout);
        controljPanelLayout.setHorizontalGroup(
            controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controljPanelLayout.createSequentialGroup()
                .addGroup(controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controljPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentManagejButton)
                            .addComponent(teacherManagejButton)
                            .addComponent(groupManagejButton)
                            .addComponent(vaccineManagejButton)
                            .addComponent(classroomManagejButton)))
                    .addGroup(controljPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ratingManagejButton))
                    .addGroup(controljPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(madeWithjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lovejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neujLabel))
                    .addGroup(controljPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(githubjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controljPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {classroomManagejButton, groupManagejButton, ratingManagejButton, studentManagejButton, teacherManagejButton, vaccineManagejButton});

        controljPanelLayout.setVerticalGroup(
            controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controljPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(studentManagejButton)
                .addGap(18, 18, 18)
                .addComponent(teacherManagejButton)
                .addGap(18, 18, 18)
                .addComponent(groupManagejButton)
                .addGap(18, 18, 18)
                .addComponent(classroomManagejButton)
                .addGap(18, 18, 18)
                .addComponent(vaccineManagejButton)
                .addGap(18, 18, 18)
                .addComponent(ratingManagejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addComponent(githubjButton)
                .addGap(18, 18, 18)
                .addGroup(controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controljPanelLayout.createSequentialGroup()
                        .addComponent(neujLabel)
                        .addGap(8, 8, 8))
                    .addGroup(controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(madeWithjLabel)
                        .addComponent(lovejLabel)))
                .addContainerGap())
        );

        controljPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {madeWithjLabel, neujLabel});

        mainjSplitPanel.setLeftComponent(controljPanel);

        containerjPanel.setBackground(new java.awt.Color(0, 102, 153));
        containerjPanel.setLayout(new java.awt.CardLayout());
        mainjSplitPanel.setRightComponent(containerjPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjSplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjSplitPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentManagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentManagejButtonActionPerformed
        // TODO add your handling code here:
        containerjPanel.removeAll();
        
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("StudentManagementHomePanel", new StudentMangementHomeJPanel(containerjPanel, university));
        cardLayout.next(containerjPanel);
    }//GEN-LAST:event_studentManagejButtonActionPerformed

    private void groupManagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupManagejButtonActionPerformed
        // TODO add your handling code here:
        containerjPanel.removeAll();
        
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("ClassroomGroupManagementHomePanel", new ClassRoomGroupManagementHomeJPanel(containerjPanel, university));
        cardLayout.next(containerjPanel);
        
    }//GEN-LAST:event_groupManagejButtonActionPerformed

    private void classroomManagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomManagejButtonActionPerformed
        // TODO add your handling code here:
        containerjPanel.removeAll();
        
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("ClassroomManagementHomePanel", new ClassRoomManagementHomeJPanel(containerjPanel, university));
        cardLayout.next(containerjPanel);
    }//GEN-LAST:event_classroomManagejButtonActionPerformed

    private void vaccineManagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineManagejButtonActionPerformed
        // TODO add your handling code here:
        containerjPanel.removeAll();
        
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("VaccinationManagementHomePanel", new VaccineManagementHomeJPanel(containerjPanel, university));
        cardLayout.next(containerjPanel);
    }//GEN-LAST:event_vaccineManagejButtonActionPerformed

    private void teacherManagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherManagejButtonActionPerformed
        // TODO add your handling code here:
        containerjPanel.removeAll();
        
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("TeacherManagementHomePanel", new TeacherManagementHomeJPanel(containerjPanel, university));
        cardLayout.next(containerjPanel);
    }//GEN-LAST:event_teacherManagejButtonActionPerformed

    private void ratingManagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingManagejButtonActionPerformed
        // TODO add your handling code here:
        containerjPanel.removeAll();
        
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("RatingManagementHomePanel", new TeacherStudentReviewHomeJPanel(university));
        cardLayout.next(containerjPanel);
    }//GEN-LAST:event_ratingManagejButtonActionPerformed

    private void githubjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_githubjButtonActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/dheeraj0/OOD_Final_project").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_githubjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classroomManagejButton;
    private javax.swing.JPanel containerjPanel;
    private javax.swing.JPanel controljPanel;
    private javax.swing.JButton githubjButton;
    private javax.swing.JButton groupManagejButton;
    private javax.swing.JLabel lovejLabel;
    private javax.swing.JLabel madeWithjLabel;
    private javax.swing.JSplitPane mainjSplitPanel;
    private javax.swing.JLabel neujLabel;
    private javax.swing.JButton ratingManagejButton;
    private javax.swing.JButton studentManagejButton;
    private javax.swing.JButton teacherManagejButton;
    private javax.swing.JButton vaccineManagejButton;
    // End of variables declaration//GEN-END:variables
}
