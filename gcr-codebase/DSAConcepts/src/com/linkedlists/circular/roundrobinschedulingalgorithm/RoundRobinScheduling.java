package com.linkedlists.circular.roundrobinschedulingalgorithm;
import java.util.Scanner;

public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        System.out.print("Enter time quantum: ");
        int timeQuantum = sc.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter burst time for process " + i + ": ");
            int burst = sc.nextInt();
            System.out.print("Enter priority for process " + i + ": ");
            int priority = sc.nextInt();
            scheduler.addProcess(i, burst, priority);
        }

        System.out.println("\nProcesses in the queue:");
        scheduler.displayProcesses();

        System.out.println("\nStarting Round Robin Scheduling...\n");
        scheduler.executeScheduling();
        
        sc.close();
        }
}
