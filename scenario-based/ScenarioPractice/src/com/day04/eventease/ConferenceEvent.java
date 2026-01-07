package com.day04.eventease;
class ConferenceEvent extends Event {

    ConferenceEvent(String name, String location, String date, int attendees,
                    boolean catering, boolean decoration) {
        super(name, location, date, attendees, catering, decoration);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup");
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}
