/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;

/**
 *
 * @author jacksonalexander
 */
public class PatientDirectory  {
 private ArrayList<Patient> listOfPatient;
 private Date lastUpdateDate;

    public PatientDirectory() throws FileNotFoundException, IOException, BadLocationException, ParseException{
        this.listOfPatient = new ArrayList<Patient>();
        String [] wordSplit = new String[30] ;
     
     FileInputStream stream = new FileInputStream("/Users/jacksonalexander/NetBeansProjects/Lab 4/src/lab4Config/listOfPatientConfig.rtf");
     RTFEditorKit kit = new RTFEditorKit();
     
     Document doc = kit.createDefaultDocument();
     kit.read(stream, doc, 0);
     String plainText = doc.getText(0, doc.getLength());
     //System.out.println(plainText.split("\\n").length);
     for(int i=1; i<plainText.split("\\n").length; i++) {
//     java.lang.System.out.println(plainText.split("\\n")[i]);
    
     wordSplit = plainText.split("\\n")[i].split("\\|") ;
     String name = wordSplit[0];
//     System.out.println(Arrays.toString(wordSplit));
//     System.out.println(wordSplit[1].trim());

     long ssn = Long.parseLong(wordSplit[1].trim());
//         SimpleDateFormat formatter1=new SimpleDateFormat("MM/dd/yyyy");  
//             Date dateOfbirth=formatter1.parse(wordSplit[2].trim()); 
          String address = wordSplit[2].trim();
          int age = Integer.parseInt(wordSplit[3].trim());
          String sex = wordSplit[4].trim();
          long phoneNumber =Long.parseLong(wordSplit[5].trim());
     String disease = wordSplit[6].trim();
     
          
          
          Patient patient = new Patient(name,ssn,address,age, sex,phoneNumber,disease);
          this.listOfPatient.add(patient);
        
    }
 
 
    }

    public ArrayList<Patient> getListOfPatients() {
        return listOfPatient;
    }

    public void setListOfPatients(ArrayList<Patient> listOfPatient) {
        this.listOfPatient = listOfPatient;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
  public void addNewPatient(Patient patient){
      System.out.println("check5 "+patient.getSsn());
        this.listOfPatient.add(patient);
    }
    

}
