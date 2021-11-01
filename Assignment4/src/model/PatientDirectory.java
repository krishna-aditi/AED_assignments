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
public class PatientDirectory {
    ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    } 
    
    public Patient addPatient(){ // , EncounterHistory encounterHistory, int patientID
       Patient p = new Patient(); 
       patientList.add(p); 
       return p;
    }
    
    public void removePatient(Patient selectedPatient){ 
       patientList.remove(selectedPatient);
    }
    
    public Patient searchPatient(int id) {
        for (Patient patient : patientList) {
            if (patient.getPatientID() == id) {
                return patient;
            }
        }
        return null;
    }
    
}
