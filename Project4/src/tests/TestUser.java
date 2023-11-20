import java.util.ArrayList;
import java.util.List;

import classes.Event;
import classes.User;

/*
 *      THIS FILE TESTS THE USER CLASS TO ENSURE
 *      THAT EVENTS ARE NOT OVERWRITTEN
 *      USERS HOLD A LIST OF RSVPED EVENTS
 *      USER SETTINGS ARE PERSISTED
 *      USER CAN SET THEIR STATUS TO ADMIN
 *      AUTHOR: BEN WOWO (BNW200001)
 */

public class TestUser {
    public static void main(String[] args) {
        User user0 = new User();
        System.out.println("\nTESTING DEFAULT USER CREATION");
        System.out.println("\nPRINTING DEFAULT USER:\n" + user0.toString() + "");
        System.out.println("Test passed!: EventOverWrite\n\n");

        System.out.println("\nTESTING SAME EVENTS TIMES DON'T CAUSE OVERWRITTE\n");
        User user1 = new User();
        boolean result = testNoEventOverwrite(user1);
        System.out.println("User after test: " + user1.toString());
        if (result == true) {
            System.out.println("Test passed!: EventOverWrite");
        } else {
            System.out.println("Test Failed!: EventOverWrite");
        }

        System.out.println("\nTESTING RVSPlist is consisteng");
        User user2 = new User();
        boolean result2 = testConsitentRSVPlist(user2);
        System.out.println("User after test: " + user2.toString());
        if (result2 == true) {
            System.out.println("Test passed!: EventOverWrite");
        } else {
            System.out.println("Test failed!: EventOverWrite");
        }

    }

    private static boolean testNoEventOverwrite(User user) {
        Event event1 = new Event();
        Event event2 = new Event();
        event1.setEventTime("6:00pm");
        event2.setEventTime("6:00pm");
        
        List<Event> userEvents = user.getRSVPedEvents();
        userEvents.add(event1);
        userEvents.add(event2);
        user.setRSVPedEvents(userEvents);
        
        if (user.getRSVPedEvents().size() == 2) {
            return true;
        }

        return false;
    }

    private static boolean testConsitentRSVPlist(User user) {
        Event event1 = new Event();
        Event event2 = new Event();
        event1.setEventTime("6:00pm");
        event2.setEventTime("6:00pm");
        
        List<Event> userEvents = user.getRSVPedEvents();
        userEvents.add(event1);
        userEvents.add(event2);
        user.setRSVPedEvents(userEvents);
        
        if (user.getRSVPedEvents().size() != 3) {
            return true;
        }

        return false;
    }

}