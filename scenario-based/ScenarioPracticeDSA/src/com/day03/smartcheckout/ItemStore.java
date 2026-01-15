package com.day03.smartcheckout;
import java.util.HashMap;

class ItemStore {

    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    ItemStore() {
        priceMap.put("apple", 50);
        priceMap.put("milk", 40);
        priceMap.put("bread", 30);

        stockMap.put("apple", 10);
        stockMap.put("milk", 10);
        stockMap.put("bread", 10);
    }

    int getPrice(String item) {
        return priceMap.get(item);
    }

    boolean isAvailable(String item) {
        return stockMap.containsKey(item) && stockMap.get(item) > 0;
    }

    void updateStock(String item) {
        stockMap.put(item, stockMap.get(item) - 1);
    }

    void printStock() {
        for (String item : stockMap.keySet()) {
            System.out.println(item + " stock " + stockMap.get(item));
        }
    }
}
