/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jacksonalexander
 */
public class ViewDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeliveryManJPanel
     */
    public JPanel container;
    public DeliveryMan deliveryMan;
    public DeliveryManDirectory deliveryManDirectory;
    public ViewDeliveryManJPanel(JPanel container,DeliveryMan deliveryMan,DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.container = container;
        this.deliveryMan = deliveryMan;
        this.deliveryManDirectory = deliveryManDirectory;
        
        deliveryManIdTextField.setText(deliveryMan.getDeliveryId());
        deliveryManNameTextField.setText(deliveryMan.getName());
        deliveryManPhoneTextField.setText(deliveryMan.getPhoneNo());
        deliveryManAddressTextField.setText(deliveryMan.getAddress());
        image.setIcon(new ImageIcon(deliveryMan.getPhoto()));
        deliveryManIdTextField.setEditable(false);
        deliveryManNameTextField.setEditable(false);
        deliveryManPhoneTextField.setEditable(false);
        deliveryManAddressTextField.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deliveryManIdTextField = new javax.swing.JTextField();
        deliveryManNameTextField = new javax.swing.JTextField();
        deliveryManPhoneTextField = new javax.swing.JTextField();
        deliveryManAddressTextField = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 115, 51));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Delivery Man");

        jLabel2.setText("Delivery Man Id");

        jLabel4.setText("Delivery Man Name");

        jLabel5.setText("Delivery Man Phone No");

        jLabel6.setText("Delivery Man Address");

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save Changes");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deliveryManIdTextField)
                            .addComponent(deliveryManNameTextField)
                            .addComponent(deliveryManPhoneTextField)
                            .addComponent(deliveryManAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(editBtn)
                        .addGap(18, 18, 18)
                        .addComponent(saveBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(deliveryManIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(deliveryManNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(deliveryManPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(deliveryManAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editBtn)
                            .addComponent(saveBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        deliveryManNameTextField.setEditable(true);
        deliveryManPhoneTextField.setEditable(true);
        deliveryManAddressTextField.setEditable(true);
    }//GEN-LAST:event_editBtnActionPerformed

    public boolean phoneFormat(String phone){
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String id = deliveryManIdTextField.getText();
        String name = deliveryManNameTextField.getText();
        String phone = deliveryManPhoneTextField.getText();
        String address = deliveryManAddressTextField.getText();
        
        if(name.isEmpty() || phone.isEmpty() || address.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all the fields!");
        }
        else if(!phoneFormat(phone))
        {
            JOptionPane.showMessageDialog(null, "Phone format is incorrect!");
        }
        else{
            deliveryManDirectory.updateDeliveryMan(id,name,phone,address);
            JOptionPane.showMessageDialog(null, "Delivery man details updated!");
            deliveryManNameTextField.setEditable(false);
            deliveryManPhoneTextField.setEditable(false);
            deliveryManAddressTextField.setEditable(false);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliveryJPanel manageDeliveryJPanel = (ManageDeliveryJPanel) component;
        manageDeliveryJPanel.populate();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField deliveryManAddressTextField;
    private javax.swing.JTextField deliveryManIdTextField;
    private javax.swing.JTextField deliveryManNameTextField;
    private javax.swing.JTextField deliveryManPhoneTextField;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
