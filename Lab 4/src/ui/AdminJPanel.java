/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import models.City;
import models.Community;
import models.Encounter;
import models.EncounterHistory;
import models.House;
import models.Patient;
import models.PatientDirectory;
import models.PersonDirectory;
import models.Person;


/**
 *
 * @author jacksonalexander
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    PersonDirectory listOfPerson;
    PatientDirectory listOfPatient;
    EncounterHistory listOfEncounter;
    City city;
    Person p;
    Patient Pa;
    Community community;
    ArrayList<City> listOfCity;
    ArrayList<Community> listOfCommunity ;
    ArrayList<House> listOfHouses;
    
    House Houses;
    
    public AdminJPanel(PersonDirectory listOfPerson,PatientDirectory listOfPatient,ArrayList<City> listOfCity,ArrayList<Community> listOfCommunity,ArrayList<House> listOfHouses) {
        initComponents();
//        System.out.println(listOfCars.getListOfCars().get(1));
        this.listOfPerson = listOfPerson;
//        this.listOfEncounter =listOfEncounter;
        this.listOfPatient = listOfPatient;
        this.city = city;
        this.listOfCity = listOfCity;
        this.listOfCommunity = listOfCommunity;
        this.listOfHouses = listOfHouses;
        
        populatePersonTable(this.listOfPerson.getListOfPerson());
        populatePatientTable(this.listOfPatient.getListOfPatients());
        populateEncounterTable();
        populateCityTable(this.listOfCity);
        populateCommunityTable(this.listOfCommunity);
        populateHouseTable(this.listOfHouses);
        populateResultViewTable(this.listOfPatient.getListOfPatients());
        
        
//        addTableListener(this.listOfPerson, this);
       
     
    }

//    AdminJPanel(PersonDirectory listOfPerson, PatientDirectory listOfPatient) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDisplayNoOfCarsAvail = new javax.swing.JLabel();
        lblDisplayNoOfCarsNonAvail = new javax.swing.JLabel();
        Tab = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewPerson = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViewPatient = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblViewCommunity = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblViewCity = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblViewHouse = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEncounter = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblResultView = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblResultView2 = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnBPMin = new javax.swing.JTextField();
        btnBPMax = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(143, 188, 219));

        lblTitle.setFont(new java.awt.Font("Big Caslon", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PERSON DASHBOARD");

        tblViewPerson.setBackground(new java.awt.Color(204, 255, 255));
        tblViewPerson.setForeground(new java.awt.Color(0, 51, 51));
        tblViewPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null, null, ""},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "SSN", "Address", "Age", "Sex", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Long.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblViewPerson.setColumnSelectionAllowed(true);
        tblViewPerson.setGridColor(new java.awt.Color(220, 220, 220));
        tblViewPerson.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblViewPerson);
        tblViewPerson.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Tab.addTab("Person", jScrollPane1);

        tblViewPatient.setBackground(new java.awt.Color(204, 255, 255));
        tblViewPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "SSN", "Address", "Age", "Sex", "Phone Number", "Disease"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblViewPatient);

        Tab.addTab("Patient", jScrollPane2);

        tblViewCommunity.setBackground(new java.awt.Color(204, 255, 255));
        tblViewCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community Id", "City Name"
            }
        ));
        jScrollPane3.setViewportView(tblViewCommunity);

        Tab.addTab("Community", jScrollPane3);

        tblViewCity.setBackground(new java.awt.Color(204, 255, 255));
        tblViewCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City ID", "City Name"
            }
        ));
        jScrollPane4.setViewportView(tblViewCity);

        Tab.addTab("City", jScrollPane4);

        tblViewHouse.setBackground(new java.awt.Color(204, 255, 255));
        tblViewHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Community ID", "Zip Code", "House ID", "House Address"
            }
        ));
        jScrollPane5.setViewportView(tblViewHouse);

        Tab.addTab("House", jScrollPane5);

        tblEncounter.setBackground(new java.awt.Color(204, 255, 255));
        tblEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Encounter ID", "Blood Pressure", "Temperature", "Pulse", "Date"
            }
        ));
        jScrollPane6.setViewportView(tblEncounter);

        Tab.addTab("Vital Signs", jScrollPane6);

        tblResultView.setBackground(new java.awt.Color(204, 255, 255));
        tblResultView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "SSN", "Address", "Age", "Sex", "Phone Number", "Disease", "Blood Pressure", "Temperature", "Pulse"
            }
        ));
        jScrollPane7.setViewportView(tblResultView);

        Tab.addTab("Result View", jScrollPane7);

        tblResultView2.setBackground(new java.awt.Color(204, 255, 255));
        tblResultView2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community ID", "Number of People"
            }
        ));
        jScrollPane8.setViewportView(tblResultView2);

        btnSearch.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBPMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBPMinActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Min:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Blood Pressure");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Max:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tab)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisplayNoOfCarsAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisplayNoOfCarsNonAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBPMax)
                                .addComponent(btnBPMin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBPMax, btnBPMin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDisplayNoOfCarsAvail)
                .addGap(0, 0, 0)
                .addComponent(lblDisplayNoOfCarsNonAvail)
                .addGap(55, 55, 55)
                .addComponent(Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBPMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBPMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(btnSearch)
                .addGap(9, 9, 9))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBPMax, btnBPMin, jLabel1, jLabel3});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         populateCommunityResultTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBPMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBPMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBPMinActionPerformed

    private void populateCommunityResultTable() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     
    
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      for(Community comm: this.listOfCommunity) {
        for(House h: comm.getListOfHouse()) {
//            System.out.println("check13 " + h.getCommunityID());
//            System.out.println("check13 " + h.getListOfPerson());
            if(h.getListOfPerson() == null) {
                continue;
            }
            for(Person p: h.getListOfPerson()) {
                                    System.out.println("Person SSN: " + p.getSsn());
                for(Patient pat: this.listOfPatient.getListOfPatients()) {
                    System.out.println("Patient SSN: " + pat.getSsn());
                    if(pat.getSsn() == p.getSsn()) {
                        System.out.println("check20");
                        if(pat.getEncounterHistory().getListOfEncounters().get(pat.getEncounterHistory().getListOfEncounters().size()-1).getVitalSign().getbP() > Double.parseDouble(btnBPMin.getText()) && pat.getEncounterHistory().getListOfEncounters().get(pat.getEncounterHistory().getListOfEncounters().size()-1).getVitalSign().getbP() < Double.parseDouble(btnBPMax.getText())) {
                            if(map.containsKey((int)h.getCommunityID())) {
                                int count = map.get((int)h.getCommunityID()) + 1;
                                map.put((int)h.getCommunityID(), count);
                            }
                            else {
                                map.put((int)h.getCommunityID(), 1);
                            }
                        }
                    }
                }
            }
        }
    }
      
     DefaultTableModel model = (DefaultTableModel) tblResultView2.getModel();
     model.setRowCount(0);
     for(Integer i : map.keySet()){
         Object[] row = new Object[10];
         row[0] = i;
         row[1] = map.get(i);

         System.out.println(Arrays.toString(row));
         model.addRow(row);
     }
    }
    
    
    
    
    
    private void populatePersonTable(ArrayList<Person> listOfPerson) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     
     DefaultTableModel model = (DefaultTableModel) tblViewPerson.getModel();
     model.setRowCount(0);
     for(Person p : listOfPerson){
         Object[] row = new Object[10];
         row[0] = p.getName().trim();
         row[1] = p.getSsn();

         row[2] = p.getAddress().trim();
         row[3] = p.getAge();

         row[4] = p.getSex().trim();
         row[5] = p.getPhoneNumber();
         model.addRow(row);
     }
    }
     private void populateEncounterTable() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     
     DefaultTableModel model4 = (DefaultTableModel) tblEncounter.getModel();
     model4.setRowCount(0);
     for(Patient pat: this.listOfPatient.getListOfPatients()) {
         for(Encounter encounter : pat.getEncounterHistory().getListOfEncounters()){
         Object[] row = new Object[10];
         row[0] = encounter.getCounterID();
         row[1] = encounter.getVitalSign().getbP();

         row[2] = encounter.getVitalSign().getTemperature();
         row[3] = encounter.getVitalSign().getPulse();

         row[4] = encounter.getDate();
     
         model4.addRow(row);
     
 
     }
     }
     
    
    }
    
        private void populatePatientTable(ArrayList<Patient> listOfPatient) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 DefaultTableModel model1 = (DefaultTableModel) tblViewPatient.getModel();
     model1.setRowCount(0);
     for(Patient pa : listOfPatient){
         Object[] row = new Object[10];
         row[0] = pa.getName().trim();
         row[1] = pa.getSsn();
//         row[2] = pa.getDateOfbirth();
         row[2] = pa.getAddress().trim();
         row[3] = pa.getAge();
         row[4] = pa.getSex().trim();
         row[5] = pa.getPhoneNumber();
         row[6] = pa.getDisease();
         model1.addRow(row);
     }  

    }
        private void populateCityTable(ArrayList<City> listOfCity) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel model2 = (DefaultTableModel) tblViewCity.getModel();
     model2.setRowCount(0);
     for(City city : listOfCity){
         Object[] row = new Object[10];
         row[0] = city.getCityID();
         row[1] = city.getCityName();
     
        
         model2.addRow(row);
     }  
        }
        private void populateCommunityTable(ArrayList<Community> listOfCommunities) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel model2 = (DefaultTableModel) tblViewCommunity.getModel();
     model2.setRowCount(0);
     for(Community community : listOfCommunities){
         Object[] row = new Object[10];
         row[0] = community.getCommunityID();
         row[1] = community.getCityName();
     
        
         model2.addRow(row);
     }  
        }
        private void populateHouseTable(ArrayList<House> listOfhouses) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel model3 = (DefaultTableModel) tblViewHouse.getModel();
     model3.setRowCount(0);
     for(House house : listOfhouses){
         Object[] row = new Object[10];
         row[0] = house.getCommunityID();
         row[1] = house.getZipCode();
         row[2] = house.getHouseID();
         row[3] = house.getHouseAddress();
     
        
         model3.addRow(row);
     }  

        } 
        
        private void populateResultViewTable(ArrayList<Patient> listOfPatient) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel model4 = (DefaultTableModel) tblResultView.getModel();
     model4.setRowCount(0);
     for(Patient patient : listOfPatient){
         if(patient.getEncounterHistory().getListOfEncounters().size() != 0) {
             Object[] row = new Object[20];
         row[0] = patient.getName();
         row[1] = patient.getSsn();
//         row[2] = pa.getDateOfbirth();
         row[2] = patient.getAddress().trim();
         row[3] = patient.getAge();
         row[4] = patient.getSex().trim();
         row[5] = patient.getPhoneNumber();
         row[6] = patient.getDisease();
         row[7] = patient.getEncounterHistory().getListOfEncounters().get(patient.getEncounterHistory().getListOfEncounters().size()-1).getVitalSign().getbP();
         row[8] = patient.getEncounterHistory().getListOfEncounters().get(patient.getEncounterHistory().getListOfEncounters().size()-1).getVitalSign().getTemperature();
         row[9] = patient.getEncounterHistory().getListOfEncounters().get(patient.getEncounterHistory().getListOfEncounters().size()-1).getVitalSign().getPulse();


     
        
         model4.addRow(row);
         }
         
     }  

        } 
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JTextField btnBPMax;
    private javax.swing.JTextField btnBPMin;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblDisplayNoOfCarsAvail;
    private javax.swing.JLabel lblDisplayNoOfCarsNonAvail;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEncounter;
    private javax.swing.JTable tblResultView;
    private javax.swing.JTable tblResultView2;
    private javax.swing.JTable tblViewCity;
    private javax.swing.JTable tblViewCommunity;
    private javax.swing.JTable tblViewHouse;
    private javax.swing.JTable tblViewPatient;
    private javax.swing.JTable tblViewPerson;
    // End of variables declaration//GEN-END:variables

    




 

 
 
          }
