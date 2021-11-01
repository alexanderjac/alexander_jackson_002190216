/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;

/**
 *
 * @author jacksonalexander
 */
public class Systems {
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;
    private Date lastUpdateDate;
    private ArrayList<City> listOfCity;
    
    
    public Systems() throws BadLocationException, IOException {
      
        
        this.listOfCity = new ArrayList<City>();
        String [] wordSplit = new String[30] ;
     
     FileInputStream stream = new FileInputStream("/Users/jacksonalexander/NetBeansProjects/Lab 4/src/lab4Config/listOfCitiesConfig.rtf");
     RTFEditorKit kit = new RTFEditorKit();
     
     Document doc = kit.createDefaultDocument();
     kit.read(stream, doc, 0);
     String plainText = doc.getText(0, doc.getLength());
     //System.out.println(plainText.split("\\n").length);
     for(int i=1; i<plainText.split("\\n").length; i++) {
//     java.lang.System.out.println(plainText.split("\\n")[i]);
    
     wordSplit = plainText.split("\\n")[i].split("\\|") ;
     long cityID = Long.parseLong(wordSplit[0].trim());

     String cityName = wordSplit[1].trim();
         
     System.out.println(cityName);
          
          
          City city = new City(cityID,cityName);
          this.listOfCity.add(city);
        
    }
 
 
        
        
    }
    
    
    

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public ArrayList<City> getListOfCity() {
        return listOfCity;
    }

    public void setListOfCity(ArrayList<City> listOfCity) {
        this.listOfCity = listOfCity;
    }
    
    
    
    
}
