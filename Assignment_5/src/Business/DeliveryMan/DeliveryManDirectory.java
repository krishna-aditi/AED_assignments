/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getEmployeeList() {
        return deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(String name){
        DeliveryMan employee = new DeliveryMan();
        employee.setName(name);
        deliveryManList.add(employee);
        return employee;
    }
    
    public void removeDeliveryMan(DeliveryMan selectedDeliveryMan){
        deliveryManList.remove(selectedDeliveryMan);
    }
}
