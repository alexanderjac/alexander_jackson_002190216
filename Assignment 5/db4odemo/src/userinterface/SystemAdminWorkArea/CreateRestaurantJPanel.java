/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
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
public class CreateRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createRestaurantJPanel
     */
    JFileChooser chooser;
    File file;
    BufferedImage img;
    private RestaurantDirectory restaurantDirectory;
    private JPanel container;
    private EcoSystem system;
    public CreateRestaurantJPanel(JPanel container, EcoSystem system,RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.restaurantDirectory = restaurantDirectory;
        this.container = container;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRestaurant = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        restaurantNameTextField = new javax.swing.JTextField();
        restaurantAddressTextField = new javax.swing.JTextField();
        restaurantPhoneNoTextField = new javax.swing.JTextField();
        chooseImgBtn = new javax.swing.JButton();
        btnaddRestaurant = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblManagerName = new javax.swing.JLabel();
        txtmanagerName = new javax.swing.JTextField();
        lblLicenceNo = new javax.swing.JLabel();
        txtlicenseNo = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblRestaurant.setText("Restaurant");

        lblName.setText("Name");

        lblAddress.setText("Address");

        lblPhoneNumber.setText("Phone no");

        lblImage.setText("Photo");

        chooseImgBtn.setText("Choose");
        chooseImgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImgBtnActionPerformed(evt);
            }
        });

        btnaddRestaurant.setText("Add");
        btnaddRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddRestaurantActionPerformed(evt);
            }
        });

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblUserName.setText("Username");

        lblPassword.setText("Password");

        lblManagerName.setText("Manager Name");

        lblLicenceNo.setText("Restaurant License No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(287, 287, 287)
                        .addComponent(lblRestaurant))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName)
                                    .addComponent(lblPassword)
                                    .addComponent(lblManagerName)
                                    .addComponent(lblName)
                                    .addComponent(lblAddress)
                                    .addComponent(lblPhoneNumber)
                                    .addComponent(lblImage))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(restaurantPhoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmanagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restaurantAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restaurantNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtlicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chooseImgBtn)
                                    .addComponent(btnaddRestaurant)))
                            .addComponent(lblLicenceNo))))
                .addGap(98, 617, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurant)
                    .addComponent(btnback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagerName)
                    .addComponent(txtmanagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(restaurantNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(restaurantAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(restaurantPhoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImage)
                    .addComponent(chooseImgBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenceNo)
                    .addComponent(txtlicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnaddRestaurant)
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddRestaurantActionPerformed
        // TODO add your handling code here:
        String name = restaurantNameTextField.getText();
        String address = restaurantAddressTextField.getText();
        String phoneNumber = restaurantPhoneNoTextField.getText();
        String username = txtusername.getText();
        String password = passwordTextField.getText();
        String managerName = txtmanagerName.getText();
        String licenseNo = txtlicenseNo.getText();
        
        if(username.isEmpty() || password.isEmpty() || name.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() || managerName.isEmpty() || licenseNo.isEmpty() || img == null){
            JOptionPane.showMessageDialog(null, "Please enter all the fields!");
        } 
        else if(!phoneFormat(phoneNumber))
        {
            JOptionPane.showMessageDialog(null, "Phone number format is incorrect!");
        }
        else if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
        else if(!restaurantDirectory.isPhoneUnique(phoneNumber)){
            JOptionPane.showMessageDialog(null, "Phone number already registered!");
        }
        else if(!restaurantDirectory.isUniqueLicenseNo(licenseNo)){
            JOptionPane.showMessageDialog(null, "License Number already exists!");
        }
        else{
            Restaurant restaurant = restaurantDirectory.add(managerName,name,phoneNumber,address,img, licenseNo);
            Employee employee = system.getEmployeeDirectory().createEmployee(restaurant.getRestaurantId());
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
            JOptionPane.showMessageDialog(null, "Restaurant is added!");
            restaurantNameTextField.setText("");
            restaurantAddressTextField.setText("");
            restaurantPhoneNoTextField.setText("");
            txtusername.setText("");
            passwordTextField.setText("");
            txtlicenseNo.setText("");
            txtmanagerName.setText("");
            img = null;
        }
    }//GEN-LAST:event_btnaddRestaurantActionPerformed
    
    private void chooseImgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImgBtnActionPerformed
        // TODO add your handling code here:
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();
        try{
            img = ImageIO.read(file);
        } catch (IOException e){
        }
    }//GEN-LAST:event_chooseImgBtnActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
         Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantJPanel manageRestaurantJPanel = (ManageRestaurantJPanel) component;
        manageRestaurantJPanel.populate();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnbackActionPerformed
    
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
    private javax.swing.JButton btnaddRestaurant;
    private javax.swing.JButton btnback;
    private javax.swing.JButton chooseImgBtn;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicenceNo;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRestaurant;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField restaurantAddressTextField;
    private javax.swing.JTextField restaurantNameTextField;
    private javax.swing.JTextField restaurantPhoneNoTextField;
    private javax.swing.JTextField txtlicenseNo;
    private javax.swing.JTextField txtmanagerName;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}