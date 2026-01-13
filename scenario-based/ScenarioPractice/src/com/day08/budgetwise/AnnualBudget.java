package com.day08.budgetwise;
public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, String[] categories) {
        super(income, limit, categories);
    }

    public void generateReport() {
        System.out.println("Annual Budget Report");
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i] + " Yearly Expense " + expenses[i]);
        }
        System.out.println("Net Savings " + calculateSavings());
    }

    public void detectOverspend() {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > limit * 12) {
                System.out.println("Annual overspending in " + categories[i]);
            }
        }
    }
}
