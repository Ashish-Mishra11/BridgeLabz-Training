package com.queues.circulartourproblem;
class CircularTour {

    public static int findStart(PetrolPump[] pumps) {
        int n = pumps.length;
        Queue queue = new Queue(n);

        int start = 0;
        int surplus = 0;

        for (int i = 0; i < n; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            queue.enqueue(pumps[i]);

            // If surplus becomes negative, reset
            while (surplus < 0 && !queue.isEmpty()) {
                PetrolPump removed = queue.dequeue();
                surplus -= (removed.petrol - removed.distance);
                start++;
            }
        }

        return (queue.isEmpty()) ? -1 : start;
    }
}
