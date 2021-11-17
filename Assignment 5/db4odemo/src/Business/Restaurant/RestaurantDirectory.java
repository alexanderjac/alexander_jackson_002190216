/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
import Business.EcoSystem;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantDirectory;

    public RestaurantDirectory() throws IOException{
        restaurantDirectory = new ArrayList<Restaurant>();
        //File file = new File("/Users/dhankuwarsisodiya/Downloads/Food App/home.jpeg");
        //Restaurant restaurant = new Restaurant("R1","John A","The Cheesecake Factory", "7863456190", "Boston", ImageIO.read(file));
        //restaurantDirectory.add(restaurant);
    }
    
    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant add(String managerName,String name, String phoneNumber, String address, BufferedImage image,String licenseNumber){
       Restaurant newRestaurant = new Restaurant("R"+(restaurantDirectory.size()+1),managerName, name, phoneNumber, address, image,licenseNumber);
       restaurantDirectory.add(newRestaurant);
       return newRestaurant;
    }
    
    public void deleteRestaurant(int index,EcoSystem system){
        String id = restaurantDirectory.get(index).getRestaurantId();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        restaurantDirectory.remove(index);
    }
    
    public Restaurant getRestaurantId(int index){
        return restaurantDirectory.get(index);
    }
    public boolean isUniqueLicenseNo(String licenseNumber){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getLicenseNo().equalsIgnoreCase(licenseNumber)){
                return false;
            }
        }
        return true;
    }

    public String getRestName(String restaurantId) {
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getRestaurantId().equalsIgnoreCase(restaurantId)){
                return restaurant.getName();
            }
        }
        return "";
    }
    
    public Restaurant getRestaurant(String id){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getRestaurantId().equalsIgnoreCase(id)){
                return restaurant;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phoneNumber){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getPhoneNo().equalsIgnoreCase(phoneNumber)){
                return false;
            }
        }
        return true;
    }
    
}
