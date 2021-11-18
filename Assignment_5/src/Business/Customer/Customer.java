/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author harold
 */
public class Customer {
    
    private String custname;
    private int custid;
    private static int count = 1;
    
    public Customer(){
        custid = count;
        count++;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
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
    
}
