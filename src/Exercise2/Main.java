package Exercise2;

import entities.*;

public class Main {
    public static void main(String[] args){
        FullTimeEmployee fullEmployee = new FullTimeEmployee(Departments.SALES);
        PartTimeEmployee partEmployee = new PartTimeEmployee(Departments.PRODUCTION);
        Manager manager = new Manager(Departments.ADMINISTRATION);

        Employee[] employees = {fullEmployee, partEmployee, manager};

        for (int i = 0; i < employees.length; i++ ){
            Employee currentEmployee = employees[i];
            currentEmployee.calculateSalary();
        }
    }
}
