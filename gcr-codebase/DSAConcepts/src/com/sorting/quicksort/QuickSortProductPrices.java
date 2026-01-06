package com.sorting.quicksort;
class QuickSortProductPrices {

    void sortPrices(int[] prices, int low, int high) {
        if (low < high) {
            int p = partition(prices, low, high);
            sortPrices(prices, low, p - 1);
            sortPrices(prices, p + 1, high);
        }
    }

    int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    void displayPrices(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
