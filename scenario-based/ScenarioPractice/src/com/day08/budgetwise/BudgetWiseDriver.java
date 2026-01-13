package com.day08.budgetwise;
import java.util.Scanner;

public class BudgetWiseDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter income");
        double income = sc.nextDouble();

        System.out.println("Enter expense limit");
        double limit = sc.nextDouble();

        System.out.println("Enter number of categories");
        int n = sc.nextInt();

        String[] categories = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter category name");
            categories[i] = sc.next();
        }

        System.out.println("1 Monthly Budget 2 Annual Budget");
        int choice = sc.nextInt();

        Budget budget;
        if (choice == 1) {
            budget = new MonthlyBudget(income, limit, categories);
        } else {
            budget = new AnnualBudget(income, limit, categories);
        }

        while (true) {

            System.out.println("1 Add Expense");
            System.out.println("2 Generate Report");
            System.out.println("3 Detect Overspend");
            System.out.println("4 Exit");

            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("Enter amount");
                double amt = sc.nextDouble();

                System.out.println("Enter category");
                String cat = sc.next();

                budget.addExpense(amt, cat);
            }

            else if (option == 2) {
                budget.generateReport();
            }

            else if (option == 3) {
                budget.detectOverspend();
            }

            else {
                System.out.println("Thank you for using BudgetWise");
                break;
            }
        }
        sc.close();
    }
}
