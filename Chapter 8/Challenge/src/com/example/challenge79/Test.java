package com.example.challenge79;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("Tanvir Hasan");
        employee1.setAge(24);
        employee1.setSalary(120000);

        employee1.displayEmployeeDetails();

        employee1.setName("Emon Hasan");
        employee1.displayEmployeeDetails();
    }
}
