/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.awt.image.BufferedImage;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String deliveryID;
    private String name;
    private long phoneNumber;
    private String address;
    private BufferedImage image;
    public DeliveryMan(String deliveryID, String name, String phoneNumber, String address, BufferedImage image) {
        this.deliveryID = deliveryID;
        this.name = name;
        this.phoneNumber = Long.parseLong(phoneNumber);
        this.address = address;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDeliveryId() {
        return deliveryID;
    }

    public void setDeliveryId(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    

    public String getPhoneNo() {
        return Long.toString(phoneNumber);
    }

    public void setPhoneNo(String phoneNumber) {
        this.phoneNumber = Long.parseLong(phoneNumber);
    }
    public BufferedImage getPhoto() {
        return image;
    }

    public void setPhoto(BufferedImage image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
