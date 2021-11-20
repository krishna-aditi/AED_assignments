/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    //private RestaurantDirectory restaurantDirectory;
    //private CustomerDirectory customerDirectory;
    //private DeliveryManDirectory deliveryManDirectory;
    private OrganizationDirectory organizationDirectory;;

    /**public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }**/
    
    public static EcoSystem getInstance(){
        if(ecosystem==null){
            ecosystem=new EcoSystem();
        }
        return ecosystem;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
    }
    
    public boolean checkIfUserIsUnique(String userName){
       if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
       else{
           return true;
       }
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
