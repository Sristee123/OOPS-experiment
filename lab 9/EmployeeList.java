package lab_9;

import java.util.ArrayList;

public class EmployeeList {
	public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aman", 101, 50000));
        employees.add(new Employee("Parul", 102, 55000));
        employees.add(new Employee("Sourabh", 103, 60000));

        // Update salary of ID 102
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 58000;
            }
        }

        // Remove employee with ID 101
        employees.removeIf(emp -> emp.id == 101);

        // Print remaining
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
