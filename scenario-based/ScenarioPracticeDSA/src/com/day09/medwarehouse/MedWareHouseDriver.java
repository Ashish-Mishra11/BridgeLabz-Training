package com.day09.medwarehouse;
public class MedWareHouseDriver {
    public static void main(String[] args) {

        Medicine[] medicines = new Medicine[6];
        medicines[0] = new Medicine(201, 120);
        medicines[1] = new Medicine(202, 30);
        medicines[2] = new Medicine(203, 90);
        medicines[3] = new Medicine(204, 15);
        medicines[4] = new Medicine(205, 60);
        medicines[5] = new Medicine(206, 10);

        MedWarehouse warehouse = new MedWarehouse();

        System.out.println("Before Sorting");
        warehouse.displayMedicines(medicines);

        warehouse.mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("After Sorting by Expiry Date");
        warehouse.displayMedicines(medicines);
    }
}
