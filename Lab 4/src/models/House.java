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
public class House {
    private ArrayList<Person> listOfPerson;
    private ArrayList<House> listOfHouses;
    private long communityID; // it could be alphabetic in the form of numbers ending with some alphabets
    private int zipCode;
    private long houseID;
    private String houseAddress;

//    House(long communityID, int zipCode, long houseID, String houseAddress) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public House(long communityID, int zipCode, long houseID, String houseAddress) throws FileNotFoundException, IOException, BadLocationException {
        this.communityID = communityID;
        this.zipCode = zipCode;
        this.houseID = houseID;
        this.houseAddress = houseAddress;
        listOfPerson = new ArrayList<Person>();
        
        
        String [] wordSplit = new String[30] ;
     
     FileInputStream stream = new FileInputStream("/Users/jacksonalexander/NetBeansProjects/Lab 4/src/lab4Config/listOfPersonsConfig.rtf");
     RTFEditorKit kit = new RTFEditorKit();
     
     Document doc = kit.createDefaultDocument();
     kit.read(stream, doc, 0);
     String plainText = doc.getText(0, doc.getLength());
     //System.out.println(plainText.split("\\n").length);
     for(int i=1; i<plainText.split("\\n").length; i++) {
//     java.lang.System.out.println(plainText.split("\\n")[i]);
     wordSplit = plainText.split("\\n")[i].split("\\|") ;
     String name = wordSplit[0];
//     System.out.println(Arrays.toString(wordSplit));
//     System.out.println(wordSplit[1].trim());
     long ssn = Long.parseLong(wordSplit[1].trim());
//         SimpleDateFormat formatter1=new SimpleDateFormat("MM/dd/yyyy");  
//             Date dateOfbirth=formatter1.parse(wordSplit[2].trim()); 
          String address = wordSplit[2].trim();
          int age=Integer.parseInt(wordSplit[3].trim());
          String sex = wordSplit[4].trim();
          long phoneNumber =Long.parseLong(wordSplit[5].trim());
          
          Person person = new Person(name,ssn,address,age,sex,phoneNumber);
          
          
        if(address.equals(this.houseAddress)) { 
            System.out.println("check50");
       this.listOfPerson.add(person);   
        
        }

        
//        this.listOfHouses = new ArrayList<House>();
//        String [] wordSplit = new String[30] ;
//     
//     FileInputStream stream = new FileInputStream("/Users/jacksonalexander/NetBeansProjects/Lab 4/src/lab4Config/listOfHousesConfig.rtf");
//     RTFEditorKit kit = new RTFEditorKit();
//     
//     Document doc = kit.createDefaultDocument();
//     kit.read(stream, doc, 0);
//     String plainText = doc.getText(0, doc.getLength());
//     //System.out.println(plainText.split("\\n").length);
//     for(int i=1; i<plainText.split("\\n").length; i++) {
////     java.lang.System.out.println(plainText.split("\\n")[i]);
//     wordSplit = plainText.split("\\n")[i].split("\\|") ;
//     
//     long communitID = Long.parseLong(wordSplit[0].trim());
//       int zipCod = Integer.parseInt(wordSplit[1].trim());
//         long housID = Long.parseLong(wordSplit[2].trim());
//     String houseAddres = wordSplit[3].trim();
////     System.out.println(wordSplit[0].trim());
//     
//          
//          
//          House house = new House(communityID,zipCod,housID,houseAddres);
//          this.listOfHouses.add(house);
//        
//    }
    }
    

    
    
    
    
    }
    
    


    public ArrayList<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(ArrayList<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }

    public long getCommunityID() {
        return communityID;
    }

    public void setCommunityID(long communityID) {
        this.communityID = communityID;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getHouseID() {
        return houseID;
    }

    public void setHouseID(long houseID) {
        this.houseID = houseID;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }
    
    
    
    
    
}
