import java.util.Scanner;

public class jq19{
    static final int max_emplo = 210; // Maximum number of employees
    static String companyName = "XYZ Corp"; // Company name
    static Employee[] employees = new Employee[max_emplo]; // Array to store employees
    static int employeeCount = 0; // Counter to keep track of the number of employees

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Menu loop
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Display Employee Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = c.nextInt();
            c.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee(c);
                    break;
                case 2:
                    updateEmployee(c);
                    break;
                case 3:
                    displayEmployeeDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    // Method to add a new employee
    public static void addEmployee(Scanner c) {
        if (employeeCount < max_emplo) {
            System.out.println("\nEnter Employee Details:");
            System.out.print("ID: ");
            int id = c.nextInt();
            c.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = c.nextLine();
            System.out.print("Salary: ");
            double salary = c.nextDouble();

            employees[employeeCount] = new Employee(id, name, salary);
            employeeCount++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Maximum number of employees reached.");
        }
    }

    // Method to update an existing employee's details
    public static void updateEmployee(Scanner c) {
        if (employeeCount > 0) {
            System.out.print("Enter employee ID to update: ");
            int id = c.nextInt();
            int index = findEmployeeIndex(id);
            if (index != -1) {
                System.out.println("Enter updated details:");
                System.out.print("Name: ");
                String name = c.next();
                System.out.print("Salary: ");
                double salary = c.nextDouble();

                employees[index].setName(name);
                employees[index].setSalary(salary);
                System.out.println("Employee details updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } else {
            System.out.println("No employees to update.");
        }
    }

    // Method to display details of all employees
    public static void displayEmployeeDetails() {
        if (employeeCount > 0) {
            System.out.println("\nEmployee Details:");
            for (int i = 0; i < employeeCount; i++) {
                System.out.println(employees[i]);
            }
        } else {
            System.out.println("No employees to display.");
        }
    }

    // Method to find index of an employee in the array based on ID
    public static int findEmployeeIndex(int id) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId() == id) {
                return i;
            }
        }
        return -1; // Employee not found
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}
