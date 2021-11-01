/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author krish
 */
public class Person {
    Patient patient;

    public Person() {
        patient = new Patient();
    }

    public Patient getP() {
        return patient;
    }

    public void setP(Patient patient) {
        this.patient = patient;
    }

    
}
