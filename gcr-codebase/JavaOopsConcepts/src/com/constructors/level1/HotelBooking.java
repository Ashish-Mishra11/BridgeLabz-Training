package com.constructors.level1;

class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    // Method to display booking details
    void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }


    public static void main(String[] args) {

        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Ashish", "Deluxe", 3);
        // copy constructor 
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println("Default Booking:");
        b1.displayBooking();

        System.out.println("\nParameterized Booking:");
        b2.displayBooking();

        System.out.println("\nCopied Booking:");
        b3.displayBooking();
    }
}

