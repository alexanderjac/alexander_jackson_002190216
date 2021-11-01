/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.text.BadLocationException;

/**
 *
 * @author jacksonalexander
 */
public class Patient extends Person {
 
    private String disease;
    private EncounterHistory encounterHistory;

    public Patient(String name, long ssn, String address,int age, String sex, long phoneNumber, String disease) throws IOException, FileNotFoundException, ParseException, BadLocationException {
        super(name, ssn, address, age ,sex, phoneNumber);
        this.disease= disease;
        this.encounterHistory= new EncounterHistory(ssn);
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    
    
    
}
