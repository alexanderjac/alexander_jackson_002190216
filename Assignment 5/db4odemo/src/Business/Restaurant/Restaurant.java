/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.awt.image.BufferedImage;
/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantID;
    private String name;
    private long phoneNumber;
    private String address;
    private BufferedImage image;
    private String managerName;
    private String licenseNumber;

    public Restaurant(String restaurantID,String managerName,String name,String phoneNumber, String address, BufferedImage image,String licenseNumber){
        this.managerName = managerName;
        this.restaurantID =restaurantID;
        this.name = name;
        this.phoneNumber = Long.parseLong(phoneNumber);
        this.address = address;
        this.image = image;
        this.licenseNumber = licenseNumber;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
    public String getRestaurantId() {
        return restaurantID;
    }

    public void setRestaurantId(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public BufferedImage getPhoto() {
        return image;
    }

    public void setPhoto(BufferedImage image) {
        this.image = image;
    }

    public String getLicenseNo() {
        return licenseNumber;
    }

    public void setLicenseNo(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
