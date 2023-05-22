package Generics;
import java.util.HashSet;
import java.util.Set;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class EmployeeHashSetExample {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();

        Employee emp1 = new Employee(1, "John Doe", 5000.0, "Sales");
        Employee emp2 = new Employee(2, "Jane Smith", 6000.0, "Marketing");
        Employee emp3 = new Employee(3, "Mike Johnson", 5500.0, "IT");

        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        for (Employee employee : employeeSet) {
            employee.displayDetails();
            System.out.println("----------------------------");
        }
    }
}