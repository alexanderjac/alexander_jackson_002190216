/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.awt.image.BufferedImage;

/**
 *
 * @author jacksonalexander
 */
public class FoodItem {
    private String name;
    private String desc;
    private String itemID;
    private String restaurantID;
    private double price;
    private BufferedImage image;
    

    public FoodItem(String itemID, String restaurantID, String name, String desc, BufferedImage image, double price) {
        this.name = name;
        this.desc = desc; 
        this.itemID = itemID;
        this.restaurantID = restaurantID;
//        this.name = name;
//        this.desc = desc;
        this.price = price;
        this.image = image;
    
    }


    public void setDescription(String desc) {
        this.desc = desc;
    }

    public BufferedImage getPhoto() {
        return image;
    }

    public void setPhoto(BufferedImage image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
public String getItemId() {
        return itemID;
    }

    public void setItemId(String itemID) {
        this.itemID = itemID;
    }

    public String getRestaurantId() {
        return restaurantID;
    }

    public void setRestaurantId(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getItemName() {
        return name;
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return desc;
    }


    
}
