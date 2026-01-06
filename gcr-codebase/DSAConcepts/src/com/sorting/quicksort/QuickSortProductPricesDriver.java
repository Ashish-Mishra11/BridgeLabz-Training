package com.sorting.quicksort;
class QuickSortProductPricesDriver {

    public static void main(String[] args) {

        int[] productPrices = {1500, 799, 2499, 999, 1299};

        QuickSortProductPrices sorter = new QuickSortProductPrices();

        sorter.displayPrices(productPrices);
        sorter.sortPrices(productPrices, 0, productPrices.length - 1);
        sorter.displayPrices(productPrices);
    }
}
