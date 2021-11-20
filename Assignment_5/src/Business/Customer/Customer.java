/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer extends Organization{
    
    private String custname;
    private String password; 
    private int custid;
    private static int count = 1;
    
    public Customer(){
        super(Organization.Type.Customer.getValue());
        custid = count;
        count++;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public int getCustid() {
        return custid;
    }

    public void setId(int id) {
        this.custid = id;
    }
    
    @Override
    public String toString() {
        return custname;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerRole());
        return roles;
    }
    
}
