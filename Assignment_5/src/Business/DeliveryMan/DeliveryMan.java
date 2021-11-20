/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Organization;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan extends Organization{
    private String name;
    private String password;
    private int id;
    private static int count = 1;
    
    public DeliveryMan(){
        super(Organization.Type.DeliveryMan.getValue());
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeliverManRole());
        return roles;
    }
    
    
}
