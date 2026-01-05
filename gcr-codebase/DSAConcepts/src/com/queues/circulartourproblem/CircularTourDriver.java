package com.queues.circulartourproblem;
public class CircularTourDriver {
    public static void main(String[] args) {

        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int startPoint = CircularTour.findStart(pumps);

        if (startPoint != -1) {
            System.out.println("Start tour at petrol pump index: " + startPoint);
        } else {
            System.out.println("No possible circular tour");
        }
    }
}
