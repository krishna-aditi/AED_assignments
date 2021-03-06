 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author krish
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    PatientDirectory patientDirectory;
    
    
    public ViewJPanel(PatientDirectory patientDirectory) {
        initComponents();
        
        this.patientDirectory = patientDirectory;
        
        populateAllPatientsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewAll = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewAll = new javax.swing.JTable();
        txtViewAddress = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtViewName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtViewAge = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtViewGender = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        txtViewCity = new javax.swing.JTextField();
        txtViewPhoneNo = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        btnViewSelectedPatient = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblViewPatientID = new javax.swing.JLabel();
        txtViewPatientID = new javax.swing.JTextField();
        txtViewCommunity = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblCommunityNo = new javax.swing.JLabel();
        txtFindByCommunityNo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 204, 255));

        lblViewAll.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblViewAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewAll.setText("Patient log");

        tblViewAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "PatientID", "Age", "Gender", "Community", "Systolic BP", "Diastolic BP"
            }
        ));
        jScrollPane1.setViewportView(tblViewAll);

        txtViewAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Name:");

        txtViewName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAge.setText("Age:");

        txtViewAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblCommunity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCommunity.setText("Community:");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGender.setText("Gender:");

        txtViewGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCity.setText("City:");

        lblPhoneNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPhoneNo.setText("Phone no.:");

        txtViewCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtViewCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewCityActionPerformed(evt);
            }
        });

        txtViewPhoneNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddress.setText("Address:");

        btnViewSelectedPatient.setText("View Patient Details");
        btnViewSelectedPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSelectedPatientActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Patient Detail");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblViewPatientID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblViewPatientID.setText("Patient ID:");

        txtViewPatientID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtViewCommunity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnSearch.setText("Find patients with risky BP");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblCommunityNo.setText("Find log by community number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(txtViewGender, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(txtViewAge, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(txtViewName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblViewPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(txtViewPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPhoneNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnViewSelectedPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtViewPhoneNo)
                                        .addComponent(txtViewCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtViewAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addComponent(txtViewCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunityNo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFindByCommunityNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblViewAll)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtViewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunityNo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtFindByCommunityNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblViewPatientID)
                            .addComponent(txtViewPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtViewAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtViewGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNo)
                            .addComponent(txtViewPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtViewCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewSelectedPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtViewCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewCityActionPerformed

    private void btnViewSelectedPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSelectedPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewAll.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a patient log to view!");
            return;
        }
        
        DefaultTableModel viewModel = (DefaultTableModel) tblViewAll.getModel();
        Patient selectedPatient = (Patient) viewModel.getValueAt(selectedRowIndex, 0);
        
        txtViewName.setText(selectedPatient.getName());
        txtViewPatientID.setText(String.valueOf(selectedPatient.getPatientID()));
        txtViewAge.setText(String.valueOf(selectedPatient.getAge()));
        txtViewGender.setText(selectedPatient.getGender());
        txtViewPhoneNo.setText(selectedPatient.getPhoneNo());
        txtViewCommunity.setText(String.valueOf(selectedPatient.getCommunity()));
        txtViewCity.setText(selectedPatient.getCity());
        txtViewAddress.setText(selectedPatient.getAddress());
        
        
    }//GEN-LAST:event_btnViewSelectedPatientActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblViewAll.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
            return;
        }
        DefaultTableModel viewModel = (DefaultTableModel) tblViewAll.getModel();
        Patient selectedPatient = (Patient) viewModel.getValueAt(selectedRowIndex, 0); // typecasting to Patient class type
        // at the 0th column we have the whole object stored
       
        patientDirectory.removePatient(selectedPatient);
        JOptionPane.showMessageDialog(this, "Patient log deleted!");
        
        populateAllPatientsTable(); // refreshing table after deletion
        
        txtViewName.setText("");
        txtViewPatientID.setText("");
        txtViewAge.setText("");
        txtViewGender.setText("");
        txtViewPhoneNo.setText("");
        txtViewCommunity.setText("");
        txtViewCity.setText("");
        txtViewAddress.setText("");
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewAll.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a patient log to update!");
            return;
        }
        DefaultTableModel viewModel = (DefaultTableModel) tblViewAll.getModel();
        Patient selectedPatient = (Patient) viewModel.getValueAt(selectedRowIndex, 0); // typecasting to Patient class type
        
        selectedPatient.setName(txtViewName.getText());
        selectedPatient.setAge(Integer.parseInt(txtViewAge.getText()));
        selectedPatient.setGender(txtViewGender.getText());
        selectedPatient.setPhoneNo(txtViewPhoneNo.getText());
        selectedPatient.setCity(txtViewCity.getText());
        selectedPatient.setCommunity(Integer.parseInt(txtViewCommunity.getText()));
        selectedPatient.setAddress(txtViewAddress.getText());

        JOptionPane.showMessageDialog(this, "Patient log updated!");
        populateAllPatientsTable();
        
        txtViewName.setText("");
        txtViewPatientID.setText("");
        txtViewAge.setText("");
        txtViewGender.setText("");
        txtViewPhoneNo.setText("");
        txtViewCommunity.setText("");
        txtViewCity.setText("");
        txtViewAddress.setText("");
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        int communityNo = 0;
        communityNo = Integer.parseInt(txtFindByCommunityNo.getText());
        populateTableWithBP(communityNo);
        
   
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewSelectedPatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunityNo;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblViewAll;
    private javax.swing.JLabel lblViewPatientID;
    private javax.swing.JTable tblViewAll;
    private javax.swing.JTextField txtFindByCommunityNo;
    private javax.swing.JTextField txtViewAddress;
    private javax.swing.JTextField txtViewAge;
    private javax.swing.JTextField txtViewCity;
    private javax.swing.JTextField txtViewCommunity;
    private javax.swing.JTextField txtViewGender;
    private javax.swing.JTextField txtViewName;
    private javax.swing.JTextField txtViewPatientID;
    private javax.swing.JTextField txtViewPhoneNo;
    // End of variables declaration//GEN-END:variables

    private void populateAllPatientsTable() {
        
        DefaultTableModel viewModel = (DefaultTableModel) tblViewAll.getModel(); // typecasting into DefaultTableModel class type
        viewModel.setRowCount(0);
        
        for( Patient patientAdded: patientDirectory.getPatientList() ){
            
            Object[] row = new Object[7];
            row[0] = patientAdded;
            row[1] = patientAdded.getPatientID();
            row[2] = patientAdded.getAge();
            row[3] = patientAdded.getGender();
            row[4] = patientAdded.getCommunity();
            row[5] = patientAdded.getSBP();
            row[6] = patientAdded.getDBP();
            
            viewModel.addRow(row);
        }
        
    }

    private void populateTableWithBP(int commNo) {
        DefaultTableModel viewBPModel = (DefaultTableModel) tblViewAll.getModel(); // typecasting into DefaultTableModel class type
        viewBPModel.setRowCount(0);
        ArrayList<Patient> patientListBP = new ArrayList<Patient>();
        for(Patient patient : patientDirectory.getPatientList()){
            if(patient.getCommunity()== commNo && patient.getAge() <30 && (patient.getSBP() > 120 || patient.getDBP() <70)){
            //if(patient.getSBP() > 120) {
                patientListBP.add(patient);
            }
        }
        for( Patient patientAdded: patientListBP ){
            //patientAdded.getEncounterHistory().getEncounterList();
            
            Object[] row = new Object[7];
            row[0] = patientAdded;
            row[1] = patientAdded.getPatientID();
            row[2] = patientAdded.getAge();
            row[3] = patientAdded.getGender();
            row[4] = patientAdded.getCommunity();
            row[5] = patientAdded.getSBP();
            row[6] = patientAdded.getDBP();
            
            viewBPModel.addRow(row);
        }    
    }
}
