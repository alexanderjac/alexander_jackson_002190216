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
public class City {
    
    private long cityID;
    private String cityName;
    private ArrayList<Community> listOfCommunity;

    public City(long cityID, String cityName) throws FileNotFoundException, IOException, BadLocationException {
       this.cityID= cityID;
       this.cityName =cityName;
        
        this.listOfCommunity = new ArrayList<Community>();
        String [] wordSplit = new String[30] ;
     
     FileInputStream stream = new FileInputStream("/Users/jacksonalexander/NetBeansProjects/Lab 4/src/lab4Config/listOfCommunitiesConfig.rtf");
     RTFEditorKit kit = new RTFEditorKit();
     
     Document doc = kit.createDefaultDocument();
     kit.read(stream, doc, 0);
     String plainText = doc.getText(0, doc.getLength());
     //System.out.println(plainText.split("\\n").length);
     for(int i=1; i<plainText.split("\\n").length; i++) {
//     java.lang.System.out.println(plainText.split("\\n")[i]);
     wordSplit = plainText.split("\\n")[i].split("\\|") ;
     long communityID = Long.parseLong(wordSplit[0].trim());
     String cityName1 = wordSplit[1].trim();
//     System.out.println(wordSplit[0].trim());
     
          
          
          Community community = new Community(communityID,cityName1);
//          if(this.cityName.equals(cityName1)) {
                        this.listOfCommunity.add(community);

//          }
        
    }
    
    }

//    public City() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    City(long cityID, String cityName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public long getCityID() {
        return cityID;
    }

    public void setCityID(long cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getListOfCommunity() {
        return listOfCommunity;
    }

    public void setListOfCommunity(ArrayList<Community> listOfCommunity) {
        this.listOfCommunity = listOfCommunity;
    }

    void add(City city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
