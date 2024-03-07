package entities;

public class FullTimeEmployee extends Employee {

    //ATTRIBUTE LIST:
    private double raiseSalary;

    //CONSTRUCTOR:
    public FullTimeEmployee (Departments department) {
        super(department);
        this.raiseSalary = 1323.48;
    }

    @Override
    public void calculateSalary() {
        System.out.println("The total monthly salary for Full Time Employee is: " + (this.salary + this.raiseSalary));
    }
}
