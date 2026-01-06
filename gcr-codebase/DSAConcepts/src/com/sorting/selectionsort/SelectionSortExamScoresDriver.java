package com.sorting.selectionsort;
class SelectionSortExamScoresDriver {

    public static void main(String[] args) {

        int[] examScores = {72, 85, 68, 90, 77};

        SelectionSortExamScores sorter = new SelectionSortExamScores();

        sorter.displayScores(examScores);
        sorter.sortScores(examScores);
        sorter.displayScores(examScores);
    }
}
