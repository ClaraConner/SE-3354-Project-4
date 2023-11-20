
// package tests;
import java.util.*;

import classes.Calendar;
import classes.Event;

/*
 *      THIS FILE TESTS THE CALENDAR CLASS ABILITY TO GET EVENTS TO AND FROM ORGANIZATIONS
 *      AUTHOR: JI MIN YOON (JXY210022)
 */

public class TestCalendarRetrieve {
  public static void main(String[] args) {
    // creating new blank calendar
    Calendar calendar = new Calendar();

    // test retrieving events when there are none (before adding any events)
    System.out.println("\nTESTING RETRIEVING ALL EVENTS WHEN THERE ARE NONE:\n");
    List<Event> allEvents = calendar.getAllEvents();
    System.out.println("Number of all events (should be 0): " + allEvents.size());

    // creating two distinct events prior to testing
    Event event = new Event("Boba Social", "6:00pm", "Enjoy some free boba and socialize", "ACM", "Blackstone",
        new Date(), true);
    Event event2 = new Event("Python Workshop", "7:00pm", "Learn the basics of Python", "IEEE", "ECSS", new Date(),
        true);

    // sets up calendar mapping and add events
    Map<String, List<Event>> initialMap = new HashMap<>();
    initialMap.put("existingOrg", new ArrayList<>());
    initialMap.put("existingOrg2", new ArrayList<>());
    calendar.setCalendarMapping(initialMap);

    calendar.addOrgEvent("existingOrg", event);
    calendar.addOrgEvent("existingOrg2", event2);

    // test retrieving events from existing organization
    System.out.println("\nTESTING RETRIEVING EVENT FROM EXISTING ORGANIZATION:\n");
    List<Event> events = calendar.getOrgEvents("existingOrg");
    System.out.println(
        "Number of events from existing organization (should be 1): " + (events != null ? events.size() : "null"));

    // test retrieving events from all organizations
    System.out.println("\nTESTING RETRIEVING EVENTS FROM ALL EXISTING ORGANIZATIONS:\n");
    allEvents = calendar.getAllEvents();
    System.out.println("Number of all events (should be 2): " + allEvents.size());
  }
}
