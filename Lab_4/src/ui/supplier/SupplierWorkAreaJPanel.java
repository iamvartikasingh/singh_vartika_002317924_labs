/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.supplier;

import model.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import model.SupplierDirectory;
import ui.LoginScreen;

/**
 *
 * @author vartika
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    JPanel mainWorkArea;
    Supplier supplier;
     SupplierDirectory supplierDirectory;
//    MasterOrderCatalog masterOrderCatalog;

    /**
     * Creates new form ProductManagerWorkAreaJPanel
     */
     public SupplierWorkAreaJPanel(JPanel mainWorkArea, Supplier supplier, SupplierDirectory supplierDirectory) {

        initComponents();
        this.mainWorkArea = mainWorkArea;
        
        this.supplier = supplier;
        this.supplierDirectory = supplierDirectory;
        if (supplier != null) lblWelcome.setText("Welcome to Lab 4, "+supplier.getSupplyName());
        
//      masterOrderCatalog = moc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workArea = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        btnManageProductCatalog = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnManageStaff = new javax.swing.JButton();
        Performance = new javax.swing.JButton();
        btnSupplierProfile = new javax.swing.JButton();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        workArea.setBackground(new java.awt.Color(237, 249, 255));
        workArea.setLayout(new java.awt.CardLayout());

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        btnManageProductCatalog.setText("Product Catalog");
        btnManageProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductCatalogActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblWelcome.setText("<Welcome Message>");

        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });

        Performance.setText("Performance");
        Performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformanceActionPerformed(evt);
            }
        });

        btnSupplierProfile.setText("Update Profile");
        btnSupplierProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnManageProductCatalog)
                .addGap(36, 36, 36)
                .addComponent(btnSupplierProfile)
                .addGap(31, 31, 31)
                .addComponent(btnManageStaff)
                .addGap(48, 48, 48)
                .addComponent(Performance)
                .addGap(31, 31, 31)
                .addComponent(btnLogOut)
                .addGap(45, 45, 45))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageProductCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome)
                    .addComponent(btnManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplierProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(535, Short.MAX_VALUE))
        );

        workArea.add(menuBar, "card2");

        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        
    mainWorkArea.remove(this);

    Component[] componentArray = mainWorkArea.getComponents();
    Component component = componentArray[componentArray.length - 1];
    LoginScreen loginPanel = (LoginScreen) component;
    loginPanel.populateSupplierCombo();

    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
    layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void PerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerformanceActionPerformed
        // TODO add your handling code here:
        //        ProductReportJPanel prjp = new workArea(userProcessContainer, supplier);
        //        workArea.add("ProductReportJPanelSupplier", prjp);
        //        CardLayout layout = (CardLayout)workArea.getLayout();
        //        layout.next(userProcessContainer);
    }//GEN-LAST:event_PerformanceActionPerformed

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
        // TODO add your handling code here:
          
    
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnManageProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductCatalogActionPerformed
        // TODO add your handling code here:
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(workArea, supplier);
        workArea.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageProductCatalogActionPerformed

    private void btnSupplierProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierProfileActionPerformed
        // TODO add your handling code here:
        UpdateSupplierProfile updateProfile = new UpdateSupplierProfile(workArea, supplier, supplierDirectory);
        workArea.add(updateProfile);

        CardLayout cardLayout = (CardLayout) workArea.getLayout();
        cardLayout.next(workArea);
    }//GEN-LAST:event_btnSupplierProfileActionPerformed
@Override
public String toString() {
    return "Supplier";
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Performance;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageProductCatalog;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnSupplierProfile;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
