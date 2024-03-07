package entities;

import interfaces.CheckIn;

public class Volunteer implements CheckIn {

    //ATTRIBUTES LIST
    String name;
    int age;
    String cv;

    //  CONSTRUCTOR:
    public Volunteer (String name, int age) {
        this.name = name;
        this.age = age;
        this.cv = "empty";
    }

    @Override
    public void checkIn() {
        System.out.println("My working time is from 11.00 am to 5.00 pm");
    }
}
