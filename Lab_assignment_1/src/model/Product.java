/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author krish
 */
public class Product {
    private String name; // name
    private String geoData; // geographical data
    private String dob; // date of birth
    private String phoneNo; // phone num
    private String fax;// fax
    private String email; //email
    private String ssn; // ssn 
    private String medNo; // medical record number 
    private String healthNo; // health plan beneficiary number
    private String bankAccNo; // bank account number
    private String licnNo; // license number
    private String vehicleNo; // vehicle number
    private String deviceNo; // device serial number
    private String linkedIn; // linkedIn
    private String ipAdd; // IP address
    private String id; // unique ID no.
    private String location; //location of image

    
    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeoData() {
        return geoData;
    }

    public void setGeoData(String geoData) {
        this.geoData = geoData;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedNo() {
        return medNo;
    }

    public void setMedNo(String medNo) {
        this.medNo = medNo;
    }

    public String getHealthNo() {
        return healthNo;
    }

    public void setHealthNo(String healthNo) {
        this.healthNo = healthNo;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    public String getLicnNo() {
        return licnNo;
    }

    public void setLicnNo(String licnNo) {
        this.licnNo = licnNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    // date validation
    public boolean validateDate(String dob){
        dob = this.dob;
        // date is null
        if (dob.trim().equals("")){
            return true;
        }
        // date is not null
        else{
            SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
            sdformat.setLenient(false);
            try{
                Date date = sdformat.parse(dob);
            }
            catch(ParseException e){
                return false;
            }
        }
        return true;
    }
    
    // phone number validation
    
    public boolean validatePhone(String phoneNo){
        phoneNo = this.phoneNo;
        // number starting with 1 to 9
        Pattern phonePattern = Pattern.compile("^[1-9]{1}\\d{9}$");
        Matcher phoneMatcher = phonePattern.matcher(phoneNo);
        return phoneMatcher.matches();
    }
    

    
    // email
    public boolean validateEmail(String email){
        email = this.email;
        Pattern emailPattern = Pattern.compile("^.+@.+\\..+$");
        Matcher emailMatcher = emailPattern.matcher(email);
        return emailMatcher.matches();
    }
    
    // ssn
    public boolean validateSsn(String ssn){
        ssn = this.ssn;
        Pattern ssnPattern = Pattern.compile("^(?!666|000|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0{4})\\d{4}$");
        Matcher ssnMatcher = ssnPattern.matcher(ssn);
        return ssnMatcher.matches();
    }
   
    
}
