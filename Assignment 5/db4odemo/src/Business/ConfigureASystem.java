package Business;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.io.IOException;

/**
 *
 * @author jacksonalexander
 */
public class ConfigureASystem {
    
    public static EcoSystem configure() throws IOException{
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        System.out.println("check10");
        EmployeeDirectory employeeDir = system.getEmployeeDirectory();
        Employee emp = employeeDir.createEmployee("PPH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", emp, new SystemAdminRole());
        
        return system;
    }
    
}
