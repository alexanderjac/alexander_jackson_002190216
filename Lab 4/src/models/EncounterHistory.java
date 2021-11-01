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
import java.util.Date;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;

/**
 *
 * @author jacksonalexander
 */
public class EncounterHistory {
    private ArrayList<Encounter> listOfEncounters;
    private Date lastUpdateDate;
    private VitalSigns vitalSigns;
    private long patientSsn;

    public EncounterHistory(long patientSsn) throws FileNotFoundException, IOException, BadLocationException, ParseException {
    this.listOfEncounters = new ArrayList<Encounter>();
    String [] wordSplit = new String[30] ;
    this.patientSsn= patientSsn;
     
     FileInputStream stream = new FileInputStream("/Users/jacksonalexander/NetBeansProjects/Lab 4/src/lab4Config/listOfEncountersConfig.rtf");
     RTFEditorKit kit = new RTFEditorKit();
     
     Document doc = kit.createDefaultDocument();
     kit.read(stream, doc, 0);
     String plainText = doc.getText(0, doc.getLength());
     //System.out.println(plainText.split("\\n").length);
     for(int i=1; i<plainText.split("\\n").length; i++) {
//     java.lang.System.out.println(plainText.split("\\n")[i]);
     wordSplit = plainText.split("\\n")[i].split("\\|") ;
     long encounterID = Long.parseLong(wordSplit[0].trim());
     long bP = Long.parseLong(wordSplit[1].trim());
      long temperature = Long.parseLong(wordSplit[2].trim());
       long pulse = Long.parseLong(wordSplit[3].trim());
     SimpleDateFormat formatter1=new SimpleDateFormat("MM/dd/yyyy");  
             Date date=formatter1.parse(wordSplit[4].trim()); 
             System.out.println(encounterID);
     
     
          vitalSigns = new VitalSigns( bP, temperature, pulse);
          
          Encounter encounter = new Encounter(vitalSigns,encounterID,date);
          if(this.patientSsn == Long.parseLong(wordSplit[5].trim())) {
                        this.listOfEncounters.add(encounter);

          }
        
    }
        
    }

    
    
    
    public ArrayList<Encounter> getListOfEncounters() {
        return listOfEncounters;
    }

    public void setListOfEncounters(ArrayList<Encounter> listOfEncounters) {
        this.listOfEncounters = listOfEncounters;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    
    
    
}
