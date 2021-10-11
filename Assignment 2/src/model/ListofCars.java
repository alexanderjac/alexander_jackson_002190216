/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;

/**
 *
 * @author jacksonalexander
 */
 

public class ListofCars {
    
    
    private ArrayList<Car> listOfCars;
    String updateDate;

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    
    public ArrayList<Car> getListOfCars() {
        return listOfCars;
    }

    public void setListOfCars(ArrayList<Car> listOfCars) {
        this.listOfCars = listOfCars;
    }
    
    public ListofCars() throws FileNotFoundException, IOException, BadLocationException{
    this.listOfCars = new ArrayList<Car>();
   // BufferedReader reader = new BufferedReader(new FileReader("Users\\jacksonalexander\\Documents\\Aed assignment\\config.txt")) ;
   //Scanner inFile = new Scanner(new FileReader("config.txt"));
   
  // InputStream stream = ListofCars.class.getClassLoader().getResourceAsStream("/com/config.txt");
  
   
 String [] wordSplit = new String[30] ;
FileInputStream stream = new FileInputStream("/Users/jacksonalexander/Documents/Aed assignment/config.rtf");
RTFEditorKit kit = new RTFEditorKit();

Document doc = kit.createDefaultDocument();
kit.read(stream, doc, 0);
String plainText = doc.getText(0, doc.getLength());
//System.out.println(plainText.split("\\n").length);
for(int i=1; i<plainText.split("\\n").length; i++) {
    System.out.println(plainText.split("\\n")[i]);
    wordSplit = plainText.split("\\n")[i].split("\\|") ;
    //System.out.println(wordSplit[0]);
    // Car car = new Car();
     String availCar = wordSplit[0];
     String make = wordSplit[1].trim();
    int manuYear = Integer.parseInt(wordSplit[2].trim());
    int capacity = Integer.parseInt(wordSplit[3].trim());
    long serialNo = Long.parseLong(wordSplit[4].trim());
    String modelNo = wordSplit[5].trim();
    //Date updateDate;
    String city = wordSplit[6].trim();
    boolean availability;
    if(wordSplit[7].trim().equals("Yes")){
      availability = true ;
              }
    else{
         availability = false;
    }
    //boolean availability = Boolean.parseBoolean();
    //boolean expiry = Boolean.parseBoolean(wordSplit[8].trim());
    boolean expiry;
    if(wordSplit[8].trim().equals("Yes")){
       expiry = true ;
              }
    else{
          expiry = false;
    }
     
     Car car = new Car(availCar,make,manuYear,capacity,serialNo,modelNo,city,availability,expiry);
//     System.out.println(car.getAvailCar());
//     System.out.println(car.getMake());
//     System.out.println(car.getManuYear());
//     System.out.println(car.getCapacity());
//     System.out.println(car.getCity());
//     System.out.println(car.getSerialNo());
//     System.out.println(car.getModelNo());
//     System.out.println(car.isAvailability());
//     System.out.println(car.isExpiry());
     this.listOfCars.add(car);
    // Car(availCar,make,manuYear,capacity,serialNo,modelNo,city,availability,expiry);
    
}
    
    }

   
//   public static void main(String []args) throws FileNotFoundException, IOException, BadLocationException{
//        ListofCars listofcar =  new ListofCars();
//    }
   public void addNewCar(Car car){
      this.listOfCars.add(car);
       
        
   }
    
}
