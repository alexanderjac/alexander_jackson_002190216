/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jacksonalexander
 */
public class VitalSigns {
    
    private long bP;
    private long pulse;
    private long temperature;
//    private int vitalSignID;

    public VitalSigns(long bP, long pulse, long temperature ) {
        this.bP = bP;
        this.pulse = pulse;
        this.temperature = temperature;
//        this.vitalSignID = vitalSignID;
    }
    
    
    

    public long getbP() {
        return bP;
    }

    public void setbP(long bP) {
        this.bP = bP;
    }

    public long getPulse() {
        return pulse;
    }

    public void setPulse(long pulse) {
        this.pulse = pulse;
    }

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

//    public int getVitalSignID() {
//        return vitalSignID;
//    }
//
//    public void setVitalSignID(int vitalSignID) {
//        this.vitalSignID = vitalSignID;
//    }

    
    
    
    
            
}
