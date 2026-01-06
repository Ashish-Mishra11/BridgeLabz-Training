package com.sorting.insertionsort;
class InsertionSortEmployeeIDs {

    void sortIDs(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            ids[j + 1] = key;
        }
    }

    void displayIDs(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
