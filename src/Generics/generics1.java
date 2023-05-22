package Generics;
import java.util.HashSet;
import java.util.Scanner;
public class generics1 {

    static class Employee {
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
            System.out.println("Employee Details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Department: " + department);
            System.out.println();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    public class Main {
        public static void main(String[] args) {
            HashSet<Employee> employees = new HashSet<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter employee details or enter 'q' to quit:");

            while (true) {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (id == 0) {
                    break; // Exit the loop if ID is 0
                }

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Department: ");
                String department = scanner.nextLine();

                Employee employee = new Employee(id, name, salary, department);
                employees.add(employee);

                System.out.println("Employee added successfully!");
                System.out.println();
            }

            System.out.println("Employee Details:");

            for (Employee employee : employees) {
                employee.displayDetails();
            }
        }
    }

}
