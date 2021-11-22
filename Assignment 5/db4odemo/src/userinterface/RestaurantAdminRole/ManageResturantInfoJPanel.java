/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jacksonalexander
 */
public class ManageResturantInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageResturantInfoJPanel
     */
    JFileChooser chooser;
    File file;
    BufferedImage img;
    private JPanel container;
    private UserAccount account;
    private EcoSystem system;
    private RestaurantDirectory restaurantDirectory;
    private MenuDirectory menuDirectory;
    private Restaurant restaurant;

    public ManageResturantInfoJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory) {
        initComponents();
        this.container = userProcessContainer;
        this.account = account;
        this.system = system;
        this.restaurantDirectory = restaurantDirectory;
        this.menuDirectory = menuDirectory;
        this.restaurant = restaurant;

        idTextField.setEditable(false);
        nameTextField.setEditable(false);
        managerTextField.setEditable(false);
        addressTextField.setEditable(false);
        contactTextField.setEditable(false);
        licenseTextField.setEditable(false);
        changePicBtn.setVisible(false);

        for (Restaurant rest : restaurantDirectory.getRestaurantDirectory()) {
            if (rest.getRestaurantId().equalsIgnoreCase(account.getEmployee().getName())) {
                this.restaurant = rest;
            }
        }

        idTextField.setText(restaurant.getRestaurantId());
        nameTextField.setText(restaurant.getName());
        managerTextField.setText(restaurant.getManagerName());
        addressTextField.setText(restaurant.getAddress());
        contactTextField.setText(restaurant.getPhoneNo());
        licenseTextField.setText(restaurant.getLicenseNo());
        img = restaurant.getPhoto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contactTextField = new javax.swing.JTextField();
        managerTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        licenseTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        changePicBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 115, 51));

        jLabel1.setText("Restaurant Info");

        jLabel2.setText("Restaurant Id");

        jLabel3.setText("Restaurant Name");

        jLabel4.setText("Restaurant Contact No");

        jLabel5.setText("Restaurant Manager");

        jLabel6.setText("Restaurant Address ");

        jLabel7.setText("Restaurant License No");

        jLabel8.setText("Change Picture");

        changePicBtn.setText("Choose");
        changePicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePicBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save Changes");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(editBtn)
                                .addComponent(jLabel8)))
                        .addGap(69, 600, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(managerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changePicBtn)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(saveBtn)
                                .addGap(25, 25, 25)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(managerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(changePicBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(editBtn))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        idTextField.setEditable(false);
        nameTextField.setEditable(true);
        managerTextField.setEditable(true);
        addressTextField.setEditable(true);
        contactTextField.setEditable(true);
        licenseTextField.setEditable(false);
        changePicBtn.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void changePicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePicBtnActionPerformed
        // TODO add your handling code here:
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();
        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
            img = restaurant.getPhoto();
        }
    }//GEN-LAST:event_changePicBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String id = idTextField.getText();
        String name = nameTextField.getText();
        String manager = managerTextField.getText();
        String address = addressTextField.getText();
        String contact = contactTextField.getText();
        String license = licenseTextField.getText();

        if (id.isEmpty() || name.isEmpty() || manager.isEmpty() || address.isEmpty() || contact.isEmpty() || license.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields!");
        } else if(!phoneFormat(contact))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }else {
            restaurant.setManagerName(manager);
            restaurant.setAddress(address);
            restaurant.setPhoneNo(contact);
            restaurant.setName(name);
            restaurant.setPhoto(img);
            
            JOptionPane.showMessageDialog(null, "Changes saved sucessfully!");
            
            idTextField.setEditable(false);
            nameTextField.setEditable(false);
            managerTextField.setEditable(false);
            addressTextField.setEditable(false);
            contactTextField.setEditable(false);
            licenseTextField.setEditable(false);
            changePicBtn.setVisible(false);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean phoneFormat(String phone){
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton changePicBtn;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField licenseTextField;
    private javax.swing.JTextField managerTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
