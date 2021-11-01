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
public class EncounterHistory {
    
    ArrayList<Encounter> encounterList; 

    public EncounterHistory() {
        encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }
    
}
