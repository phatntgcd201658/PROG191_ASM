/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author phatn
 */
public class Account {
    public String ID;
    public String userName;
    public String password;
    public String name;
    public String email;
    public String phone;
    public String role;
    
    public static int i = 0;
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

//    public Date getWorkingPeriod() {
//        return workingPeriod;
//    }

//    public void setWorkingPeriod(Date workingPeriod) {
//        this.workingPeriod = workingPeriod;
//    }
//
//    public String getManagerAt() {
//        return managerAt;
//    }
//
//    public void setManagerAt(String managerAt) {
//        this.managerAt = managerAt;
//    }
//
//    public String getCitizenID() {
//        return citizenID;
//    }
//
//    public void setCitizenIdentifier(String citizenID) {
//        this.citizenID = citizenID;
//    }
//
//    public Date getBird() {
//        return bird;
//    }
//
//    public void setBird(Date bird) {
//        this.bird = bird;
//    }
//    
//    public String getDateTimeID() {
//        return dateTimeID;
//    }
//    
//    public void setDateTimeID(String dateTimeID) {
//        this.dateTimeID = dateTimeID;
//    }
    
    public Account(String...args){
        if(args.length == 6){
//            this.ID = args[0];
            this.userName = args[0];
            this.password = args[1];
            this.name = args[2];
            this.email = args[3];
            this.phone = args[4];
            this.role = args[5];
        }
        else if(args.length == 2){
//            this.ID = args[1];
            this.userName = args[0];
            this.password = args[1];
        }
        
    }
    
    

}
