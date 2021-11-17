/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author harold
 */
public class Customer {
    private String customerID;
    private long phoneNumber;
   private String address;
   private String name;
   

    public Customer(String customerID, String name, String phoneNumber, String address) {
        this.customerID = customerID;
         this.phoneNumber = Long.parseLong(phoneNumber);
        this.address = address;
        this.name = name;
       
    }

    public String getCustomerId() {
        return customerID;
    }

    public void setCustomerId(String customerID) {
        this.customerID = customerID;
    }

    public String getPhoneNo() {
        return Long.toString(phoneNumber);
    }

    public void setPhoneNo(String phoneNumber) {
        this.phoneNumber = Long.parseLong(phoneNumber);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
