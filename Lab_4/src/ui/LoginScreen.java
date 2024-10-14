/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Supplier;
import model.SupplierDirectory;
import ui.admin.AdminWorkAreaJPanel;
import ui.supplier.SupplierWorkAreaJPanel;



/**
 *
 * @author vartika
 */
public class LoginScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    SupplierDirectory supplierDirectory;
    Supplier selectedSupplier = null;

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen(JPanel mainWorkArea, SupplierDirectory supplierDirectory) {
        initComponents();

        this.mainWorkArea = mainWorkArea;
        this.supplierDirectory = supplierDirectory;

        populateRoleCombo();
    populateSupplierCombo();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSupplier = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        cmbRoles = new javax.swing.JComboBox<>();
        cmbSuppliers = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(227, 246, 255));

        lblSupplier.setText("Select Supplier:");

        jLabel2.setText("Lab_4");

        lblRole.setText("Choose Role:");

        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        cmbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolesActionPerformed(evt);
            }
        });

        cmbSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSuppliersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1130, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRole)
                    .addComponent(lblSupplier))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSuppliers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSupplier)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
     JPanel selectedPanel = (JPanel) cmbRoles.getSelectedItem();

    // Check if the selected role is for SupplierWorkAreaJPanel
    if (selectedPanel.getClass() == SupplierWorkAreaJPanel.class) {
        // If no supplier is selected, show an error message
        if (selectedSupplier == null) {
            JOptionPane.showMessageDialog(this, "Please select a supplier to login under supplier role.");
            return; // Stop the process if no supplier is selected
        } else {
            // If a supplier is selected, create a new SupplierWorkAreaJPanel with it
            selectedPanel = new SupplierWorkAreaJPanel(mainWorkArea, selectedSupplier);
        }
    }

    // Add the selected panel to the main work area and switch to it using CardLayout
    mainWorkArea.add("WorkAreaJPanel", selectedPanel);
    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
    layout.next(mainWorkArea);
    }//GEN-LAST:event_btnLogInActionPerformed

    private void cmbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolesActionPerformed
        // TODO add your handling code here:
        updateSupplierVisibility();
    }//GEN-LAST:event_cmbRolesActionPerformed

    private void cmbSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSuppliersActionPerformed
        // TODO add your handling code here:
        // Check if the selected item is null
    if (cmbSuppliers.getSelectedItem() == null) return;
    selectedSupplier = (Supplier) cmbSuppliers.getSelectedItem();
    }//GEN-LAST:event_cmbSuppliersActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JComboBox<Object> cmbRoles;
    private javax.swing.JComboBox<Supplier> cmbSuppliers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSupplier;
    // End of variables declaration//GEN-END:variables

   // Method to populate roles in the combo box
private void populateRoleCombo() {
     cmbRoles.removeAllItems(); // Clear all items from the combo box

    // Create the admin panel and supplier panel
    AdminWorkAreaJPanel adminPanel = new AdminWorkAreaJPanel(mainWorkArea, supplierDirectory);
    SupplierWorkAreaJPanel supplierPanel = new SupplierWorkAreaJPanel(mainWorkArea, selectedSupplier);

    // Add the panels to the combo box
    cmbRoles.addItem(adminPanel); // Adding Admin panel
    cmbRoles.addItem(supplierPanel); // Adding Supplier panel
}


public void populateSupplierCombo() {
    cmbSuppliers.removeAllItems(); // Clear all items from the combo box

    // Loop through the suppliers and add them to the combo box
    for (Supplier supplier : supplierDirectory.getSupplierList()) {
        cmbSuppliers.addItem(supplier); // Add the Supplier object, toString() will display the name
    }
}

// Method to update the visibility of suppliers
private void updateSupplierVisibility() {
    // If no role is selected or if the selected role is AdminWorkAreaJPanel
    if ((cmbRoles.getSelectedItem() == null) || 
        (cmbRoles.getSelectedItem().getClass() == AdminWorkAreaJPanel.class)) {
        // Hide supplier-related components and reset selectedSupplier
        selectedSupplier = null;
        lblSupplier.setVisible(false);  // Hide the supplier label
        cmbSuppliers.setVisible(false); // Hide the supplier combo box
        return; // Exit the method
    }

    // If the selected role is SupplierWorkAreaJPanel
    if (cmbRoles.getSelectedItem().getClass() == SupplierWorkAreaJPanel.class) {
        // Show supplier-related components
        lblSupplier.setVisible(true);   // Show the supplier label
        cmbSuppliers.setVisible(true);  // Show the supplier combo box
    }
}




}