/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<Customer>();

    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public void deleteCustomer(int index,EcoSystem system){
        String id = customerDirectory.get(index).getCustomerId();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        customerDirectory.remove(index);
    }
    
    public Customer add(String name, String phoneNumber, String address){
        Customer customer1 = new Customer("C"+(customerDirectory.size()+1),name,phoneNumber,address);
        customerDirectory.add(customer1);
        return customer1;
    }
    
    public Customer getCustomerId(int index){
        return customerDirectory.get(index);
    }
    
    public void updateCustomer(String id,String name,String phoneNumber,String address){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerId().equalsIgnoreCase(id)){
                customer.setName(name);
                customer.setPhoneNo(phoneNumber);
                customer.setAddress(address);
            }
        }
    }
    
    public boolean isPhoneUnique(String phoneNumber){
        for(Customer customer: customerDirectory){
            if(customer.getPhoneNo().equalsIgnoreCase(phoneNumber)){
                return false;
            }
        }
        return true;
    }
    
    public Customer getCustomer(String id){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerId().equalsIgnoreCase(id)){
                return customer;
            }
        }
        return null;
    }
}
