package com.day04.eventease;
class BirthdayEvent extends Event {

    BirthdayEvent(String name, String location, String date, int attendees,
                  boolean catering, boolean decoration) {
        super(name, location, date, attendees, catering, decoration);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with fun activities");
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}
