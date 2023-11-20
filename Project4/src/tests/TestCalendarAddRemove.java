
// package tests;
import java.util.*;

import classes.Calendar;
import classes.Event;

/*
 *      THIS FILE TESTS THE CALENDAR CLASS ABILITY TO ADD AND REMOVE EVENTS TO AND FROM ORGANIZATIONS
 *      AUTHOR: SAIDARSH TUKKADI (SXT200072)
 */

public class TestCalendarAddRemove {
  public static void main(String[] args) {
    // creating new blank calendar
    Calendar calendar = new Calendar();

    // creating two distinct events prior to testing
    Event event = new Event("Boba Social", "6:00pm", "Enjoy some free boba and socialize", "ACM", "Blackstone",
        new Date(), true);

    // test adding event to organization that doesn't exist
    System.out.println("\nTESTING ADDING EVENT TO NON-EXISTING ORGANIZATION:\n");
    boolean addedEvent = calendar.addOrgEvent("nonExistingOrg", event);
    System.out.println("Added event to organization (should be false): " + addedEvent);

    // sets up calendar mapping
    Map<String, List<Event>> initialMap = new HashMap<>();
    initialMap.put("existingOrg", new ArrayList<>());
    calendar.setCalendarMapping(initialMap);

    // test adding event to existing organization
    System.out.println("\nTESTING ADDING EVENT TO EXISTING ORGANIZATION:\n");
    addedEvent = calendar.addOrgEvent("existingOrg", event);
    System.out.println("Added event to organization (should be true): " + addedEvent);

    // test removing event from organization
    System.out.println("\nTESTING REMOVING EVENT FROM EXISTING ORGANIZATION:\n");
    boolean removedEvent = calendar.removeOrgEvent("existingOrg", event);
    System.out.println("Removed event from organization (should be true): " + removedEvent);

    // test removing non-existent event from organization
    System.out.println("\nTESTING REMOVING NON-EXISTING EVENT FROM EXISTING ORGANIZATION:\n");
    removedEvent = calendar.removeOrgEvent("existingOrg2", event);
    System.out.println("Removed non-existing event from organization (should be false): " + removedEvent);
  }
}
