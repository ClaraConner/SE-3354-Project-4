/*
 * AUTHOR: 
 * This class will contain multiple lists I guess for each organization
 * containing the dates of what events they will be having
 * 
 */

package classes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {
    private Map<String, List<Event>> calendarMapping;

    public Calendar() {
        calendarMapping = new HashMap<>();
    }

    public Calendar(Map<String, List<Event>> calendarMapping) {
        this.calendarMapping = calendarMapping;
    }

    public Map<String,List<Event>> getCalendarMapping() {
        return this.calendarMapping;
    }

    public void setCalendarMapping(Map<String, List<Event>> calendarMapping){
        this.calendarMapping = calendarMapping;
    }
    
    public boolean addOrgEvent(String orgID, Event event){
        if (!this.calendarMapping.containsKey(orgID)) {
            return false;
        }

        this.calendarMapping.get(orgID).add(event);
        return true;
    }

    public boolean removeOrgEvent(String orgID, Event event) {
        if (!this.calendarMapping.containsKey(orgID)) {
            return false;
        }

        this.calendarMapping.get(orgID).remove(event);
        return true;
    }

    public List<Event> getAllEvents() {
        List<Event> allEvents = new ArrayList<>();

        this.calendarMapping.forEach((orgID, Event) -> {
            allEvents.add((classes.Event) Event);
        });

        return allEvents;
    }

    public List<Event> getOrgEvents(String orgID) {
        if (!this.calendarMapping.containsKey((orgID))) {
            return null;
        }

        return this.calendarMapping.get(orgID);
    }
}
