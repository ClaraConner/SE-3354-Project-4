package classes;

import java.text.SimpleDateFormat;
import java.util.*;

/*
 * 
 *  THIS FILE IS THE EVENT CLASS AND ALLOWS YOU TO CREATE AND EDIT AN EVENT
 *  AUTHOR: ANUSHA BAJRACHARYA 
 * 
 * 
 */

public class Event {

    private String   eventName;
    private String   eventTime;
    private String   eventDescription;
    private String   eventOrgName;
    private String   eventLocation;
    private Date     eventDate;
    public boolean   isOpen;
    public Attendees attendeeList = new Attendees(); 

    public Event(String name, String time, String desc, String orgName,
                 String location, Date date, boolean open){

        eventName           = name;
        eventTime           = time;
        eventDescription    = desc;
        eventOrgName        = orgName;
        eventLocation       = location;
        eventDate           = date;
        isOpen              = open;

    }

    public Event(){

        //doesnt let the date be null
        Date date = new Date();

        eventName           = "Enter event name";
        eventTime           = null;
        eventDescription    = null;
        eventOrgName        = null;
        eventLocation       = null;
        eventDate           = date;
        isOpen              = false;

    }

    public String eventToString(){
        SimpleDateFormat dateFormat = 
        new SimpleDateFormat ("E yyyy.MM.dd");
        
        return "Event Name:         " + eventName + "\n" + 
               "Event Time:         " + eventTime + "\n" + 
               "Event Description:  " + eventDescription + "\n" + 
               "Event Org:          " + eventOrgName + "\n" + 
               "Event Location:     " + eventLocation + "\n" + 
               "Event Date:         " + dateFormat.format(eventDate) + "\n" + 
               "Event is Open?:     " + isOpen + "\n";
    }

    //Getters and Setters
    public String getEventName(){
        return eventName;
    }

    public void setEventName(String name){
        eventName = name;
    }

    public String getEventTime(){
        return eventTime;
    }

    public void setEventTime(String time){
        eventTime = time;
    }

    public String getEventDesc(){
        return eventDescription;
    }

    public void setEventDesc(String desc){
        eventDescription = desc;
    }

    public String getEventOrg(){
        return eventOrgName;
    }

    public void setEventOrg(String org){
        eventOrgName = org;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventLocation(String location){
        eventLocation = location;
    }

    public Date getEventDate(){
        return eventDate;
    }

    public void setEventDate(Date date){
        Date today = new Date();
        //Tests if the event date is before/after current date
        if(today.after(date))
            //date is not valid
            System.out.println("The entered date is before the current date. Please enter a new one.");
        else
            eventDate = date;
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void setEventStatus(boolean status){
        isOpen = status;
    }
}
