package br.com.javainsider.other.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static br.com.javainsider.other.list.Employee.Status.ACTIVE;
import static br.com.javainsider.other.list.Employee.Status.INACTIVE;

public class ExRemoveEmployees {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Emp A", ACTIVE),
                new Employee("Emp B", INACTIVE),
                new Employee("Emp C", ACTIVE),
                new Employee("Emp D", INACTIVE),
                new Employee("Emp E", INACTIVE),
                new Employee("Emp F", ACTIVE)
        ));

        List<Employee> activeEmployees = getOnlyActiveEmployees(employees);
        List<Employee> inactiveEmployees = getOnlyInactiveEmployees(employees);
        System.out.println(employees);
        System.out.println(activeEmployees);
        System.out.println(inactiveEmployees);

    }

    private static List<Employee> getOnlyActiveEmployees(List<Employee> employees) {
        return filterByRemovingStatus(employees, INACTIVE);
    }

    private static List<Employee> getOnlyInactiveEmployees(List<Employee> inactiveEmployee) {
        return filterByRemovingStatus(inactiveEmployee, ACTIVE);
    }

    private static List<Employee> filterByRemovingStatus(List<Employee> inactiveEmployee, Employee.Status active) {
        List<Employee> inactiveEmployees = new ArrayList<>(inactiveEmployee);

        inactiveEmployees.removeIf(employee -> employee.getStatus() == active);
        return inactiveEmployees;
    }

}
