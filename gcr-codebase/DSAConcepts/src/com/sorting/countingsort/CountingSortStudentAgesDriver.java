package com.sorting.countingsort;
class CountingSortStudentAgesDriver {

    public static void main(String[] args) {

        int[] studentAges = {14, 12, 16, 11, 18, 15, 13, 10};

        CountingSortStudentAges sorter = new CountingSortStudentAges();

        sorter.displayAges(studentAges);
        sorter.sortAges(studentAges);
        sorter.displayAges(studentAges);
    }
}
