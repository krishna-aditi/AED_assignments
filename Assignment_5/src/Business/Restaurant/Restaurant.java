/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant extends Organization{
    private String restaurantName;
    private String password;
    private int restId;
    private String address;
    private static int count = 1;
    ArrayList<Menu> menuItemList;
    ArrayList<WorkQueue> workQueue;
    private EmployeeDirectory empDir;
    private DeliveryManDirectory deliveryManDir;
   
    public Restaurant(){
        super(Organization.Type.RestaurantAdmin.getValue());
        menuItemList = new ArrayList<Menu>();
        workQueue = new ArrayList<WorkQueue>();
        restId = count;
        count++;
    }

    
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public ArrayList<Menu> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(ArrayList<Menu> menuItemList) {
        this.menuItemList = menuItemList;
    }
    
    public Menu addMenuItem(String name){
        Menu item = new Menu();
        item.setItemName(name);
        menuItemList.add(item);
        return item;
    }
    
    public void removeMenuItem(Menu selectedItem){
        menuItemList.remove(selectedItem);
    }

    /**public ArrayList<WorkQueue> getWorkQueue() {
        return workQueue;
    }**/

    public void setWorkQueue(ArrayList<WorkQueue> workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmpDir() {
        return empDir;
    }

    public void setEmpDir(EmployeeDirectory empDir) {
        this.empDir = empDir;
    }

    public DeliveryManDirectory getDeliveryManDir() {
        return deliveryManDir;
    }

    public void setDeliveryManDir(DeliveryManDirectory deliveryManDir) {
        this.deliveryManDir = deliveryManDir;
    }

    public Menu addItem(String itemName){
        Menu newitem = new Menu();
        newitem.setItemName(itemName);
        menuItemList.add(newitem);
        return newitem;
    }
    
    public void removeItem(Menu selecteditem){
        menuItemList.remove(selecteditem);
    } 

      
    
    @Override
    public String toString() {
        return restaurantName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
