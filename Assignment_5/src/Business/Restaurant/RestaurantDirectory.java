/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    public Restaurant createRestaurant(String name){
        Restaurant newRes = new Restaurant();
        newRes.setRestaurantName(name);
        restaurantList.add(newRes);
        return newRes;
    }
    
    public void removeRestaurant(Restaurant selectedRestaurant){
        restaurantList.remove(selectedRestaurant);
    } 
}

