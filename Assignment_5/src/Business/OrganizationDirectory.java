/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Organization.Type;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.RestaurantAdmin.getValue())){
            organization = new Restaurant();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DeliveryMan.getValue())){
            organization = new DeliveryMan();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Customer.getValue())){
            organization = new Customer();
            organizationList.add(organization);
        }
        return organization;
    }
}
