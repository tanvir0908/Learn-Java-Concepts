package com.example.challenge79;

class Employee {
    private String name;
    private int age;
    private long salary;

    public void setName(String name) {
        this.name = name;
        System.out.println("Name added successfully.");
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age added successfully.");
    }

    public int getAge() {
        return this.age;
    }

    public void setSalary(long salary) {
        this.salary = salary;
        System.out.println("Salary added successfully.");
    }

    public long getSalary() {
        return this.salary;
    }

    void displayEmployeeDetails() {
        System.out.printf("\nEmployee Details: \nName: %s\nAge: %d\nSalary: %d", name, age, salary);
    }
}
