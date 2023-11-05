import java.util.*;

import classes.Event;

/*
 * 
 *      THIS FILE TESTS THE EVENT CLASS ABILITY TO CREATE AND EDIT EVENTS
 *      AND ALSO TESTS THE DATE SET FUNCTION
 *      AUTHOR: NAME
 * 
 * 
 */

public class TestEvent {
    public static void main(String[] args) throws Exception {
        
        //Creating new blank event
        Event event = new Event();
        System.out.println("\nPRINTING BLANK EVENT:\n" + event.eventToString() + "\n\n");

        //Manually Setting Event Info
        Date date = new Date();
        event.setEventName("Boba Social");
        event.setEventTime("6:00pm");
        event.setEventDesc("Enjoy some free boba and socalize");
        event.setEventOrg("ACM");
        event.setEventLocation("Blackstone");
        event.setEventDate(date);
        event.setEventStatus(true);
        System.out.println("USING SETTERS TO EDIT EVENT: \n" + event.eventToString() + "\n\n");

        //Setting Info from beginning
        Event event2 
        = new Event("Python Workshop", "7:00pm", "Learn the basics of Python", 
                    "IEEE", "ECSS", date, true);
        System.out.println("USING CONSTRUCTOR TO CREATE EVENT:\n" + event2.eventToString() + "\n\n");

        //Attempts to set the event date to a day earlier than today (invalid date)
        Date earlyDate = new Date(600);
        System.out.println("ATTEMPTS TO SET DATE TO INVALID DATE:");
        event2.setEventDate(earlyDate);
        System.out.println("\n\n");
    }
}
