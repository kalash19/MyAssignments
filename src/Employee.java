import java.util.ArrayList;

    class Employee {
        int salary = 10000;

        public int getSalary() {
            return salary;
        }
    }

    class Manager extends Employee {
        @Override
        public int getSalary() {
            int incentive = 5000;
            return salary + incentive;
        }
    }

    class Labour extends Employee {
        @Override
        public int getSalary() {
            int overtime = 500;
            return salary + overtime;
        }
    }

     class Assignment2Q2 {
        public int totalEmployeesSalary(ArrayList<Employee> employees) {
            int totalSalary = 0;
            for (Employee employee : employees) {
                totalSalary += employee.getSalary();
            }
            return totalSalary;
        }

        public static void main(String[] args) {
            Assignment2Q2 organization = new Assignment2Q2();

            // Create some employees
            Manager manager1 = new Manager();
            Manager manager2 = new Manager();
            Labour labourer1 = new Labour();
            Labour labourer2 = new Labour();

            // Add the employees to the list
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(manager1);
            employees.add(manager2);
            employees.add(labourer1);
            employees.add(labourer2);

            // Calculate the total salary of all employees
            int totalSalary = organization.totalEmployeesSalary(employees);
            System.out.println("Total salary of all employees: " + totalSalary);
        }
    }


