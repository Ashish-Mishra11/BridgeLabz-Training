package com.inheritance.hybrid.restaurantmanagement;

public class Waiter extends Person implements Worker {
	private int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving tables. Tables assigned: " + tablesAssigned);
    }

}
