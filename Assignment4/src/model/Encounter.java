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
public class Encounter {
    
    Vitals vitals;
    private static int encounterNo = 0;
    int encounterID;

    public Encounter() {
        ++encounterNo;
        encounterID = encounterNo;
        vitals = new Vitals();
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public Vitals getVitals() {
        return vitals;
    }

    public void setVitals(Vitals vitals) {
        this.vitals = vitals;
    }
    
}
