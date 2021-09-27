/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Model.Person;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;



/**
 *
 * @author jacksonalexander
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJpanel
     */
    Person person;
    public CreateJPanel(Person person) {
        initComponents();
       // datePicket();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   /** private void datePicket(){
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);  
        frame.add(datePicker);
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeoDate = new javax.swing.JLabel();
        lbldateOfbirth = new javax.swing.JLabel();
        lblTelephoneNum = new javax.swing.JLabel();
        lblFAXNum = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblmedRecnum = new javax.swing.JLabel();
        lblhealthPlanBenenum = new javax.swing.JLabel();
        lblbankAccnum = new javax.swing.JLabel();
        lblcertNum = new javax.swing.JLabel();
        lblvehIden = new javax.swing.JLabel();
        lbldeviceIden = new javax.swing.JLabel();
        lbllinkedIn = new javax.swing.JLabel();
        lblinternetProtocolAddress = new javax.swing.JLabel();
        lbluniqueIdentifyingNum = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtTelephoneNumber = new javax.swing.JTextField();
        txtFAXNumber = new javax.swing.JTextField();
        txtEmailAddresses = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        txtHealthPlanBeneficiaryNum = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtbankAccnum = new javax.swing.JTextField();
        txtcertNum = new javax.swing.JTextField();
        txtvehIden = new javax.swing.JTextField();
        txtdeviceIden = new javax.swing.JTextField();
        txtlinkedIn = new javax.swing.JTextField();
        txtinternetProtocolAddress = new javax.swing.JTextField();
        txtuniqueIdentifyingNum = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jDateDOB = new com.toedter.calendar.JDateChooser();
        btnPhoto = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();
        lblBiometric = new javax.swing.JLabel();
        btnBiometric = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create");

        lblName.setText("Name:");

        lblGeoDate.setText("Geographic Data:");

        lbldateOfbirth.setText("Date of  Birth:");

        lblTelephoneNum.setText("Telephone Number:");

        lblFAXNum.setText("FAX Number:");

        lblEmail.setText("Email addresses:");

        lblSSN.setText("Social Security number:");

        lblmedRecnum.setText("Medical Record number:");

        lblhealthPlanBenenum.setText("Health plan beneficiary number:");

        lblbankAccnum.setText("Bank account numbers:");

        lblcertNum.setText("Certificate/license number:");

        lblvehIden.setText("Vehicle serial numbers:");

        lbldeviceIden.setText("Device identifiers and serial numbers:");

        lbllinkedIn.setText("LinkedIn:");

        lblinternetProtocolAddress.setText("Internet protocol addresses:");

        lbluniqueIdentifyingNum.setText("unique identifying number:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });

        txtTelephoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneNumberActionPerformed(evt);
            }
        });

        txtFAXNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAXNumberActionPerformed(evt);
            }
        });

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPhoto.setText("Attach");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        lblPhoto.setText("         Photo");

        lblBiometric.setText("Biometric");

        btnBiometric.setText("Attach");
        btnBiometric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiometricActionPerformed(evt);
            }
        });

        jLabel1.setText("Phone Number Should be 10 digits");

        jLabel2.setText("Fax Number Should be 10 Digits");

        jLabel3.setText("SSN Should be 10 Digits");

        jLabel4.setText("Medical Record Number should be 10 digits");

        jLabel5.setText("Health Plan Beneficiary Number is 5 Alphabets followed by 5 digits");

        jLabel6.setText("Bank Account Number is 4 Alphabets followed by 7 digits");

        jLabel7.setText("Certificate/license number is 3 alphabets and 7 numbers followed ");

        jLabel8.setText("Vehicle number should be in the format like AD12GH1223");

        jLabel9.setText("Device identification number should be 10 digits");

        jLabel10.setText("Unique identification number is 10 digits");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblhealthPlanBenenum)
                                    .addComponent(lblmedRecnum)
                                    .addComponent(lblSSN)
                                    .addComponent(lblEmail)
                                    .addComponent(lblFAXNum)
                                    .addComponent(lblTelephoneNum)
                                    .addComponent(lbldateOfbirth)
                                    .addComponent(lblName)
                                    .addComponent(lblGeoDate)
                                    .addComponent(lblbankAccnum)
                                    .addComponent(lblcertNum)
                                    .addComponent(lblvehIden)
                                    .addComponent(lbldeviceIden)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblinternetProtocolAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbllinkedIn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbluniqueIdentifyingNum, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStreet))
                                    .addComponent(txtName)
                                    .addComponent(txtHealthPlanBeneficiaryNum, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMedicalRecordNumber)
                                    .addComponent(txtSSN)
                                    .addComponent(txtEmailAddresses)
                                    .addComponent(txtFAXNumber)
                                    .addComponent(txtTelephoneNumber)
                                    .addComponent(txtbankAccnum)
                                    .addComponent(txtcertNum)
                                    .addComponent(txtvehIden)
                                    .addComponent(txtdeviceIden)
                                    .addComponent(txtlinkedIn)
                                    .addComponent(txtinternetProtocolAddress)
                                    .addComponent(txtuniqueIdentifyingNum)
                                    .addComponent(jDateDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(0, 14, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBiometric, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBiometric, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBiometric, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnPhoto)
                    .addComponent(btnBiometric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeoDate)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldateOfbirth)
                    .addComponent(jDateDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephoneNum)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFAXNum)
                    .addComponent(txtFAXNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmailAddresses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmedRecnum)
                    .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhealthPlanBenenum)
                    .addComponent(txtHealthPlanBeneficiaryNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbankAccnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbankAccnum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcertNum)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcertNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblvehIden)
                    .addComponent(txtvehIden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldeviceIden)
                    .addComponent(txtdeviceIden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllinkedIn)
                    .addComponent(txtlinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinternetProtocolAddress)
                    .addComponent(txtinternetProtocolAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluniqueIdentifyingNum)
                    .addComponent(txtuniqueIdentifyingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblFAXNum, lblTelephoneNum, lbldateOfbirth, txtFAXNumber, txtTelephoneNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed

    private void txtTelephoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneNumberActionPerformed

    private void txtFAXNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAXNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAXNumberActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         int flag_count = 0;
        if(txtName.getText().length()==0)
        {System.out.println("No Value Inserted");
        flag_count=1;
        } else if(Pattern.matches("[a-zA-Z]+\\.?",txtName.getText()))
        {person.setName(txtName.getText());  // Prints name
        }else{System.out.println("This is an invalid Input");     
        flag_count=1;
        }
        
        if(txtCountry.getText().length() ==0)
        {System.out.println("No Value Inserted"); 
        flag_count=1;
        }else if(Pattern.matches("[a-zA-Z]+\\.?",txtCountry.getText()))
        {person.setCountry(txtCountry.getText()); // Prints country
        }else{System.out.println("This is an invalid Input");   
        flag_count=1;
        }
        
        if(txtCity.getText().length() ==0)
        {System.out.println("No Value Inserted"); 
        flag_count=1;
        }else if(Pattern.matches("[a-zA-Z]+\\.?",txtCity.getText()))
        {person.setCity(txtCity.getText()); // Prints City
        }else{System.out.println("This is an invalid Input");    
        flag_count=1;}
        
        if(txtStreet.getText().length() ==0)
        {System.out.println("No data Inserted");
        flag_count=1;
        }else if(Pattern.matches("[a-zA-Z]+\\.?",txtStreet.getText()))
        {person.setStreet(txtStreet.getText()); // Prints Street 
        }else{System.out.println("This is an invalid Input");   
        flag_count=1;}
        
      
        if(jDateDOB.getDate() == null){
            System.out.println("No Value Inserted");
        }      
        else{
            person.setDateOfbirth(jDateDOB.getDate());
        }
        
        if(Pattern.matches("^\\d{10}$", txtTelephoneNumber.getText())){
        person.setTelePhone(txtTelephoneNumber.getText()); // Prints Telephone
        
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
       
        if(Pattern.matches("^\\d{10}$", txtFAXNumber.getText())){
        person.setFaxNumber(txtFAXNumber.getText()); // Prints Fax number
  
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
        
        if(txtEmailAddresses.getText().length()==0)
        {System.out.println("No Value Inserted");
        flag_count=1;
        } else if(Pattern.matches("^(.+)@(.+)$",txtEmailAddresses.getText()))
        {person.setEmailId(txtEmailAddresses.getText());
        }else{System.out.println("This is an invalid Input"); 
        flag_count=1;}
         
       if(Pattern.matches("^\\d{10}$", txtSSN.getText())){
         person.setSsn(Long.parseLong(txtSSN.getText()));//SSN should be 10 digits
       } else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
        
       if(Pattern.matches("^\\d{10}$", txtMedicalRecordNumber.getText())){
        person.setMedRecnum(txtMedicalRecordNumber.getText());// Assuming Medical Record Number is 10 digits
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
       
       if(Pattern.matches("^[A-Z]{5}[0-9]{5}$", txtHealthPlanBeneficiaryNum.getText())){
        person.setHealthPlanBenenum(txtHealthPlanBeneficiaryNum.getText());// Assuming Health Plan Beneficiary Number is 5 Alphabets followed by 5 digits
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
        
        if(Pattern.matches("^[A-Z]{4}[0-9]{7}$", txtbankAccnum.getText())){
        person.setBankAccnum(txtbankAccnum.getText());// Assuming Bank Account Number is like ABCD1234567
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
       
        if(Pattern.matches("^[A-Z]{3}[0-9]{7}$", txtcertNum.getText())){
        person.setCertNum(txtcertNum.getText());// Assuming Certificate/license number is 3 alphabets and 7 numbers followed
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
        
         if(Pattern.matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$", txtvehIden.getText())){
        person.setVehIden(txtvehIden.getText());// Assuming vehicle number is like AB21CD1234
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
       
         if(Pattern.matches("^\\d{10}$", txtdeviceIden.getText())){
        person.setDeviceIden(txtdeviceIden.getText());// Assuming device identification number is 10 digits
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
       
         if(txtlinkedIn.getText().length()==0)
        {System.out.println("No Value Inserted");
        flag_count=1;
        } else if(Pattern.matches("[a-zA-Z]+\\.?",txtName.getText()))
        {person.setLinkedIn(txtlinkedIn.getText());
        }else{System.out.println("This is an invalid Input");   
        flag_count=1;}
         
         
           if(Pattern.matches("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$", txtinternetProtocolAddress.getText())){
        person.setInternetProtocolAddress(txtinternetProtocolAddress.getText());
           }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
        
        
        
        if(Pattern.matches("^\\d{10}$", txtuniqueIdentifyingNum.getText())){
        person.setUniqueIdentifyingNum(txtuniqueIdentifyingNum.getText());// Assuming Unique identification number is 10 digits
    }
        else {
            System.out.println("This is an invalid Input");
            flag_count=1;
            }
        
        
       // person.setTelePhone(txtTelephoneNumber.getText());
       
       if(flag_count ==1){
           JOptionPane.showMessageDialog(this, "Invalid");
       }
       else{
        JOptionPane.showMessageDialog(this, "Person Information Saved.");
      
    }//GEN-LAST:event_btnSaveActionPerformed
    }
    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        File selectedFile = choose.getSelectedFile();
        String imagename = selectedFile.getName();
        if(imagename.endsWith( "jpeg")||imagename.endsWith( "jpg")|| imagename.endsWith("png")){
        person.setPhoto(selectedFile.toString());
        lblPhoto.setText(imagename);
    }
        
    }//GEN-LAST:event_btnPhotoActionPerformed

    private void btnBiometricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiometricActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        File selectedFile = choose.getSelectedFile();
        String imagename = selectedFile.getName();
        if(imagename.endsWith( "jpeg")||imagename.endsWith( "jpg")|| imagename.endsWith("png")){
        person.setBiometric(selectedFile.toString());
        lblBiometric.setText(imagename);
    }//GEN-LAST:event_btnBiometricActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiometric;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser jDateDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBiometric;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFAXNum;
    private javax.swing.JLabel lblGeoDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelephoneNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblbankAccnum;
    private javax.swing.JLabel lblcertNum;
    private javax.swing.JLabel lbldateOfbirth;
    private javax.swing.JLabel lbldeviceIden;
    private javax.swing.JLabel lblhealthPlanBenenum;
    private javax.swing.JLabel lblinternetProtocolAddress;
    private javax.swing.JLabel lbllinkedIn;
    private javax.swing.JLabel lblmedRecnum;
    private javax.swing.JLabel lbluniqueIdentifyingNum;
    private javax.swing.JLabel lblvehIden;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmailAddresses;
    private javax.swing.JTextField txtFAXNumber;
    private javax.swing.JTextField txtHealthPlanBeneficiaryNum;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtbankAccnum;
    private javax.swing.JTextField txtcertNum;
    private javax.swing.JTextField txtdeviceIden;
    private javax.swing.JTextField txtinternetProtocolAddress;
    private javax.swing.JTextField txtlinkedIn;
    private javax.swing.JTextField txtuniqueIdentifyingNum;
    private javax.swing.JTextField txtvehIden;
    // End of variables declaration//GEN-END:variables
}