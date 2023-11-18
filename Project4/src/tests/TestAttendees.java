import classes.Event;

/*
 * 
 *  THIS FILE TESTS THE ATTENDEE LIST FOR AN EVENT
 *  AUTHOR: LUCAS WILSON 
 * 
 * 
 */

public class TestAttendees {
    public static void main(String[] args) 
    { 
        //Creating an event will create a blank attendee list
        Event event = new Event();
   
        //First we need to test if the event is open or not
        System.out.println("\nTESTING ADDING SOMEONE TO A CLOSED EVENT: =================================\n");
        System.out.println("Is event currently open: " + event.isOpen);
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Clara"); 
        System.out.println("\n");

        //Now we open the event and add the attendees
        System.out.println("OPENING THE EVENT AND ADDING ATTENDEES: =====================================");
        event.setEventStatus(true);
   
        // Insert the attendees 
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Clara"); 
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Anusha"); 
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Kevin"); 
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Saidarsh"); 
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Lucas"); 
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Ben"); 
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Vijay"); 
   
        // Print the Attendee List 
        event.attendeeList.printList(); 
        System.out.println("\nThe attendees were successfully added since the event opened.\n");

        // Test delete function
        System.out.println("TESTING DELETE FUNCTION: ====================================================");
        System.out.println("Trying to delete Clara from the list:");
        event.attendeeList.deleteByName(event.attendeeList, "Clara");
        System.out.println("Trying to delete Vijay from the list:");
        event.attendeeList.deleteByName(event.attendeeList, "Vijay");
        System.out.println("Trying to delete Kevin from the list:");
        event.attendeeList.deleteByName(event.attendeeList, "Kevin");
        //Trying to delete an attendee which doesn't exist
        System.out.println("\nTrying to delete Bob from the list:");
        event.attendeeList.deleteByName(event.attendeeList, "Bob");
        System.out.println("Trying to delete Clara from the list again:");
        event.attendeeList.deleteByName(event.attendeeList, "Clara");

        //Printing new list
        System.out.println("\nNEW LIST AFTER DELETIONS: =================================================");
        event.attendeeList.printList(); 
        System.out.println("\n");

    } 
}
