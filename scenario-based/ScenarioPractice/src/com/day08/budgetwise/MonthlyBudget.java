package com.day08.budgetwise;
public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, String[] categories) {
        super(income, limit, categories);
    }

    public void generateReport() {
        System.out.println("Monthly Budget Report");
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i] + " Expense " + expenses[i]);
        }
        System.out.println("Net Savings " + calculateSavings());
    }

    public void detectOverspend() {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > limit) {
                System.out.println("Overspending in " + categories[i]);
            }
        }
    }
}
