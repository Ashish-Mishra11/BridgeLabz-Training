package com.sorting.insertionsort;
class InsertionSortEmployeeIDsDriver {

    public static void main(String[] args) {

        int[] employeeIDs = {104, 101, 109, 102, 106};

        InsertionSortEmployeeIDs sorter = new InsertionSortEmployeeIDs();

        sorter.displayIDs(employeeIDs);
        sorter.sortIDs(employeeIDs);
        sorter.displayIDs(employeeIDs);
    }
}
