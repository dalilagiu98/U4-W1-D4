package Exercise1;

import entities.Departments;
import entities.Employee;
import entities.FullTimeEmployee;
import entities.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee(Departments.ADMINISTRATION);
        Employee employee2 = new PartTimeEmployee(Departments.PRODUCTION);
        Employee employee3 = new PartTimeEmployee(Departments.SALES);

        Employee[] employees = { employee1, employee2, employee3};

         for (int i = 0; i < employees.length; i++) {
             Employee currentEmployee = employees[i];
             System.out.println("---------------------------------");
             System.out.println("These are the details for the employee:");
             System.out.println("Serial number: " + currentEmployee.getSerialNumber());
             System.out.println("Department: " + currentEmployee.getDepartment());
             System.out.println("Salary: " + currentEmployee.getSalary());
             System.out.println("---------------------------------");
       }


         employee1.setDepartment(Departments.SALES);
         System.out.println("These are the details for the employee1:");
         System.out.println("Serial number: " + employee1.getSerialNumber());
         System.out.println("Department: " + employee1.getDepartment());
         System.out.println("Salary: " + employee1.getSalary());

    }
}