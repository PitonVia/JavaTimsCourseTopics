package streams;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees; // List of Employee objects

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    // Method to add employees to the employee List
    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    // Method to get the List of employees
    public List<Employee> getEmployees() {
        return employees;
    }
}
