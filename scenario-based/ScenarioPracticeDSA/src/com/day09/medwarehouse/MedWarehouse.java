package com.day09.medwarehouse;
class MedWarehouse {

    public void mergeSort(Medicine[] meds, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(meds, left, mid);
            mergeSort(meds, mid + 1, right);

            merge(meds, left, mid, right);
        }
    }

    private void merge(Medicine[] meds, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] leftArr = new Medicine[n1];
        Medicine[] rightArr = new Medicine[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = meds[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = meds[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].expiryDays <= rightArr[j].expiryDays) {
                meds[k] = leftArr[i];
                i++;
            } else {
                meds[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            meds[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            meds[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void displayMedicines(Medicine[] meds) {
        for (Medicine m : meds) {
            m.display();
        }
    }
}
