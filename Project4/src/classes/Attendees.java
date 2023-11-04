package classes;

/*
 * 
 *  THIS FILE CREATES A LINKED LIST OF ATTENDEES FOR A GIVEN EVENT
 *  AUTHOR: NAME
 * 
 * 
 */

public class Attendees {
    public Attendee head;

    static class Attendee {
        public String attendeeName;
        public Attendee next;
 
        Attendee(String name) { 
            attendeeName = name; 
            next = null; 
        }

    }

     public Attendees insert(boolean isOpen, Attendees list, String name) 
    { 
        //if the event is closed then return original list
        if(!isOpen){
            System.out.println("Attendee " + name + " could not be added because the event is closed.");
            return list;
        } 
        // Create a new node with given data 
        Attendee new_attendee = new Attendee(name); 
         
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_attendee; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Attendee last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
            // Insert the new_node at last node 
            last.next = new_attendee; 
        } 
   
        // Return the list by head 
        return list; 
    } 

    // Method to print the LinkedList. 
    public void printList() 
    { 
        Attendee currNode = head; 
    
        System.out.print("Event Attendees: "); 
    
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print("   " + currNode.attendeeName + ", "); 
    
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 

    //Deletes Attendees from the list
    public Attendees deleteByName(Attendees list, String name) {
        Attendee currNode = head, prev = null;
 
        //Attendee is found and deleted
        if (currNode != null && currNode.attendeeName == name) {
            list.head = currNode.next; 
            System.out.println(name + " was found and removed from the attendee list");
            return list;
        }
 
        while (currNode != null && currNode.attendeeName != name) {
            prev = currNode;
            currNode = currNode.next;
        }
 
        //attendee was found and deleted
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(name + " found and removed from the attendee list");
        }
 
        //attendee was not found on the list
        if (currNode == null) {
            System.out.println(name + " not found on the attendee list");
        }
 
        // return the List
        return list;
    }
}
