package io.pragra.b25.inherritance;

import io.pragra.b25.inherritance.Person;

// Setup a class Manager in manage
// a field  bonus
// calculateSalary for manager should include bonus
public class Employee extends Person {
    private int empId;
    private double hourlyWage;

    public Employee(int age, String name, int empId, double hourlyWage) {
        super(age, name);
        this.empId = empId;
        this.hourlyWage = hourlyWage;
    }

    public double calcSalary(int hoursWorks) {
        return hoursWorks * hourlyWage;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Employee id ->" + empId);
        System.out.println("Employee hourlyWage ->" + hourlyWage);
    }
}
