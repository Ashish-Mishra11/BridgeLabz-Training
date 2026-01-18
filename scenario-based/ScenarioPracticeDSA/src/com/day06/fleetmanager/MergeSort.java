package com.day06.fleetmanager;
public class MergeSort {

    public static Vehicle[] mergeSort(Vehicle[] vehicles) {
        if (vehicles.length <= 1) {
            return vehicles;
        }

        int mid = vehicles.length / 2;
        Vehicle[] left = new Vehicle[mid];
        Vehicle[] right = new Vehicle[vehicles.length - mid];

        for (int i = 0; i < mid; i++) left[i] = vehicles[i];
        for (int i = mid; i < vehicles.length; i++) right[i - mid] = vehicles[i];

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static Vehicle[] merge(Vehicle[] left, Vehicle[] right) {
        Vehicle[] merged = new Vehicle[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].mileage <= right[j].mileage) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) merged[k++] = left[i++];
        while (j < right.length) merged[k++] = right[j++];

        return merged;
    }
}
