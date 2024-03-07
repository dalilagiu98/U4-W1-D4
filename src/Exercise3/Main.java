package Exercise3;

import entities.Departments;
import entities.Employee;
import entities.Manager;
import entities.Volunteer;
import interfaces.CheckIn;

public class Main {
    public static void main(String[] args) {
        Volunteer volunteer = new Volunteer("Aldo", 32);
        Employee employee = new Manager(Departments.ADMINISTRATION);

        CheckIn[] checkIns = {volunteer, employee};
        for(int i = 0; i < checkIns.length; i++) {
            checkIns[i].checkIn();
        }
    }
}
