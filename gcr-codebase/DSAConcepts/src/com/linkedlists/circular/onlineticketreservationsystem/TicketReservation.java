package com.linkedlists.circular.onlineticketreservationsystem;
public class TicketReservation {
    private TicketNode last;

    public TicketReservation() {
        last = null;
    }

    // Add ticket at the end
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            last = newTicket;
            last.next = last; // circular link
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        System.out.println("Ticket booked successfully");
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (last == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode current = last.next;
        TicketNode prev = last;
        boolean found = false;

        do {
            if (current.ticketID == ticketID) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("Ticket ID not found");
            return;
        }

        if (current == last && current == last.next) {
            last = null; // Only one node
        } else {
            prev.next = current.next;
            if (current == last) {
                last = prev;
            }
        }

        System.out.println("Ticket removed successfully");
    }

    // Display all tickets
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode current = last.next;
        System.out.println("Current Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    // Search ticket by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (last == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(keyword) || current.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket Found: ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No matching ticket found");
        }
    }

    // Count total tickets
    public int totalTickets() {
        if (last == null) return 0;
        int count = 0;
        TicketNode current = last.next;
        do {
            count++;
            current = current.next;
        } while (current != last.next);
        return count;
    }
}
