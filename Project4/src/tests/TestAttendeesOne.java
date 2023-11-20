import classes.Event;

/*
 * 
 *  THIS FILE TESTS THE ATTENDEE LIST FOR AN EVENT
 *  AUTHOR: LUCAS WILSON 
 * 
 * 
 */

public class TestAttendeesOne {
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
        event.attendeeList.printList(); 
        System.out.println("\nThe attendees were successfully added since the event opened.\n");

        //Adding another attendee
        System.out.println("ADDING ANOTHER ATTENDEE: =====================================");
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Vijay"); 

   
        // Print the Attendee List 
        event.attendeeList.printList(); 
        System.out.println("\nThe attendee was sucessfully added.");

        //Trying to add attendee which already exists
        System.out.println("\nTRYING TO ADD AN EXISTING ATTENDEE: =====================================");
        System.out.println("Trying to add Saidarsh to the list again:");
        event.attendeeList.insert(event.isOpen, event.attendeeList, "Saidarsh");


        //Printing new list
        System.out.println("\nFINAL LIST: =================================================");
        event.attendeeList.printList(); 
        System.out.println("\n");

    } 
}
