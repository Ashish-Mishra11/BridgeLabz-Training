package com.day04.eventease;
import java.util.Scanner;

public class EventEaseDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter organizer name");
        String uname = sc.nextLine();

        System.out.println("Enter email");
        String email = sc.nextLine();

        System.out.println("Enter phone");
        String phone = sc.nextLine();

        User user = new User(uname, email, phone);

        System.out.println("Choose event type 1 Birthday 2 Conference");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter event name");
        String eventName = sc.nextLine();

        System.out.println("Enter location");
        String location = sc.nextLine();

        System.out.println("Enter date");
        String date = sc.nextLine();

        System.out.println("Enter number of attendees");
        int attendees = sc.nextInt();

        System.out.println("Need catering true or false");
        boolean catering = sc.nextBoolean();

        System.out.println("Need decoration true or false");
        boolean decoration = sc.nextBoolean();

        Event event;

        if (choice == 1) {
            event = new BirthdayEvent(eventName, location, date, attendees, catering, decoration);
        } else {
            event = new ConferenceEvent(eventName, location, date, attendees, catering, decoration);
        }

        event.schedule();

        System.out.println("Event ID (read only): " + event.getEventId());
        System.out.println("Organizer: " + user.getName());
        
        sc.close();
    }
}
