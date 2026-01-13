package com.day08.budgetwise;
public class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected String[] categories;
    protected double[] expenses;
    protected int count;

    protected Budget(double income, double limit, String[] categories) {
        this.income = income;
        this.limit = limit;
        this.categories = categories;
        expenses = new double[categories.length];
        count = 0;
    }

    protected void addExpense(double amount, String category) {
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equals(category)) {
                expenses[i] += amount;
            }
        }
    }

    public double calculateSavings() {
        double totalExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            totalExpense += expenses[i];
        }
        return income - totalExpense;
    }

    public void generateReport() {}

    public void detectOverspend() {}
}
