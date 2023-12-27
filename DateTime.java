/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author phatn
 */
public class DateTime {
    public String dateTimeID;
    public String date;
    public String month;
    public String year;
    public String hour;
    public String minute;
    
    public static int i= 0;

    public String getDateTimeID() {
        return dateTimeID;
    }

    public void setDateTimeID(String dateTimeID) {
        this.dateTimeID = dateTimeID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
    
    public DateTime(String...args){
        if(args.length == 4){
            this.dateTimeID = args[0];
                this.date = args[1];
                this.month = args[2];
                this.year = args[3];                
        }
    }
    
}
