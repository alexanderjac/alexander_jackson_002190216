/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author jacksonalexander
 */
public class Car {
    String availCar;
    String make;
    int manuYear;
    int capacity;
    long serialNo;
    String modelNo;
    //Date updateDate;
    String city;
    boolean availability;
    boolean expiry;

    public Car(String availCar, String make, int manuYear, int capacity, long serialNo, String modelNo, String city, boolean availability, boolean expiry) {
        this.availCar = availCar;
        this.make = make;
        this.manuYear = manuYear;
        this.capacity = capacity;
        this.serialNo = serialNo;
        this.modelNo = modelNo;
        this.city = city;
        this.availability = availability;
        this.expiry = expiry;
    }

    
    
    public String getAvailCar() {
        return availCar;
    }

    public void setAvailCar(String availCar) {
        this.availCar = availCar;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getManuYear() {
        return manuYear;
    }

    public void setManuYear(int manuYear) {
        this.manuYear = manuYear;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isExpiry() {
        return expiry;
    }

    public void setExpiry(boolean expiry) {
        this.expiry = expiry;
    }
    
    
}
