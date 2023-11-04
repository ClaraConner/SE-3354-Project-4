/*
 * This is the User class idk what to put in it
 */
package classes;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String netID;
    private List<Event> RSVPedEvents;
    private List<String> organizations;
    
    public User() {
        this.firstName = "Default first name";
        this.middleName = "Default middle name";
        this.lastName = "Default last name";
        this.netID = "Default netID";
        this.RSVPedEvents = new ArrayList<>();
    }

    public User(String firstName, String middleName, String lastName, String netID, List<Event> rSVPedEvents,
            List<String> organizations) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.netID = netID;
        RSVPedEvents = rSVPedEvents;
        this.organizations = organizations;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNetID() {
        return netID;
    }

    public void setNetID(String netID) {
        this.netID = netID;
    }

    public List<Event> getRSVPedEvents() {
        return RSVPedEvents;
    }

    public void setRSVPedEvents(List<Event> rSVPedEvents) {
        RSVPedEvents = rSVPedEvents;
    }

    public List<String> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<String> organizations) {
        this.organizations = organizations;
    }

    
}