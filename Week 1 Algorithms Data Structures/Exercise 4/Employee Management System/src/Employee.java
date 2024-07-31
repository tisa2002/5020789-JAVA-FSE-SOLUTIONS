import java.util.ArrayList;
import java.util.List;

class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}


class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee searchEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public boolean deleteEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        system.addEmployee(new Employee(1, "John Doe", "Manager", 75000));
        system.addEmployee(new Employee(2, "Jane Smith", "Developer", 65000));
        system.addEmployee(new Employee(3, "Emily Davis", "Designer", 60000));

        System.out.println("All Employees:");
        system.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee employee = system.searchEmployeeById(2);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee with ID 1:");
        boolean isDeleted = system.deleteEmployeeById(1);
        if (isDeleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
        
        System.out.println("\nAll Employees after deletion:");
        system.traverseEmployees();
    }
}
