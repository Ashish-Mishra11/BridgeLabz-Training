package com.day04.eventease;
class Event implements ISchedulable {
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;
    private double venueCost;
    private double serviceCost;
    private double discount;

    private static int idCounter = 1000;

    Event(String eventName, String location, String date, int attendees) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.eventId = ++idCounter;
        this.venueCost = 5000;
        this.serviceCost = 0;
        this.discount = 0;
    }

    Event(String eventName, String location, String date, int attendees,
          boolean catering, boolean decoration) {
        this(eventName, location, date, attendees);
        if (catering) {
            serviceCost += 3000;
        }
        if (decoration) {
            serviceCost += 2000;
        }
    }

    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    @Override
    public void schedule() {
        System.out.println("Event scheduled on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event cancelled");
    }
}
