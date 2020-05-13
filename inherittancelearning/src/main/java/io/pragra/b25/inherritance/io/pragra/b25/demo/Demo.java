package io.pragra.b25.inherritance.io.pragra.b25.demo;

import io.pragra.b25.inherritance.AdvanceCalculator;
import io.pragra.b25.inherritance.Employee;
import io.pragra.b25.inherritance.Person;
//Overloading

public class Demo extends AdvanceCalculator {
    public static void main(String[] args) {
        AdvanceCalculator obj = new AdvanceCalculator();


        Employee employee = new Employee(4, "Abu", 1, 50);
        employee.display();

        Person person = new Person(20, "Jean");

        person.display();


    }
}


