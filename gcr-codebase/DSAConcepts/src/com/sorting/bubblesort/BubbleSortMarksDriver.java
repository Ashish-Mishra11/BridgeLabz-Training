package com.sorting.bubblesort;
class BubbleSortMarksDriver {

    public static void main(String[] args) {

        int[] studentMarks = {79, 43, 88, 61, 90, 53};

        BubbleSortMarks sorter = new BubbleSortMarks();

        sorter.displayMarks(studentMarks);
        sorter.sortMarks(studentMarks);
        sorter.displayMarks(studentMarks);
    }
}
