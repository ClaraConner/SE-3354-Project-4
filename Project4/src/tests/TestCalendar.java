package tests;
import java.util.*;

import classes.Calendar;
import classes.Event;

/*
 *      THIS FILE TESTS THE CALENDAR CLASS ABILITY TO ADD,REMOVE,AND GET EVENTS TO AND FROM ORGANIZATIONS
 *      AUTHOR: SAIDARSH TUKKADI (SXT200072)
 */

public class TestCalendar {
    public static void main(String[] args) {
        //creating new blank calendar
        Calendar calendar = new Calendar();

        //creating two distinct events prior to testing
        Event event = new Event("Boba Social", "6:00pm", "Enjoy some free boba and socialize", "ACM", "Blackstone", new Date(), true);
        Event event2 = new Event("Python Workshop", "7:00pm", "Learn the basics of Python", "IEEE", "ECSS", new Date(), true);

        //test adding event to organization that doesn't exist
        System.out.println("\nTESTING ADDING EVENT TO NON-EXISTING ORGANIZATION:\n");
        boolean addedEvent = calendar.addOrgEvent("nonExistingOrg", event);
        System.out.println("Added event to organization (should be false): " + addedEvent);

        //sets up calendar mapping
        Map<String, List<Event>> initialMap = new HashMap<>();
        initialMap.put("existingOrg", new ArrayList<>());
        calendar.setCalendarMapping(initialMap);

        //test adding event to existing organization
        System.out.println("\nTESTING ADDING EVENT TO EXISTING ORGANIZATION:\n");
        addedEvent = calendar.addOrgEvent("existingOrg", event);
        System.out.println("Added event to organization (should be true): " + addedEvent);

        //test retrieving events from existing organization
        System.out.println("\nTESTING RETRIEVING EVENT FROM EXISTING ORGANIZATION:\n");
        List<Event> events = calendar.getOrgEvents("existingOrg");
        System.out.println("Number of events from existing organization (should be 1): " + (events != null ? events.size() : "null"));

        //test removing event from organization
        System.out.println("\nTESTING REMOVING EVENT FROM EXISTING ORGANIZATION:\n");
        boolean removedEvent = calendar.removeOrgEvent("existingOrg", event);
        System.out.println("Removed event from organization (should be true): " + removedEvent);

        //test retrieving events when there are none
        System.out.println("\nTESTING RETRIEVING ALL EVENTS WHEN THERE ARE NONE:\n");
        List<Event> allEvents = calendar.getAllEvents();
        System.out.println("Number of all events (should be 0): " + allEvents.size());

        //new instances for events in multiple organizations
        calendar.addOrgEvent("existingOrg", event);
        initialMap.put("existingOrg2", new ArrayList<>());
        calendar.addOrgEvent("existingOrg2", event2);

        //test retrieving events from all organizations
        System.out.println("\nTESTING RETRIEVING EVENTS FROM ALL EXISTING ORGANIZATIONS:\n");
        allEvents = calendar.getAllEvents();
        System.out.println("Number of all events (should be 2): " + allEvents.size());

        //test removing non-existent event from organization
        System.out.println("\nTESTING REMOVING NON-EXISTING EVENT FROM EXISTING ORGANIZATION:\n");
        removedEvent = calendar.removeOrgEvent("existingOrg2", event);
        System.out.println("Removed non-existing event from organization (should be false): " + removedEvent);

    }
}