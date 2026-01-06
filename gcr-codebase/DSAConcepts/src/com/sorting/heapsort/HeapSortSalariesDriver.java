package com.sorting.heapsort;
class HeapSortSalariesDriver {

    public static void main(String[] args) {

        int[] salaryDemands = {55000, 42000, 78000, 60000, 50000};

        HeapSortSalaries sorter = new HeapSortSalaries();

        sorter.displaySalaries(salaryDemands);
        sorter.sortSalaries(salaryDemands);
        sorter.displaySalaries(salaryDemands);
    }
}
