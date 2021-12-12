/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.userinterface.classroomGroup;

import edu.neu.csye6200.University;
import edu.neu.csye6200.classRoom.ClassRoom;
import edu.neu.csye6200.classRoomGroup.ClassRoomGroup;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manojreddy
 */
public class ClassRoomGroupManagementHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClassRoomGroupManagementHomeJPanel
     */
    private JPanel containerjPanel;
    private University university;
    
    public ClassRoomGroupManagementHomeJPanel(JPanel containerjPanel, University university) {
        initComponents();
        this.containerjPanel = containerjPanel;
        this.university = university;
        
        populateClassRoomgroups();
    }
    
    public void populateClassRoomgroups() {
        
        DefaultTableModel classRoomGroupListModel = (DefaultTableModel) classRoomsListjTable.getModel();
        classRoomGroupListModel.setRowCount(0);
        
        System.out.println(university.getClassRoomGroupController().getUnassignedClassRoomGroup().size());
        
        university.getClassRoomGroupController().getAllClassRoomGroup().stream()
                .map(x -> (ClassRoomGroup)x)
                .map(x -> new Object[]{x, x.getTeacher().getName(),x.getIsAssigned(),x.getStudents().size(),x.getAgeGroup().getDisplayValue()})
                .forEach(x -> {classRoomGroupListModel.addRow(x);});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        classRoomsListjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        deletejButton = new javax.swing.JButton();
        createjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();

        classRoomsListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Teacher", "IsAssigned", "No of Students"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(classRoomsListjTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ClassRoom Group Records");

        deletejButton.setText("Delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        createjButton.setText("Create >");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updatejButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletejButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createjButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletejButton)
                    .addComponent(createjButton)
                    .addComponent(updatejButton))
                .addContainerGap(314, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel classRoomListModel = (DefaultTableModel) classRoomsListjTable.getModel();
        ClassRoomGroup classRoomGroup = (ClassRoomGroup) classRoomListModel.getValueAt(classRoomsListjTable.getSelectedRow(), 0);
        university.getClassRoomGroupController().removeClassRoomGroup(classRoomGroup);

        JOptionPane.showMessageDialog(this, "Successfully deleted classRoomGroup record");

        populateClassRoomgroups();
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("CreateNewStudentJpanel", new CreateNewClassRoomGroupJPanel(containerjPanel, university));
        cardLayout.next(containerjPanel);
    }//GEN-LAST:event_createjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel classRoomListModel = (DefaultTableModel) classRoomsListjTable.getModel();
        ClassRoomGroup classRoomGroup = (ClassRoomGroup) classRoomListModel.getValueAt(classRoomsListjTable.getSelectedRow(), 0);

        CardLayout cardLayout = (CardLayout) containerjPanel.getLayout();
        containerjPanel.add("UpdateStudentJPanel", new UpdateClassRoomGroupJPanel(containerjPanel, university, classRoomGroup));
        cardLayout.next(containerjPanel);
    }//GEN-LAST:event_updatejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable classRoomsListjTable;
    private javax.swing.JButton createjButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
