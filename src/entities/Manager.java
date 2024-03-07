package entities;

public class Manager extends Employee{

    //ATTRIBUTES LIST:
    private double raiseSalary;

    //CONSTRUCTOR:
    public Manager(Departments department) {
        super(department);
        this.raiseSalary = 10000;
    }

    @Override
    public void calculateSalary() {
        System.out.println("The total monthly salary for Manager is: " + this.raiseSalary);

    }
}
