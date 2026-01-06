package com.sorting.mergesort;
class MergeSortBookPricesDriver {

    public static void main(String[] args) {

        int[] bookPrices = {499, 299, 799, 199, 599};

        MergeSortBookPrices sorter = new MergeSortBookPrices();

        sorter.displayPrices(bookPrices);
        sorter.sortPrices(bookPrices, 0, bookPrices.length - 1);
        sorter.displayPrices(bookPrices);
    }
}
