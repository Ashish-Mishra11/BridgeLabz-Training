package com.generics.smartwarehousemanagement;

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Groceries: " + getName();
    }
}