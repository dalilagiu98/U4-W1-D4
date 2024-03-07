package Exercise1;

import entities.Departments;
import entities.Employee;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(Departments.ADMINISTRATION);
        Employee employee2 = new Employee(Departments.PRODUCTION);
        Employee employee3 = new Employee(Departments.SALES);

        Employee[] employees = { employee1, employee2, employee3};

        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            System.out.println("These are the details for the employee:");
            System.out.println("Serial number: " + currentEmployee.getSerialNumber());
            System.out.println("Department: " + currentEmployee.getDepartment());
            System.out.println("Salary: " + currentEmployee.getSalary());
        }

        employee1.setDepartment(Departments.SALES);
        System.out.println("These are the details for the employee1:");
        System.out.println("Serial number: " + employee1.getSerialNumber());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Salary: " + employee1.getSalary());

    }
}