package classes;

import java.text.SimpleDateFormat;
import java.util.*;

/*
 * 
 *  THIS FILE IS THE EVENT CLASS AND ALLOWS YOU TO CREATE AND EDIT AN EVENT
 *  AUTHOR: CLARA CONNER (CMC200010)
 * 
 * 
 */

public class Event {

    public String   eventName;
    public String   eventTime;
    public String   eventDescription;
    public String   eventOrgName;
    public String   eventLocation;
    public Date     eventDate;
    public boolean  isOpen;
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

    //SETTERS

    public void setEventName(String name){
        eventName = name;
    }

    public void setEventTime(String time){
        eventTime = time;
    }

    public void setEventDesc(String desc){
        eventDescription = desc;
    }

    public void setEventOrg(String org){
        eventOrgName = org;
    }

    public void setEventLocation(String location){
        eventLocation = location;
    }

    public void setEventDate(Date date){
        Date today = new Date();
        //Tests if the event date is before/after current date
        if(today.after(date))
            System.out.println("The entered date is before the current date. Please enter a new one.");
        else
            eventDate = date;
    }

    public void setEventStatus(boolean status){
        isOpen = status;
    }

    //GETTERS

    public String getEventName(){
        return eventName;
    }

    public String getEventTime(){
        return eventTime;
    }

    public String getEventDesc(){
        return eventDescription;
    }

    public String getEventOrg(){
        return eventOrgName;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public Date getEventDate(){
        return eventDate;
    }

    public boolean getEventStatus(){
        return isOpen;
    }

}
