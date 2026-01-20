package com.bridgelaz;

// Base class
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer subclass
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Intern subclass
class Intern extends Employee {
    int durationMonths;

    public Intern(String name, int id, double salary, int months) {
        super(name, id, salary);
        this.durationMonths = months;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
    }
}

// Demo class
public class EmployeeSystemDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager("Aditi", 101, 85000, 5);
        Employee e2 = new Developer("Rahul", 102, 75000, "Java");
        Employee e3 = new Intern("Sneha", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
