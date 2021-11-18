package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        //EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
       /** Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee employee2 = system.getEmployeeDirectory().createEmployee("customer");
        
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee, new CustomerRole());
        
        Employee employee3 = system.getEmployeeDirectory().createEmployee("deliveryman");
        
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("deliveryman", "deliveryman", employee, new DeliverManRole());
        
        Employee employee4 = system.getEmployeeDirectory().createEmployee("manager");
        
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("manager", "manager", employee, new AdminRole());
        **/
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        
        //AdminDirectory adminOrganization = new AdminOrganization();
        //business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        //Employee employee = new Employee();
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee("FoodGenie");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());
        account.setEmployee(employee);
        
        ecosystem.getEmployeeDirectory().getEmployeeList().add(employee);
        ecosystem.getUserAccountDirectory().getUserAccountList().add(account);
               
        
        return ecosystem;
    }
    
}
