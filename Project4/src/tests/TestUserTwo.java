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
 *      AUTHOR: ANUSHA BAJRACHARYA
 */

public class TestUserTwo {
    public static void main(String[] args) {
        User user0 = new User();
        User user1 = new User();
        User user2 = new User();

        System.out.println("\nTESTING user settings consisteng");
        User user3 = new User();
        boolean result3 = testConsistentSettings(user3);
        System.out.println("User after test " + user3.toString());
        if (result3 == true) {
            System.out.println("Test passed!: EventOverWrite");
        } else {
            System.out.println("Test failed!: EventOverWrite");
        }

        System.out.println("\nTESTING organization list");
        User user4 = new User();
        boolean result4 = testOrganizationList(user4);
        System.out.println("User after test " + user4.toString());
        if (result4 == true) {
            System.out.println("Test passed!: EventOverWrite");
        } else {
            System.out.println("Test failed!: EventOverWrite");
        }

        System.out.println("\nTESTING admin status");
        User user5 = new User();
        boolean result5 = testAdminStatus(user1);
        System.out.println("User after test " + user5.toString());
        if (result5 == true) {
            System.out.println("Test passed!: EventOverWrite");
        } else {
            System.out.println("Test failed!: EventOverWrite");
        }
    }


    private static boolean testConsistentSettings(User user) {
        user.setFirstName("new first name");
        user.setMiddleName("new middle name");
        user.setLastName("new last name");
        user.setNetID("new net id");
        if (user.getFirstName().equals("new first name") && user.getMiddleName().equals("new middle name") && user.getLastName().equals("new last name") && user.getNetID().equals("new net id")) {
            return true;
        }
        return false;
    }

    private static boolean testOrganizationList(User user) {
        user.setOrganizations(new ArrayList<>());
        List<String> organizations = user.getOrganizations();
        organizations.add("ACM");
        organizations.add("AIS");
        organizations.add("ECS");

        if (organizations.contains("ACM") && organizations.contains("AIS") && organizations.contains("ECS")) {
            return true;
        }
        return false;
    }

    private static boolean testAdminStatus(User user) {
        user.setAdmin(true);

        if (user.isAdmin() == true) {
            return true;
        }

        return false;
    }
}
