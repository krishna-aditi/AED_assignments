/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class carFleet {
    
    private ArrayList<car> fleet;
    
    // using constructor
    public carFleet(){
        this.fleet = new ArrayList<car>();
    }

    public ArrayList<car> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<car> fleet) {
        this.fleet = fleet;
    }
    
    public car registerNewCar(){
        car newCar = new car();
        fleet.add(newCar);
        return newCar;
    }

    public void deleteCar(car selectedCar) {
        fleet.remove(selectedCar);
    }
}
