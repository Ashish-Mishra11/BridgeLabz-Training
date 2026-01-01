package com.inheritance.hybrid.restaurantmanagement;

public class Chef extends Person implements Worker {
	private String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking dishes. Specialty: " + specialty);
    }

}
