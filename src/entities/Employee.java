package entities;

public class Employee {
    //ATTRIBUTES LIST:
    private long serialNumber;
    private double salary;
    private String department;


    //CONSTRUCTOR:
    public Employee(long serialNumber, double salary, String department) {
        this.serialNumber= serialNumber;
        this.salary = salary;
        this.department = department;
    }
    
}
