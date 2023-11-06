/*
 * AUTHOR: BEN WOWO (BNW200001)
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
    private boolean admin;
    
    public User() {
        this.firstName = "Default first name";
        this.middleName = "Default middle name";
        this.lastName = "Default last name";
        this.netID = "Default netID";
        this.RSVPedEvents = new ArrayList<>();
        this.admin = false;
    }

    

    public User(String firstName, String middleName, String lastName, String netID, List<Event> rSVPedEvents,
            List<String> organizations, boolean admin) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.netID = netID;
        RSVPedEvents = rSVPedEvents;
        this.organizations = organizations;
        this.admin = admin;
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }  

    

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", netID="
                + netID + ", RSVPedEvents=" + RSVPedEvents + ", organizations=" + organizations + "]";
    }  
}