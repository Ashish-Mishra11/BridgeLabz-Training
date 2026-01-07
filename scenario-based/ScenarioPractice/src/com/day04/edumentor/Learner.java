package com.day04.edumentor;
class Learner extends User implements ICertifiable {
    private boolean fullTimeCourse;

    Learner(String name, String email, int userId, boolean fullTimeCourse) {
        super(name, email, userId);
        this.fullTimeCourse = fullTimeCourse;
    }

    @Override
    public void generateCertificate() {
        if (fullTimeCourse) {
            System.out.println("Full-Time Course Certificate issued to " + name);
        } else {
            System.out.println("Short Course Certificate issued to " + name);
        }
    }
}
