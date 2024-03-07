package entities;

import java.util.Random;

public class Employee {
    //ATTRIBUTES LIST:
    private long serialNumber;
    private double salary;
    private Departments department;


    //CONSTRUCTOR:
    public Employee( Departments department) {
        Random random = new Random();
        this.serialNumber= random.nextLong(1,1000);
        this.salary = 750.65;
        this.department = department;
    }

    //METHOD:


    public long getSerialNumber() {
        return serialNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }
}
