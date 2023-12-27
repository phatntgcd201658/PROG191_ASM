/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author phatn
 */
public class Address {
    public String addressID;
    public String city;
    public String district;
    public String commune;
    public String village;
    public String road;
    public String apartmentNumber;
    public String zip;
    
    public static int i;
    
    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
        
    public Address(String...args){
        if(args.length == 7) {
            
            this.addressID = args[0];
            this.city = args[1];
            this.district = args[2];
            this.commune = args[3];
            this.village = args[4];
            this.road = args[5];
            this.apartmentNumber = args[6];
        } 
        else if(args.length == 5) {
            this.addressID = args[0];
            this.city = args[1];
            this.district = args[2];
            this.commune = args[3];
            this.village = args[4];
            this.road = "None";
            this.apartmentNumber = "None";
        }


    }
}
