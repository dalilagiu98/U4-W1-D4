package entities;

public class PartTimeEmployee extends Employee {

    //ATTRIBUTES LIST:
    private double raiseSalary;

    //CONSTRUCTOR:
    public PartTimeEmployee(Departments departments) {
        super(departments);
        this.raiseSalary= (60 * 8.56);
    }

    //ABSTRACT METHODS:
    @Override
    public void calculateSalary() {
        System.out.println("The total monthly salary for Part Time Employee is: " + ((this.salary/2) + this.raiseSalary));
    }
}
