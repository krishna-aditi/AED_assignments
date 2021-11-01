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
public class Patient {
    
    EncounterHistory encounterHistory;
    int patientID;
    private static int totalCountOfPatients = 0;
    String name;
    int age;
    String gender;
    String phoneNo;
    String address;
    int community;
    String city;
    int pulse;
    int respRate;
    int temp;
    int SBP;
    int DBP;

    public Patient(){
        ++totalCountOfPatients;
        patientID = totalCountOfPatients;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCommunity() {
        return community;
    }

    public void setCommunity(int community) {
        this.community = community;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        this.respRate = respRate;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getSBP() {
        return SBP;
    }

    public void setSBP(int SBP) {
        this.SBP = SBP;
    }

    public int getDBP() {
        return DBP;
    }

    public void setDBP(int DBP) {
        this.DBP = DBP;
    }
    
    
    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
