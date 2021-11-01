/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author jacksonalexander
 */
public class Encounter {
    private long counterID;
    private VitalSigns vitalSigns;
    private Date date;

    public Encounter(VitalSigns vitalSigns,long counterID, Date date) {
        this.vitalSigns = vitalSigns;
        this.counterID = counterID;
//        this.vitalSign = vitalSign;
        this.date = date;
    }

//    Encounter(long counterID, Date date) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public long getCounterID() {
        return counterID;
    }

    public void setCounterID(long counterID) {
        this.counterID = counterID;
    }

    public VitalSigns getVitalSign() {
        return vitalSigns;
    }

    public void setVitalSign(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
