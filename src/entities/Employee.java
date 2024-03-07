package entities;

import java.util.Random;

public abstract class Employee {
    //ATTRIBUTES LIST:
    protected long serialNumber;
    protected double salary;
    protected Departments department;


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

    //ABSTRACT METHODS:
    public abstract void calculateSalary();
}
