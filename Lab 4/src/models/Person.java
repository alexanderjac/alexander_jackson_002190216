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
public class Person {
    private String name;
    private long ssn;
//    private Date dateOfbirth ;
    private String address;
    private int age;
    private String sex;
    private long phoneNumber;

    public Person(String name, long ssn, String address, int age, String sex, long phoneNumber) {
        this.name = name;
        this.ssn = ssn;
//        this.dateOfbirth = dateOfbirth;
        this.address = address;
        this.age =age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

//    public Date getDateOfbirth() {
//        return dateOfbirth;
//    }
//
//    public void setDateOfbirth(Date dateOfbirth) {
//        this.dateOfbirth = dateOfbirth;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
