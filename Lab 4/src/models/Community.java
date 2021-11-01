/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;

/**
 *
 * @author jacksonalexander
 */
public class Community {
    private long communityID; // it can be alphabetic ending with alphabets after numbers
    private String cityName;
    private ArrayList<House> listOfHouse;

    public Community(long communityID, String cityName) throws FileNotFoundException, IOException, BadLocationException {
      //  this.communityID = communityID; String communityID, String cityName, ArrayList<House> listOfHouse
        this.communityID= communityID;
        this.cityName =cityName;
        this.listOfHouse = new ArrayList<House>() ;
        
        String [] wordSplit = new String[30] ;
     
     FileInputStream stream = new FileInputStream("/Users/jacksonalexander/NetBeansProjects/Lab 4/src/lab4Config/listOfHousesConfig.rtf");
     RTFEditorKit kit = new RTFEditorKit();
     
     Document doc = kit.createDefaultDocument();
     kit.read(stream, doc, 0);
     String plainText = doc.getText(0, doc.getLength());
     //System.out.println(plainText.split("\\n").length);
     for(int i=1; i<plainText.split("\\n").length; i++) {
//     java.lang.System.out.println(plainText.split("\\n")[i]);
     wordSplit = plainText.split("\\n")[i].split("\\|") ;
     long communitID = Long.parseLong(wordSplit[0].trim());
     int zipCode = Integer.parseInt(wordSplit[1].trim());
      long houseID = Long.parseLong(wordSplit[2].trim());
      String houseAddress = wordSplit[3].trim();
    
          
          
          House house = new House(communitID,zipCode,houseID,houseAddress);
          System.out.println("check22 " + this.communityID);
                    System.out.println("check23 " + communitID);
          if(communitID == this.communityID) {
              System.out.println("check40");
             this.listOfHouse.add(house);
          }
    }
    
    
    
    
    
}

    public long getCommunityID() {
        return communityID;
    }

    public void setCommunityID(long communityID) {
        this.communityID = communityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<House> getListOfHouse() {
        return listOfHouse;
    }

    public void setListOfHouse(ArrayList<House> listOfHouse) {
        this.listOfHouse = listOfHouse;
    }
}
